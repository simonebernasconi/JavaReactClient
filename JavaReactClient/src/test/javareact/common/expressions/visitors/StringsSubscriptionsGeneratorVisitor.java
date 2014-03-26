package test.javareact.common.expressions.visitors;

import java.util.HashSet;
import java.util.Set;

import test.javareact.common.Consts;
import test.javareact.common.expressions.antlr_grammars.StringsBaseVisitor;
import test.javareact.common.expressions.antlr_grammars.StringsParser;
import test.javareact.common.packets.content.Constraint;
import test.javareact.common.packets.content.Subscription;


public class StringsSubscriptionsGeneratorVisitor extends StringsBaseVisitor<Void> {
  private final Set<Subscription> subscriptions = new HashSet<Subscription>();

  @Override
  public Void visitIdentifier(StringsParser.IdentifierContext ctx) {
    String hostId = (ctx.hostId() == null) ? Consts.hostName : ctx.hostId().getText();
    String observableId = ctx.observableId().getText();
    String method = ctx.method().getText();
    Subscription sub = new Subscription(observableId, hostId, new Constraint(method));
    subscriptions.add(sub);
    System.out.println(subscriptions);
    return null;
  }

  public Set<Subscription> getSubscriptions() {
    return subscriptions;
  }

}
