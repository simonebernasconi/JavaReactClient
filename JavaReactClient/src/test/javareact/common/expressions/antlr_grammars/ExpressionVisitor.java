// Generated from antlr_grammars/Expression.g4 by ANTLR 4.1
package test.javareact.common.expressions.antlr_grammars;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExpressionParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExpressionVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#IdListDouble}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdListDouble(@NotNull ExpressionParser.IdListDoubleContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#identifierListBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierListBool(@NotNull ExpressionParser.IdentifierListBoolContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#EqualNum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualNum(@NotNull ExpressionParser.EqualNumContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#listDouble}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListDouble(@NotNull ExpressionParser.ListDoubleContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#SeqDoubleDouble}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeqDoubleDouble(@NotNull ExpressionParser.SeqDoubleDoubleContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#identifierString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierString(@NotNull ExpressionParser.IdentifierStringContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#IdListString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdListString(@NotNull ExpressionParser.IdListStringContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#hostId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHostId(@NotNull ExpressionParser.HostIdContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#SeqBoolIdentifierListBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeqBoolIdentifierListBool(@NotNull ExpressionParser.SeqBoolIdentifierListBoolContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#IdListBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdListBool(@NotNull ExpressionParser.IdListBoolContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#ListBoolExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListBoolExpression(@NotNull ExpressionParser.ListBoolExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#MulDiv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(@NotNull ExpressionParser.MulDivContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#IdString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdString(@NotNull ExpressionParser.IdStringContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#SeqDoubleIdentifierListDouble}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeqDoubleIdentifierListDouble(@NotNull ExpressionParser.SeqDoubleIdentifierListDoubleContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#Int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(@NotNull ExpressionParser.IntContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#listString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListString(@NotNull ExpressionParser.ListStringContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#identifierListInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierListInt(@NotNull ExpressionParser.IdentifierListIntContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#SeqStringString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeqStringString(@NotNull ExpressionParser.SeqStringStringContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#identifierNum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierNum(@NotNull ExpressionParser.IdentifierNumContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#SeqStringSeqString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeqStringSeqString(@NotNull ExpressionParser.SeqStringSeqStringContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#IdNumListDouble}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdNumListDouble(@NotNull ExpressionParser.IdNumListDoubleContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#AddSub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(@NotNull ExpressionParser.AddSubContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#SeqStringIdentifierListString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeqStringIdentifierListString(@NotNull ExpressionParser.SeqStringIdentifierListStringContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#SeqIntDigit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeqIntDigit(@NotNull ExpressionParser.SeqIntDigitContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#EqualList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualList(@NotNull ExpressionParser.EqualListContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#ParensBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParensBool(@NotNull ExpressionParser.ParensBoolContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#SeqIntSeqIntIdListInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeqIntSeqIntIdListInt(@NotNull ExpressionParser.SeqIntSeqIntIdListIntContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#observableId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObservableId(@NotNull ExpressionParser.ObservableIdContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#BoolExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpression(@NotNull ExpressionParser.BoolExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#ParensString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParensString(@NotNull ExpressionParser.ParensStringContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(@NotNull ExpressionParser.StartContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#ListBool_Label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListBool_Label(@NotNull ExpressionParser.ListBool_LabelContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#SeqStringSeqStringIdListString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeqStringSeqStringIdListString(@NotNull ExpressionParser.SeqStringSeqStringIdListStringContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#MinMax}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinMax(@NotNull ExpressionParser.MinMaxContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#StringExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExpression(@NotNull ExpressionParser.StringExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#ListDoubleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListDoubleExpression(@NotNull ExpressionParser.ListDoubleExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#ListDouble_Label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListDouble_Label(@NotNull ExpressionParser.ListDouble_LabelContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#Double}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble(@NotNull ExpressionParser.DoubleContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#listDigit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListDigit(@NotNull ExpressionParser.ListDigitContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#SeqDoubleSeqDoubleIdListDouble}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeqDoubleSeqDoubleIdListDouble(@NotNull ExpressionParser.SeqDoubleSeqDoubleIdListDoubleContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#IdBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdBool(@NotNull ExpressionParser.IdBoolContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#Bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(@NotNull ExpressionParser.BoolContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#BaseStr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseStr(@NotNull ExpressionParser.BaseStrContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#Concat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcat(@NotNull ExpressionParser.ConcatContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#EqualString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualString(@NotNull ExpressionParser.EqualStringContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#ListDigit_Label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListDigit_Label(@NotNull ExpressionParser.ListDigit_LabelContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#SeqBoolSeqBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeqBoolSeqBool(@NotNull ExpressionParser.SeqBoolSeqBoolContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#ParensNum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParensNum(@NotNull ExpressionParser.ParensNumContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#listBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListBool(@NotNull ExpressionParser.ListBoolContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#SeqBoolSeqBoolIdListBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeqBoolSeqBoolIdListBool(@NotNull ExpressionParser.SeqBoolSeqBoolIdListBoolContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#NumExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumExpression(@NotNull ExpressionParser.NumExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#AndOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndOr(@NotNull ExpressionParser.AndOrContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#EqualBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualBool(@NotNull ExpressionParser.EqualBoolContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#identifierListDouble}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierListDouble(@NotNull ExpressionParser.IdentifierListDoubleContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#ListString_Label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListString_Label(@NotNull ExpressionParser.ListString_LabelContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#SeqDoubleSeqDouble}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeqDoubleSeqDouble(@NotNull ExpressionParser.SeqDoubleSeqDoubleContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#IdListInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdListInt(@NotNull ExpressionParser.IdListIntContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#Not}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(@NotNull ExpressionParser.NotContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#IdNum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdNum(@NotNull ExpressionParser.IdNumContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#ListStringExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListStringExpression(@NotNull ExpressionParser.ListStringExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#ListExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListExpression(@NotNull ExpressionParser.ListExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#SeqBoolBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeqBoolBool(@NotNull ExpressionParser.SeqBoolBoolContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#ListDigitExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListDigitExpression(@NotNull ExpressionParser.ListDigitExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#IdNumListInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdNumListInt(@NotNull ExpressionParser.IdNumListIntContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#SeqIntSeqInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeqIntSeqInt(@NotNull ExpressionParser.SeqIntSeqIntContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(@NotNull ExpressionParser.MethodContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#identifierListString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierListString(@NotNull ExpressionParser.IdentifierListStringContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#SeqIntIdentifierListInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeqIntIdentifierListInt(@NotNull ExpressionParser.SeqIntIdentifierListIntContext ctx);

	/**
	 * Visit a parse tree produced by {@link ExpressionParser#identifierBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierBool(@NotNull ExpressionParser.IdentifierBoolContext ctx);
}