package test.javareact.registry;

import java.io.IOException;
import java.net.ConnectException;
import java.net.MalformedURLException;
import java.util.logging.Logger;

import polimi.reds.NodeDescriptor;
import polimi.reds.broker.overlay.GenericOverlay;
import polimi.reds.broker.overlay.NotRunningException;
import polimi.reds.broker.overlay.Overlay;
import polimi.reds.broker.overlay.SimpleTopologyManager;
import polimi.reds.broker.overlay.TCPTransport;
import polimi.reds.broker.overlay.TopologyManager;
import polimi.reds.broker.overlay.Transport;
import polimi.reds.broker.routing.GenericRouter;
import test.javareact.common.Consts;
import test.javareact.common.packets.EventPacket;
import test.javareact.common.packets.SubscriptionPacket;
import test.javareact.common.packets.content.AdvType;
import test.javareact.common.packets.registry.RegistryAdvertisePacket;

public class RegistryLauncher {
  private static RegistryLauncher launcher;

  private final Overlay overlay;
  private final Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

  private RegistryLauncher() {
    Transport tr = null;
    try {
      tr = new TCPTransport();
    } catch (IOException e) {
      e.printStackTrace();
    }
    TopologyManager tm = new SimpleTopologyManager();
    overlay = new GenericOverlay(tm, tr);
    GenericRouter router = new GenericRouter(overlay);
    Registry registry = new Registry();
    router.setPacketForwarder(EventPacket.subject, registry);
    router.setPacketForwarder(SubscriptionPacket.subject, registry);
  }

  public static final void start() {
    if (launcher == null) {
      launcher = new RegistryLauncher();
    }
    launcher.logger.fine("Starting registry");
    launcher.overlay.start();
    try {
      launcher.overlay.addNeighbor(Consts.serverAddr);
    } catch (Exception e) {
      e.printStackTrace();
    }
    for (NodeDescriptor node : launcher.overlay.getNeighbors()) {
      try {
        launcher.overlay.send(RegistryAdvertisePacket.subject, new RegistryAdvertisePacket(AdvType.ADV), node);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }

  public static final void stop() {
    if (launcher != null) {
      for (NodeDescriptor node : launcher.overlay.getNeighbors()) {
        try {
          launcher.overlay.send(RegistryAdvertisePacket.subject, new RegistryAdvertisePacket(AdvType.UNADV), node);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
      launcher.logger.fine("Stopping registry");
      launcher.overlay.stop();
    }
  }

}
