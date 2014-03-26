package test.javareact.common.expressions.visitors;

import java.util.Map;

import test.javareact.common.Consts;
import test.javareact.common.expressions.antlr_grammars.StringsBaseVisitor;
import test.javareact.common.expressions.antlr_grammars.StringsParser;
import test.javareact.common.packets.content.Value;


public class StringsEvaluatorVisitor extends StringsBaseVisitor<Value> {
  private final Map<String, Value> values;

  public StringsEvaluatorVisitor(Map<String, Value> values) {
    super();
    this.values = values;
  }

  @Override
  public Value visitIdentifier(StringsParser.IdentifierContext ctx) {
    String hostId = (ctx.hostId() == null) ? Consts.hostName : ctx.hostId().getText();
    String observableId = ctx.observableId().getText();
    String method = ctx.method().getText();
    String id = hostId + "." + observableId + "." + method;
    return values.get(id);
  }

  @Override
  public Value visitParens(StringsParser.ParensContext ctx) {
    return visit(ctx.stringExpr());
  }

  @Override
  public Value visitConcat(StringsParser.ConcatContext ctx) {
    String left = visit(ctx.stringExpr(0)).stringVal();
    String right = visit(ctx.stringExpr(1)).stringVal();
    return new Value(left + right);
  }

  @Override
  public Value visitId(StringsParser.IdContext ctx) {
    return visit(ctx.identifier());
  }
}
