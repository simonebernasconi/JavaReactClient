package test.javareact.common.expressions.visitors;

import java.util.HashSet;
import java.util.Set;

import test.javareact.common.Consts;
import test.javareact.common.expressions.antlr_grammars.BoolsBaseVisitor;
import test.javareact.common.expressions.antlr_grammars.BoolsParser;
import test.javareact.common.packets.content.Constraint;
import test.javareact.common.packets.content.Subscription;


public class BoolsSubscriptionsGeneratorVisitor extends BoolsBaseVisitor<Void> {
  private final Set<Subscription> subscriptions = new HashSet<Subscription>();

  @Override
  public Void visitIdentifier(BoolsParser.IdentifierContext ctx) {
    String hostId = (ctx.hostId() == null) ? Consts.hostName : ctx.hostId().getText();
    String observableId = ctx.observableId().getText();
    String method = ctx.method().getText();
    Subscription sub = new Subscription(observableId, hostId, new Constraint(method));
    subscriptions.add(sub);
    return null;
  }

  public Set<Subscription> getSubscriptions() {
    return subscriptions;
  }

}
