// Generated from /Users/jangi/IdeaProjects/Java-to-Python-converter/src/main/antlr/SimpleJava.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleJavaParser}.
 */
public interface SimpleJavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(SimpleJavaParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(SimpleJavaParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(SimpleJavaParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(SimpleJavaParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(SimpleJavaParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(SimpleJavaParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(SimpleJavaParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(SimpleJavaParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(SimpleJavaParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(SimpleJavaParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(SimpleJavaParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(SimpleJavaParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#normalMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalMethodDeclaration(SimpleJavaParser.NormalMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#normalMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalMethodDeclaration(SimpleJavaParser.NormalMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#mainMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMainMethodDeclaration(SimpleJavaParser.MainMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#mainMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMainMethodDeclaration(SimpleJavaParser.MainMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(SimpleJavaParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(SimpleJavaParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(SimpleJavaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(SimpleJavaParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#incrementStatement}.
	 * @param ctx the parse tree
	 */
	void enterIncrementStatement(SimpleJavaParser.IncrementStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#incrementStatement}.
	 * @param ctx the parse tree
	 */
	void exitIncrementStatement(SimpleJavaParser.IncrementStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#decrementStatement}.
	 * @param ctx the parse tree
	 */
	void enterDecrementStatement(SimpleJavaParser.DecrementStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#decrementStatement}.
	 * @param ctx the parse tree
	 */
	void exitDecrementStatement(SimpleJavaParser.DecrementStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#declarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationStatement(SimpleJavaParser.DeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#declarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationStatement(SimpleJavaParser.DeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SimpleJavaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SimpleJavaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(SimpleJavaParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(SimpleJavaParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(SimpleJavaParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(SimpleJavaParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(SimpleJavaParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(SimpleJavaParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(SimpleJavaParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(SimpleJavaParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(SimpleJavaParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(SimpleJavaParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(SimpleJavaParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(SimpleJavaParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SimpleJavaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SimpleJavaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpression(SimpleJavaParser.LogicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpression(SimpleJavaParser.LogicalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpression(SimpleJavaParser.ComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpression(SimpleJavaParser.ComparisonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#mathExpression}.
	 * @param ctx the parse tree
	 */
	void enterMathExpression(SimpleJavaParser.MathExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#mathExpression}.
	 * @param ctx the parse tree
	 */
	void exitMathExpression(SimpleJavaParser.MathExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(SimpleJavaParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(SimpleJavaParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(SimpleJavaParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(SimpleJavaParser.PrimaryExpressionContext ctx);
}