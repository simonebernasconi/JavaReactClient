package test.javareact.token_service;

import java.io.IOException;
import java.net.ConnectException;
import java.net.MalformedURLException;
import java.util.Collection;
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
import test.javareact.common.packets.AdvertisementPacket;
import test.javareact.common.packets.EventPacket;
import test.javareact.common.packets.content.AdvType;
import test.javareact.common.packets.token_service.TokenAckPacket;
import test.javareact.common.packets.token_service.TokenServiceAdvertisePacket;

public class TokenServiceLauncher {
  private static TokenServiceLauncher launcher;

  private final Overlay overlay;
  private final Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

  private TokenServiceLauncher() {
    Transport tr = null;
    try {
      tr = new TCPTransport();
    } catch (IOException e) {
      e.printStackTrace();
    }
    TopologyManager tm = new SimpleTopologyManager();
    overlay = new GenericOverlay(tm, tr);
    GenericRouter router = new GenericRouter(overlay);
    TokenService registry = new TokenService();
    router.setPacketForwarder(EventPacket.subject, registry);
    router.setPacketForwarder(AdvertisementPacket.subject, registry);
    router.setPacketForwarder(TokenAckPacket.subject, registry);
  }

  public static final void start(Collection<String> addresses) {
    if (launcher == null) {
      launcher = new TokenServiceLauncher();
    }
    launcher.logger.fine("Starting registry");
    launcher.overlay.start();
    for (String address : addresses) {
      try {
        launcher.overlay.addNeighbor(address);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    for (NodeDescriptor node : launcher.overlay.getNeighbors()) {
      try {
        launcher.overlay.send(TokenServiceAdvertisePacket.subject, new TokenServiceAdvertisePacket(AdvType.ADV), node);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }

  public static final void stop() {
    if (launcher != null) {
      for (NodeDescriptor node : launcher.overlay.getNeighbors()) {
        try {
          launcher.overlay.send(TokenServiceAdvertisePacket.subject, new TokenServiceAdvertisePacket(AdvType.UNADV), node);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
      launcher.logger.fine("Stopping registry");
      launcher.overlay.stop();
    }
  }

}
