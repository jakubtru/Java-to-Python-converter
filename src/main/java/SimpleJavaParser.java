// Generated from SimpleJava.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SimpleJavaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
			new PredictionContextCache();
	public static final int
			Class=1, Public=2, Static=3, Void=4, Main=5, String=6, Int=7, Char=8,
			Bool=9, Float=10, Extends=11, Return=12, If=13, ElseIf=14, Else=15, While=16,
			Print=17, Plus=18, Minus=19, Multiply=20, Divide=21, Equals=22, GreaterThan=23,
			LessThan=24, DoubleQuote=25, LessThanOrEqual=26, GreaterThanOrEqual=27,
			Equal=28, NotEqual=29, And=30, Or=31, Dot=32, Increment=33, Decrement=34,
			Semicolon=35, Comma=36, LeftParen=37, RightParen=38, LeftCurly=39, RightCurly=40,
			LeftSquareBracket=41, RightSquareBracket=42, IntegerLiteral=43, FloatLiteral=44,
			CharLiteral=45, BoolLiteral=46, StringLiteral=47, Whitespace=48, Identifier=49;
	public static final int
			RULE_compilationUnit = 0, RULE_classDeclaration = 1, RULE_classBody = 2,
			RULE_classBodyDeclaration = 3, RULE_fieldDeclaration = 4, RULE_methodDeclaration = 5,
			RULE_normalMethodDeclaration = 6, RULE_mainMethodDeclaration = 7, RULE_methodBody = 8,
			RULE_type = 9, RULE_incrementStatement = 10, RULE_decrementStatement = 11,
			RULE_declarationStatement = 12, RULE_statement = 13, RULE_assignmentStatement = 14,
			RULE_printStatement = 15, RULE_ifStatement = 16, RULE_elseIfStatement = 17,
			RULE_elseStatement = 18, RULE_whileStatement = 19, RULE_returnStatement = 20,
			RULE_expressionStatement = 21, RULE_expression = 22, RULE_logicalExpression = 23,
			RULE_comparisonExpression = 24, RULE_mathExpression = 25, RULE_unaryExpression = 26,
			RULE_primaryExpression = 27, RULE_printExpression = 28;
	public static final String _serializedATN =
			"\u0004\u00011\u013d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
					"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
					"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
					"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
					"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
					"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
					"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
					"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
					"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
					"\u0002\u001c\u0007\u001c\u0001\u0000\u0005\u0000<\b\u0000\n\u0000\f\u0000"+
					"?\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0003\u0001D\b\u0001\u0001"+
					"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
					"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0005\u0003P\b\u0003\n\u0003"+
					"\f\u0003S\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
					"\u0004\u0005\u0004Z\b\u0004\n\u0004\f\u0004]\t\u0004\u0001\u0004\u0001"+
					"\u0004\u0001\u0004\u0001\u0004\u0005\u0004c\b\u0004\n\u0004\f\u0004f\t"+
					"\u0004\u0003\u0004h\b\u0004\u0001\u0005\u0001\u0005\u0003\u0005l\b\u0005"+
					"\u0001\u0006\u0003\u0006o\b\u0006\u0001\u0006\u0003\u0006r\b\u0006\u0001"+
					"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
					"\u0006\u0001\u0006\u0005\u0006|\b\u0006\n\u0006\f\u0006\u007f\t\u0006"+
					"\u0003\u0006\u0081\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
					"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
					"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
					"\b\u0005\b\u0094\b\b\n\b\f\b\u0097\t\b\u0001\b\u0001\b\u0001\t\u0001\t"+
					"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
					"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r"+
					"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00b4"+
					"\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
					"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00bf\b\u000e\u0001"+
					"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
					"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0004"+
					"\u0010\u00cd\b\u0010\u000b\u0010\f\u0010\u00ce\u0001\u0010\u0001\u0010"+
					"\u0005\u0010\u00d3\b\u0010\n\u0010\f\u0010\u00d6\t\u0010\u0001\u0010\u0003"+
					"\u0010\u00d9\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
					"\u0011\u0001\u0011\u0004\u0011\u00e1\b\u0011\u000b\u0011\f\u0011\u00e2"+
					"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0004\u0012"+
					"\u00ea\b\u0012\u000b\u0012\f\u0012\u00eb\u0001\u0012\u0001\u0012\u0001"+
					"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0004"+
					"\u0013\u00f6\b\u0013\u000b\u0013\f\u0013\u00f7\u0001\u0013\u0001\u0013"+
					"\u0001\u0014\u0001\u0014\u0003\u0014\u00fe\b\u0014\u0001\u0014\u0001\u0014"+
					"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017"+
					"\u0001\u0017\u0001\u0017\u0005\u0017\u010a\b\u0017\n\u0017\f\u0017\u010d"+
					"\t\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u0112\b\u0018"+
					"\n\u0018\f\u0018\u0115\t\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0005"+
					"\u0019\u011a\b\u0019\n\u0019\f\u0019\u011d\t\u0019\u0001\u001a\u0001\u001a"+
					"\u0001\u001a\u0003\u001a\u0122\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
					"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
					"\u0001\u001b\u0003\u001b\u012e\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
					"\u0003\u001c\u0133\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c"+
					"\u0138\b\u001c\n\u001c\f\u001c\u013b\t\u001c\u0001\u001c\u0000\u00018"+
					"\u001d\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
					"\u001a\u001c\u001e \"$&(*,.02468\u0000\t\u0001\u0000((\u0002\u0000\u0004"+
					"\u0004\u0006\n\u0002\u0000\u0006\n11\u0001\u0000+/\u0001\u0000\u001e\u001f"+
					"\u0002\u0000\u0017\u0018\u001a\u001d\u0001\u0000\u0012\u0015\u0001\u0000"+
					"\u0012\u0013\u0002\u0000//11\u014a\u0000=\u0001\u0000\u0000\u0000\u0002"+
					"C\u0001\u0000\u0000\u0000\u0004I\u0001\u0000\u0000\u0000\u0006Q\u0001"+
					"\u0000\u0000\u0000\bg\u0001\u0000\u0000\u0000\nk\u0001\u0000\u0000\u0000"+
					"\fn\u0001\u0000\u0000\u0000\u000e\u0085\u0001\u0000\u0000\u0000\u0010"+
					"\u0091\u0001\u0000\u0000\u0000\u0012\u009a\u0001\u0000\u0000\u0000\u0014"+
					"\u009c\u0001\u0000\u0000\u0000\u0016\u00a0\u0001\u0000\u0000\u0000\u0018"+
					"\u00a4\u0001\u0000\u0000\u0000\u001a\u00b3\u0001\u0000\u0000\u0000\u001c"+
					"\u00be\u0001\u0000\u0000\u0000\u001e\u00c0\u0001\u0000\u0000\u0000 \u00c6"+
					"\u0001\u0000\u0000\u0000\"\u00da\u0001\u0000\u0000\u0000$\u00e6\u0001"+
					"\u0000\u0000\u0000&\u00ef\u0001\u0000\u0000\u0000(\u00fb\u0001\u0000\u0000"+
					"\u0000*\u0101\u0001\u0000\u0000\u0000,\u0104\u0001\u0000\u0000\u0000."+
					"\u0106\u0001\u0000\u0000\u00000\u010e\u0001\u0000\u0000\u00002\u0116\u0001"+
					"\u0000\u0000\u00004\u0121\u0001\u0000\u0000\u00006\u012d\u0001\u0000\u0000"+
					"\u00008\u0132\u0001\u0000\u0000\u0000:<\u0003\u0002\u0001\u0000;:\u0001"+
					"\u0000\u0000\u0000<?\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000"+
					"=>\u0001\u0000\u0000\u0000>@\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000"+
					"\u0000@A\u0005\u0000\u0000\u0001A\u0001\u0001\u0000\u0000\u0000BD\u0005"+
					"\u0002\u0000\u0000CB\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000"+
					"DE\u0001\u0000\u0000\u0000EF\u0005\u0001\u0000\u0000FG\u00051\u0000\u0000"+
					"GH\u0003\u0004\u0002\u0000H\u0003\u0001\u0000\u0000\u0000IJ\u0005\'\u0000"+
					"\u0000JK\u0003\u0006\u0003\u0000KL\u0007\u0000\u0000\u0000L\u0005\u0001"+
					"\u0000\u0000\u0000MP\u0003\n\u0005\u0000NP\u0003\b\u0004\u0000OM\u0001"+
					"\u0000\u0000\u0000ON\u0001\u0000\u0000\u0000PS\u0001\u0000\u0000\u0000"+
					"QO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000R\u0007\u0001\u0000"+
					"\u0000\u0000SQ\u0001\u0000\u0000\u0000TU\u0003\u0012\t\u0000UV\u00051"+
					"\u0000\u0000V[\u0005#\u0000\u0000WZ\u0003\b\u0004\u0000XZ\u0003\n\u0005"+
					"\u0000YW\u0001\u0000\u0000\u0000YX\u0001\u0000\u0000\u0000Z]\u0001\u0000"+
					"\u0000\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\h\u0001"+
					"\u0000\u0000\u0000][\u0001\u0000\u0000\u0000^_\u0003\u0012\t\u0000_d\u0003"+
					"\u001c\u000e\u0000`c\u0003\b\u0004\u0000ac\u0003\n\u0005\u0000b`\u0001"+
					"\u0000\u0000\u0000ba\u0001\u0000\u0000\u0000cf\u0001\u0000\u0000\u0000"+
					"db\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000eh\u0001\u0000\u0000"+
					"\u0000fd\u0001\u0000\u0000\u0000gT\u0001\u0000\u0000\u0000g^\u0001\u0000"+
					"\u0000\u0000h\t\u0001\u0000\u0000\u0000il\u0003\u000e\u0007\u0000jl\u0003"+
					"\f\u0006\u0000ki\u0001\u0000\u0000\u0000kj\u0001\u0000\u0000\u0000l\u000b"+
					"\u0001\u0000\u0000\u0000mo\u0005\u0002\u0000\u0000nm\u0001\u0000\u0000"+
					"\u0000no\u0001\u0000\u0000\u0000oq\u0001\u0000\u0000\u0000pr\u0005\u0003"+
					"\u0000\u0000qp\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rs\u0001"+
					"\u0000\u0000\u0000st\u0007\u0001\u0000\u0000tu\u00051\u0000\u0000u\u0080"+
					"\u0005%\u0000\u0000vw\u0007\u0001\u0000\u0000w}\u00051\u0000\u0000xy\u0005"+
					"$\u0000\u0000yz\u0007\u0001\u0000\u0000z|\u00051\u0000\u0000{x\u0001\u0000"+
					"\u0000\u0000|\u007f\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000"+
					"}~\u0001\u0000\u0000\u0000~\u0081\u0001\u0000\u0000\u0000\u007f}\u0001"+
					"\u0000\u0000\u0000\u0080v\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000"+
					"\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0083\u0005&\u0000"+
					"\u0000\u0083\u0084\u0003\u0010\b\u0000\u0084\r\u0001\u0000\u0000\u0000"+
					"\u0085\u0086\u0005\u0002\u0000\u0000\u0086\u0087\u0005\u0003\u0000\u0000"+
					"\u0087\u0088\u0005\u0004\u0000\u0000\u0088\u0089\u0005\u0005\u0000\u0000"+
					"\u0089\u008a\u0005%\u0000\u0000\u008a\u008b\u0005\u0006\u0000\u0000\u008b"+
					"\u008c\u0005)\u0000\u0000\u008c\u008d\u0005*\u0000\u0000\u008d\u008e\u0005"+
					"1\u0000\u0000\u008e\u008f\u0005&\u0000\u0000\u008f\u0090\u0003\u0010\b"+
					"\u0000\u0090\u000f\u0001\u0000\u0000\u0000\u0091\u0095\u0005\'\u0000\u0000"+
					"\u0092\u0094\u0003\u001a\r\u0000\u0093\u0092\u0001\u0000\u0000\u0000\u0094"+
					"\u0097\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0095"+
					"\u0096\u0001\u0000\u0000\u0000\u0096\u0098\u0001\u0000\u0000\u0000\u0097"+
					"\u0095\u0001\u0000\u0000\u0000\u0098\u0099\u0007\u0000\u0000\u0000\u0099"+
					"\u0011\u0001\u0000\u0000\u0000\u009a\u009b\u0007\u0002\u0000\u0000\u009b"+
					"\u0013\u0001\u0000\u0000\u0000\u009c\u009d\u00051\u0000\u0000\u009d\u009e"+
					"\u0005!\u0000\u0000\u009e\u009f\u0005#\u0000\u0000\u009f\u0015\u0001\u0000"+
					"\u0000\u0000\u00a0\u00a1\u00051\u0000\u0000\u00a1\u00a2\u0005\"\u0000"+
					"\u0000\u00a2\u00a3\u0005#\u0000\u0000\u00a3\u0017\u0001\u0000\u0000\u0000"+
					"\u00a4\u00a5\u0003\u0012\t\u0000\u00a5\u00a6\u00051\u0000\u0000\u00a6"+
					"\u00a7\u0005\u0016\u0000\u0000\u00a7\u00a8\u00036\u001b\u0000\u00a8\u00a9"+
					"\u0005#\u0000\u0000\u00a9\u0019\u0001\u0000\u0000\u0000\u00aa\u00b4\u0003"+
					"\u0018\f\u0000\u00ab\u00b4\u0003\u001c\u000e\u0000\u00ac\u00b4\u0003 "+
					"\u0010\u0000\u00ad\u00b4\u0003&\u0013\u0000\u00ae\u00b4\u0003(\u0014\u0000"+
					"\u00af\u00b4\u0003*\u0015\u0000\u00b0\u00b4\u0003\u0014\n\u0000\u00b1"+
					"\u00b4\u0003\u0016\u000b\u0000\u00b2\u00b4\u0003\u001e\u000f\u0000\u00b3"+
					"\u00aa\u0001\u0000\u0000\u0000\u00b3\u00ab\u0001\u0000\u0000\u0000\u00b3"+
					"\u00ac\u0001\u0000\u0000\u0000\u00b3\u00ad\u0001\u0000\u0000\u0000\u00b3"+
					"\u00ae\u0001\u0000\u0000\u0000\u00b3\u00af\u0001\u0000\u0000\u0000\u00b3"+
					"\u00b0\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b3"+
					"\u00b2\u0001\u0000\u0000\u0000\u00b4\u001b\u0001\u0000\u0000\u0000\u00b5"+
					"\u00b6\u00051\u0000\u0000\u00b6\u00b7\u0005\u0016\u0000\u0000\u00b7\u00b8"+
					"\u0003,\u0016\u0000\u00b8\u00b9\u0005#\u0000\u0000\u00b9\u00bf\u0001\u0000"+
					"\u0000\u0000\u00ba\u00bb\u00051\u0000\u0000\u00bb\u00bc\u0005\u0016\u0000"+
					"\u0000\u00bc\u00bd\u0007\u0003\u0000\u0000\u00bd\u00bf\u0005#\u0000\u0000"+
					"\u00be\u00b5\u0001\u0000\u0000\u0000\u00be\u00ba\u0001\u0000\u0000\u0000"+
					"\u00bf\u001d\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005\u0011\u0000\u0000"+
					"\u00c1\u00c2\u0005%\u0000\u0000\u00c2\u00c3\u00038\u001c\u0000\u00c3\u00c4"+
					"\u0005&\u0000\u0000\u00c4\u00c5\u0005#\u0000\u0000\u00c5\u001f\u0001\u0000"+
					"\u0000\u0000\u00c6\u00c7\u0005\r\u0000\u0000\u00c7\u00c8\u0005%\u0000"+
					"\u0000\u00c8\u00c9\u0003,\u0016\u0000\u00c9\u00ca\u0005&\u0000\u0000\u00ca"+
					"\u00cc\u0005\'\u0000\u0000\u00cb\u00cd\u0003\u001a\r\u0000\u00cc\u00cb"+
					"\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00cc"+
					"\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf\u00d0"+
					"\u0001\u0000\u0000\u0000\u00d0\u00d4\u0005(\u0000\u0000\u00d1\u00d3\u0003"+
					"\"\u0011\u0000\u00d2\u00d1\u0001\u0000\u0000\u0000\u00d3\u00d6\u0001\u0000"+
					"\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000"+
					"\u0000\u0000\u00d5\u00d8\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000"+
					"\u0000\u0000\u00d7\u00d9\u0003$\u0012\u0000\u00d8\u00d7\u0001\u0000\u0000"+
					"\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9!\u0001\u0000\u0000\u0000"+
					"\u00da\u00db\u0005\u000e\u0000\u0000\u00db\u00dc\u0005%\u0000\u0000\u00dc"+
					"\u00dd\u0003,\u0016\u0000\u00dd\u00de\u0005&\u0000\u0000\u00de\u00e0\u0005"+
					"\'\u0000\u0000\u00df\u00e1\u0003\u001a\r\u0000\u00e0\u00df\u0001\u0000"+
					"\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000"+
					"\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000"+
					"\u0000\u0000\u00e4\u00e5\u0005(\u0000\u0000\u00e5#\u0001\u0000\u0000\u0000"+
					"\u00e6\u00e7\u0005\u000f\u0000\u0000\u00e7\u00e9\u0005\'\u0000\u0000\u00e8"+
					"\u00ea\u0003\u001a\r\u0000\u00e9\u00e8\u0001\u0000\u0000\u0000\u00ea\u00eb"+
					"\u0001\u0000\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ec"+
					"\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed\u00ee"+
					"\u0005(\u0000\u0000\u00ee%\u0001\u0000\u0000\u0000\u00ef\u00f0\u0005\u0010"+
					"\u0000\u0000\u00f0\u00f1\u0005%\u0000\u0000\u00f1\u00f2\u0003,\u0016\u0000"+
					"\u00f2\u00f3\u0005&\u0000\u0000\u00f3\u00f5\u0005\'\u0000\u0000\u00f4"+
					"\u00f6\u0003\u001a\r\u0000\u00f5\u00f4\u0001\u0000\u0000\u0000\u00f6\u00f7"+
					"\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f7\u00f8"+
					"\u0001\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9\u00fa"+
					"\u0005(\u0000\u0000\u00fa\'\u0001\u0000\u0000\u0000\u00fb\u00fd\u0005"+
					"\f\u0000\u0000\u00fc\u00fe\u0003,\u0016\u0000\u00fd\u00fc\u0001\u0000"+
					"\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000"+
					"\u0000\u0000\u00ff\u0100\u0005#\u0000\u0000\u0100)\u0001\u0000\u0000\u0000"+
					"\u0101\u0102\u0003,\u0016\u0000\u0102\u0103\u0005#\u0000\u0000\u0103+"+
					"\u0001\u0000\u0000\u0000\u0104\u0105\u0003.\u0017\u0000\u0105-\u0001\u0000"+
					"\u0000\u0000\u0106\u010b\u00030\u0018\u0000\u0107\u0108\u0007\u0004\u0000"+
					"\u0000\u0108\u010a\u00030\u0018\u0000\u0109\u0107\u0001\u0000\u0000\u0000"+
					"\u010a\u010d\u0001\u0000\u0000\u0000\u010b\u0109\u0001\u0000\u0000\u0000"+
					"\u010b\u010c\u0001\u0000\u0000\u0000\u010c/\u0001\u0000\u0000\u0000\u010d"+
					"\u010b\u0001\u0000\u0000\u0000\u010e\u0113\u00032\u0019\u0000\u010f\u0110"+
					"\u0007\u0005\u0000\u0000\u0110\u0112\u00032\u0019\u0000\u0111\u010f\u0001"+
					"\u0000\u0000\u0000\u0112\u0115\u0001\u0000\u0000\u0000\u0113\u0111\u0001"+
					"\u0000\u0000\u0000\u0113\u0114\u0001\u0000\u0000\u0000\u01141\u0001\u0000"+
					"\u0000\u0000\u0115\u0113\u0001\u0000\u0000\u0000\u0116\u011b\u00034\u001a"+
					"\u0000\u0117\u0118\u0007\u0006\u0000\u0000\u0118\u011a\u00034\u001a\u0000"+
					"\u0119\u0117\u0001\u0000\u0000\u0000\u011a\u011d\u0001\u0000\u0000\u0000"+
					"\u011b\u0119\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000\u0000\u0000"+
					"\u011c3\u0001\u0000\u0000\u0000\u011d\u011b\u0001\u0000\u0000\u0000\u011e"+
					"\u0122\u00036\u001b\u0000\u011f\u0120\u0007\u0007\u0000\u0000\u0120\u0122"+
					"\u00034\u001a\u0000\u0121\u011e\u0001\u0000\u0000\u0000\u0121\u011f\u0001"+
					"\u0000\u0000\u0000\u01225\u0001\u0000\u0000\u0000\u0123\u012e\u0005+\u0000"+
					"\u0000\u0124\u012e\u0005,\u0000\u0000\u0125\u012e\u0005-\u0000\u0000\u0126"+
					"\u012e\u0005.\u0000\u0000\u0127\u012e\u0005/\u0000\u0000\u0128\u012e\u0005"+
					"1\u0000\u0000\u0129\u012a\u0005%\u0000\u0000\u012a\u012b\u0003,\u0016"+
					"\u0000\u012b\u012c\u0005&\u0000\u0000\u012c\u012e\u0001\u0000\u0000\u0000"+
					"\u012d\u0123\u0001\u0000\u0000\u0000\u012d\u0124\u0001\u0000\u0000\u0000"+
					"\u012d\u0125\u0001\u0000\u0000\u0000\u012d\u0126\u0001\u0000\u0000\u0000"+
					"\u012d\u0127\u0001\u0000\u0000\u0000\u012d\u0128\u0001\u0000\u0000\u0000"+
					"\u012d\u0129\u0001\u0000\u0000\u0000\u012e7\u0001\u0000\u0000\u0000\u012f"+
					"\u0130\u0006\u001c\uffff\uffff\u0000\u0130\u0133\u0005/\u0000\u0000\u0131"+
					"\u0133\u00051\u0000\u0000\u0132\u012f\u0001\u0000\u0000\u0000\u0132\u0131"+
					"\u0001\u0000\u0000\u0000\u0133\u0139\u0001\u0000\u0000\u0000\u0134\u0135"+
					"\n\u0001\u0000\u0000\u0135\u0136\u0005\u0012\u0000\u0000\u0136\u0138\u0007"+
					"\b\u0000\u0000\u0137\u0134\u0001\u0000\u0000\u0000\u0138\u013b\u0001\u0000"+
					"\u0000\u0000\u0139\u0137\u0001\u0000\u0000\u0000\u0139\u013a\u0001\u0000"+
					"\u0000\u0000\u013a9\u0001\u0000\u0000\u0000\u013b\u0139\u0001\u0000\u0000"+
					"\u0000\u001f=COQY[bdgknq}\u0080\u0095\u00b3\u00be\u00ce\u00d4\u00d8\u00e2"+
					"\u00eb\u00f7\u00fd\u010b\u0113\u011b\u0121\u012d\u0132\u0139";
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeRuleNames() {
		return new String[] {
				"compilationUnit", "classDeclaration", "classBody", "classBodyDeclaration",
				"fieldDeclaration", "methodDeclaration", "normalMethodDeclaration", "mainMethodDeclaration",
				"methodBody", "type", "incrementStatement", "decrementStatement", "declarationStatement",
				"statement", "assignmentStatement", "printStatement", "ifStatement",
				"elseIfStatement", "elseStatement", "whileStatement", "returnStatement",
				"expressionStatement", "expression", "logicalExpression", "comparisonExpression",
				"mathExpression", "unaryExpression", "primaryExpression", "printExpression"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();

	private static String[] makeLiteralNames() {
		return new String[] {
				null, "'class'", "'public'", "'static'", "'void'", "'main'", "'String'",
				"'int'", "'char'", "'boolean'", "'float'", "'extends'", "'return'", "'if'",
				"'else if'", "'else'", "'while'", "'System.out.println'", "'+'", "'-'",
				"'*'", "'/'", "'='", "'>'", "'<'", "'\"'", "'<='", "'>='", "'=='", "'!='",
				"'&&'", "'||'", "'.'", "'++'", "'--'", "';'", "','", "'('", "')'", "'{'",
				"'}'", "'['", "']'"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SimpleJava.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SimpleJavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SimpleJavaParser.EOF, 0); }
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitCompilationUnit(this);
		}
	}

	private static String[] makeSymbolicNames() {
		return new String[] {
				null, "Class", "Public", "Static", "Void", "Main", "String", "Int", "Char",
				"Bool", "Float", "Extends", "Return", "If", "ElseIf", "Else", "While",
				"Print", "Plus", "Minus", "Multiply", "Divide", "Equals", "GreaterThan",
				"LessThan", "DoubleQuote", "LessThanOrEqual", "GreaterThanOrEqual", "Equal",
				"NotEqual", "And", "Or", "Dot", "Increment", "Decrement", "Semicolon",
				"Comma", "LeftParen", "RightParen", "LeftCurly", "RightCurly", "LeftSquareBracket",
				"RightSquareBracket", "IntegerLiteral", "FloatLiteral", "CharLiteral",
				"BoolLiteral", "StringLiteral", "Whitespace", "Identifier"
		};
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Class || _la==Public) {
					{
						{
							setState(58);
							classDeclaration();
						}
					}
					setState(63);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(64);
				match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Public) {
					{
						setState(66);
						match(Public);
					}
				}

				setState(69);
				match(Class);
				setState(70);
				match(Identifier);
				setState(71);
				classBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassBodyContext extends ParserRuleContext {
		public TerminalNode LeftCurly() { return getToken(SimpleJavaParser.LeftCurly, 0); }
		public ClassBodyDeclarationContext classBodyDeclaration() {
			return getRuleContext(ClassBodyDeclarationContext.class,0);
		}
		public TerminalNode RightCurly() { return getToken(SimpleJavaParser.RightCurly, 0); }
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitClassBody(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(73);
				match(LeftCurly);
				setState(74);
				classBodyDeclaration();
				setState(75);
				_la = _input.LA(1);
				if ( !(_la==RightCurly) ) {
					_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public List<FieldDeclarationContext> fieldDeclaration() {
			return getRuleContexts(FieldDeclarationContext.class);
		}
		public FieldDeclarationContext fieldDeclaration(int i) {
			return getRuleContext(FieldDeclarationContext.class,i);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitClassBodyDeclaration(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classBodyDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 562949953423324L) != 0)) {
					{
						setState(79);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
							case 1:
							{
								setState(77);
								methodDeclaration();
							}
							break;
							case 2:
							{
								setState(78);
								fieldDeclaration();
							}
							break;
						}
					}
					setState(83);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FieldDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(SimpleJavaParser.Identifier, 0); }
		public TerminalNode Semicolon() { return getToken(SimpleJavaParser.Semicolon, 0); }
		public List<FieldDeclarationContext> fieldDeclaration() {
			return getRuleContexts(FieldDeclarationContext.class);
		}
		public FieldDeclarationContext fieldDeclaration(int i) {
			return getRuleContext(FieldDeclarationContext.class,i);
		}
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitFieldDeclaration(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fieldDeclaration);
		try {
			int _alt;
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(84);
					type();
					setState(85);
					match(Identifier);
					setState(86);
					match(Semicolon);
					setState(91);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
								setState(89);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
									case 1:
									{
										setState(87);
										fieldDeclaration();
									}
									break;
									case 2:
									{
										setState(88);
										methodDeclaration();
									}
									break;
								}
							}
						}
						setState(93);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
					}
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(94);
					type();
					setState(95);
					assignmentStatement();
					setState(100);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
								setState(98);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
									case 1:
									{
										setState(96);
										fieldDeclaration();
									}
									break;
									case 2:
									{
										setState(97);
										methodDeclaration();
									}
									break;
								}
							}
						}
						setState(102);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
					}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodDeclarationContext extends ParserRuleContext {
		public MainMethodDeclarationContext mainMethodDeclaration() {
			return getRuleContext(MainMethodDeclarationContext.class,0);
		}
		public NormalMethodDeclarationContext normalMethodDeclaration() {
			return getRuleContext(NormalMethodDeclarationContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_methodDeclaration);
		try {
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(105);
					mainMethodDeclaration();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(106);
					normalMethodDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NormalMethodDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(SimpleJavaParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(SimpleJavaParser.Identifier, i);
		}
		public TerminalNode LeftParen() { return getToken(SimpleJavaParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(SimpleJavaParser.RightParen, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<TerminalNode> Void() { return getTokens(SimpleJavaParser.Void); }
		public TerminalNode Void(int i) {
			return getToken(SimpleJavaParser.Void, i);
		}
		public List<TerminalNode> Int() { return getTokens(SimpleJavaParser.Int); }
		public TerminalNode Int(int i) {
			return getToken(SimpleJavaParser.Int, i);
		}
		public List<TerminalNode> String() { return getTokens(SimpleJavaParser.String); }
		public TerminalNode String(int i) {
			return getToken(SimpleJavaParser.String, i);
		}
		public List<TerminalNode> Char() { return getTokens(SimpleJavaParser.Char); }
		public TerminalNode Char(int i) {
			return getToken(SimpleJavaParser.Char, i);
		}
		public List<TerminalNode> Bool() { return getTokens(SimpleJavaParser.Bool); }
		public TerminalNode Bool(int i) {
			return getToken(SimpleJavaParser.Bool, i);
		}
		public List<TerminalNode> Float() { return getTokens(SimpleJavaParser.Float); }
		public TerminalNode Float(int i) {
			return getToken(SimpleJavaParser.Float, i);
		}
		public TerminalNode Public() { return getToken(SimpleJavaParser.Public, 0); }
		public TerminalNode Static() { return getToken(SimpleJavaParser.Static, 0); }
		public List<TerminalNode> Comma() { return getTokens(SimpleJavaParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SimpleJavaParser.Comma, i);
		}
		public NormalMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterNormalMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitNormalMethodDeclaration(this);
		}
	}

	public final NormalMethodDeclarationContext normalMethodDeclaration() throws RecognitionException {
		NormalMethodDeclarationContext _localctx = new NormalMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_normalMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Public) {
					{
						setState(109);
						match(Public);
					}
				}

				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Static) {
					{
						setState(112);
						match(Static);
					}
				}

				setState(115);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2000L) != 0)) ) {
					_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(116);
				match(Identifier);
				setState(117);
				match(LeftParen);
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2000L) != 0)) {
					{
						setState(118);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2000L) != 0)) ) {
							_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(119);
						match(Identifier);
						setState(125);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Comma) {
							{
								{
									setState(120);
									match(Comma);
									setState(121);
									_la = _input.LA(1);
									if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2000L) != 0)) ) {
										_errHandler.recoverInline(this);
									}
									else {
										if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
										_errHandler.reportMatch(this);
										consume();
									}
									setState(122);
									match(Identifier);
								}
							}
							setState(127);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
					}
				}

				setState(130);
				match(RightParen);
				setState(131);
				methodBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public final MainMethodDeclarationContext mainMethodDeclaration() throws RecognitionException {
		MainMethodDeclarationContext _localctx = new MainMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_mainMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(133);
				match(Public);
				setState(134);
				match(Static);
				setState(135);
				match(Void);
				setState(136);
				match(Main);
				setState(137);
				match(LeftParen);
				setState(138);
				match(String);
				setState(139);
				match(LeftSquareBracket);
				setState(140);
				match(RightSquareBracket);
				setState(141);
				match(Identifier);
				setState(142);
				match(RightParen);
				setState(143);
				methodBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_methodBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(145);
				match(LeftCurly);
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 835766277060544L) != 0)) {
					{
						{
							setState(146);
							statement();
						}
					}
					setState(151);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(152);
				_la = _input.LA(1);
				if ( !(_la==RightCurly) ) {
					_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(154);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 562949953423296L) != 0)) ) {
					_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public final IncrementStatementContext incrementStatement() throws RecognitionException {
		IncrementStatementContext _localctx = new IncrementStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_incrementStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(156);
				match(Identifier);
				setState(157);
				match(Increment);
				setState(158);
				match(Semicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public final DecrementStatementContext decrementStatement() throws RecognitionException {
		DecrementStatementContext _localctx = new DecrementStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_decrementStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(160);
				match(Identifier);
				setState(161);
				match(Decrement);
				setState(162);
				match(Semicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public final DeclarationStatementContext declarationStatement() throws RecognitionException {
		DeclarationStatementContext _localctx = new DeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_declarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(164);
				type();
				setState(165);
				match(Identifier);
				setState(166);
				match(Equals);
				setState(167);
				primaryExpression();
				setState(168);
				match(Semicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(179);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
					{
						setState(170);
						declarationStatement();
					}
					break;
					case 2:
					{
						setState(171);
						assignmentStatement();
					}
					break;
					case 3:
					{
						setState(172);
						ifStatement();
					}
					break;
					case 4:
					{
						setState(173);
						whileStatement();
					}
					break;
					case 5:
					{
						setState(174);
						returnStatement();
					}
					break;
					case 6:
					{
						setState(175);
						expressionStatement();
					}
					break;
					case 7:
					{
						setState(176);
						incrementStatement();
					}
					break;
					case 8:
					{
						setState(177);
						decrementStatement();
					}
					break;
					case 9:
					{
						setState(178);
						printStatement();
					}
					break;
				}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assignmentStatement);
		int _la;
		try {
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(181);
					match(Identifier);
					setState(182);
					match(Equals);
					setState(183);
					expression();
					setState(184);
					match(Semicolon);
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(186);
					match(Identifier);
					setState(187);
					match(Equals);
					setState(188);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 272678883688448L) != 0)) ) {
						_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(189);
					match(Semicolon);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DecrementStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SimpleJavaParser.Identifier, 0); }
		public TerminalNode Decrement() { return getToken(SimpleJavaParser.Decrement, 0); }
		public TerminalNode Semicolon() { return getToken(SimpleJavaParser.Semicolon, 0); }
		public DecrementStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decrementStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterDecrementStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitDecrementStatement(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(192);
				match(Print);
				setState(193);
				match(LeftParen);
				setState(194);
				printExpression(0);
				setState(195);
				match(RightParen);
				setState(196);
				match(Semicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationStatementContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(SimpleJavaParser.Identifier, 0); }
		public TerminalNode Equals() { return getToken(SimpleJavaParser.Equals, 0); }
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public TerminalNode Semicolon() { return getToken(SimpleJavaParser.Semicolon, 0); }
		public DeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitDeclarationStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(198);
				match(If);
				setState(199);
				match(LeftParen);
				setState(200);
				expression();
				setState(201);
				match(RightParen);
				setState(202);
				match(LeftCurly);
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(203);
							statement();
						}
					}
					setState(206);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 835766277060544L) != 0) );
				setState(208);
				match(RightCurly);
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ElseIf) {
					{
						{
							setState(209);
							elseIfStatement();
						}
					}
					setState(214);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Else) {
					{
						setState(215);
						elseStatement();
					}
				}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public DeclarationStatementContext declarationStatement() {
			return getRuleContext(DeclarationStatementContext.class,0);
		}
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public IncrementStatementContext incrementStatement() {
			return getRuleContext(IncrementStatementContext.class,0);
		}
		public DecrementStatementContext decrementStatement() {
			return getRuleContext(DecrementStatementContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitStatement(this);
		}
	}

	public final ElseIfStatementContext elseIfStatement() throws RecognitionException {
		ElseIfStatementContext _localctx = new ElseIfStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_elseIfStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(218);
				match(ElseIf);
				setState(219);
				match(LeftParen);
				setState(220);
				expression();
				setState(221);
				match(RightParen);
				setState(222);
				match(LeftCurly);
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(223);
							statement();
						}
					}
					setState(226);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 835766277060544L) != 0) );
				setState(228);
				match(RightCurly);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_elseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(230);
				match(Else);
				setState(231);
				match(LeftCurly);
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(232);
							statement();
						}
					}
					setState(235);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 835766277060544L) != 0) );
				setState(237);
				match(RightCurly);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(239);
				match(While);
				setState(240);
				match(LeftParen);
				setState(241);
				expression();
				setState(242);
				match(RightParen);
				setState(243);
				match(LeftCurly);
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(244);
							statement();
						}
					}
					setState(247);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 835766277060544L) != 0) );
				setState(249);
				match(RightCurly);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(251);
				match(Return);
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 835766276849664L) != 0)) {
					{
						setState(252);
						expression();
					}
				}

				setState(255);
				match(Semicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(257);
				expression();
				setState(258);
				match(Semicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(260);
				logicalExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public final LogicalExpressionContext logicalExpression() throws RecognitionException {
		LogicalExpressionContext _localctx = new LogicalExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_logicalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(262);
				comparisonExpression();
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==And || _la==Or) {
					{
						{
							setState(263);
							_la = _input.LA(1);
							if ( !(_la==And || _la==Or) ) {
								_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							setState(264);
							comparisonExpression();
						}
					}
					setState(269);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public final ComparisonExpressionContext comparisonExpression() throws RecognitionException {
		ComparisonExpressionContext _localctx = new ComparisonExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_comparisonExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(270);
				mathExpression();
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1031798784L) != 0)) {
					{
						{
							setState(271);
							_la = _input.LA(1);
							if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1031798784L) != 0)) ) {
								_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							setState(272);
							mathExpression();
						}
					}
					setState(277);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public final MathExpressionContext mathExpression() throws RecognitionException {
		MathExpressionContext _localctx = new MathExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_mathExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(278);
				unaryExpression();
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3932160L) != 0)) {
					{
						{
							setState(279);
							_la = _input.LA(1);
							if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3932160L) != 0)) ) {
								_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							setState(280);
							unaryExpression();
						}
					}
					setState(285);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_unaryExpression);
		int _la;
		try {
			setState(289);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case LeftParen:
				case IntegerLiteral:
				case FloatLiteral:
				case CharLiteral:
				case BoolLiteral:
				case StringLiteral:
				case Identifier:
					enterOuterAlt(_localctx, 1);
				{
					setState(286);
					primaryExpression();
				}
				break;
				case Plus:
				case Minus:
					enterOuterAlt(_localctx, 2);
				{
					{
						setState(287);
						_la = _input.LA(1);
						if ( !(_la==Plus || _la==Minus) ) {
							_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(288);
						unaryExpression();
					}
				}
				break;
				default:
					throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_primaryExpression);
		try {
			setState(301);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case IntegerLiteral:
					enterOuterAlt(_localctx, 1);
				{
					setState(291);
					match(IntegerLiteral);
				}
				break;
				case FloatLiteral:
					enterOuterAlt(_localctx, 2);
				{
					setState(292);
					match(FloatLiteral);
				}
				break;
				case CharLiteral:
					enterOuterAlt(_localctx, 3);
				{
					setState(293);
					match(CharLiteral);
				}
				break;
				case BoolLiteral:
					enterOuterAlt(_localctx, 4);
				{
					setState(294);
					match(BoolLiteral);
				}
				break;
				case StringLiteral:
					enterOuterAlt(_localctx, 5);
				{
					setState(295);
					match(StringLiteral);
				}
				break;
				case Identifier:
					enterOuterAlt(_localctx, 6);
				{
					setState(296);
					match(Identifier);
				}
				break;
				case LeftParen:
					enterOuterAlt(_localctx, 7);
				{
					setState(297);
					match(LeftParen);
					setState(298);
					expression();
					setState(299);
					match(RightParen);
				}
				break;
				default:
					throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public final PrintExpressionContext printExpression() throws RecognitionException {
		return printExpression(0);
	}

	private PrintExpressionContext printExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrintExpressionContext _localctx = new PrintExpressionContext(_ctx, _parentState);
		PrintExpressionContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_printExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(306);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
					case StringLiteral:
					{
						setState(304);
						match(StringLiteral);
					}
					break;
					case Identifier:
					{
						setState(305);
						match(Identifier);
					}
					break;
					default:
						throw new NoViableAltException(this);
				}
				_ctx.stop = _input.LT(-1);
				setState(313);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						if ( _parseListeners!=null ) triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							{
								_localctx = new PrintExpressionContext(_parentctx, _parentState);
								pushNewRecursionContext(_localctx, _startState, RULE_printExpression);
								setState(308);
								if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
								setState(309);
								match(Plus);
								setState(310);
								_la = _input.LA(1);
								if ( !(_la==StringLiteral || _la==Identifier) ) {
									_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
							}
						}
					}
					setState(315);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
			case 28:
				return printExpression_sempred((PrintExpressionContext)_localctx, predIndex);
		}
		return true;
	}

	private boolean printExpression_sempred(PrintExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
			case 0:
				return precpred(_ctx, 1);
		}
		return true;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(SimpleJavaParser.Class, 0); }
		public TerminalNode Identifier() { return getToken(SimpleJavaParser.Identifier, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode Public() { return getToken(SimpleJavaParser.Public, 0); }
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitClassDeclaration(this);
		}
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MainMethodDeclarationContext extends ParserRuleContext {
		public MainMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode Public() { return getToken(SimpleJavaParser.Public, 0); }

		public TerminalNode Static() { return getToken(SimpleJavaParser.Static, 0); }

		public TerminalNode Void() { return getToken(SimpleJavaParser.Void, 0); }

		public TerminalNode Main() { return getToken(SimpleJavaParser.Main, 0); }

		public TerminalNode LeftParen() { return getToken(SimpleJavaParser.LeftParen, 0); }

		public TerminalNode String() { return getToken(SimpleJavaParser.String, 0); }

		public TerminalNode LeftSquareBracket() { return getToken(SimpleJavaParser.LeftSquareBracket, 0); }

		public TerminalNode RightSquareBracket() { return getToken(SimpleJavaParser.RightSquareBracket, 0); }

		public TerminalNode Identifier() { return getToken(SimpleJavaParser.Identifier, 0); }

		public TerminalNode RightParen() { return getToken(SimpleJavaParser.RightParen, 0); }

		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_mainMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterMainMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitMainMethodDeclaration(this);
		}
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitExpression(this);
		}
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodBodyContext extends ParserRuleContext {
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode LeftCurly() { return getToken(SimpleJavaParser.LeftCurly, 0); }

		public TerminalNode RightCurly() { return getToken(SimpleJavaParser.RightCurly, 0); }

		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}

		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}

		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitMethodBody(this);
		}
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalExpressionContext extends ParserRuleContext {
		public List<ComparisonExpressionContext> comparisonExpression() {
			return getRuleContexts(ComparisonExpressionContext.class);
		}
		public ComparisonExpressionContext comparisonExpression(int i) {
			return getRuleContext(ComparisonExpressionContext.class,i);
		}
		public List<TerminalNode> And() { return getTokens(SimpleJavaParser.And); }
		public TerminalNode And(int i) {
			return getToken(SimpleJavaParser.And, i);
		}
		public List<TerminalNode> Or() { return getTokens(SimpleJavaParser.Or); }
		public TerminalNode Or(int i) {
			return getToken(SimpleJavaParser.Or, i);
		}
		public LogicalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterLogicalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitLogicalExpression(this);
		}
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode Int() { return getToken(SimpleJavaParser.Int, 0); }

		public TerminalNode Char() { return getToken(SimpleJavaParser.Char, 0); }

		public TerminalNode Bool() { return getToken(SimpleJavaParser.Bool, 0); }

		public TerminalNode Float() { return getToken(SimpleJavaParser.Float, 0); }
		public TerminalNode Identifier() { return getToken(SimpleJavaParser.Identifier, 0); }

		public TerminalNode String() { return getToken(SimpleJavaParser.String, 0); }

		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitType(this);
		}
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonExpressionContext extends ParserRuleContext {
		public List<MathExpressionContext> mathExpression() {
			return getRuleContexts(MathExpressionContext.class);
		}
		public MathExpressionContext mathExpression(int i) {
			return getRuleContext(MathExpressionContext.class,i);
		}
		public List<TerminalNode> LessThan() { return getTokens(SimpleJavaParser.LessThan); }
		public TerminalNode LessThan(int i) {
			return getToken(SimpleJavaParser.LessThan, i);
		}
		public List<TerminalNode> GreaterThan() { return getTokens(SimpleJavaParser.GreaterThan); }
		public TerminalNode GreaterThan(int i) {
			return getToken(SimpleJavaParser.GreaterThan, i);
		}
		public List<TerminalNode> LessThanOrEqual() { return getTokens(SimpleJavaParser.LessThanOrEqual); }
		public TerminalNode LessThanOrEqual(int i) {
			return getToken(SimpleJavaParser.LessThanOrEqual, i);
		}
		public List<TerminalNode> GreaterThanOrEqual() { return getTokens(SimpleJavaParser.GreaterThanOrEqual); }
		public TerminalNode GreaterThanOrEqual(int i) {
			return getToken(SimpleJavaParser.GreaterThanOrEqual, i);
		}
		public List<TerminalNode> Equal() { return getTokens(SimpleJavaParser.Equal); }
		public TerminalNode Equal(int i) {
			return getToken(SimpleJavaParser.Equal, i);
		}
		public List<TerminalNode> NotEqual() { return getTokens(SimpleJavaParser.NotEqual); }
		public TerminalNode NotEqual(int i) {
			return getToken(SimpleJavaParser.NotEqual, i);
		}
		public ComparisonExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterComparisonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitComparisonExpression(this);
		}
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IncrementStatementContext extends ParserRuleContext {
		public IncrementStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode Identifier() { return getToken(SimpleJavaParser.Identifier, 0); }

		public TerminalNode Increment() { return getToken(SimpleJavaParser.Increment, 0); }

		public TerminalNode Semicolon() { return getToken(SimpleJavaParser.Semicolon, 0); }

		@Override public int getRuleIndex() { return RULE_incrementStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterIncrementStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitIncrementStatement(this);
		}
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MathExpressionContext extends ParserRuleContext {
		public List<UnaryExpressionContext> unaryExpression() {
			return getRuleContexts(UnaryExpressionContext.class);
		}
		public UnaryExpressionContext unaryExpression(int i) {
			return getRuleContext(UnaryExpressionContext.class,i);
		}
		public List<TerminalNode> Plus() { return getTokens(SimpleJavaParser.Plus); }
		public TerminalNode Plus(int i) {
			return getToken(SimpleJavaParser.Plus, i);
		}
		public List<TerminalNode> Minus() { return getTokens(SimpleJavaParser.Minus); }
		public TerminalNode Minus(int i) {
			return getToken(SimpleJavaParser.Minus, i);
		}
		public List<TerminalNode> Multiply() { return getTokens(SimpleJavaParser.Multiply); }
		public TerminalNode Multiply(int i) {
			return getToken(SimpleJavaParser.Multiply, i);
		}
		public List<TerminalNode> Divide() { return getTokens(SimpleJavaParser.Divide); }
		public TerminalNode Divide(int i) {
			return getToken(SimpleJavaParser.Divide, i);
		}
		public MathExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterMathExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitMathExpression(this);
		}
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentStatementContext extends ParserRuleContext {
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode Identifier() { return getToken(SimpleJavaParser.Identifier, 0); }

		public TerminalNode Equals() { return getToken(SimpleJavaParser.Equals, 0); }
		public TerminalNode Semicolon() { return getToken(SimpleJavaParser.Semicolon, 0); }

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}

		public TerminalNode CharLiteral() { return getToken(SimpleJavaParser.CharLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(SimpleJavaParser.StringLiteral, 0); }

		public TerminalNode FloatLiteral() { return getToken(SimpleJavaParser.FloatLiteral, 0); }

		public TerminalNode IntegerLiteral() { return getToken(SimpleJavaParser.IntegerLiteral, 0); }

		public TerminalNode BoolLiteral() { return getToken(SimpleJavaParser.BoolLiteral, 0); }

		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitAssignmentStatement(this);
		}
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode Plus() { return getToken(SimpleJavaParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(SimpleJavaParser.Minus, 0); }
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitUnaryExpression(this);
		}
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrintStatementContext extends ParserRuleContext {
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode Print() { return getToken(SimpleJavaParser.Print, 0); }

		public TerminalNode LeftParen() { return getToken(SimpleJavaParser.LeftParen, 0); }

		public PrintExpressionContext printExpression() {
			return getRuleContext(PrintExpressionContext.class,0);
		}

		public TerminalNode RightParen() { return getToken(SimpleJavaParser.RightParen, 0); }

		public TerminalNode Semicolon() { return getToken(SimpleJavaParser.Semicolon, 0); }

		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitPrintStatement(this);
		}
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExpressionContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(SimpleJavaParser.IntegerLiteral, 0); }
		public TerminalNode FloatLiteral() { return getToken(SimpleJavaParser.FloatLiteral, 0); }
		public TerminalNode CharLiteral() { return getToken(SimpleJavaParser.CharLiteral, 0); }
		public TerminalNode BoolLiteral() { return getToken(SimpleJavaParser.BoolLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(SimpleJavaParser.StringLiteral, 0); }
		public TerminalNode Identifier() { return getToken(SimpleJavaParser.Identifier, 0); }
		public TerminalNode LeftParen() { return getToken(SimpleJavaParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(SimpleJavaParser.RightParen, 0); }
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitPrimaryExpression(this);
		}
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(SimpleJavaParser.If, 0); }
		public TerminalNode LeftParen() { return getToken(SimpleJavaParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(SimpleJavaParser.RightParen, 0); }
		public TerminalNode LeftCurly() { return getToken(SimpleJavaParser.LeftCurly, 0); }
		public TerminalNode RightCurly() { return getToken(SimpleJavaParser.RightCurly, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<ElseIfStatementContext> elseIfStatement() {
			return getRuleContexts(ElseIfStatementContext.class);
		}
		public ElseIfStatementContext elseIfStatement(int i) {
			return getRuleContext(ElseIfStatementContext.class,i);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitIfStatement(this);
		}
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElseIfStatementContext extends ParserRuleContext {
		public ElseIfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		public TerminalNode LeftParen() { return getToken(SimpleJavaParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(SimpleJavaParser.RightParen, 0); }
		public TerminalNode LeftCurly() { return getToken(SimpleJavaParser.LeftCurly, 0); }
		public TerminalNode RightCurly() { return getToken(SimpleJavaParser.RightCurly, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}

		public TerminalNode ElseIf() { return getToken(SimpleJavaParser.ElseIf, 0); }

		@Override public int getRuleIndex() { return RULE_elseIfStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterElseIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitElseIfStatement(this);
		}
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElseStatementContext extends ParserRuleContext {
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode Else() { return getToken(SimpleJavaParser.Else, 0); }

		public TerminalNode LeftCurly() { return getToken(SimpleJavaParser.LeftCurly, 0); }

		public TerminalNode RightCurly() { return getToken(SimpleJavaParser.RightCurly, 0); }

		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}

		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}

		@Override public int getRuleIndex() { return RULE_elseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitElseStatement(this);
		}
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends ParserRuleContext {
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode While() { return getToken(SimpleJavaParser.While, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}

		public TerminalNode LeftParen() { return getToken(SimpleJavaParser.LeftParen, 0); }

		public TerminalNode RightParen() { return getToken(SimpleJavaParser.RightParen, 0); }

		public TerminalNode LeftCurly() { return getToken(SimpleJavaParser.LeftCurly, 0); }

		public TerminalNode RightCurly() { return getToken(SimpleJavaParser.RightCurly, 0); }

		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}

		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}

		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitWhileStatement(this);
		}
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends ParserRuleContext {
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode Return() { return getToken(SimpleJavaParser.Return, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}

		public TerminalNode Semicolon() { return getToken(SimpleJavaParser.Semicolon, 0); }

		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitReturnStatement(this);
		}
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}

		public TerminalNode Semicolon() { return getToken(SimpleJavaParser.Semicolon, 0); }

		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitExpressionStatement(this);
		}
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrintExpressionContext extends ParserRuleContext {
		public PrintExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode StringLiteral() { return getToken(SimpleJavaParser.StringLiteral, 0); }

		public TerminalNode Identifier() { return getToken(SimpleJavaParser.Identifier, 0); }

		public PrintExpressionContext printExpression() {
			return getRuleContext(PrintExpressionContext.class,0);
		}

		public TerminalNode Plus() { return getToken(SimpleJavaParser.Plus, 0); }

		@Override public int getRuleIndex() { return RULE_printExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).enterPrintExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaListener ) ((SimpleJavaListener)listener).exitPrintExpression(this);
		}
	}
	public static final ATN _ATN =
			new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}