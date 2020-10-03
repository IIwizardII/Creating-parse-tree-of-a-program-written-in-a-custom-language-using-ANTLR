// Generated from pheonix.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link pheonixParser}.
 */
public interface pheonixListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link pheonixParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(pheonixParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link pheonixParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(pheonixParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link pheonixParser#begin}.
	 * @param ctx the parse tree
	 */
	void enterBegin(pheonixParser.BeginContext ctx);
	/**
	 * Exit a parse tree produced by {@link pheonixParser#begin}.
	 * @param ctx the parse tree
	 */
	void exitBegin(pheonixParser.BeginContext ctx);
	/**
	 * Enter a parse tree produced by {@link pheonixParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(pheonixParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link pheonixParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(pheonixParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link pheonixParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(pheonixParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link pheonixParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(pheonixParser.DataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link pheonixParser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(pheonixParser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link pheonixParser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(pheonixParser.FunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link pheonixParser#functionBlock}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBlock(pheonixParser.FunctionBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link pheonixParser#functionBlock}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBlock(pheonixParser.FunctionBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link pheonixParser#functionWork}.
	 * @param ctx the parse tree
	 */
	void enterFunctionWork(pheonixParser.FunctionWorkContext ctx);
	/**
	 * Exit a parse tree produced by {@link pheonixParser#functionWork}.
	 * @param ctx the parse tree
	 */
	void exitFunctionWork(pheonixParser.FunctionWorkContext ctx);
	/**
	 * Enter a parse tree produced by {@link pheonixParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(pheonixParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link pheonixParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(pheonixParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link pheonixParser#valueAssignment}.
	 * @param ctx the parse tree
	 */
	void enterValueAssignment(pheonixParser.ValueAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link pheonixParser#valueAssignment}.
	 * @param ctx the parse tree
	 */
	void exitValueAssignment(pheonixParser.ValueAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link pheonixParser#arithmeticCalculation}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticCalculation(pheonixParser.ArithmeticCalculationContext ctx);
	/**
	 * Exit a parse tree produced by {@link pheonixParser#arithmeticCalculation}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticCalculation(pheonixParser.ArithmeticCalculationContext ctx);
	/**
	 * Enter a parse tree produced by {@link pheonixParser#arithmeticOperator}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticOperator(pheonixParser.ArithmeticOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link pheonixParser#arithmeticOperator}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticOperator(pheonixParser.ArithmeticOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link pheonixParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void enterConditionalStatement(pheonixParser.ConditionalStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pheonixParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void exitConditionalStatement(pheonixParser.ConditionalStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link pheonixParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(pheonixParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link pheonixParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(pheonixParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link pheonixParser#conditionalOperator}.
	 * @param ctx the parse tree
	 */
	void enterConditionalOperator(pheonixParser.ConditionalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link pheonixParser#conditionalOperator}.
	 * @param ctx the parse tree
	 */
	void exitConditionalOperator(pheonixParser.ConditionalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link pheonixParser#conditionalBlock}.
	 * @param ctx the parse tree
	 */
	void enterConditionalBlock(pheonixParser.ConditionalBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link pheonixParser#conditionalBlock}.
	 * @param ctx the parse tree
	 */
	void exitConditionalBlock(pheonixParser.ConditionalBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link pheonixParser#conditionalStatementWork}.
	 * @param ctx the parse tree
	 */
	void enterConditionalStatementWork(pheonixParser.ConditionalStatementWorkContext ctx);
	/**
	 * Exit a parse tree produced by {@link pheonixParser#conditionalStatementWork}.
	 * @param ctx the parse tree
	 */
	void exitConditionalStatementWork(pheonixParser.ConditionalStatementWorkContext ctx);
	/**
	 * Enter a parse tree produced by {@link pheonixParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(pheonixParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link pheonixParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(pheonixParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link pheonixParser#loopBlock}.
	 * @param ctx the parse tree
	 */
	void enterLoopBlock(pheonixParser.LoopBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link pheonixParser#loopBlock}.
	 * @param ctx the parse tree
	 */
	void exitLoopBlock(pheonixParser.LoopBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link pheonixParser#loopWork}.
	 * @param ctx the parse tree
	 */
	void enterLoopWork(pheonixParser.LoopWorkContext ctx);
	/**
	 * Exit a parse tree produced by {@link pheonixParser#loopWork}.
	 * @param ctx the parse tree
	 */
	void exitLoopWork(pheonixParser.LoopWorkContext ctx);
	/**
	 * Enter a parse tree produced by {@link pheonixParser#returnValue}.
	 * @param ctx the parse tree
	 */
	void enterReturnValue(pheonixParser.ReturnValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link pheonixParser#returnValue}.
	 * @param ctx the parse tree
	 */
	void exitReturnValue(pheonixParser.ReturnValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link pheonixParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(pheonixParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link pheonixParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(pheonixParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link pheonixParser#end}.
	 * @param ctx the parse tree
	 */
	void enterEnd(pheonixParser.EndContext ctx);
	/**
	 * Exit a parse tree produced by {@link pheonixParser#end}.
	 * @param ctx the parse tree
	 */
	void exitEnd(pheonixParser.EndContext ctx);
}