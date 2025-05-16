// Generated from c:/Users/aaron/Documents/GitHub/1ACC0218-2510-275-Teoria-de-Compiladores-MiniGameLang/MiniGame.g4 by ANTLR 4.13.1
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
		T__17=18, ID=19, CADENA=20, NUM=21, NL=22, ESPACIOS=23;
	public static final int
		RULE_program = 0, RULE_instruccion = 1, RULE_crearSprite = 2, RULE_eventoTecla = 3, 
		RULE_accion = 4, RULE_colision = 5, RULE_mostrarTexto = 6, RULE_detener = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "instruccion", "crearSprite", "eventoTecla", "accion", "colision", 
			"mostrarTexto", "detener"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'juego'", "'sprite'", "'en'", "'('", "','", "')'", "'imagen'", 
			"'al'", "'presionar'", "'hacer'", "'mover'", "'por'", "'si'", "'colisionan'", 
			"'entonces'", "'fin'", "'mostrar'", "'detener'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "ID", "CADENA", "NUM", "NL", 
			"ESPACIOS"
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
		public TerminalNode CADENA() { return getToken(MiniGameParser.CADENA, 0); }
		public TerminalNode NL() { return getToken(MiniGameParser.NL, 0); }
		public TerminalNode EOF() { return getToken(MiniGameParser.EOF, 0); }
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
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
			match(CADENA);
			setState(18);
			match(NL);
			setState(22);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 401668L) != 0)) {
				{
				{
				setState(19);
				instruccion();
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
	public static class InstruccionContext extends ParserRuleContext {
		public CrearSpriteContext crearSprite() {
			return getRuleContext(CrearSpriteContext.class,0);
		}
		public EventoTeclaContext eventoTecla() {
			return getRuleContext(EventoTeclaContext.class,0);
		}
		public ColisionContext colision() {
			return getRuleContext(ColisionContext.class,0);
		}
		public MostrarTextoContext mostrarTexto() {
			return getRuleContext(MostrarTextoContext.class,0);
		}
		public DetenerContext detener() {
			return getRuleContext(DetenerContext.class,0);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instruccion);
		try {
			setState(32);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(27);
				crearSprite();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(28);
				eventoTecla();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(29);
				colision();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 4);
				{
				setState(30);
				mostrarTexto();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 5);
				{
				setState(31);
				detener();
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
	public static class CrearSpriteContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniGameParser.ID, 0); }
		public List<TerminalNode> NUM() { return getTokens(MiniGameParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(MiniGameParser.NUM, i);
		}
		public TerminalNode CADENA() { return getToken(MiniGameParser.CADENA, 0); }
		public TerminalNode NL() { return getToken(MiniGameParser.NL, 0); }
		public CrearSpriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crearSprite; }
	}

	public final CrearSpriteContext crearSprite() throws RecognitionException {
		CrearSpriteContext _localctx = new CrearSpriteContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_crearSprite);
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
			match(NUM);
			setState(39);
			match(T__4);
			setState(40);
			match(NUM);
			setState(41);
			match(T__5);
			setState(42);
			match(T__6);
			setState(43);
			match(CADENA);
			setState(44);
			match(NL);
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
	public static class EventoTeclaContext extends ParserRuleContext {
		public TerminalNode CADENA() { return getToken(MiniGameParser.CADENA, 0); }
		public AccionContext accion() {
			return getRuleContext(AccionContext.class,0);
		}
		public TerminalNode NL() { return getToken(MiniGameParser.NL, 0); }
		public EventoTeclaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventoTecla; }
	}

	public final EventoTeclaContext eventoTecla() throws RecognitionException {
		EventoTeclaContext _localctx = new EventoTeclaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_eventoTecla);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(T__7);
			setState(47);
			match(T__8);
			setState(48);
			match(CADENA);
			setState(49);
			match(T__9);
			setState(50);
			accion();
			setState(51);
			match(NL);
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
	public static class AccionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniGameParser.ID, 0); }
		public List<TerminalNode> NUM() { return getTokens(MiniGameParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(MiniGameParser.NUM, i);
		}
		public AccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accion; }
	}

	public final AccionContext accion() throws RecognitionException {
		AccionContext _localctx = new AccionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_accion);
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
			match(NUM);
			setState(58);
			match(T__4);
			setState(59);
			match(NUM);
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
	public static class ColisionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MiniGameParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiniGameParser.ID, i);
		}
		public TerminalNode NL() { return getToken(MiniGameParser.NL, 0); }
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public ColisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colision; }
	}

	public final ColisionContext colision() throws RecognitionException {
		ColisionContext _localctx = new ColisionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_colision);
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
			match(NL);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 401668L) != 0)) {
				{
				{
				setState(71);
				instruccion();
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
	public static class MostrarTextoContext extends ParserRuleContext {
		public TerminalNode CADENA() { return getToken(MiniGameParser.CADENA, 0); }
		public TerminalNode NL() { return getToken(MiniGameParser.NL, 0); }
		public MostrarTextoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mostrarTexto; }
	}

	public final MostrarTextoContext mostrarTexto() throws RecognitionException {
		MostrarTextoContext _localctx = new MostrarTextoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_mostrarTexto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(T__16);
			setState(80);
			match(CADENA);
			setState(81);
			match(NL);
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
	public static class DetenerContext extends ParserRuleContext {
		public TerminalNode NL() { return getToken(MiniGameParser.NL, 0); }
		public DetenerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_detener; }
	}

	public final DetenerContext detener() throws RecognitionException {
		DetenerContext _localctx = new DetenerContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_detener);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(T__17);
			setState(84);
			match(NL);
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