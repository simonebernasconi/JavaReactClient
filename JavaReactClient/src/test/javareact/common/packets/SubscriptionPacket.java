package test.javareact.common.packets;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;

import test.javareact.common.packets.content.SubType;
import test.javareact.common.packets.content.Subscription;


/**
 * Packets used to deliver a subscription, which expresses an interest in some specific events.
 */
public class SubscriptionPacket implements Serializable, Iterable<Subscription> {
  private static final long serialVersionUID = -9026500933220636540L;
  public static final String subject = "__JAVA_REACT_SUBSCRIPTION_PACKET_SUBJECT";

  private final Set<Subscription> subscriptions;
  private final SubType subType;

  public SubscriptionPacket(Set<Subscription> subscriptions, SubType subType) {
    this.subscriptions = subscriptions;
    this.subType = subType;
  }

  public final SubType getSubType() {
    return subType;
  }

  @Override
  public Iterator<Subscription> iterator() {
    return subscriptions.iterator();
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((subType == null) ? 0 : subType.hashCode());
    result = prime * result + ((subscriptions == null) ? 0 : subscriptions.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (!(obj instanceof SubscriptionPacket)) {
      return false;
    }
    SubscriptionPacket other = (SubscriptionPacket) obj;
    if (subType != other.subType) {
      return false;
    }
    if (subscriptions == null) {
      if (other.subscriptions != null) {
        return false;
      }
    } else if (!subscriptions.equals(other.subscriptions)) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return subType + ": " + subscriptions.toString();
  }

}
