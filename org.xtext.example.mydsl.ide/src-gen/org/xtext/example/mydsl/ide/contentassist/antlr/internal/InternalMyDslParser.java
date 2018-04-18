package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SIMBOLO", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'-'", "'*'", "'expt'", "'/'", "'>'", "'<'", "'>='", "'<='", "'('", "')'", "'cond'", "'else'", "'define'"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=6;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_SIMBOLO=4;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


    	private MyDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleModel EOF )
            // InternalMyDsl.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:62:1: ruleModel : ( ( rule__Model__GreetingsAssignment ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Model__GreetingsAssignment ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__Model__GreetingsAssignment ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Model__GreetingsAssignment ) )
            // InternalMyDsl.g:68:3: ( rule__Model__GreetingsAssignment )
            {
             before(grammarAccess.getModelAccess().getGreetingsAssignment()); 
            // InternalMyDsl.g:69:3: ( rule__Model__GreetingsAssignment )
            // InternalMyDsl.g:69:4: rule__Model__GreetingsAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Model__GreetingsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGreetingsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleGreeting"
    // InternalMyDsl.g:78:1: entryRuleGreeting : ruleGreeting EOF ;
    public final void entryRuleGreeting() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleGreeting EOF )
            // InternalMyDsl.g:80:1: ruleGreeting EOF
            {
             before(grammarAccess.getGreetingRule()); 
            pushFollow(FOLLOW_1);
            ruleGreeting();

            state._fsp--;

             after(grammarAccess.getGreetingRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGreeting"


    // $ANTLR start "ruleGreeting"
    // InternalMyDsl.g:87:1: ruleGreeting : ( ( rule__Greeting__Alternatives ) ) ;
    public final void ruleGreeting() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Greeting__Alternatives ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Greeting__Alternatives ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Greeting__Alternatives ) )
            // InternalMyDsl.g:93:3: ( rule__Greeting__Alternatives )
            {
             before(grammarAccess.getGreetingAccess().getAlternatives()); 
            // InternalMyDsl.g:94:3: ( rule__Greeting__Alternatives )
            // InternalMyDsl.g:94:4: rule__Greeting__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Greeting__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGreetingAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGreeting"


    // $ANTLR start "entryRuleOp"
    // InternalMyDsl.g:103:1: entryRuleOp : ruleOp EOF ;
    public final void entryRuleOp() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleOp EOF )
            // InternalMyDsl.g:105:1: ruleOp EOF
            {
             before(grammarAccess.getOpRule()); 
            pushFollow(FOLLOW_1);
            ruleOp();

            state._fsp--;

             after(grammarAccess.getOpRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOp"


    // $ANTLR start "ruleOp"
    // InternalMyDsl.g:112:1: ruleOp : ( ( rule__Op__Alternatives ) ) ;
    public final void ruleOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Op__Alternatives ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Op__Alternatives ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Op__Alternatives ) )
            // InternalMyDsl.g:118:3: ( rule__Op__Alternatives )
            {
             before(grammarAccess.getOpAccess().getAlternatives()); 
            // InternalMyDsl.g:119:3: ( rule__Op__Alternatives )
            // InternalMyDsl.g:119:4: rule__Op__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Op__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOpAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOp"


    // $ANTLR start "entryRuleExpressao"
    // InternalMyDsl.g:128:1: entryRuleExpressao : ruleExpressao EOF ;
    public final void entryRuleExpressao() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleExpressao EOF )
            // InternalMyDsl.g:130:1: ruleExpressao EOF
            {
             before(grammarAccess.getExpressaoRule()); 
            pushFollow(FOLLOW_1);
            ruleExpressao();

            state._fsp--;

             after(grammarAccess.getExpressaoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpressao"


    // $ANTLR start "ruleExpressao"
    // InternalMyDsl.g:137:1: ruleExpressao : ( ( rule__Expressao__Group__0 ) ) ;
    public final void ruleExpressao() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Expressao__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Expressao__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Expressao__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__Expressao__Group__0 )
            {
             before(grammarAccess.getExpressaoAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__Expressao__Group__0 )
            // InternalMyDsl.g:144:4: rule__Expressao__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expressao__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressaoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressao"


    // $ANTLR start "entryRuleComparador"
    // InternalMyDsl.g:153:1: entryRuleComparador : ruleComparador EOF ;
    public final void entryRuleComparador() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleComparador EOF )
            // InternalMyDsl.g:155:1: ruleComparador EOF
            {
             before(grammarAccess.getComparadorRule()); 
            pushFollow(FOLLOW_1);
            ruleComparador();

            state._fsp--;

             after(grammarAccess.getComparadorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComparador"


    // $ANTLR start "ruleComparador"
    // InternalMyDsl.g:162:1: ruleComparador : ( ( rule__Comparador__Alternatives ) ) ;
    public final void ruleComparador() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Comparador__Alternatives ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Comparador__Alternatives ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Comparador__Alternatives ) )
            // InternalMyDsl.g:168:3: ( rule__Comparador__Alternatives )
            {
             before(grammarAccess.getComparadorAccess().getAlternatives()); 
            // InternalMyDsl.g:169:3: ( rule__Comparador__Alternatives )
            // InternalMyDsl.g:169:4: rule__Comparador__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Comparador__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComparadorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparador"


    // $ANTLR start "entryRulePredicado"
    // InternalMyDsl.g:178:1: entryRulePredicado : rulePredicado EOF ;
    public final void entryRulePredicado() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( rulePredicado EOF )
            // InternalMyDsl.g:180:1: rulePredicado EOF
            {
             before(grammarAccess.getPredicadoRule()); 
            pushFollow(FOLLOW_1);
            rulePredicado();

            state._fsp--;

             after(grammarAccess.getPredicadoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePredicado"


    // $ANTLR start "rulePredicado"
    // InternalMyDsl.g:187:1: rulePredicado : ( ( rule__Predicado__Group__0 ) ) ;
    public final void rulePredicado() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__Predicado__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__Predicado__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__Predicado__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__Predicado__Group__0 )
            {
             before(grammarAccess.getPredicadoAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__Predicado__Group__0 )
            // InternalMyDsl.g:194:4: rule__Predicado__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Predicado__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPredicadoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePredicado"


    // $ANTLR start "entryRuleSelecao"
    // InternalMyDsl.g:203:1: entryRuleSelecao : ruleSelecao EOF ;
    public final void entryRuleSelecao() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleSelecao EOF )
            // InternalMyDsl.g:205:1: ruleSelecao EOF
            {
             before(grammarAccess.getSelecaoRule()); 
            pushFollow(FOLLOW_1);
            ruleSelecao();

            state._fsp--;

             after(grammarAccess.getSelecaoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSelecao"


    // $ANTLR start "ruleSelecao"
    // InternalMyDsl.g:212:1: ruleSelecao : ( ( rule__Selecao__Group__0 ) ) ;
    public final void ruleSelecao() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__Selecao__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__Selecao__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__Selecao__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__Selecao__Group__0 )
            {
             before(grammarAccess.getSelecaoAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__Selecao__Group__0 )
            // InternalMyDsl.g:219:4: rule__Selecao__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Selecao__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelecaoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelecao"


    // $ANTLR start "entryRuleDefine"
    // InternalMyDsl.g:228:1: entryRuleDefine : ruleDefine EOF ;
    public final void entryRuleDefine() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleDefine EOF )
            // InternalMyDsl.g:230:1: ruleDefine EOF
            {
             before(grammarAccess.getDefineRule()); 
            pushFollow(FOLLOW_1);
            ruleDefine();

            state._fsp--;

             after(grammarAccess.getDefineRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDefine"


    // $ANTLR start "ruleDefine"
    // InternalMyDsl.g:237:1: ruleDefine : ( ( rule__Define__Group__0 ) ) ;
    public final void ruleDefine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__Define__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__Define__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__Define__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__Define__Group__0 )
            {
             before(grammarAccess.getDefineAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__Define__Group__0 )
            // InternalMyDsl.g:244:4: rule__Define__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Define__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefine"


    // $ANTLR start "rule__Greeting__Alternatives"
    // InternalMyDsl.g:252:1: rule__Greeting__Alternatives : ( ( ruleExpressao ) | ( ( rule__Greeting__ValueAssignment_1 ) ) | ( rulePredicado ) | ( ruleSelecao ) | ( ruleDefine ) );
    public final void rule__Greeting__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:256:1: ( ( ruleExpressao ) | ( ( rule__Greeting__ValueAssignment_1 ) ) | ( rulePredicado ) | ( ruleSelecao ) | ( ruleDefine ) )
            int alt1=5;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==21) ) {
                switch ( input.LA(2) ) {
                case 17:
                case 18:
                case 19:
                case 20:
                    {
                    alt1=3;
                    }
                    break;
                case 25:
                    {
                    alt1=5;
                    }
                    break;
                case 23:
                    {
                    alt1=4;
                    }
                    break;
                case RULE_SIMBOLO:
                case RULE_INT:
                case RULE_ID:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 21:
                    {
                    alt1=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA1_0==RULE_INT) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:257:2: ( ruleExpressao )
                    {
                    // InternalMyDsl.g:257:2: ( ruleExpressao )
                    // InternalMyDsl.g:258:3: ruleExpressao
                    {
                     before(grammarAccess.getGreetingAccess().getExpressaoParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleExpressao();

                    state._fsp--;

                     after(grammarAccess.getGreetingAccess().getExpressaoParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:263:2: ( ( rule__Greeting__ValueAssignment_1 ) )
                    {
                    // InternalMyDsl.g:263:2: ( ( rule__Greeting__ValueAssignment_1 ) )
                    // InternalMyDsl.g:264:3: ( rule__Greeting__ValueAssignment_1 )
                    {
                     before(grammarAccess.getGreetingAccess().getValueAssignment_1()); 
                    // InternalMyDsl.g:265:3: ( rule__Greeting__ValueAssignment_1 )
                    // InternalMyDsl.g:265:4: rule__Greeting__ValueAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Greeting__ValueAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getGreetingAccess().getValueAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:269:2: ( rulePredicado )
                    {
                    // InternalMyDsl.g:269:2: ( rulePredicado )
                    // InternalMyDsl.g:270:3: rulePredicado
                    {
                     before(grammarAccess.getGreetingAccess().getPredicadoParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    rulePredicado();

                    state._fsp--;

                     after(grammarAccess.getGreetingAccess().getPredicadoParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:275:2: ( ruleSelecao )
                    {
                    // InternalMyDsl.g:275:2: ( ruleSelecao )
                    // InternalMyDsl.g:276:3: ruleSelecao
                    {
                     before(grammarAccess.getGreetingAccess().getSelecaoParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleSelecao();

                    state._fsp--;

                     after(grammarAccess.getGreetingAccess().getSelecaoParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:281:2: ( ruleDefine )
                    {
                    // InternalMyDsl.g:281:2: ( ruleDefine )
                    // InternalMyDsl.g:282:3: ruleDefine
                    {
                     before(grammarAccess.getGreetingAccess().getDefineParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleDefine();

                    state._fsp--;

                     after(grammarAccess.getGreetingAccess().getDefineParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Alternatives"


    // $ANTLR start "rule__Op__Alternatives"
    // InternalMyDsl.g:291:1: rule__Op__Alternatives : ( ( '+' ) | ( '-' ) | ( '*' ) | ( 'expt' ) | ( '/' ) );
    public final void rule__Op__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:295:1: ( ( '+' ) | ( '-' ) | ( '*' ) | ( 'expt' ) | ( '/' ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt2=1;
                }
                break;
            case 13:
                {
                alt2=2;
                }
                break;
            case 14:
                {
                alt2=3;
                }
                break;
            case 15:
                {
                alt2=4;
                }
                break;
            case 16:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:296:2: ( '+' )
                    {
                    // InternalMyDsl.g:296:2: ( '+' )
                    // InternalMyDsl.g:297:3: '+'
                    {
                     before(grammarAccess.getOpAccess().getPlusSignKeyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getOpAccess().getPlusSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:302:2: ( '-' )
                    {
                    // InternalMyDsl.g:302:2: ( '-' )
                    // InternalMyDsl.g:303:3: '-'
                    {
                     before(grammarAccess.getOpAccess().getHyphenMinusKeyword_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getOpAccess().getHyphenMinusKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:308:2: ( '*' )
                    {
                    // InternalMyDsl.g:308:2: ( '*' )
                    // InternalMyDsl.g:309:3: '*'
                    {
                     before(grammarAccess.getOpAccess().getAsteriskKeyword_2()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getOpAccess().getAsteriskKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:314:2: ( 'expt' )
                    {
                    // InternalMyDsl.g:314:2: ( 'expt' )
                    // InternalMyDsl.g:315:3: 'expt'
                    {
                     before(grammarAccess.getOpAccess().getExptKeyword_3()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getOpAccess().getExptKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:320:2: ( '/' )
                    {
                    // InternalMyDsl.g:320:2: ( '/' )
                    // InternalMyDsl.g:321:3: '/'
                    {
                     before(grammarAccess.getOpAccess().getSolidusKeyword_4()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getOpAccess().getSolidusKeyword_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Op__Alternatives"


    // $ANTLR start "rule__Expressao__Alternatives_1"
    // InternalMyDsl.g:330:1: rule__Expressao__Alternatives_1 : ( ( ruleOp ) | ( ( rule__Expressao__NameAssignment_1_1 ) ) );
    public final void rule__Expressao__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:334:1: ( ( ruleOp ) | ( ( rule__Expressao__NameAssignment_1_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=12 && LA3_0<=16)) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:335:2: ( ruleOp )
                    {
                    // InternalMyDsl.g:335:2: ( ruleOp )
                    // InternalMyDsl.g:336:3: ruleOp
                    {
                     before(grammarAccess.getExpressaoAccess().getOpParserRuleCall_1_0()); 
                    pushFollow(FOLLOW_2);
                    ruleOp();

                    state._fsp--;

                     after(grammarAccess.getExpressaoAccess().getOpParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:341:2: ( ( rule__Expressao__NameAssignment_1_1 ) )
                    {
                    // InternalMyDsl.g:341:2: ( ( rule__Expressao__NameAssignment_1_1 ) )
                    // InternalMyDsl.g:342:3: ( rule__Expressao__NameAssignment_1_1 )
                    {
                     before(grammarAccess.getExpressaoAccess().getNameAssignment_1_1()); 
                    // InternalMyDsl.g:343:3: ( rule__Expressao__NameAssignment_1_1 )
                    // InternalMyDsl.g:343:4: rule__Expressao__NameAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expressao__NameAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressaoAccess().getNameAssignment_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expressao__Alternatives_1"


    // $ANTLR start "rule__Expressao__Alternatives_2"
    // InternalMyDsl.g:351:1: rule__Expressao__Alternatives_2 : ( ( ( rule__Expressao__ValueAssignment_2_0 ) ) | ( ( rule__Expressao__ExpAssignment_2_1 ) ) | ( RULE_SIMBOLO ) );
    public final void rule__Expressao__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:355:1: ( ( ( rule__Expressao__ValueAssignment_2_0 ) ) | ( ( rule__Expressao__ExpAssignment_2_1 ) ) | ( RULE_SIMBOLO ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt4=1;
                }
                break;
            case 21:
                {
                alt4=2;
                }
                break;
            case RULE_SIMBOLO:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:356:2: ( ( rule__Expressao__ValueAssignment_2_0 ) )
                    {
                    // InternalMyDsl.g:356:2: ( ( rule__Expressao__ValueAssignment_2_0 ) )
                    // InternalMyDsl.g:357:3: ( rule__Expressao__ValueAssignment_2_0 )
                    {
                     before(grammarAccess.getExpressaoAccess().getValueAssignment_2_0()); 
                    // InternalMyDsl.g:358:3: ( rule__Expressao__ValueAssignment_2_0 )
                    // InternalMyDsl.g:358:4: rule__Expressao__ValueAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expressao__ValueAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressaoAccess().getValueAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:362:2: ( ( rule__Expressao__ExpAssignment_2_1 ) )
                    {
                    // InternalMyDsl.g:362:2: ( ( rule__Expressao__ExpAssignment_2_1 ) )
                    // InternalMyDsl.g:363:3: ( rule__Expressao__ExpAssignment_2_1 )
                    {
                     before(grammarAccess.getExpressaoAccess().getExpAssignment_2_1()); 
                    // InternalMyDsl.g:364:3: ( rule__Expressao__ExpAssignment_2_1 )
                    // InternalMyDsl.g:364:4: rule__Expressao__ExpAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expressao__ExpAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressaoAccess().getExpAssignment_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:368:2: ( RULE_SIMBOLO )
                    {
                    // InternalMyDsl.g:368:2: ( RULE_SIMBOLO )
                    // InternalMyDsl.g:369:3: RULE_SIMBOLO
                    {
                     before(grammarAccess.getExpressaoAccess().getSIMBOLOTerminalRuleCall_2_2()); 
                    match(input,RULE_SIMBOLO,FOLLOW_2); 
                     after(grammarAccess.getExpressaoAccess().getSIMBOLOTerminalRuleCall_2_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expressao__Alternatives_2"


    // $ANTLR start "rule__Expressao__Alternatives_3"
    // InternalMyDsl.g:378:1: rule__Expressao__Alternatives_3 : ( ( ( rule__Expressao__ValueAssignment_3_0 ) ) | ( ( rule__Expressao__ExpAssignment_3_1 ) ) | ( RULE_SIMBOLO ) );
    public final void rule__Expressao__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:382:1: ( ( ( rule__Expressao__ValueAssignment_3_0 ) ) | ( ( rule__Expressao__ExpAssignment_3_1 ) ) | ( RULE_SIMBOLO ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt5=1;
                }
                break;
            case 21:
                {
                alt5=2;
                }
                break;
            case RULE_SIMBOLO:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:383:2: ( ( rule__Expressao__ValueAssignment_3_0 ) )
                    {
                    // InternalMyDsl.g:383:2: ( ( rule__Expressao__ValueAssignment_3_0 ) )
                    // InternalMyDsl.g:384:3: ( rule__Expressao__ValueAssignment_3_0 )
                    {
                     before(grammarAccess.getExpressaoAccess().getValueAssignment_3_0()); 
                    // InternalMyDsl.g:385:3: ( rule__Expressao__ValueAssignment_3_0 )
                    // InternalMyDsl.g:385:4: rule__Expressao__ValueAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expressao__ValueAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressaoAccess().getValueAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:389:2: ( ( rule__Expressao__ExpAssignment_3_1 ) )
                    {
                    // InternalMyDsl.g:389:2: ( ( rule__Expressao__ExpAssignment_3_1 ) )
                    // InternalMyDsl.g:390:3: ( rule__Expressao__ExpAssignment_3_1 )
                    {
                     before(grammarAccess.getExpressaoAccess().getExpAssignment_3_1()); 
                    // InternalMyDsl.g:391:3: ( rule__Expressao__ExpAssignment_3_1 )
                    // InternalMyDsl.g:391:4: rule__Expressao__ExpAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expressao__ExpAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressaoAccess().getExpAssignment_3_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:395:2: ( RULE_SIMBOLO )
                    {
                    // InternalMyDsl.g:395:2: ( RULE_SIMBOLO )
                    // InternalMyDsl.g:396:3: RULE_SIMBOLO
                    {
                     before(grammarAccess.getExpressaoAccess().getSIMBOLOTerminalRuleCall_3_2()); 
                    match(input,RULE_SIMBOLO,FOLLOW_2); 
                     after(grammarAccess.getExpressaoAccess().getSIMBOLOTerminalRuleCall_3_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expressao__Alternatives_3"


    // $ANTLR start "rule__Comparador__Alternatives"
    // InternalMyDsl.g:405:1: rule__Comparador__Alternatives : ( ( '>' ) | ( '<' ) | ( '>=' ) | ( '<=' ) );
    public final void rule__Comparador__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:409:1: ( ( '>' ) | ( '<' ) | ( '>=' ) | ( '<=' ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt6=1;
                }
                break;
            case 18:
                {
                alt6=2;
                }
                break;
            case 19:
                {
                alt6=3;
                }
                break;
            case 20:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:410:2: ( '>' )
                    {
                    // InternalMyDsl.g:410:2: ( '>' )
                    // InternalMyDsl.g:411:3: '>'
                    {
                     before(grammarAccess.getComparadorAccess().getGreaterThanSignKeyword_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getComparadorAccess().getGreaterThanSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:416:2: ( '<' )
                    {
                    // InternalMyDsl.g:416:2: ( '<' )
                    // InternalMyDsl.g:417:3: '<'
                    {
                     before(grammarAccess.getComparadorAccess().getLessThanSignKeyword_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getComparadorAccess().getLessThanSignKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:422:2: ( '>=' )
                    {
                    // InternalMyDsl.g:422:2: ( '>=' )
                    // InternalMyDsl.g:423:3: '>='
                    {
                     before(grammarAccess.getComparadorAccess().getGreaterThanSignEqualsSignKeyword_2()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getComparadorAccess().getGreaterThanSignEqualsSignKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:428:2: ( '<=' )
                    {
                    // InternalMyDsl.g:428:2: ( '<=' )
                    // InternalMyDsl.g:429:3: '<='
                    {
                     before(grammarAccess.getComparadorAccess().getLessThanSignEqualsSignKeyword_3()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getComparadorAccess().getLessThanSignEqualsSignKeyword_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparador__Alternatives"


    // $ANTLR start "rule__Expressao__Group__0"
    // InternalMyDsl.g:438:1: rule__Expressao__Group__0 : rule__Expressao__Group__0__Impl rule__Expressao__Group__1 ;
    public final void rule__Expressao__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:442:1: ( rule__Expressao__Group__0__Impl rule__Expressao__Group__1 )
            // InternalMyDsl.g:443:2: rule__Expressao__Group__0__Impl rule__Expressao__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Expressao__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expressao__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expressao__Group__0"


    // $ANTLR start "rule__Expressao__Group__0__Impl"
    // InternalMyDsl.g:450:1: rule__Expressao__Group__0__Impl : ( '(' ) ;
    public final void rule__Expressao__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:454:1: ( ( '(' ) )
            // InternalMyDsl.g:455:1: ( '(' )
            {
            // InternalMyDsl.g:455:1: ( '(' )
            // InternalMyDsl.g:456:2: '('
            {
             before(grammarAccess.getExpressaoAccess().getLeftParenthesisKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getExpressaoAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expressao__Group__0__Impl"


    // $ANTLR start "rule__Expressao__Group__1"
    // InternalMyDsl.g:465:1: rule__Expressao__Group__1 : rule__Expressao__Group__1__Impl rule__Expressao__Group__2 ;
    public final void rule__Expressao__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:469:1: ( rule__Expressao__Group__1__Impl rule__Expressao__Group__2 )
            // InternalMyDsl.g:470:2: rule__Expressao__Group__1__Impl rule__Expressao__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Expressao__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expressao__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expressao__Group__1"


    // $ANTLR start "rule__Expressao__Group__1__Impl"
    // InternalMyDsl.g:477:1: rule__Expressao__Group__1__Impl : ( ( rule__Expressao__Alternatives_1 )? ) ;
    public final void rule__Expressao__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:481:1: ( ( ( rule__Expressao__Alternatives_1 )? ) )
            // InternalMyDsl.g:482:1: ( ( rule__Expressao__Alternatives_1 )? )
            {
            // InternalMyDsl.g:482:1: ( ( rule__Expressao__Alternatives_1 )? )
            // InternalMyDsl.g:483:2: ( rule__Expressao__Alternatives_1 )?
            {
             before(grammarAccess.getExpressaoAccess().getAlternatives_1()); 
            // InternalMyDsl.g:484:2: ( rule__Expressao__Alternatives_1 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID||(LA7_0>=12 && LA7_0<=16)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:484:3: rule__Expressao__Alternatives_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expressao__Alternatives_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpressaoAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expressao__Group__1__Impl"


    // $ANTLR start "rule__Expressao__Group__2"
    // InternalMyDsl.g:492:1: rule__Expressao__Group__2 : rule__Expressao__Group__2__Impl rule__Expressao__Group__3 ;
    public final void rule__Expressao__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:496:1: ( rule__Expressao__Group__2__Impl rule__Expressao__Group__3 )
            // InternalMyDsl.g:497:2: rule__Expressao__Group__2__Impl rule__Expressao__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Expressao__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expressao__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expressao__Group__2"


    // $ANTLR start "rule__Expressao__Group__2__Impl"
    // InternalMyDsl.g:504:1: rule__Expressao__Group__2__Impl : ( ( rule__Expressao__Alternatives_2 ) ) ;
    public final void rule__Expressao__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:508:1: ( ( ( rule__Expressao__Alternatives_2 ) ) )
            // InternalMyDsl.g:509:1: ( ( rule__Expressao__Alternatives_2 ) )
            {
            // InternalMyDsl.g:509:1: ( ( rule__Expressao__Alternatives_2 ) )
            // InternalMyDsl.g:510:2: ( rule__Expressao__Alternatives_2 )
            {
             before(grammarAccess.getExpressaoAccess().getAlternatives_2()); 
            // InternalMyDsl.g:511:2: ( rule__Expressao__Alternatives_2 )
            // InternalMyDsl.g:511:3: rule__Expressao__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__Expressao__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getExpressaoAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expressao__Group__2__Impl"


    // $ANTLR start "rule__Expressao__Group__3"
    // InternalMyDsl.g:519:1: rule__Expressao__Group__3 : rule__Expressao__Group__3__Impl rule__Expressao__Group__4 ;
    public final void rule__Expressao__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:523:1: ( rule__Expressao__Group__3__Impl rule__Expressao__Group__4 )
            // InternalMyDsl.g:524:2: rule__Expressao__Group__3__Impl rule__Expressao__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Expressao__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expressao__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expressao__Group__3"


    // $ANTLR start "rule__Expressao__Group__3__Impl"
    // InternalMyDsl.g:531:1: rule__Expressao__Group__3__Impl : ( ( rule__Expressao__Alternatives_3 )* ) ;
    public final void rule__Expressao__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:535:1: ( ( ( rule__Expressao__Alternatives_3 )* ) )
            // InternalMyDsl.g:536:1: ( ( rule__Expressao__Alternatives_3 )* )
            {
            // InternalMyDsl.g:536:1: ( ( rule__Expressao__Alternatives_3 )* )
            // InternalMyDsl.g:537:2: ( rule__Expressao__Alternatives_3 )*
            {
             before(grammarAccess.getExpressaoAccess().getAlternatives_3()); 
            // InternalMyDsl.g:538:2: ( rule__Expressao__Alternatives_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_SIMBOLO && LA8_0<=RULE_INT)||LA8_0==21) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:538:3: rule__Expressao__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Expressao__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getExpressaoAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expressao__Group__3__Impl"


    // $ANTLR start "rule__Expressao__Group__4"
    // InternalMyDsl.g:546:1: rule__Expressao__Group__4 : rule__Expressao__Group__4__Impl ;
    public final void rule__Expressao__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:550:1: ( rule__Expressao__Group__4__Impl )
            // InternalMyDsl.g:551:2: rule__Expressao__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expressao__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expressao__Group__4"


    // $ANTLR start "rule__Expressao__Group__4__Impl"
    // InternalMyDsl.g:557:1: rule__Expressao__Group__4__Impl : ( ')' ) ;
    public final void rule__Expressao__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:561:1: ( ( ')' ) )
            // InternalMyDsl.g:562:1: ( ')' )
            {
            // InternalMyDsl.g:562:1: ( ')' )
            // InternalMyDsl.g:563:2: ')'
            {
             before(grammarAccess.getExpressaoAccess().getRightParenthesisKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getExpressaoAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expressao__Group__4__Impl"


    // $ANTLR start "rule__Predicado__Group__0"
    // InternalMyDsl.g:573:1: rule__Predicado__Group__0 : rule__Predicado__Group__0__Impl rule__Predicado__Group__1 ;
    public final void rule__Predicado__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:577:1: ( rule__Predicado__Group__0__Impl rule__Predicado__Group__1 )
            // InternalMyDsl.g:578:2: rule__Predicado__Group__0__Impl rule__Predicado__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Predicado__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Predicado__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicado__Group__0"


    // $ANTLR start "rule__Predicado__Group__0__Impl"
    // InternalMyDsl.g:585:1: rule__Predicado__Group__0__Impl : ( '(' ) ;
    public final void rule__Predicado__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:589:1: ( ( '(' ) )
            // InternalMyDsl.g:590:1: ( '(' )
            {
            // InternalMyDsl.g:590:1: ( '(' )
            // InternalMyDsl.g:591:2: '('
            {
             before(grammarAccess.getPredicadoAccess().getLeftParenthesisKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPredicadoAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicado__Group__0__Impl"


    // $ANTLR start "rule__Predicado__Group__1"
    // InternalMyDsl.g:600:1: rule__Predicado__Group__1 : rule__Predicado__Group__1__Impl rule__Predicado__Group__2 ;
    public final void rule__Predicado__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:604:1: ( rule__Predicado__Group__1__Impl rule__Predicado__Group__2 )
            // InternalMyDsl.g:605:2: rule__Predicado__Group__1__Impl rule__Predicado__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Predicado__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Predicado__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicado__Group__1"


    // $ANTLR start "rule__Predicado__Group__1__Impl"
    // InternalMyDsl.g:612:1: rule__Predicado__Group__1__Impl : ( ruleComparador ) ;
    public final void rule__Predicado__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:616:1: ( ( ruleComparador ) )
            // InternalMyDsl.g:617:1: ( ruleComparador )
            {
            // InternalMyDsl.g:617:1: ( ruleComparador )
            // InternalMyDsl.g:618:2: ruleComparador
            {
             before(grammarAccess.getPredicadoAccess().getComparadorParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleComparador();

            state._fsp--;

             after(grammarAccess.getPredicadoAccess().getComparadorParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicado__Group__1__Impl"


    // $ANTLR start "rule__Predicado__Group__2"
    // InternalMyDsl.g:627:1: rule__Predicado__Group__2 : rule__Predicado__Group__2__Impl rule__Predicado__Group__3 ;
    public final void rule__Predicado__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:631:1: ( rule__Predicado__Group__2__Impl rule__Predicado__Group__3 )
            // InternalMyDsl.g:632:2: rule__Predicado__Group__2__Impl rule__Predicado__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Predicado__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Predicado__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicado__Group__2"


    // $ANTLR start "rule__Predicado__Group__2__Impl"
    // InternalMyDsl.g:639:1: rule__Predicado__Group__2__Impl : ( RULE_SIMBOLO ) ;
    public final void rule__Predicado__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:643:1: ( ( RULE_SIMBOLO ) )
            // InternalMyDsl.g:644:1: ( RULE_SIMBOLO )
            {
            // InternalMyDsl.g:644:1: ( RULE_SIMBOLO )
            // InternalMyDsl.g:645:2: RULE_SIMBOLO
            {
             before(grammarAccess.getPredicadoAccess().getSIMBOLOTerminalRuleCall_2()); 
            match(input,RULE_SIMBOLO,FOLLOW_2); 
             after(grammarAccess.getPredicadoAccess().getSIMBOLOTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicado__Group__2__Impl"


    // $ANTLR start "rule__Predicado__Group__3"
    // InternalMyDsl.g:654:1: rule__Predicado__Group__3 : rule__Predicado__Group__3__Impl rule__Predicado__Group__4 ;
    public final void rule__Predicado__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:658:1: ( rule__Predicado__Group__3__Impl rule__Predicado__Group__4 )
            // InternalMyDsl.g:659:2: rule__Predicado__Group__3__Impl rule__Predicado__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Predicado__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Predicado__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicado__Group__3"


    // $ANTLR start "rule__Predicado__Group__3__Impl"
    // InternalMyDsl.g:666:1: rule__Predicado__Group__3__Impl : ( RULE_SIMBOLO ) ;
    public final void rule__Predicado__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:670:1: ( ( RULE_SIMBOLO ) )
            // InternalMyDsl.g:671:1: ( RULE_SIMBOLO )
            {
            // InternalMyDsl.g:671:1: ( RULE_SIMBOLO )
            // InternalMyDsl.g:672:2: RULE_SIMBOLO
            {
             before(grammarAccess.getPredicadoAccess().getSIMBOLOTerminalRuleCall_3()); 
            match(input,RULE_SIMBOLO,FOLLOW_2); 
             after(grammarAccess.getPredicadoAccess().getSIMBOLOTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicado__Group__3__Impl"


    // $ANTLR start "rule__Predicado__Group__4"
    // InternalMyDsl.g:681:1: rule__Predicado__Group__4 : rule__Predicado__Group__4__Impl ;
    public final void rule__Predicado__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:685:1: ( rule__Predicado__Group__4__Impl )
            // InternalMyDsl.g:686:2: rule__Predicado__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Predicado__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicado__Group__4"


    // $ANTLR start "rule__Predicado__Group__4__Impl"
    // InternalMyDsl.g:692:1: rule__Predicado__Group__4__Impl : ( ')' ) ;
    public final void rule__Predicado__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:696:1: ( ( ')' ) )
            // InternalMyDsl.g:697:1: ( ')' )
            {
            // InternalMyDsl.g:697:1: ( ')' )
            // InternalMyDsl.g:698:2: ')'
            {
             before(grammarAccess.getPredicadoAccess().getRightParenthesisKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPredicadoAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicado__Group__4__Impl"


    // $ANTLR start "rule__Selecao__Group__0"
    // InternalMyDsl.g:708:1: rule__Selecao__Group__0 : rule__Selecao__Group__0__Impl rule__Selecao__Group__1 ;
    public final void rule__Selecao__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:712:1: ( rule__Selecao__Group__0__Impl rule__Selecao__Group__1 )
            // InternalMyDsl.g:713:2: rule__Selecao__Group__0__Impl rule__Selecao__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Selecao__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selecao__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selecao__Group__0"


    // $ANTLR start "rule__Selecao__Group__0__Impl"
    // InternalMyDsl.g:720:1: rule__Selecao__Group__0__Impl : ( '(' ) ;
    public final void rule__Selecao__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:724:1: ( ( '(' ) )
            // InternalMyDsl.g:725:1: ( '(' )
            {
            // InternalMyDsl.g:725:1: ( '(' )
            // InternalMyDsl.g:726:2: '('
            {
             before(grammarAccess.getSelecaoAccess().getLeftParenthesisKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSelecaoAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selecao__Group__0__Impl"


    // $ANTLR start "rule__Selecao__Group__1"
    // InternalMyDsl.g:735:1: rule__Selecao__Group__1 : rule__Selecao__Group__1__Impl rule__Selecao__Group__2 ;
    public final void rule__Selecao__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:739:1: ( rule__Selecao__Group__1__Impl rule__Selecao__Group__2 )
            // InternalMyDsl.g:740:2: rule__Selecao__Group__1__Impl rule__Selecao__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Selecao__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selecao__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selecao__Group__1"


    // $ANTLR start "rule__Selecao__Group__1__Impl"
    // InternalMyDsl.g:747:1: rule__Selecao__Group__1__Impl : ( 'cond' ) ;
    public final void rule__Selecao__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:751:1: ( ( 'cond' ) )
            // InternalMyDsl.g:752:1: ( 'cond' )
            {
            // InternalMyDsl.g:752:1: ( 'cond' )
            // InternalMyDsl.g:753:2: 'cond'
            {
             before(grammarAccess.getSelecaoAccess().getCondKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSelecaoAccess().getCondKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selecao__Group__1__Impl"


    // $ANTLR start "rule__Selecao__Group__2"
    // InternalMyDsl.g:762:1: rule__Selecao__Group__2 : rule__Selecao__Group__2__Impl rule__Selecao__Group__3 ;
    public final void rule__Selecao__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:766:1: ( rule__Selecao__Group__2__Impl rule__Selecao__Group__3 )
            // InternalMyDsl.g:767:2: rule__Selecao__Group__2__Impl rule__Selecao__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Selecao__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selecao__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selecao__Group__2"


    // $ANTLR start "rule__Selecao__Group__2__Impl"
    // InternalMyDsl.g:774:1: rule__Selecao__Group__2__Impl : ( ( ( rule__Selecao__Group_2__0 ) ) ( ( rule__Selecao__Group_2__0 )* ) ) ;
    public final void rule__Selecao__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:778:1: ( ( ( ( rule__Selecao__Group_2__0 ) ) ( ( rule__Selecao__Group_2__0 )* ) ) )
            // InternalMyDsl.g:779:1: ( ( ( rule__Selecao__Group_2__0 ) ) ( ( rule__Selecao__Group_2__0 )* ) )
            {
            // InternalMyDsl.g:779:1: ( ( ( rule__Selecao__Group_2__0 ) ) ( ( rule__Selecao__Group_2__0 )* ) )
            // InternalMyDsl.g:780:2: ( ( rule__Selecao__Group_2__0 ) ) ( ( rule__Selecao__Group_2__0 )* )
            {
            // InternalMyDsl.g:780:2: ( ( rule__Selecao__Group_2__0 ) )
            // InternalMyDsl.g:781:3: ( rule__Selecao__Group_2__0 )
            {
             before(grammarAccess.getSelecaoAccess().getGroup_2()); 
            // InternalMyDsl.g:782:3: ( rule__Selecao__Group_2__0 )
            // InternalMyDsl.g:782:4: rule__Selecao__Group_2__0
            {
            pushFollow(FOLLOW_12);
            rule__Selecao__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getSelecaoAccess().getGroup_2()); 

            }

            // InternalMyDsl.g:785:2: ( ( rule__Selecao__Group_2__0 )* )
            // InternalMyDsl.g:786:3: ( rule__Selecao__Group_2__0 )*
            {
             before(grammarAccess.getSelecaoAccess().getGroup_2()); 
            // InternalMyDsl.g:787:3: ( rule__Selecao__Group_2__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==21) ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1==21) ) {
                        alt9=1;
                    }


                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:787:4: rule__Selecao__Group_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Selecao__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getSelecaoAccess().getGroup_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selecao__Group__2__Impl"


    // $ANTLR start "rule__Selecao__Group__3"
    // InternalMyDsl.g:796:1: rule__Selecao__Group__3 : rule__Selecao__Group__3__Impl rule__Selecao__Group__4 ;
    public final void rule__Selecao__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:800:1: ( rule__Selecao__Group__3__Impl rule__Selecao__Group__4 )
            // InternalMyDsl.g:801:2: rule__Selecao__Group__3__Impl rule__Selecao__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Selecao__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selecao__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selecao__Group__3"


    // $ANTLR start "rule__Selecao__Group__3__Impl"
    // InternalMyDsl.g:808:1: rule__Selecao__Group__3__Impl : ( ( rule__Selecao__Group_3__0 )? ) ;
    public final void rule__Selecao__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:812:1: ( ( ( rule__Selecao__Group_3__0 )? ) )
            // InternalMyDsl.g:813:1: ( ( rule__Selecao__Group_3__0 )? )
            {
            // InternalMyDsl.g:813:1: ( ( rule__Selecao__Group_3__0 )? )
            // InternalMyDsl.g:814:2: ( rule__Selecao__Group_3__0 )?
            {
             before(grammarAccess.getSelecaoAccess().getGroup_3()); 
            // InternalMyDsl.g:815:2: ( rule__Selecao__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:815:3: rule__Selecao__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Selecao__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelecaoAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selecao__Group__3__Impl"


    // $ANTLR start "rule__Selecao__Group__4"
    // InternalMyDsl.g:823:1: rule__Selecao__Group__4 : rule__Selecao__Group__4__Impl ;
    public final void rule__Selecao__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:827:1: ( rule__Selecao__Group__4__Impl )
            // InternalMyDsl.g:828:2: rule__Selecao__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Selecao__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selecao__Group__4"


    // $ANTLR start "rule__Selecao__Group__4__Impl"
    // InternalMyDsl.g:834:1: rule__Selecao__Group__4__Impl : ( ')' ) ;
    public final void rule__Selecao__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:838:1: ( ( ')' ) )
            // InternalMyDsl.g:839:1: ( ')' )
            {
            // InternalMyDsl.g:839:1: ( ')' )
            // InternalMyDsl.g:840:2: ')'
            {
             before(grammarAccess.getSelecaoAccess().getRightParenthesisKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSelecaoAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selecao__Group__4__Impl"


    // $ANTLR start "rule__Selecao__Group_2__0"
    // InternalMyDsl.g:850:1: rule__Selecao__Group_2__0 : rule__Selecao__Group_2__0__Impl rule__Selecao__Group_2__1 ;
    public final void rule__Selecao__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:854:1: ( rule__Selecao__Group_2__0__Impl rule__Selecao__Group_2__1 )
            // InternalMyDsl.g:855:2: rule__Selecao__Group_2__0__Impl rule__Selecao__Group_2__1
            {
            pushFollow(FOLLOW_10);
            rule__Selecao__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selecao__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selecao__Group_2__0"


    // $ANTLR start "rule__Selecao__Group_2__0__Impl"
    // InternalMyDsl.g:862:1: rule__Selecao__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Selecao__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:866:1: ( ( '(' ) )
            // InternalMyDsl.g:867:1: ( '(' )
            {
            // InternalMyDsl.g:867:1: ( '(' )
            // InternalMyDsl.g:868:2: '('
            {
             before(grammarAccess.getSelecaoAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSelecaoAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selecao__Group_2__0__Impl"


    // $ANTLR start "rule__Selecao__Group_2__1"
    // InternalMyDsl.g:877:1: rule__Selecao__Group_2__1 : rule__Selecao__Group_2__1__Impl rule__Selecao__Group_2__2 ;
    public final void rule__Selecao__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:881:1: ( rule__Selecao__Group_2__1__Impl rule__Selecao__Group_2__2 )
            // InternalMyDsl.g:882:2: rule__Selecao__Group_2__1__Impl rule__Selecao__Group_2__2
            {
            pushFollow(FOLLOW_8);
            rule__Selecao__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selecao__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selecao__Group_2__1"


    // $ANTLR start "rule__Selecao__Group_2__1__Impl"
    // InternalMyDsl.g:889:1: rule__Selecao__Group_2__1__Impl : ( ( rule__Selecao__Group_2_1__0 ) ) ;
    public final void rule__Selecao__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:893:1: ( ( ( rule__Selecao__Group_2_1__0 ) ) )
            // InternalMyDsl.g:894:1: ( ( rule__Selecao__Group_2_1__0 ) )
            {
            // InternalMyDsl.g:894:1: ( ( rule__Selecao__Group_2_1__0 ) )
            // InternalMyDsl.g:895:2: ( rule__Selecao__Group_2_1__0 )
            {
             before(grammarAccess.getSelecaoAccess().getGroup_2_1()); 
            // InternalMyDsl.g:896:2: ( rule__Selecao__Group_2_1__0 )
            // InternalMyDsl.g:896:3: rule__Selecao__Group_2_1__0
            {
            pushFollow(FOLLOW_2);
            rule__Selecao__Group_2_1__0();

            state._fsp--;


            }

             after(grammarAccess.getSelecaoAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selecao__Group_2__1__Impl"


    // $ANTLR start "rule__Selecao__Group_2__2"
    // InternalMyDsl.g:904:1: rule__Selecao__Group_2__2 : rule__Selecao__Group_2__2__Impl ;
    public final void rule__Selecao__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:908:1: ( rule__Selecao__Group_2__2__Impl )
            // InternalMyDsl.g:909:2: rule__Selecao__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Selecao__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selecao__Group_2__2"


    // $ANTLR start "rule__Selecao__Group_2__2__Impl"
    // InternalMyDsl.g:915:1: rule__Selecao__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Selecao__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:919:1: ( ( ')' ) )
            // InternalMyDsl.g:920:1: ( ')' )
            {
            // InternalMyDsl.g:920:1: ( ')' )
            // InternalMyDsl.g:921:2: ')'
            {
             before(grammarAccess.getSelecaoAccess().getRightParenthesisKeyword_2_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSelecaoAccess().getRightParenthesisKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selecao__Group_2__2__Impl"


    // $ANTLR start "rule__Selecao__Group_2_1__0"
    // InternalMyDsl.g:931:1: rule__Selecao__Group_2_1__0 : rule__Selecao__Group_2_1__0__Impl rule__Selecao__Group_2_1__1 ;
    public final void rule__Selecao__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:935:1: ( rule__Selecao__Group_2_1__0__Impl rule__Selecao__Group_2_1__1 )
            // InternalMyDsl.g:936:2: rule__Selecao__Group_2_1__0__Impl rule__Selecao__Group_2_1__1
            {
            pushFollow(FOLLOW_10);
            rule__Selecao__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selecao__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selecao__Group_2_1__0"


    // $ANTLR start "rule__Selecao__Group_2_1__0__Impl"
    // InternalMyDsl.g:943:1: rule__Selecao__Group_2_1__0__Impl : ( rulePredicado ) ;
    public final void rule__Selecao__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:947:1: ( ( rulePredicado ) )
            // InternalMyDsl.g:948:1: ( rulePredicado )
            {
            // InternalMyDsl.g:948:1: ( rulePredicado )
            // InternalMyDsl.g:949:2: rulePredicado
            {
             before(grammarAccess.getSelecaoAccess().getPredicadoParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            rulePredicado();

            state._fsp--;

             after(grammarAccess.getSelecaoAccess().getPredicadoParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selecao__Group_2_1__0__Impl"


    // $ANTLR start "rule__Selecao__Group_2_1__1"
    // InternalMyDsl.g:958:1: rule__Selecao__Group_2_1__1 : rule__Selecao__Group_2_1__1__Impl rule__Selecao__Group_2_1__2 ;
    public final void rule__Selecao__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:962:1: ( rule__Selecao__Group_2_1__1__Impl rule__Selecao__Group_2_1__2 )
            // InternalMyDsl.g:963:2: rule__Selecao__Group_2_1__1__Impl rule__Selecao__Group_2_1__2
            {
            pushFollow(FOLLOW_10);
            rule__Selecao__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selecao__Group_2_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selecao__Group_2_1__1"


    // $ANTLR start "rule__Selecao__Group_2_1__1__Impl"
    // InternalMyDsl.g:970:1: rule__Selecao__Group_2_1__1__Impl : ( ( rule__Selecao__ExpAssignment_2_1_1 ) ) ;
    public final void rule__Selecao__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:974:1: ( ( ( rule__Selecao__ExpAssignment_2_1_1 ) ) )
            // InternalMyDsl.g:975:1: ( ( rule__Selecao__ExpAssignment_2_1_1 ) )
            {
            // InternalMyDsl.g:975:1: ( ( rule__Selecao__ExpAssignment_2_1_1 ) )
            // InternalMyDsl.g:976:2: ( rule__Selecao__ExpAssignment_2_1_1 )
            {
             before(grammarAccess.getSelecaoAccess().getExpAssignment_2_1_1()); 
            // InternalMyDsl.g:977:2: ( rule__Selecao__ExpAssignment_2_1_1 )
            // InternalMyDsl.g:977:3: rule__Selecao__ExpAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Selecao__ExpAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSelecaoAccess().getExpAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selecao__Group_2_1__1__Impl"


    // $ANTLR start "rule__Selecao__Group_2_1__2"
    // InternalMyDsl.g:985:1: rule__Selecao__Group_2_1__2 : rule__Selecao__Group_2_1__2__Impl ;
    public final void rule__Selecao__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:989:1: ( rule__Selecao__Group_2_1__2__Impl )
            // InternalMyDsl.g:990:2: rule__Selecao__Group_2_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Selecao__Group_2_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selecao__Group_2_1__2"


    // $ANTLR start "rule__Selecao__Group_2_1__2__Impl"
    // InternalMyDsl.g:996:1: rule__Selecao__Group_2_1__2__Impl : ( ( rule__Selecao__ExpAssignment_2_1_2 )* ) ;
    public final void rule__Selecao__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1000:1: ( ( ( rule__Selecao__ExpAssignment_2_1_2 )* ) )
            // InternalMyDsl.g:1001:1: ( ( rule__Selecao__ExpAssignment_2_1_2 )* )
            {
            // InternalMyDsl.g:1001:1: ( ( rule__Selecao__ExpAssignment_2_1_2 )* )
            // InternalMyDsl.g:1002:2: ( rule__Selecao__ExpAssignment_2_1_2 )*
            {
             before(grammarAccess.getSelecaoAccess().getExpAssignment_2_1_2()); 
            // InternalMyDsl.g:1003:2: ( rule__Selecao__ExpAssignment_2_1_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==21) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:1003:3: rule__Selecao__ExpAssignment_2_1_2
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Selecao__ExpAssignment_2_1_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getSelecaoAccess().getExpAssignment_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selecao__Group_2_1__2__Impl"


    // $ANTLR start "rule__Selecao__Group_3__0"
    // InternalMyDsl.g:1012:1: rule__Selecao__Group_3__0 : rule__Selecao__Group_3__0__Impl rule__Selecao__Group_3__1 ;
    public final void rule__Selecao__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1016:1: ( rule__Selecao__Group_3__0__Impl rule__Selecao__Group_3__1 )
            // InternalMyDsl.g:1017:2: rule__Selecao__Group_3__0__Impl rule__Selecao__Group_3__1
            {
            pushFollow(FOLLOW_13);
            rule__Selecao__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selecao__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selecao__Group_3__0"


    // $ANTLR start "rule__Selecao__Group_3__0__Impl"
    // InternalMyDsl.g:1024:1: rule__Selecao__Group_3__0__Impl : ( '(' ) ;
    public final void rule__Selecao__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1028:1: ( ( '(' ) )
            // InternalMyDsl.g:1029:1: ( '(' )
            {
            // InternalMyDsl.g:1029:1: ( '(' )
            // InternalMyDsl.g:1030:2: '('
            {
             before(grammarAccess.getSelecaoAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSelecaoAccess().getLeftParenthesisKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selecao__Group_3__0__Impl"


    // $ANTLR start "rule__Selecao__Group_3__1"
    // InternalMyDsl.g:1039:1: rule__Selecao__Group_3__1 : rule__Selecao__Group_3__1__Impl rule__Selecao__Group_3__2 ;
    public final void rule__Selecao__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1043:1: ( rule__Selecao__Group_3__1__Impl rule__Selecao__Group_3__2 )
            // InternalMyDsl.g:1044:2: rule__Selecao__Group_3__1__Impl rule__Selecao__Group_3__2
            {
            pushFollow(FOLLOW_10);
            rule__Selecao__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selecao__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selecao__Group_3__1"


    // $ANTLR start "rule__Selecao__Group_3__1__Impl"
    // InternalMyDsl.g:1051:1: rule__Selecao__Group_3__1__Impl : ( 'else' ) ;
    public final void rule__Selecao__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1055:1: ( ( 'else' ) )
            // InternalMyDsl.g:1056:1: ( 'else' )
            {
            // InternalMyDsl.g:1056:1: ( 'else' )
            // InternalMyDsl.g:1057:2: 'else'
            {
             before(grammarAccess.getSelecaoAccess().getElseKeyword_3_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSelecaoAccess().getElseKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selecao__Group_3__1__Impl"


    // $ANTLR start "rule__Selecao__Group_3__2"
    // InternalMyDsl.g:1066:1: rule__Selecao__Group_3__2 : rule__Selecao__Group_3__2__Impl rule__Selecao__Group_3__3 ;
    public final void rule__Selecao__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1070:1: ( rule__Selecao__Group_3__2__Impl rule__Selecao__Group_3__3 )
            // InternalMyDsl.g:1071:2: rule__Selecao__Group_3__2__Impl rule__Selecao__Group_3__3
            {
            pushFollow(FOLLOW_8);
            rule__Selecao__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selecao__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selecao__Group_3__2"


    // $ANTLR start "rule__Selecao__Group_3__2__Impl"
    // InternalMyDsl.g:1078:1: rule__Selecao__Group_3__2__Impl : ( ( ( rule__Selecao__ExpAssignment_3_2 ) ) ( ( rule__Selecao__ExpAssignment_3_2 )* ) ) ;
    public final void rule__Selecao__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1082:1: ( ( ( ( rule__Selecao__ExpAssignment_3_2 ) ) ( ( rule__Selecao__ExpAssignment_3_2 )* ) ) )
            // InternalMyDsl.g:1083:1: ( ( ( rule__Selecao__ExpAssignment_3_2 ) ) ( ( rule__Selecao__ExpAssignment_3_2 )* ) )
            {
            // InternalMyDsl.g:1083:1: ( ( ( rule__Selecao__ExpAssignment_3_2 ) ) ( ( rule__Selecao__ExpAssignment_3_2 )* ) )
            // InternalMyDsl.g:1084:2: ( ( rule__Selecao__ExpAssignment_3_2 ) ) ( ( rule__Selecao__ExpAssignment_3_2 )* )
            {
            // InternalMyDsl.g:1084:2: ( ( rule__Selecao__ExpAssignment_3_2 ) )
            // InternalMyDsl.g:1085:3: ( rule__Selecao__ExpAssignment_3_2 )
            {
             before(grammarAccess.getSelecaoAccess().getExpAssignment_3_2()); 
            // InternalMyDsl.g:1086:3: ( rule__Selecao__ExpAssignment_3_2 )
            // InternalMyDsl.g:1086:4: rule__Selecao__ExpAssignment_3_2
            {
            pushFollow(FOLLOW_12);
            rule__Selecao__ExpAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getSelecaoAccess().getExpAssignment_3_2()); 

            }

            // InternalMyDsl.g:1089:2: ( ( rule__Selecao__ExpAssignment_3_2 )* )
            // InternalMyDsl.g:1090:3: ( rule__Selecao__ExpAssignment_3_2 )*
            {
             before(grammarAccess.getSelecaoAccess().getExpAssignment_3_2()); 
            // InternalMyDsl.g:1091:3: ( rule__Selecao__ExpAssignment_3_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==21) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:1091:4: rule__Selecao__ExpAssignment_3_2
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Selecao__ExpAssignment_3_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getSelecaoAccess().getExpAssignment_3_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selecao__Group_3__2__Impl"


    // $ANTLR start "rule__Selecao__Group_3__3"
    // InternalMyDsl.g:1100:1: rule__Selecao__Group_3__3 : rule__Selecao__Group_3__3__Impl ;
    public final void rule__Selecao__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1104:1: ( rule__Selecao__Group_3__3__Impl )
            // InternalMyDsl.g:1105:2: rule__Selecao__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Selecao__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selecao__Group_3__3"


    // $ANTLR start "rule__Selecao__Group_3__3__Impl"
    // InternalMyDsl.g:1111:1: rule__Selecao__Group_3__3__Impl : ( ')' ) ;
    public final void rule__Selecao__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1115:1: ( ( ')' ) )
            // InternalMyDsl.g:1116:1: ( ')' )
            {
            // InternalMyDsl.g:1116:1: ( ')' )
            // InternalMyDsl.g:1117:2: ')'
            {
             before(grammarAccess.getSelecaoAccess().getRightParenthesisKeyword_3_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSelecaoAccess().getRightParenthesisKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selecao__Group_3__3__Impl"


    // $ANTLR start "rule__Define__Group__0"
    // InternalMyDsl.g:1127:1: rule__Define__Group__0 : rule__Define__Group__0__Impl rule__Define__Group__1 ;
    public final void rule__Define__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1131:1: ( rule__Define__Group__0__Impl rule__Define__Group__1 )
            // InternalMyDsl.g:1132:2: rule__Define__Group__0__Impl rule__Define__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Define__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Define__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Define__Group__0"


    // $ANTLR start "rule__Define__Group__0__Impl"
    // InternalMyDsl.g:1139:1: rule__Define__Group__0__Impl : ( '(' ) ;
    public final void rule__Define__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1143:1: ( ( '(' ) )
            // InternalMyDsl.g:1144:1: ( '(' )
            {
            // InternalMyDsl.g:1144:1: ( '(' )
            // InternalMyDsl.g:1145:2: '('
            {
             before(grammarAccess.getDefineAccess().getLeftParenthesisKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getDefineAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Define__Group__0__Impl"


    // $ANTLR start "rule__Define__Group__1"
    // InternalMyDsl.g:1154:1: rule__Define__Group__1 : rule__Define__Group__1__Impl rule__Define__Group__2 ;
    public final void rule__Define__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1158:1: ( rule__Define__Group__1__Impl rule__Define__Group__2 )
            // InternalMyDsl.g:1159:2: rule__Define__Group__1__Impl rule__Define__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Define__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Define__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Define__Group__1"


    // $ANTLR start "rule__Define__Group__1__Impl"
    // InternalMyDsl.g:1166:1: rule__Define__Group__1__Impl : ( 'define' ) ;
    public final void rule__Define__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1170:1: ( ( 'define' ) )
            // InternalMyDsl.g:1171:1: ( 'define' )
            {
            // InternalMyDsl.g:1171:1: ( 'define' )
            // InternalMyDsl.g:1172:2: 'define'
            {
             before(grammarAccess.getDefineAccess().getDefineKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getDefineAccess().getDefineKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Define__Group__1__Impl"


    // $ANTLR start "rule__Define__Group__2"
    // InternalMyDsl.g:1181:1: rule__Define__Group__2 : rule__Define__Group__2__Impl rule__Define__Group__3 ;
    public final void rule__Define__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1185:1: ( rule__Define__Group__2__Impl rule__Define__Group__3 )
            // InternalMyDsl.g:1186:2: rule__Define__Group__2__Impl rule__Define__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Define__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Define__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Define__Group__2"


    // $ANTLR start "rule__Define__Group__2__Impl"
    // InternalMyDsl.g:1193:1: rule__Define__Group__2__Impl : ( RULE_SIMBOLO ) ;
    public final void rule__Define__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1197:1: ( ( RULE_SIMBOLO ) )
            // InternalMyDsl.g:1198:1: ( RULE_SIMBOLO )
            {
            // InternalMyDsl.g:1198:1: ( RULE_SIMBOLO )
            // InternalMyDsl.g:1199:2: RULE_SIMBOLO
            {
             before(grammarAccess.getDefineAccess().getSIMBOLOTerminalRuleCall_2()); 
            match(input,RULE_SIMBOLO,FOLLOW_2); 
             after(grammarAccess.getDefineAccess().getSIMBOLOTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Define__Group__2__Impl"


    // $ANTLR start "rule__Define__Group__3"
    // InternalMyDsl.g:1208:1: rule__Define__Group__3 : rule__Define__Group__3__Impl rule__Define__Group__4 ;
    public final void rule__Define__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1212:1: ( rule__Define__Group__3__Impl rule__Define__Group__4 )
            // InternalMyDsl.g:1213:2: rule__Define__Group__3__Impl rule__Define__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Define__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Define__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Define__Group__3"


    // $ANTLR start "rule__Define__Group__3__Impl"
    // InternalMyDsl.g:1220:1: rule__Define__Group__3__Impl : ( ( rule__Define__ExpAssignment_3 ) ) ;
    public final void rule__Define__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1224:1: ( ( ( rule__Define__ExpAssignment_3 ) ) )
            // InternalMyDsl.g:1225:1: ( ( rule__Define__ExpAssignment_3 ) )
            {
            // InternalMyDsl.g:1225:1: ( ( rule__Define__ExpAssignment_3 ) )
            // InternalMyDsl.g:1226:2: ( rule__Define__ExpAssignment_3 )
            {
             before(grammarAccess.getDefineAccess().getExpAssignment_3()); 
            // InternalMyDsl.g:1227:2: ( rule__Define__ExpAssignment_3 )
            // InternalMyDsl.g:1227:3: rule__Define__ExpAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Define__ExpAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDefineAccess().getExpAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Define__Group__3__Impl"


    // $ANTLR start "rule__Define__Group__4"
    // InternalMyDsl.g:1235:1: rule__Define__Group__4 : rule__Define__Group__4__Impl rule__Define__Group__5 ;
    public final void rule__Define__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1239:1: ( rule__Define__Group__4__Impl rule__Define__Group__5 )
            // InternalMyDsl.g:1240:2: rule__Define__Group__4__Impl rule__Define__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Define__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Define__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Define__Group__4"


    // $ANTLR start "rule__Define__Group__4__Impl"
    // InternalMyDsl.g:1247:1: rule__Define__Group__4__Impl : ( ( rule__Define__SelAssignment_4 )? ) ;
    public final void rule__Define__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1251:1: ( ( ( rule__Define__SelAssignment_4 )? ) )
            // InternalMyDsl.g:1252:1: ( ( rule__Define__SelAssignment_4 )? )
            {
            // InternalMyDsl.g:1252:1: ( ( rule__Define__SelAssignment_4 )? )
            // InternalMyDsl.g:1253:2: ( rule__Define__SelAssignment_4 )?
            {
             before(grammarAccess.getDefineAccess().getSelAssignment_4()); 
            // InternalMyDsl.g:1254:2: ( rule__Define__SelAssignment_4 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:1254:3: rule__Define__SelAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Define__SelAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDefineAccess().getSelAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Define__Group__4__Impl"


    // $ANTLR start "rule__Define__Group__5"
    // InternalMyDsl.g:1262:1: rule__Define__Group__5 : rule__Define__Group__5__Impl ;
    public final void rule__Define__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1266:1: ( rule__Define__Group__5__Impl )
            // InternalMyDsl.g:1267:2: rule__Define__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Define__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Define__Group__5"


    // $ANTLR start "rule__Define__Group__5__Impl"
    // InternalMyDsl.g:1273:1: rule__Define__Group__5__Impl : ( ')' ) ;
    public final void rule__Define__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1277:1: ( ( ')' ) )
            // InternalMyDsl.g:1278:1: ( ')' )
            {
            // InternalMyDsl.g:1278:1: ( ')' )
            // InternalMyDsl.g:1279:2: ')'
            {
             before(grammarAccess.getDefineAccess().getRightParenthesisKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDefineAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Define__Group__5__Impl"


    // $ANTLR start "rule__Model__GreetingsAssignment"
    // InternalMyDsl.g:1289:1: rule__Model__GreetingsAssignment : ( ruleGreeting ) ;
    public final void rule__Model__GreetingsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1293:1: ( ( ruleGreeting ) )
            // InternalMyDsl.g:1294:2: ( ruleGreeting )
            {
            // InternalMyDsl.g:1294:2: ( ruleGreeting )
            // InternalMyDsl.g:1295:3: ruleGreeting
            {
             before(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleGreeting();

            state._fsp--;

             after(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__GreetingsAssignment"


    // $ANTLR start "rule__Greeting__ValueAssignment_1"
    // InternalMyDsl.g:1304:1: rule__Greeting__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__Greeting__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1308:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:1309:2: ( RULE_INT )
            {
            // InternalMyDsl.g:1309:2: ( RULE_INT )
            // InternalMyDsl.g:1310:3: RULE_INT
            {
             before(grammarAccess.getGreetingAccess().getValueINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getGreetingAccess().getValueINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__ValueAssignment_1"


    // $ANTLR start "rule__Expressao__NameAssignment_1_1"
    // InternalMyDsl.g:1319:1: rule__Expressao__NameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Expressao__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1323:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1324:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1324:2: ( RULE_ID )
            // InternalMyDsl.g:1325:3: RULE_ID
            {
             before(grammarAccess.getExpressaoAccess().getNameIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExpressaoAccess().getNameIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expressao__NameAssignment_1_1"


    // $ANTLR start "rule__Expressao__ValueAssignment_2_0"
    // InternalMyDsl.g:1334:1: rule__Expressao__ValueAssignment_2_0 : ( RULE_INT ) ;
    public final void rule__Expressao__ValueAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1338:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:1339:2: ( RULE_INT )
            {
            // InternalMyDsl.g:1339:2: ( RULE_INT )
            // InternalMyDsl.g:1340:3: RULE_INT
            {
             before(grammarAccess.getExpressaoAccess().getValueINTTerminalRuleCall_2_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getExpressaoAccess().getValueINTTerminalRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expressao__ValueAssignment_2_0"


    // $ANTLR start "rule__Expressao__ExpAssignment_2_1"
    // InternalMyDsl.g:1349:1: rule__Expressao__ExpAssignment_2_1 : ( ruleExpressao ) ;
    public final void rule__Expressao__ExpAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1353:1: ( ( ruleExpressao ) )
            // InternalMyDsl.g:1354:2: ( ruleExpressao )
            {
            // InternalMyDsl.g:1354:2: ( ruleExpressao )
            // InternalMyDsl.g:1355:3: ruleExpressao
            {
             before(grammarAccess.getExpressaoAccess().getExpExpressaoParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressao();

            state._fsp--;

             after(grammarAccess.getExpressaoAccess().getExpExpressaoParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expressao__ExpAssignment_2_1"


    // $ANTLR start "rule__Expressao__ValueAssignment_3_0"
    // InternalMyDsl.g:1364:1: rule__Expressao__ValueAssignment_3_0 : ( RULE_INT ) ;
    public final void rule__Expressao__ValueAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1368:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:1369:2: ( RULE_INT )
            {
            // InternalMyDsl.g:1369:2: ( RULE_INT )
            // InternalMyDsl.g:1370:3: RULE_INT
            {
             before(grammarAccess.getExpressaoAccess().getValueINTTerminalRuleCall_3_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getExpressaoAccess().getValueINTTerminalRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expressao__ValueAssignment_3_0"


    // $ANTLR start "rule__Expressao__ExpAssignment_3_1"
    // InternalMyDsl.g:1379:1: rule__Expressao__ExpAssignment_3_1 : ( ruleExpressao ) ;
    public final void rule__Expressao__ExpAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1383:1: ( ( ruleExpressao ) )
            // InternalMyDsl.g:1384:2: ( ruleExpressao )
            {
            // InternalMyDsl.g:1384:2: ( ruleExpressao )
            // InternalMyDsl.g:1385:3: ruleExpressao
            {
             before(grammarAccess.getExpressaoAccess().getExpExpressaoParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressao();

            state._fsp--;

             after(grammarAccess.getExpressaoAccess().getExpExpressaoParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expressao__ExpAssignment_3_1"


    // $ANTLR start "rule__Selecao__ExpAssignment_2_1_1"
    // InternalMyDsl.g:1394:1: rule__Selecao__ExpAssignment_2_1_1 : ( ruleExpressao ) ;
    public final void rule__Selecao__ExpAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1398:1: ( ( ruleExpressao ) )
            // InternalMyDsl.g:1399:2: ( ruleExpressao )
            {
            // InternalMyDsl.g:1399:2: ( ruleExpressao )
            // InternalMyDsl.g:1400:3: ruleExpressao
            {
             before(grammarAccess.getSelecaoAccess().getExpExpressaoParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressao();

            state._fsp--;

             after(grammarAccess.getSelecaoAccess().getExpExpressaoParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selecao__ExpAssignment_2_1_1"


    // $ANTLR start "rule__Selecao__ExpAssignment_2_1_2"
    // InternalMyDsl.g:1409:1: rule__Selecao__ExpAssignment_2_1_2 : ( ruleExpressao ) ;
    public final void rule__Selecao__ExpAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1413:1: ( ( ruleExpressao ) )
            // InternalMyDsl.g:1414:2: ( ruleExpressao )
            {
            // InternalMyDsl.g:1414:2: ( ruleExpressao )
            // InternalMyDsl.g:1415:3: ruleExpressao
            {
             before(grammarAccess.getSelecaoAccess().getExpExpressaoParserRuleCall_2_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressao();

            state._fsp--;

             after(grammarAccess.getSelecaoAccess().getExpExpressaoParserRuleCall_2_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selecao__ExpAssignment_2_1_2"


    // $ANTLR start "rule__Selecao__ExpAssignment_3_2"
    // InternalMyDsl.g:1424:1: rule__Selecao__ExpAssignment_3_2 : ( ruleExpressao ) ;
    public final void rule__Selecao__ExpAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1428:1: ( ( ruleExpressao ) )
            // InternalMyDsl.g:1429:2: ( ruleExpressao )
            {
            // InternalMyDsl.g:1429:2: ( ruleExpressao )
            // InternalMyDsl.g:1430:3: ruleExpressao
            {
             before(grammarAccess.getSelecaoAccess().getExpExpressaoParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressao();

            state._fsp--;

             after(grammarAccess.getSelecaoAccess().getExpExpressaoParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selecao__ExpAssignment_3_2"


    // $ANTLR start "rule__Define__ExpAssignment_3"
    // InternalMyDsl.g:1439:1: rule__Define__ExpAssignment_3 : ( ruleExpressao ) ;
    public final void rule__Define__ExpAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1443:1: ( ( ruleExpressao ) )
            // InternalMyDsl.g:1444:2: ( ruleExpressao )
            {
            // InternalMyDsl.g:1444:2: ( ruleExpressao )
            // InternalMyDsl.g:1445:3: ruleExpressao
            {
             before(grammarAccess.getDefineAccess().getExpExpressaoParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressao();

            state._fsp--;

             after(grammarAccess.getDefineAccess().getExpExpressaoParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Define__ExpAssignment_3"


    // $ANTLR start "rule__Define__SelAssignment_4"
    // InternalMyDsl.g:1454:1: rule__Define__SelAssignment_4 : ( ruleSelecao ) ;
    public final void rule__Define__SelAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1458:1: ( ( ruleSelecao ) )
            // InternalMyDsl.g:1459:2: ( ruleSelecao )
            {
            // InternalMyDsl.g:1459:2: ( ruleSelecao )
            // InternalMyDsl.g:1460:3: ruleSelecao
            {
             before(grammarAccess.getDefineAccess().getSelSelecaoParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSelecao();

            state._fsp--;

             after(grammarAccess.getDefineAccess().getSelSelecaoParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Define__SelAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000021F070L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000600030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000200032L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000001E0000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});

}