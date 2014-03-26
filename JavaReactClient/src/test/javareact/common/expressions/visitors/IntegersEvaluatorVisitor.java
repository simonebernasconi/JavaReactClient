package test.javareact.common.expressions.visitors;

import java.util.Map;

import test.javareact.common.Consts;
import test.javareact.common.expressions.antlr_grammars.IntegersBaseVisitor;
import test.javareact.common.expressions.antlr_grammars.IntegersParser;
import test.javareact.common.packets.content.Value;


public class IntegersEvaluatorVisitor extends IntegersBaseVisitor<Value> {
  private final Map<String, Value> values;

  public IntegersEvaluatorVisitor(Map<String, Value> values) {
    super();
    this.values = values;
  }

  @Override
  public Value visitIdentifier(IntegersParser.IdentifierContext ctx) {
    String hostId = (ctx.hostId() == null) ? Consts.hostName : ctx.hostId().getText();
    String observableId = ctx.observableId().getText();
    String method = ctx.method().getText();
    String id = hostId + "." + observableId + "." + method;
    return values.get(id);
  }

  @Override
  public Value visitParens(IntegersParser.ParensContext ctx) {
    return visit(ctx.intExpr());
  }

	@Override
	public Value visitAddSub(IntegersParser.AddSubContext ctx) {
		int left = visit(ctx.intExpr(0)).intVal();
		int right = visit(ctx.intExpr(1)).intVal();
		if (ctx.op.getType() == IntegersParser.ADD) {
			return new Value(left+right);
//			//if (left > right) {
//				//return new Value(true);
//			} else {
//				return new Value(false);
//			}
		} else {
			return new Value(left-right);
//			if (left > right) {
//				return new Value(false);
//			} else {
//				return new Value(true);
//			}
		}
	}

  @Override
  public Value visitId(IntegersParser.IdContext ctx) {
    return visit(ctx.identifier());
  }

  @Override
  public Value visitInt(IntegersParser.IntContext ctx) {
    return new Value(Integer.parseInt(ctx.getText()));
  }

  @Override
  public Value visitMulDiv(IntegersParser.MulDivContext ctx) {
    int left = visit(ctx.intExpr(0)).intVal();
    int right = visit(ctx.intExpr(1)).intVal();
    if (ctx.op.getType() == IntegersParser.MUL) {
      return new Value(left * right);
    } else {
      return new Value(left / right);
    }
  }
}
