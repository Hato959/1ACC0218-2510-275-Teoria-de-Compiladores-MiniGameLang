// Generated from c:/Users/aaron/Desktop/Compiladores/MiniGame.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MiniGameParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, ID=19, STRING=20, INT=21, NEWLINE=22, WS=23;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_spriteDecl = 2, RULE_eventHandler = 3, 
		RULE_action = 4, RULE_collisionStmt = 5, RULE_showStmt = 6, RULE_stopStmt = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "spriteDecl", "eventHandler", "action", "collisionStmt", 
			"showStmt", "stopStmt"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'game'", "'sprite'", "'at'", "'('", "','", "')'", "'image'", "'on'", 
			"'key'", "'do'", "'move'", "'by'", "'if'", "'collision'", "'then'", "'end'", 
			"'show'", "'stop'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "ID", "STRING", "INT", "NEWLINE", 
			"WS"
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
	public String getGrammarFileName() { return "MiniGame.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiniGameParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(MiniGameParser.STRING, 0); }
		public TerminalNode NEWLINE() { return getToken(MiniGameParser.NEWLINE, 0); }
		public TerminalNode EOF() { return getToken(MiniGameParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			match(T__0);
			setState(17);
			match(STRING);
			setState(18);
			match(NEWLINE);
			setState(22);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 401668L) != 0)) {
				{
				{
				setState(19);
				statement();
				}
				}
				setState(24);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(25);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public SpriteDeclContext spriteDecl() {
			return getRuleContext(SpriteDeclContext.class,0);
		}
		public EventHandlerContext eventHandler() {
			return getRuleContext(EventHandlerContext.class,0);
		}
		public CollisionStmtContext collisionStmt() {
			return getRuleContext(CollisionStmtContext.class,0);
		}
		public ShowStmtContext showStmt() {
			return getRuleContext(ShowStmtContext.class,0);
		}
		public StopStmtContext stopStmt() {
			return getRuleContext(StopStmtContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(32);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(27);
				spriteDecl();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(28);
				eventHandler();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(29);
				collisionStmt();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 4);
				{
				setState(30);
				showStmt();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 5);
				{
				setState(31);
				stopStmt();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SpriteDeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniGameParser.ID, 0); }
		public List<TerminalNode> INT() { return getTokens(MiniGameParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(MiniGameParser.INT, i);
		}
		public TerminalNode STRING() { return getToken(MiniGameParser.STRING, 0); }
		public TerminalNode NEWLINE() { return getToken(MiniGameParser.NEWLINE, 0); }
		public SpriteDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spriteDecl; }
	}

	public final SpriteDeclContext spriteDecl() throws RecognitionException {
		SpriteDeclContext _localctx = new SpriteDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_spriteDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(T__1);
			setState(35);
			match(ID);
			setState(36);
			match(T__2);
			setState(37);
			match(T__3);
			setState(38);
			match(INT);
			setState(39);
			match(T__4);
			setState(40);
			match(INT);
			setState(41);
			match(T__5);
			setState(42);
			match(T__6);
			setState(43);
			match(STRING);
			setState(44);
			match(NEWLINE);
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
	public static class EventHandlerContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(MiniGameParser.STRING, 0); }
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(MiniGameParser.NEWLINE, 0); }
		public EventHandlerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventHandler; }
	}

	public final EventHandlerContext eventHandler() throws RecognitionException {
		EventHandlerContext _localctx = new EventHandlerContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_eventHandler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(T__7);
			setState(47);
			match(T__8);
			setState(48);
			match(STRING);
			setState(49);
			match(T__9);
			setState(50);
			action();
			setState(51);
			match(NEWLINE);
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
	public static class ActionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniGameParser.ID, 0); }
		public List<TerminalNode> INT() { return getTokens(MiniGameParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(MiniGameParser.INT, i);
		}
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(T__10);
			setState(54);
			match(ID);
			setState(55);
			match(T__11);
			setState(56);
			match(T__3);
			setState(57);
			match(INT);
			setState(58);
			match(T__4);
			setState(59);
			match(INT);
			setState(60);
			match(T__5);
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
	public static class CollisionStmtContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MiniGameParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiniGameParser.ID, i);
		}
		public TerminalNode NEWLINE() { return getToken(MiniGameParser.NEWLINE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public CollisionStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collisionStmt; }
	}

	public final CollisionStmtContext collisionStmt() throws RecognitionException {
		CollisionStmtContext _localctx = new CollisionStmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_collisionStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(T__12);
			setState(63);
			match(T__13);
			setState(64);
			match(T__3);
			setState(65);
			match(ID);
			setState(66);
			match(T__4);
			setState(67);
			match(ID);
			setState(68);
			match(T__5);
			setState(69);
			match(T__14);
			setState(70);
			match(NEWLINE);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 401668L) != 0)) {
				{
				{
				setState(71);
				statement();
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77);
			match(T__15);
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
	public static class ShowStmtContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(MiniGameParser.STRING, 0); }
		public TerminalNode NEWLINE() { return getToken(MiniGameParser.NEWLINE, 0); }
		public ShowStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showStmt; }
	}

	public final ShowStmtContext showStmt() throws RecognitionException {
		ShowStmtContext _localctx = new ShowStmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_showStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(T__16);
			setState(80);
			match(STRING);
			setState(81);
			match(NEWLINE);
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
	public static class StopStmtContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(MiniGameParser.NEWLINE, 0); }
		public StopStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stopStmt; }
	}

	public final StopStmtContext stopStmt() throws RecognitionException {
		StopStmtContext _localctx = new StopStmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stopStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(T__17);
			setState(84);
			match(NEWLINE);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0017W\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u0015\b\u0000\n"+
		"\u0000\f\u0000\u0018\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001!\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005I\b\u0005\n\u0005\f\u0005L\t\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0000\u0000\b\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0000\u0000T\u0000\u0010\u0001\u0000\u0000\u0000\u0002"+
		" \u0001\u0000\u0000\u0000\u0004\"\u0001\u0000\u0000\u0000\u0006.\u0001"+
		"\u0000\u0000\u0000\b5\u0001\u0000\u0000\u0000\n>\u0001\u0000\u0000\u0000"+
		"\fO\u0001\u0000\u0000\u0000\u000eS\u0001\u0000\u0000\u0000\u0010\u0011"+
		"\u0005\u0001\u0000\u0000\u0011\u0012\u0005\u0014\u0000\u0000\u0012\u0016"+
		"\u0005\u0016\u0000\u0000\u0013\u0015\u0003\u0002\u0001\u0000\u0014\u0013"+
		"\u0001\u0000\u0000\u0000\u0015\u0018\u0001\u0000\u0000\u0000\u0016\u0014"+
		"\u0001\u0000\u0000\u0000\u0016\u0017\u0001\u0000\u0000\u0000\u0017\u0019"+
		"\u0001\u0000\u0000\u0000\u0018\u0016\u0001\u0000\u0000\u0000\u0019\u001a"+
		"\u0005\u0000\u0000\u0001\u001a\u0001\u0001\u0000\u0000\u0000\u001b!\u0003"+
		"\u0004\u0002\u0000\u001c!\u0003\u0006\u0003\u0000\u001d!\u0003\n\u0005"+
		"\u0000\u001e!\u0003\f\u0006\u0000\u001f!\u0003\u000e\u0007\u0000 \u001b"+
		"\u0001\u0000\u0000\u0000 \u001c\u0001\u0000\u0000\u0000 \u001d\u0001\u0000"+
		"\u0000\u0000 \u001e\u0001\u0000\u0000\u0000 \u001f\u0001\u0000\u0000\u0000"+
		"!\u0003\u0001\u0000\u0000\u0000\"#\u0005\u0002\u0000\u0000#$\u0005\u0013"+
		"\u0000\u0000$%\u0005\u0003\u0000\u0000%&\u0005\u0004\u0000\u0000&\'\u0005"+
		"\u0015\u0000\u0000\'(\u0005\u0005\u0000\u0000()\u0005\u0015\u0000\u0000"+
		")*\u0005\u0006\u0000\u0000*+\u0005\u0007\u0000\u0000+,\u0005\u0014\u0000"+
		"\u0000,-\u0005\u0016\u0000\u0000-\u0005\u0001\u0000\u0000\u0000./\u0005"+
		"\b\u0000\u0000/0\u0005\t\u0000\u000001\u0005\u0014\u0000\u000012\u0005"+
		"\n\u0000\u000023\u0003\b\u0004\u000034\u0005\u0016\u0000\u00004\u0007"+
		"\u0001\u0000\u0000\u000056\u0005\u000b\u0000\u000067\u0005\u0013\u0000"+
		"\u000078\u0005\f\u0000\u000089\u0005\u0004\u0000\u00009:\u0005\u0015\u0000"+
		"\u0000:;\u0005\u0005\u0000\u0000;<\u0005\u0015\u0000\u0000<=\u0005\u0006"+
		"\u0000\u0000=\t\u0001\u0000\u0000\u0000>?\u0005\r\u0000\u0000?@\u0005"+
		"\u000e\u0000\u0000@A\u0005\u0004\u0000\u0000AB\u0005\u0013\u0000\u0000"+
		"BC\u0005\u0005\u0000\u0000CD\u0005\u0013\u0000\u0000DE\u0005\u0006\u0000"+
		"\u0000EF\u0005\u000f\u0000\u0000FJ\u0005\u0016\u0000\u0000GI\u0003\u0002"+
		"\u0001\u0000HG\u0001\u0000\u0000\u0000IL\u0001\u0000\u0000\u0000JH\u0001"+
		"\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KM\u0001\u0000\u0000\u0000"+
		"LJ\u0001\u0000\u0000\u0000MN\u0005\u0010\u0000\u0000N\u000b\u0001\u0000"+
		"\u0000\u0000OP\u0005\u0011\u0000\u0000PQ\u0005\u0014\u0000\u0000QR\u0005"+
		"\u0016\u0000\u0000R\r\u0001\u0000\u0000\u0000ST\u0005\u0012\u0000\u0000"+
		"TU\u0005\u0016\u0000\u0000U\u000f\u0001\u0000\u0000\u0000\u0003\u0016"+
		" J";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}