package test.javareact.client;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.logging.Logger;

import polimi.reds.NodeDescriptor;
import polimi.reds.broker.routing.Outbox;
import polimi.reds.broker.routing.PacketForwarder;
import test.javareact.common.ConsistencyType;
import test.javareact.common.Consts;
import test.javareact.common.packets.EventPacket;
import test.javareact.common.packets.SubscriptionPacket;
import test.javareact.common.packets.content.Advertisement;
import test.javareact.common.packets.content.Event;
import test.javareact.common.packets.content.Subscription;

public class ClientEventForwarder implements PacketForwarder {
  private static ClientEventForwarder self = null;

  private final ConnectionManager connectionManager;
  private final ClientSubscriptionTable subTable;
  private final Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

  public static final ClientEventForwarder get() {
    if (self == null) {
      self = new ClientEventForwarder();
    }
    return self;
  }

  public static final void stop() {
    if (self != null) {
      self.stopClient();
      self = null;
    }
  }

  private final void stopClient() {
    connectionManager.stop();
  }

  private ClientEventForwarder() {
    connectionManager = new ConnectionManager();
    subTable = new ClientSubscriptionTable();
    connectionManager.registerForwarder(this, EventPacket.subject);
    connectionManager.registerForwarder(this, SubscriptionPacket.subject);
  }

  @Override
  public Collection<NodeDescriptor> forwardPacket(String subject, NodeDescriptor sender, Serializable packet, Collection<NodeDescriptor> neighbors, Outbox outbox) {
    Collection<NodeDescriptor> result = new ArrayList<NodeDescriptor>();
    if (subject.equals(EventPacket.subject)) {
      assert (packet instanceof EventPacket);
      logger.finer("Received an event packet " + packet);
      processEventFromServer((EventPacket) packet);
    } else if (subject.equals(SubscriptionPacket.subject)) {
      assert (packet instanceof SubscriptionPacket);
      logger.fine("Received a subscription packet " + packet);
      processSubscriptionFromServer((SubscriptionPacket) packet);
    } else {
      assert false : subject;
    }
    return result;
  }

  public final void sendEvent(UUID id, Event ev, Set<String> computedFrom, boolean approvedByTokenService) {
    sendEvent(id, ev, computedFrom, new HashSet<String>(), approvedByTokenService);
  }

  public final void sendEvent(UUID id, Event ev, Set<String> computedFrom, Set<String> finalExpressions, boolean approvedByTokenService) {
    logger.finer("Sending an event " + ev);
    // Local forward occurs only if glitch freedom is not guaranteed.
    // Indeed, to ensure glitch freedom, all events, including local ones,
    // need to be pass through the server before being delivered
    if (Consts.consistencyType != ConsistencyType.GLITCH_FREE && Consts.consistencyType != ConsistencyType.ATOMIC) {
      for (Subscriber sub : subTable.getMatchingSubscribers(ev)) {
        sub.notifyValueChanged(new EventPacket(ev, id, computedFrom, approvedByTokenService));
      }
    }
    if (subTable.needsToDeliverToServer(ev) || ev.isPersistent()) {
      connectionManager.sendEvent(id, ev, computedFrom, finalExpressions, approvedByTokenService);
    }
  }

  public final void advertise(Advertisement adv, boolean isPublic) {
    logger.fine("Sending advertisement " + adv);
    connectionManager.sendAdvertisement(adv, isPublic);
  }

  public final void unadvertise(Advertisement adv, boolean isPublic) {
    logger.fine("Sending unadvertisement " + adv);
    connectionManager.sendUnadvertisement(adv, isPublic);
  }

  public final void advertise(Advertisement adv, Set<Subscription> subs, boolean isPublic) {
    logger.fine("Sending advertisement " + adv + " with subscriptions " + subs);
    connectionManager.sendAdvertisement(adv, subs, isPublic);
  }

  public final void unadvertise(Advertisement adv, Set<Subscription> subs, boolean isPublic) {
    logger.fine("Sending unadvertisement " + adv + " with subscriptions " + subs);
    connectionManager.sendUnadvertisement(adv, isPublic);
  }

  public final void addSubscriptions(Subscriber subscriber, Set<Subscription> subscriptions) {
    logger.fine("Adding subscriptions " + subscriptions);
    subTable.addSubscriptions(subscriber, subscriptions);
    Set<Subscription> subsToSendToServer = getSubscriptionsToForwardToServer(subscriptions);
    connectionManager.sendSubscription(subsToSendToServer);
  }

  public final void removeSubscriptions(Subscriber subscriber, Set<Subscription> subscriptions) {
    logger.fine("Removing subscriptions " + subscriptions);
    subTable.removeSubscriptions(subscriber, subscriptions);
    Set<Subscription> subsToSendToServer = getSubscriptionsToForwardToServer(subscriptions);
    connectionManager.sendUnsubscription(subsToSendToServer);
  }

  private final Set<Subscription> getSubscriptionsToForwardToServer(Set<Subscription> subscriptions) {
    if (Consts.consistencyType == ConsistencyType.GLITCH_FREE || Consts.consistencyType == ConsistencyType.ATOMIC) {
      return subscriptions;
    }
    Set<Subscription> result = new HashSet<Subscription>();
    for (Subscription sub : subscriptions) {
      if (!isLocal(sub)) {
        result.add(sub);
      }
    }
    return result;
  }

  private final boolean isLocal(Subscription sub) {
    return sub.getHostId().equals(Consts.hostName);
  }

  private final void processEventFromServer(EventPacket evPkt) {
    for (Subscriber sub : subTable.getMatchingSubscribers(evPkt.getEvent())) {
      sub.notifyValueChanged(evPkt);
    }
    if (Consts.consistencyType == ConsistencyType.GLITCH_FREE || Consts.consistencyType == ConsistencyType.ATOMIC) {
      for (Subscriber sub : subTable.getSignatureOnlyMatchingSubscribers(evPkt.getEvent())) {
        sub.notifyValueChanged(evPkt);
      }
    }
  }

  private final void processSubscriptionFromServer(SubscriptionPacket subPkt) {
    for (Subscription sub : subPkt) {
      switch (subPkt.getSubType()) {
      case SUB:
        subTable.addServerSubscription(sub);
        break;
      case UNSUB:
        subTable.removeServerSubscription(sub);
        break;
      default:
        assert false : subPkt.getSubType();
      }
    }
  }
}