package test.javareact.client;

import java.io.IOException;
import java.io.Serializable;
import java.net.ConnectException;
import java.net.MalformedURLException;
import java.util.Set;
import java.util.UUID;

import polimi.reds.NodeDescriptor;
import polimi.reds.broker.overlay.GenericOverlay;
import polimi.reds.broker.overlay.NotRunningException;
import polimi.reds.broker.overlay.Overlay;
import polimi.reds.broker.overlay.SimpleTopologyManager;
import polimi.reds.broker.overlay.TCPTransport;
import polimi.reds.broker.overlay.TopologyManager;
import polimi.reds.broker.overlay.Transport;
import polimi.reds.broker.routing.GenericRouter;
import polimi.reds.broker.routing.PacketForwarder;
import test.javareact.common.Consts;
import test.javareact.common.packets.AdvertisementPacket;
import test.javareact.common.packets.EventPacket;
import test.javareact.common.packets.SubscriptionPacket;
import test.javareact.common.packets.content.AdvType;
import test.javareact.common.packets.content.Advertisement;
import test.javareact.common.packets.content.Event;
import test.javareact.common.packets.content.SubType;
import test.javareact.common.packets.content.Subscription;

class ConnectionManager {
  private final Overlay overlay;
  private final GenericRouter router;

  ConnectionManager() {
    Transport tr = null;
    try {
      tr = new TCPTransport();
    } catch (IOException e) {
      e.printStackTrace();
    }
    TopologyManager tm = new SimpleTopologyManager();
    overlay = new GenericOverlay(tm, tr, false);
    router = new GenericRouter(overlay);
    overlay.start();
    try {
      overlay.addNeighbor(Consts.serverAddr);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  final void sendEvent(UUID id, Event event, Set<String> computedFrom, Set<String> finalExpressions, boolean approvedByTokenService) {
    EventPacket pkt = new EventPacket(event, id, computedFrom, approvedByTokenService);
    for (String finalExpression : finalExpressions) {
      pkt.addFinalExpression(finalExpression);
    }
    send(EventPacket.subject, pkt);
  }

  final void sendSubscription(Set<Subscription> subs) {
    SubscriptionPacket pkt = new SubscriptionPacket(subs, SubType.SUB);
    send(SubscriptionPacket.subject, pkt);
  }

  final void sendUnsubscription(Set<Subscription> subs) {
    SubscriptionPacket pkt = new SubscriptionPacket(subs, SubType.UNSUB);
    send(SubscriptionPacket.subject, pkt);
  }

  final void sendAdvertisement(Advertisement adv, boolean isPublic) {
    sendAdvertisement(adv, AdvType.ADV, null, isPublic);
  }

  final void sendAdvertisement(Advertisement adv, Set<Subscription> subs, boolean isPublic) {
    sendAdvertisement(adv, AdvType.ADV, subs, isPublic);
  }

  final void sendUnadvertisement(Advertisement adv, boolean isPublic) {
    sendAdvertisement(adv, AdvType.UNADV, null, isPublic);
  }

  final void sendUnadvertisement(Advertisement adv, Set<Subscription> subs, boolean isPublic) {
    sendAdvertisement(adv, AdvType.UNADV, subs, isPublic);
  }

  private final void sendAdvertisement(Advertisement adv, AdvType advType, Set<Subscription> subs, boolean isPublic) {
    AdvertisementPacket pkt = (subs != null) ? new AdvertisementPacket(adv, advType, subs, isPublic) : new AdvertisementPacket(adv, advType, isPublic);
    send(AdvertisementPacket.subject, pkt);
  }

  final void registerForwarder(PacketForwarder forwarder, String subject) {
    router.setPacketForwarder(subject, forwarder);
  }

  final void stop() {
    overlay.stop();
  }

  private final void send(String subject, Serializable packet) {
    assert overlay.getNumberOfBrokers() == 1;
    assert overlay.getNumberOfClients() == 0;
    for (NodeDescriptor node : overlay.getNeighbors()) {
      try {
        overlay.send(subject, packet, node);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }

}
