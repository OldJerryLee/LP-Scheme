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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'-'", "'*'", "'expt'", "'/'", "'('", "')'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=4;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

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


    // $ANTLR start "rule__Greeting__Alternatives"
    // InternalMyDsl.g:127:1: rule__Greeting__Alternatives : ( ( ( rule__Greeting__Group_0__0 ) ) | ( ( rule__Greeting__ValueAssignment_1 ) ) );
    public final void rule__Greeting__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:131:1: ( ( ( rule__Greeting__Group_0__0 ) ) | ( ( rule__Greeting__ValueAssignment_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==16) ) {
                alt1=1;
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
                    // InternalMyDsl.g:132:2: ( ( rule__Greeting__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:132:2: ( ( rule__Greeting__Group_0__0 ) )
                    // InternalMyDsl.g:133:3: ( rule__Greeting__Group_0__0 )
                    {
                     before(grammarAccess.getGreetingAccess().getGroup_0()); 
                    // InternalMyDsl.g:134:3: ( rule__Greeting__Group_0__0 )
                    // InternalMyDsl.g:134:4: rule__Greeting__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Greeting__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGreetingAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:138:2: ( ( rule__Greeting__ValueAssignment_1 ) )
                    {
                    // InternalMyDsl.g:138:2: ( ( rule__Greeting__ValueAssignment_1 ) )
                    // InternalMyDsl.g:139:3: ( rule__Greeting__ValueAssignment_1 )
                    {
                     before(grammarAccess.getGreetingAccess().getValueAssignment_1()); 
                    // InternalMyDsl.g:140:3: ( rule__Greeting__ValueAssignment_1 )
                    // InternalMyDsl.g:140:4: rule__Greeting__ValueAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Greeting__ValueAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getGreetingAccess().getValueAssignment_1()); 

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
    // InternalMyDsl.g:148:1: rule__Op__Alternatives : ( ( '+' ) | ( '-' ) | ( '*' ) | ( 'expt' ) | ( '/' ) );
    public final void rule__Op__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:152:1: ( ( '+' ) | ( '-' ) | ( '*' ) | ( 'expt' ) | ( '/' ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            case 15:
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
                    // InternalMyDsl.g:153:2: ( '+' )
                    {
                    // InternalMyDsl.g:153:2: ( '+' )
                    // InternalMyDsl.g:154:3: '+'
                    {
                     before(grammarAccess.getOpAccess().getPlusSignKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getOpAccess().getPlusSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:159:2: ( '-' )
                    {
                    // InternalMyDsl.g:159:2: ( '-' )
                    // InternalMyDsl.g:160:3: '-'
                    {
                     before(grammarAccess.getOpAccess().getHyphenMinusKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getOpAccess().getHyphenMinusKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:165:2: ( '*' )
                    {
                    // InternalMyDsl.g:165:2: ( '*' )
                    // InternalMyDsl.g:166:3: '*'
                    {
                     before(grammarAccess.getOpAccess().getAsteriskKeyword_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getOpAccess().getAsteriskKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:171:2: ( 'expt' )
                    {
                    // InternalMyDsl.g:171:2: ( 'expt' )
                    // InternalMyDsl.g:172:3: 'expt'
                    {
                     before(grammarAccess.getOpAccess().getExptKeyword_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getOpAccess().getExptKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:177:2: ( '/' )
                    {
                    // InternalMyDsl.g:177:2: ( '/' )
                    // InternalMyDsl.g:178:3: '/'
                    {
                     before(grammarAccess.getOpAccess().getSolidusKeyword_4()); 
                    match(input,15,FOLLOW_2); 
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


    // $ANTLR start "rule__Greeting__Group_0__0"
    // InternalMyDsl.g:187:1: rule__Greeting__Group_0__0 : rule__Greeting__Group_0__0__Impl rule__Greeting__Group_0__1 ;
    public final void rule__Greeting__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:1: ( rule__Greeting__Group_0__0__Impl rule__Greeting__Group_0__1 )
            // InternalMyDsl.g:192:2: rule__Greeting__Group_0__0__Impl rule__Greeting__Group_0__1
            {
            pushFollow(FOLLOW_3);
            rule__Greeting__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Greeting__Group_0__1();

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
    // $ANTLR end "rule__Greeting__Group_0__0"


    // $ANTLR start "rule__Greeting__Group_0__0__Impl"
    // InternalMyDsl.g:199:1: rule__Greeting__Group_0__0__Impl : ( '(' ) ;
    public final void rule__Greeting__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:203:1: ( ( '(' ) )
            // InternalMyDsl.g:204:1: ( '(' )
            {
            // InternalMyDsl.g:204:1: ( '(' )
            // InternalMyDsl.g:205:2: '('
            {
             before(grammarAccess.getGreetingAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getGreetingAccess().getLeftParenthesisKeyword_0_0()); 

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
    // $ANTLR end "rule__Greeting__Group_0__0__Impl"


    // $ANTLR start "rule__Greeting__Group_0__1"
    // InternalMyDsl.g:214:1: rule__Greeting__Group_0__1 : rule__Greeting__Group_0__1__Impl rule__Greeting__Group_0__2 ;
    public final void rule__Greeting__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:218:1: ( rule__Greeting__Group_0__1__Impl rule__Greeting__Group_0__2 )
            // InternalMyDsl.g:219:2: rule__Greeting__Group_0__1__Impl rule__Greeting__Group_0__2
            {
            pushFollow(FOLLOW_4);
            rule__Greeting__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Greeting__Group_0__2();

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
    // $ANTLR end "rule__Greeting__Group_0__1"


    // $ANTLR start "rule__Greeting__Group_0__1__Impl"
    // InternalMyDsl.g:226:1: rule__Greeting__Group_0__1__Impl : ( ruleOp ) ;
    public final void rule__Greeting__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:230:1: ( ( ruleOp ) )
            // InternalMyDsl.g:231:1: ( ruleOp )
            {
            // InternalMyDsl.g:231:1: ( ruleOp )
            // InternalMyDsl.g:232:2: ruleOp
            {
             before(grammarAccess.getGreetingAccess().getOpParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleOp();

            state._fsp--;

             after(grammarAccess.getGreetingAccess().getOpParserRuleCall_0_1()); 

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
    // $ANTLR end "rule__Greeting__Group_0__1__Impl"


    // $ANTLR start "rule__Greeting__Group_0__2"
    // InternalMyDsl.g:241:1: rule__Greeting__Group_0__2 : rule__Greeting__Group_0__2__Impl rule__Greeting__Group_0__3 ;
    public final void rule__Greeting__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:245:1: ( rule__Greeting__Group_0__2__Impl rule__Greeting__Group_0__3 )
            // InternalMyDsl.g:246:2: rule__Greeting__Group_0__2__Impl rule__Greeting__Group_0__3
            {
            pushFollow(FOLLOW_4);
            rule__Greeting__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Greeting__Group_0__3();

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
    // $ANTLR end "rule__Greeting__Group_0__2"


    // $ANTLR start "rule__Greeting__Group_0__2__Impl"
    // InternalMyDsl.g:253:1: rule__Greeting__Group_0__2__Impl : ( ( rule__Greeting__ValueAssignment_0_2 ) ) ;
    public final void rule__Greeting__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:257:1: ( ( ( rule__Greeting__ValueAssignment_0_2 ) ) )
            // InternalMyDsl.g:258:1: ( ( rule__Greeting__ValueAssignment_0_2 ) )
            {
            // InternalMyDsl.g:258:1: ( ( rule__Greeting__ValueAssignment_0_2 ) )
            // InternalMyDsl.g:259:2: ( rule__Greeting__ValueAssignment_0_2 )
            {
             before(grammarAccess.getGreetingAccess().getValueAssignment_0_2()); 
            // InternalMyDsl.g:260:2: ( rule__Greeting__ValueAssignment_0_2 )
            // InternalMyDsl.g:260:3: rule__Greeting__ValueAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Greeting__ValueAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getGreetingAccess().getValueAssignment_0_2()); 

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
    // $ANTLR end "rule__Greeting__Group_0__2__Impl"


    // $ANTLR start "rule__Greeting__Group_0__3"
    // InternalMyDsl.g:268:1: rule__Greeting__Group_0__3 : rule__Greeting__Group_0__3__Impl rule__Greeting__Group_0__4 ;
    public final void rule__Greeting__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:272:1: ( rule__Greeting__Group_0__3__Impl rule__Greeting__Group_0__4 )
            // InternalMyDsl.g:273:2: rule__Greeting__Group_0__3__Impl rule__Greeting__Group_0__4
            {
            pushFollow(FOLLOW_5);
            rule__Greeting__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Greeting__Group_0__4();

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
    // $ANTLR end "rule__Greeting__Group_0__3"


    // $ANTLR start "rule__Greeting__Group_0__3__Impl"
    // InternalMyDsl.g:280:1: rule__Greeting__Group_0__3__Impl : ( ( rule__Greeting__ValueAssignment_0_3 ) ) ;
    public final void rule__Greeting__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:284:1: ( ( ( rule__Greeting__ValueAssignment_0_3 ) ) )
            // InternalMyDsl.g:285:1: ( ( rule__Greeting__ValueAssignment_0_3 ) )
            {
            // InternalMyDsl.g:285:1: ( ( rule__Greeting__ValueAssignment_0_3 ) )
            // InternalMyDsl.g:286:2: ( rule__Greeting__ValueAssignment_0_3 )
            {
             before(grammarAccess.getGreetingAccess().getValueAssignment_0_3()); 
            // InternalMyDsl.g:287:2: ( rule__Greeting__ValueAssignment_0_3 )
            // InternalMyDsl.g:287:3: rule__Greeting__ValueAssignment_0_3
            {
            pushFollow(FOLLOW_2);
            rule__Greeting__ValueAssignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getGreetingAccess().getValueAssignment_0_3()); 

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
    // $ANTLR end "rule__Greeting__Group_0__3__Impl"


    // $ANTLR start "rule__Greeting__Group_0__4"
    // InternalMyDsl.g:295:1: rule__Greeting__Group_0__4 : rule__Greeting__Group_0__4__Impl ;
    public final void rule__Greeting__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:299:1: ( rule__Greeting__Group_0__4__Impl )
            // InternalMyDsl.g:300:2: rule__Greeting__Group_0__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Greeting__Group_0__4__Impl();

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
    // $ANTLR end "rule__Greeting__Group_0__4"


    // $ANTLR start "rule__Greeting__Group_0__4__Impl"
    // InternalMyDsl.g:306:1: rule__Greeting__Group_0__4__Impl : ( ')' ) ;
    public final void rule__Greeting__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:310:1: ( ( ')' ) )
            // InternalMyDsl.g:311:1: ( ')' )
            {
            // InternalMyDsl.g:311:1: ( ')' )
            // InternalMyDsl.g:312:2: ')'
            {
             before(grammarAccess.getGreetingAccess().getRightParenthesisKeyword_0_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getGreetingAccess().getRightParenthesisKeyword_0_4()); 

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
    // $ANTLR end "rule__Greeting__Group_0__4__Impl"


    // $ANTLR start "rule__Model__GreetingsAssignment"
    // InternalMyDsl.g:322:1: rule__Model__GreetingsAssignment : ( ruleGreeting ) ;
    public final void rule__Model__GreetingsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:326:1: ( ( ruleGreeting ) )
            // InternalMyDsl.g:327:2: ( ruleGreeting )
            {
            // InternalMyDsl.g:327:2: ( ruleGreeting )
            // InternalMyDsl.g:328:3: ruleGreeting
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


    // $ANTLR start "rule__Greeting__ValueAssignment_0_2"
    // InternalMyDsl.g:337:1: rule__Greeting__ValueAssignment_0_2 : ( RULE_INT ) ;
    public final void rule__Greeting__ValueAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:342:2: ( RULE_INT )
            {
            // InternalMyDsl.g:342:2: ( RULE_INT )
            // InternalMyDsl.g:343:3: RULE_INT
            {
             before(grammarAccess.getGreetingAccess().getValueINTTerminalRuleCall_0_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getGreetingAccess().getValueINTTerminalRuleCall_0_2_0()); 

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
    // $ANTLR end "rule__Greeting__ValueAssignment_0_2"


    // $ANTLR start "rule__Greeting__ValueAssignment_0_3"
    // InternalMyDsl.g:352:1: rule__Greeting__ValueAssignment_0_3 : ( RULE_INT ) ;
    public final void rule__Greeting__ValueAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:356:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:357:2: ( RULE_INT )
            {
            // InternalMyDsl.g:357:2: ( RULE_INT )
            // InternalMyDsl.g:358:3: RULE_INT
            {
             before(grammarAccess.getGreetingAccess().getValueINTTerminalRuleCall_0_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getGreetingAccess().getValueINTTerminalRuleCall_0_3_0()); 

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
    // $ANTLR end "rule__Greeting__ValueAssignment_0_3"


    // $ANTLR start "rule__Greeting__ValueAssignment_1"
    // InternalMyDsl.g:367:1: rule__Greeting__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__Greeting__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:371:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:372:2: ( RULE_INT )
            {
            // InternalMyDsl.g:372:2: ( RULE_INT )
            // InternalMyDsl.g:373:3: RULE_INT
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000000F800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});

}