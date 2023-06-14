// Generated from /Users/jangi/IdeaProjects/Java-to-Python-converter/src/main/antlr/SimpleJava.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimpleJavaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimpleJavaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(SimpleJavaParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(SimpleJavaParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(SimpleJavaParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(SimpleJavaParser.ClassBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(SimpleJavaParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(SimpleJavaParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#normalMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalMethodDeclaration(SimpleJavaParser.NormalMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#mainMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainMethodDeclaration(SimpleJavaParser.MainMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(SimpleJavaParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(SimpleJavaParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#incrementStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrementStatement(SimpleJavaParser.IncrementStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#decrementStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecrementStatement(SimpleJavaParser.DecrementStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#declarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationStatement(SimpleJavaParser.DeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(SimpleJavaParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#assignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(SimpleJavaParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(SimpleJavaParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(SimpleJavaParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(SimpleJavaParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(SimpleJavaParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(SimpleJavaParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SimpleJavaParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#logicalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpression(SimpleJavaParser.LogicalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#comparisonExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpression(SimpleJavaParser.ComparisonExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#mathExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathExpression(SimpleJavaParser.MathExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(SimpleJavaParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(SimpleJavaParser.PrimaryExpressionContext ctx);
}