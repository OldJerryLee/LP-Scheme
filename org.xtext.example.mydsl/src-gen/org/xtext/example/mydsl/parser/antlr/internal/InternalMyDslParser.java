package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_SIMBOLO", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'-'", "'*'", "'expt'", "'/'", "'('", "')'", "'>'", "'<'", "'>='", "'<='", "'cond'", "'else'", "'define'"
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=4;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_SIMBOLO=6;
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

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMyDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalMyDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:71:1: ruleModel returns [EObject current=null] : ( (lv_greetings_0_0= ruleGreeting ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_greetings_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( (lv_greetings_0_0= ruleGreeting ) ) )
            // InternalMyDsl.g:78:2: ( (lv_greetings_0_0= ruleGreeting ) )
            {
            // InternalMyDsl.g:78:2: ( (lv_greetings_0_0= ruleGreeting ) )
            // InternalMyDsl.g:79:3: (lv_greetings_0_0= ruleGreeting )
            {
            // InternalMyDsl.g:79:3: (lv_greetings_0_0= ruleGreeting )
            // InternalMyDsl.g:80:4: lv_greetings_0_0= ruleGreeting
            {

            				newCompositeNode(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_greetings_0_0=ruleGreeting();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getModelRule());
            				}
            				add(
            					current,
            					"greetings",
            					lv_greetings_0_0,
            					"org.xtext.example.mydsl.MyDsl.Greeting");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleGreeting"
    // InternalMyDsl.g:100:1: entryRuleGreeting returns [EObject current=null] : iv_ruleGreeting= ruleGreeting EOF ;
    public final EObject entryRuleGreeting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreeting = null;


        try {
            // InternalMyDsl.g:100:49: (iv_ruleGreeting= ruleGreeting EOF )
            // InternalMyDsl.g:101:2: iv_ruleGreeting= ruleGreeting EOF
            {
             newCompositeNode(grammarAccess.getGreetingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGreeting=ruleGreeting();

            state._fsp--;

             current =iv_ruleGreeting; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGreeting"


    // $ANTLR start "ruleGreeting"
    // InternalMyDsl.g:107:1: ruleGreeting returns [EObject current=null] : (this_Expressao_0= ruleExpressao | ( (lv_value_1_0= RULE_INT ) ) | rulePredicado | this_Selecao_3= ruleSelecao | this_Define_4= ruleDefine ) ;
    public final EObject ruleGreeting() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        EObject this_Expressao_0 = null;

        EObject this_Selecao_3 = null;

        EObject this_Define_4 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:113:2: ( (this_Expressao_0= ruleExpressao | ( (lv_value_1_0= RULE_INT ) ) | rulePredicado | this_Selecao_3= ruleSelecao | this_Define_4= ruleDefine ) )
            // InternalMyDsl.g:114:2: (this_Expressao_0= ruleExpressao | ( (lv_value_1_0= RULE_INT ) ) | rulePredicado | this_Selecao_3= ruleSelecao | this_Define_4= ruleDefine )
            {
            // InternalMyDsl.g:114:2: (this_Expressao_0= ruleExpressao | ( (lv_value_1_0= RULE_INT ) ) | rulePredicado | this_Selecao_3= ruleSelecao | this_Define_4= ruleDefine )
            int alt1=5;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==17) ) {
                switch ( input.LA(2) ) {
                case RULE_INT:
                case RULE_ID:
                case RULE_SIMBOLO:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                    {
                    alt1=1;
                    }
                    break;
                case 19:
                case 20:
                case 21:
                case 22:
                    {
                    alt1=3;
                    }
                    break;
                case 23:
                    {
                    alt1=4;
                    }
                    break;
                case 25:
                    {
                    alt1=5;
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
                    // InternalMyDsl.g:115:3: this_Expressao_0= ruleExpressao
                    {

                    			newCompositeNode(grammarAccess.getGreetingAccess().getExpressaoParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Expressao_0=ruleExpressao();

                    state._fsp--;


                    			current = this_Expressao_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:124:3: ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalMyDsl.g:124:3: ( (lv_value_1_0= RULE_INT ) )
                    // InternalMyDsl.g:125:4: (lv_value_1_0= RULE_INT )
                    {
                    // InternalMyDsl.g:125:4: (lv_value_1_0= RULE_INT )
                    // InternalMyDsl.g:126:5: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    					newLeafNode(lv_value_1_0, grammarAccess.getGreetingAccess().getValueINTTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getGreetingRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"value",
                    						lv_value_1_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:143:3: rulePredicado
                    {

                    			newCompositeNode(grammarAccess.getGreetingAccess().getPredicadoParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    rulePredicado();

                    state._fsp--;


                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:151:3: this_Selecao_3= ruleSelecao
                    {

                    			newCompositeNode(grammarAccess.getGreetingAccess().getSelecaoParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Selecao_3=ruleSelecao();

                    state._fsp--;


                    			current = this_Selecao_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:160:3: this_Define_4= ruleDefine
                    {

                    			newCompositeNode(grammarAccess.getGreetingAccess().getDefineParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Define_4=ruleDefine();

                    state._fsp--;


                    			current = this_Define_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGreeting"


    // $ANTLR start "entryRuleOp"
    // InternalMyDsl.g:172:1: entryRuleOp returns [String current=null] : iv_ruleOp= ruleOp EOF ;
    public final String entryRuleOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOp = null;


        try {
            // InternalMyDsl.g:172:42: (iv_ruleOp= ruleOp EOF )
            // InternalMyDsl.g:173:2: iv_ruleOp= ruleOp EOF
            {
             newCompositeNode(grammarAccess.getOpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOp=ruleOp();

            state._fsp--;

             current =iv_ruleOp.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOp"


    // $ANTLR start "ruleOp"
    // InternalMyDsl.g:179:1: ruleOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '*' | kw= 'expt' | kw= '/' ) ;
    public final AntlrDatatypeRuleToken ruleOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:185:2: ( (kw= '+' | kw= '-' | kw= '*' | kw= 'expt' | kw= '/' ) )
            // InternalMyDsl.g:186:2: (kw= '+' | kw= '-' | kw= '*' | kw= 'expt' | kw= '/' )
            {
            // InternalMyDsl.g:186:2: (kw= '+' | kw= '-' | kw= '*' | kw= 'expt' | kw= '/' )
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
                    // InternalMyDsl.g:187:3: kw= '+'
                    {
                    kw=(Token)match(input,12,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOpAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:193:3: kw= '-'
                    {
                    kw=(Token)match(input,13,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOpAccess().getHyphenMinusKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:199:3: kw= '*'
                    {
                    kw=(Token)match(input,14,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOpAccess().getAsteriskKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:205:3: kw= 'expt'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOpAccess().getExptKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:211:3: kw= '/'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOpAccess().getSolidusKeyword_4());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOp"


    // $ANTLR start "entryRuleExpressao"
    // InternalMyDsl.g:220:1: entryRuleExpressao returns [EObject current=null] : iv_ruleExpressao= ruleExpressao EOF ;
    public final EObject entryRuleExpressao() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressao = null;


        try {
            // InternalMyDsl.g:220:50: (iv_ruleExpressao= ruleExpressao EOF )
            // InternalMyDsl.g:221:2: iv_ruleExpressao= ruleExpressao EOF
            {
             newCompositeNode(grammarAccess.getExpressaoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressao=ruleExpressao();

            state._fsp--;

             current =iv_ruleExpressao; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressao"


    // $ANTLR start "ruleExpressao"
    // InternalMyDsl.g:227:1: ruleExpressao returns [EObject current=null] : (otherlv_0= '(' ( ruleOp | ( (lv_name_2_0= RULE_ID ) ) )? ( ( (lv_value_3_0= RULE_INT ) ) | ( (lv_Exp_4_0= ruleExpressao ) ) | this_SIMBOLO_5= RULE_SIMBOLO ) ( ( (lv_value_6_0= RULE_INT ) ) | ( (lv_Exp_7_0= ruleExpressao ) ) | this_SIMBOLO_8= RULE_SIMBOLO )* otherlv_9= ')' ) ;
    public final EObject ruleExpressao() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token lv_value_3_0=null;
        Token this_SIMBOLO_5=null;
        Token lv_value_6_0=null;
        Token this_SIMBOLO_8=null;
        Token otherlv_9=null;
        EObject lv_Exp_4_0 = null;

        EObject lv_Exp_7_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:233:2: ( (otherlv_0= '(' ( ruleOp | ( (lv_name_2_0= RULE_ID ) ) )? ( ( (lv_value_3_0= RULE_INT ) ) | ( (lv_Exp_4_0= ruleExpressao ) ) | this_SIMBOLO_5= RULE_SIMBOLO ) ( ( (lv_value_6_0= RULE_INT ) ) | ( (lv_Exp_7_0= ruleExpressao ) ) | this_SIMBOLO_8= RULE_SIMBOLO )* otherlv_9= ')' ) )
            // InternalMyDsl.g:234:2: (otherlv_0= '(' ( ruleOp | ( (lv_name_2_0= RULE_ID ) ) )? ( ( (lv_value_3_0= RULE_INT ) ) | ( (lv_Exp_4_0= ruleExpressao ) ) | this_SIMBOLO_5= RULE_SIMBOLO ) ( ( (lv_value_6_0= RULE_INT ) ) | ( (lv_Exp_7_0= ruleExpressao ) ) | this_SIMBOLO_8= RULE_SIMBOLO )* otherlv_9= ')' )
            {
            // InternalMyDsl.g:234:2: (otherlv_0= '(' ( ruleOp | ( (lv_name_2_0= RULE_ID ) ) )? ( ( (lv_value_3_0= RULE_INT ) ) | ( (lv_Exp_4_0= ruleExpressao ) ) | this_SIMBOLO_5= RULE_SIMBOLO ) ( ( (lv_value_6_0= RULE_INT ) ) | ( (lv_Exp_7_0= ruleExpressao ) ) | this_SIMBOLO_8= RULE_SIMBOLO )* otherlv_9= ')' )
            // InternalMyDsl.g:235:3: otherlv_0= '(' ( ruleOp | ( (lv_name_2_0= RULE_ID ) ) )? ( ( (lv_value_3_0= RULE_INT ) ) | ( (lv_Exp_4_0= ruleExpressao ) ) | this_SIMBOLO_5= RULE_SIMBOLO ) ( ( (lv_value_6_0= RULE_INT ) ) | ( (lv_Exp_7_0= ruleExpressao ) ) | this_SIMBOLO_8= RULE_SIMBOLO )* otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getExpressaoAccess().getLeftParenthesisKeyword_0());
            		
            // InternalMyDsl.g:239:3: ( ruleOp | ( (lv_name_2_0= RULE_ID ) ) )?
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=12 && LA3_0<=16)) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:240:4: ruleOp
                    {

                    				newCompositeNode(grammarAccess.getExpressaoAccess().getOpParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_4);
                    ruleOp();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:248:4: ( (lv_name_2_0= RULE_ID ) )
                    {
                    // InternalMyDsl.g:248:4: ( (lv_name_2_0= RULE_ID ) )
                    // InternalMyDsl.g:249:5: (lv_name_2_0= RULE_ID )
                    {
                    // InternalMyDsl.g:249:5: (lv_name_2_0= RULE_ID )
                    // InternalMyDsl.g:250:6: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

                    						newLeafNode(lv_name_2_0, grammarAccess.getExpressaoAccess().getNameIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExpressaoRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:267:3: ( ( (lv_value_3_0= RULE_INT ) ) | ( (lv_Exp_4_0= ruleExpressao ) ) | this_SIMBOLO_5= RULE_SIMBOLO )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt4=1;
                }
                break;
            case 17:
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
                    // InternalMyDsl.g:268:4: ( (lv_value_3_0= RULE_INT ) )
                    {
                    // InternalMyDsl.g:268:4: ( (lv_value_3_0= RULE_INT ) )
                    // InternalMyDsl.g:269:5: (lv_value_3_0= RULE_INT )
                    {
                    // InternalMyDsl.g:269:5: (lv_value_3_0= RULE_INT )
                    // InternalMyDsl.g:270:6: lv_value_3_0= RULE_INT
                    {
                    lv_value_3_0=(Token)match(input,RULE_INT,FOLLOW_5); 

                    						newLeafNode(lv_value_3_0, grammarAccess.getExpressaoAccess().getValueINTTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExpressaoRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:287:4: ( (lv_Exp_4_0= ruleExpressao ) )
                    {
                    // InternalMyDsl.g:287:4: ( (lv_Exp_4_0= ruleExpressao ) )
                    // InternalMyDsl.g:288:5: (lv_Exp_4_0= ruleExpressao )
                    {
                    // InternalMyDsl.g:288:5: (lv_Exp_4_0= ruleExpressao )
                    // InternalMyDsl.g:289:6: lv_Exp_4_0= ruleExpressao
                    {

                    						newCompositeNode(grammarAccess.getExpressaoAccess().getExpExpressaoParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_Exp_4_0=ruleExpressao();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpressaoRule());
                    						}
                    						set(
                    							current,
                    							"Exp",
                    							lv_Exp_4_0,
                    							"org.xtext.example.mydsl.MyDsl.Expressao");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:307:4: this_SIMBOLO_5= RULE_SIMBOLO
                    {
                    this_SIMBOLO_5=(Token)match(input,RULE_SIMBOLO,FOLLOW_5); 

                    				newLeafNode(this_SIMBOLO_5, grammarAccess.getExpressaoAccess().getSIMBOLOTerminalRuleCall_2_2());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:312:3: ( ( (lv_value_6_0= RULE_INT ) ) | ( (lv_Exp_7_0= ruleExpressao ) ) | this_SIMBOLO_8= RULE_SIMBOLO )*
            loop5:
            do {
                int alt5=4;
                switch ( input.LA(1) ) {
                case RULE_INT:
                    {
                    alt5=1;
                    }
                    break;
                case 17:
                    {
                    alt5=2;
                    }
                    break;
                case RULE_SIMBOLO:
                    {
                    alt5=3;
                    }
                    break;

                }

                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:313:4: ( (lv_value_6_0= RULE_INT ) )
            	    {
            	    // InternalMyDsl.g:313:4: ( (lv_value_6_0= RULE_INT ) )
            	    // InternalMyDsl.g:314:5: (lv_value_6_0= RULE_INT )
            	    {
            	    // InternalMyDsl.g:314:5: (lv_value_6_0= RULE_INT )
            	    // InternalMyDsl.g:315:6: lv_value_6_0= RULE_INT
            	    {
            	    lv_value_6_0=(Token)match(input,RULE_INT,FOLLOW_5); 

            	    						newLeafNode(lv_value_6_0, grammarAccess.getExpressaoAccess().getValueINTTerminalRuleCall_3_0_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getExpressaoRule());
            	    						}
            	    						setWithLastConsumed(
            	    							current,
            	    							"value",
            	    							lv_value_6_0,
            	    							"org.eclipse.xtext.common.Terminals.INT");
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:332:4: ( (lv_Exp_7_0= ruleExpressao ) )
            	    {
            	    // InternalMyDsl.g:332:4: ( (lv_Exp_7_0= ruleExpressao ) )
            	    // InternalMyDsl.g:333:5: (lv_Exp_7_0= ruleExpressao )
            	    {
            	    // InternalMyDsl.g:333:5: (lv_Exp_7_0= ruleExpressao )
            	    // InternalMyDsl.g:334:6: lv_Exp_7_0= ruleExpressao
            	    {

            	    						newCompositeNode(grammarAccess.getExpressaoAccess().getExpExpressaoParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_Exp_7_0=ruleExpressao();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpressaoRule());
            	    						}
            	    						set(
            	    							current,
            	    							"Exp",
            	    							lv_Exp_7_0,
            	    							"org.xtext.example.mydsl.MyDsl.Expressao");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMyDsl.g:352:4: this_SIMBOLO_8= RULE_SIMBOLO
            	    {
            	    this_SIMBOLO_8=(Token)match(input,RULE_SIMBOLO,FOLLOW_5); 

            	    				newLeafNode(this_SIMBOLO_8, grammarAccess.getExpressaoAccess().getSIMBOLOTerminalRuleCall_3_2());
            	    			

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_9=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getExpressaoAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpressao"


    // $ANTLR start "entryRuleComparador"
    // InternalMyDsl.g:365:1: entryRuleComparador returns [String current=null] : iv_ruleComparador= ruleComparador EOF ;
    public final String entryRuleComparador() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleComparador = null;


        try {
            // InternalMyDsl.g:365:50: (iv_ruleComparador= ruleComparador EOF )
            // InternalMyDsl.g:366:2: iv_ruleComparador= ruleComparador EOF
            {
             newCompositeNode(grammarAccess.getComparadorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComparador=ruleComparador();

            state._fsp--;

             current =iv_ruleComparador.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparador"


    // $ANTLR start "ruleComparador"
    // InternalMyDsl.g:372:1: ruleComparador returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' ) ;
    public final AntlrDatatypeRuleToken ruleComparador() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:378:2: ( (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' ) )
            // InternalMyDsl.g:379:2: (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' )
            {
            // InternalMyDsl.g:379:2: (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt6=1;
                }
                break;
            case 20:
                {
                alt6=2;
                }
                break;
            case 21:
                {
                alt6=3;
                }
                break;
            case 22:
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
                    // InternalMyDsl.g:380:3: kw= '>'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getComparadorAccess().getGreaterThanSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:386:3: kw= '<'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getComparadorAccess().getLessThanSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:392:3: kw= '>='
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getComparadorAccess().getGreaterThanSignEqualsSignKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:398:3: kw= '<='
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getComparadorAccess().getLessThanSignEqualsSignKeyword_3());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparador"


    // $ANTLR start "entryRulePredicado"
    // InternalMyDsl.g:407:1: entryRulePredicado returns [String current=null] : iv_rulePredicado= rulePredicado EOF ;
    public final String entryRulePredicado() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePredicado = null;


        try {
            // InternalMyDsl.g:407:49: (iv_rulePredicado= rulePredicado EOF )
            // InternalMyDsl.g:408:2: iv_rulePredicado= rulePredicado EOF
            {
             newCompositeNode(grammarAccess.getPredicadoRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePredicado=rulePredicado();

            state._fsp--;

             current =iv_rulePredicado.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePredicado"


    // $ANTLR start "rulePredicado"
    // InternalMyDsl.g:414:1: rulePredicado returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '(' this_Comparador_1= ruleComparador this_SIMBOLO_2= RULE_SIMBOLO this_SIMBOLO_3= RULE_SIMBOLO kw= ')' ) ;
    public final AntlrDatatypeRuleToken rulePredicado() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_SIMBOLO_2=null;
        Token this_SIMBOLO_3=null;
        AntlrDatatypeRuleToken this_Comparador_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:420:2: ( (kw= '(' this_Comparador_1= ruleComparador this_SIMBOLO_2= RULE_SIMBOLO this_SIMBOLO_3= RULE_SIMBOLO kw= ')' ) )
            // InternalMyDsl.g:421:2: (kw= '(' this_Comparador_1= ruleComparador this_SIMBOLO_2= RULE_SIMBOLO this_SIMBOLO_3= RULE_SIMBOLO kw= ')' )
            {
            // InternalMyDsl.g:421:2: (kw= '(' this_Comparador_1= ruleComparador this_SIMBOLO_2= RULE_SIMBOLO this_SIMBOLO_3= RULE_SIMBOLO kw= ')' )
            // InternalMyDsl.g:422:3: kw= '(' this_Comparador_1= ruleComparador this_SIMBOLO_2= RULE_SIMBOLO this_SIMBOLO_3= RULE_SIMBOLO kw= ')'
            {
            kw=(Token)match(input,17,FOLLOW_6); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getPredicadoAccess().getLeftParenthesisKeyword_0());
            		

            			newCompositeNode(grammarAccess.getPredicadoAccess().getComparadorParserRuleCall_1());
            		
            pushFollow(FOLLOW_7);
            this_Comparador_1=ruleComparador();

            state._fsp--;


            			current.merge(this_Comparador_1);
            		

            			afterParserOrEnumRuleCall();
            		
            this_SIMBOLO_2=(Token)match(input,RULE_SIMBOLO,FOLLOW_7); 

            			current.merge(this_SIMBOLO_2);
            		

            			newLeafNode(this_SIMBOLO_2, grammarAccess.getPredicadoAccess().getSIMBOLOTerminalRuleCall_2());
            		
            this_SIMBOLO_3=(Token)match(input,RULE_SIMBOLO,FOLLOW_8); 

            			current.merge(this_SIMBOLO_3);
            		

            			newLeafNode(this_SIMBOLO_3, grammarAccess.getPredicadoAccess().getSIMBOLOTerminalRuleCall_3());
            		
            kw=(Token)match(input,18,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getPredicadoAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePredicado"


    // $ANTLR start "entryRuleSelecao"
    // InternalMyDsl.g:460:1: entryRuleSelecao returns [EObject current=null] : iv_ruleSelecao= ruleSelecao EOF ;
    public final EObject entryRuleSelecao() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelecao = null;


        try {
            // InternalMyDsl.g:460:48: (iv_ruleSelecao= ruleSelecao EOF )
            // InternalMyDsl.g:461:2: iv_ruleSelecao= ruleSelecao EOF
            {
             newCompositeNode(grammarAccess.getSelecaoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelecao=ruleSelecao();

            state._fsp--;

             current =iv_ruleSelecao; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelecao"


    // $ANTLR start "ruleSelecao"
    // InternalMyDsl.g:467:1: ruleSelecao returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'cond' (otherlv_2= '(' ( rulePredicado ( (lv_Exp_4_0= ruleExpressao ) ) ( (lv_Exp_5_0= ruleExpressao ) )* ) otherlv_6= ')' )+ (otherlv_7= '(' otherlv_8= 'else' ( (lv_Exp_9_0= ruleExpressao ) )+ otherlv_10= ')' )? otherlv_11= ')' ) ;
    public final EObject ruleSelecao() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_Exp_4_0 = null;

        EObject lv_Exp_5_0 = null;

        EObject lv_Exp_9_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:473:2: ( (otherlv_0= '(' otherlv_1= 'cond' (otherlv_2= '(' ( rulePredicado ( (lv_Exp_4_0= ruleExpressao ) ) ( (lv_Exp_5_0= ruleExpressao ) )* ) otherlv_6= ')' )+ (otherlv_7= '(' otherlv_8= 'else' ( (lv_Exp_9_0= ruleExpressao ) )+ otherlv_10= ')' )? otherlv_11= ')' ) )
            // InternalMyDsl.g:474:2: (otherlv_0= '(' otherlv_1= 'cond' (otherlv_2= '(' ( rulePredicado ( (lv_Exp_4_0= ruleExpressao ) ) ( (lv_Exp_5_0= ruleExpressao ) )* ) otherlv_6= ')' )+ (otherlv_7= '(' otherlv_8= 'else' ( (lv_Exp_9_0= ruleExpressao ) )+ otherlv_10= ')' )? otherlv_11= ')' )
            {
            // InternalMyDsl.g:474:2: (otherlv_0= '(' otherlv_1= 'cond' (otherlv_2= '(' ( rulePredicado ( (lv_Exp_4_0= ruleExpressao ) ) ( (lv_Exp_5_0= ruleExpressao ) )* ) otherlv_6= ')' )+ (otherlv_7= '(' otherlv_8= 'else' ( (lv_Exp_9_0= ruleExpressao ) )+ otherlv_10= ')' )? otherlv_11= ')' )
            // InternalMyDsl.g:475:3: otherlv_0= '(' otherlv_1= 'cond' (otherlv_2= '(' ( rulePredicado ( (lv_Exp_4_0= ruleExpressao ) ) ( (lv_Exp_5_0= ruleExpressao ) )* ) otherlv_6= ')' )+ (otherlv_7= '(' otherlv_8= 'else' ( (lv_Exp_9_0= ruleExpressao ) )+ otherlv_10= ')' )? otherlv_11= ')'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getSelecaoAccess().getLeftParenthesisKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getSelecaoAccess().getCondKeyword_1());
            		
            // InternalMyDsl.g:483:3: (otherlv_2= '(' ( rulePredicado ( (lv_Exp_4_0= ruleExpressao ) ) ( (lv_Exp_5_0= ruleExpressao ) )* ) otherlv_6= ')' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==17) ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1==17) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:484:4: otherlv_2= '(' ( rulePredicado ( (lv_Exp_4_0= ruleExpressao ) ) ( (lv_Exp_5_0= ruleExpressao ) )* ) otherlv_6= ')'
            	    {
            	    otherlv_2=(Token)match(input,17,FOLLOW_10); 

            	    				newLeafNode(otherlv_2, grammarAccess.getSelecaoAccess().getLeftParenthesisKeyword_2_0());
            	    			
            	    // InternalMyDsl.g:488:4: ( rulePredicado ( (lv_Exp_4_0= ruleExpressao ) ) ( (lv_Exp_5_0= ruleExpressao ) )* )
            	    // InternalMyDsl.g:489:5: rulePredicado ( (lv_Exp_4_0= ruleExpressao ) ) ( (lv_Exp_5_0= ruleExpressao ) )*
            	    {

            	    					newCompositeNode(grammarAccess.getSelecaoAccess().getPredicadoParserRuleCall_2_1_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    rulePredicado();

            	    state._fsp--;


            	    					afterParserOrEnumRuleCall();
            	    				
            	    // InternalMyDsl.g:496:5: ( (lv_Exp_4_0= ruleExpressao ) )
            	    // InternalMyDsl.g:497:6: (lv_Exp_4_0= ruleExpressao )
            	    {
            	    // InternalMyDsl.g:497:6: (lv_Exp_4_0= ruleExpressao )
            	    // InternalMyDsl.g:498:7: lv_Exp_4_0= ruleExpressao
            	    {

            	    							newCompositeNode(grammarAccess.getSelecaoAccess().getExpExpressaoParserRuleCall_2_1_1_0());
            	    						
            	    pushFollow(FOLLOW_11);
            	    lv_Exp_4_0=ruleExpressao();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getSelecaoRule());
            	    							}
            	    							set(
            	    								current,
            	    								"Exp",
            	    								lv_Exp_4_0,
            	    								"org.xtext.example.mydsl.MyDsl.Expressao");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }

            	    // InternalMyDsl.g:515:5: ( (lv_Exp_5_0= ruleExpressao ) )*
            	    loop7:
            	    do {
            	        int alt7=2;
            	        int LA7_0 = input.LA(1);

            	        if ( (LA7_0==17) ) {
            	            alt7=1;
            	        }


            	        switch (alt7) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:516:6: (lv_Exp_5_0= ruleExpressao )
            	    	    {
            	    	    // InternalMyDsl.g:516:6: (lv_Exp_5_0= ruleExpressao )
            	    	    // InternalMyDsl.g:517:7: lv_Exp_5_0= ruleExpressao
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getSelecaoAccess().getExpExpressaoParserRuleCall_2_1_2_0());
            	    	    						
            	    	    pushFollow(FOLLOW_11);
            	    	    lv_Exp_5_0=ruleExpressao();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getSelecaoRule());
            	    	    							}
            	    	    							set(
            	    	    								current,
            	    	    								"Exp",
            	    	    								lv_Exp_5_0,
            	    	    								"org.xtext.example.mydsl.MyDsl.Expressao");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop7;
            	        }
            	    } while (true);


            	    }

            	    otherlv_6=(Token)match(input,18,FOLLOW_11); 

            	    				newLeafNode(otherlv_6, grammarAccess.getSelecaoAccess().getRightParenthesisKeyword_2_2());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            // InternalMyDsl.g:540:3: (otherlv_7= '(' otherlv_8= 'else' ( (lv_Exp_9_0= ruleExpressao ) )+ otherlv_10= ')' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==17) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:541:4: otherlv_7= '(' otherlv_8= 'else' ( (lv_Exp_9_0= ruleExpressao ) )+ otherlv_10= ')'
                    {
                    otherlv_7=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_7, grammarAccess.getSelecaoAccess().getLeftParenthesisKeyword_3_0());
                    			
                    otherlv_8=(Token)match(input,24,FOLLOW_10); 

                    				newLeafNode(otherlv_8, grammarAccess.getSelecaoAccess().getElseKeyword_3_1());
                    			
                    // InternalMyDsl.g:549:4: ( (lv_Exp_9_0= ruleExpressao ) )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==17) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalMyDsl.g:550:5: (lv_Exp_9_0= ruleExpressao )
                    	    {
                    	    // InternalMyDsl.g:550:5: (lv_Exp_9_0= ruleExpressao )
                    	    // InternalMyDsl.g:551:6: lv_Exp_9_0= ruleExpressao
                    	    {

                    	    						newCompositeNode(grammarAccess.getSelecaoAccess().getExpExpressaoParserRuleCall_3_2_0());
                    	    					
                    	    pushFollow(FOLLOW_11);
                    	    lv_Exp_9_0=ruleExpressao();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getSelecaoRule());
                    	    						}
                    	    						set(
                    	    							current,
                    	    							"Exp",
                    	    							lv_Exp_9_0,
                    	    							"org.xtext.example.mydsl.MyDsl.Expressao");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);

                    otherlv_10=(Token)match(input,18,FOLLOW_8); 

                    				newLeafNode(otherlv_10, grammarAccess.getSelecaoAccess().getRightParenthesisKeyword_3_3());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getSelecaoAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelecao"


    // $ANTLR start "entryRuleDefine"
    // InternalMyDsl.g:581:1: entryRuleDefine returns [EObject current=null] : iv_ruleDefine= ruleDefine EOF ;
    public final EObject entryRuleDefine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefine = null;


        try {
            // InternalMyDsl.g:581:47: (iv_ruleDefine= ruleDefine EOF )
            // InternalMyDsl.g:582:2: iv_ruleDefine= ruleDefine EOF
            {
             newCompositeNode(grammarAccess.getDefineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefine=ruleDefine();

            state._fsp--;

             current =iv_ruleDefine; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefine"


    // $ANTLR start "ruleDefine"
    // InternalMyDsl.g:588:1: ruleDefine returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'define' this_SIMBOLO_2= RULE_SIMBOLO ( (lv_Exp_3_0= ruleExpressao ) ) ( (lv_Sel_4_0= ruleSelecao ) )? otherlv_5= ')' ) ;
    public final EObject ruleDefine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token this_SIMBOLO_2=null;
        Token otherlv_5=null;
        EObject lv_Exp_3_0 = null;

        EObject lv_Sel_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:594:2: ( (otherlv_0= '(' otherlv_1= 'define' this_SIMBOLO_2= RULE_SIMBOLO ( (lv_Exp_3_0= ruleExpressao ) ) ( (lv_Sel_4_0= ruleSelecao ) )? otherlv_5= ')' ) )
            // InternalMyDsl.g:595:2: (otherlv_0= '(' otherlv_1= 'define' this_SIMBOLO_2= RULE_SIMBOLO ( (lv_Exp_3_0= ruleExpressao ) ) ( (lv_Sel_4_0= ruleSelecao ) )? otherlv_5= ')' )
            {
            // InternalMyDsl.g:595:2: (otherlv_0= '(' otherlv_1= 'define' this_SIMBOLO_2= RULE_SIMBOLO ( (lv_Exp_3_0= ruleExpressao ) ) ( (lv_Sel_4_0= ruleSelecao ) )? otherlv_5= ')' )
            // InternalMyDsl.g:596:3: otherlv_0= '(' otherlv_1= 'define' this_SIMBOLO_2= RULE_SIMBOLO ( (lv_Exp_3_0= ruleExpressao ) ) ( (lv_Sel_4_0= ruleSelecao ) )? otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getDefineAccess().getLeftParenthesisKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getDefineAccess().getDefineKeyword_1());
            		
            this_SIMBOLO_2=(Token)match(input,RULE_SIMBOLO,FOLLOW_10); 

            			newLeafNode(this_SIMBOLO_2, grammarAccess.getDefineAccess().getSIMBOLOTerminalRuleCall_2());
            		
            // InternalMyDsl.g:608:3: ( (lv_Exp_3_0= ruleExpressao ) )
            // InternalMyDsl.g:609:4: (lv_Exp_3_0= ruleExpressao )
            {
            // InternalMyDsl.g:609:4: (lv_Exp_3_0= ruleExpressao )
            // InternalMyDsl.g:610:5: lv_Exp_3_0= ruleExpressao
            {

            					newCompositeNode(grammarAccess.getDefineAccess().getExpExpressaoParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
            lv_Exp_3_0=ruleExpressao();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDefineRule());
            					}
            					set(
            						current,
            						"Exp",
            						lv_Exp_3_0,
            						"org.xtext.example.mydsl.MyDsl.Expressao");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:627:3: ( (lv_Sel_4_0= ruleSelecao ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==17) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:628:4: (lv_Sel_4_0= ruleSelecao )
                    {
                    // InternalMyDsl.g:628:4: (lv_Sel_4_0= ruleSelecao )
                    // InternalMyDsl.g:629:5: lv_Sel_4_0= ruleSelecao
                    {

                    					newCompositeNode(grammarAccess.getDefineAccess().getSelSelecaoParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_8);
                    lv_Sel_4_0=ruleSelecao();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDefineRule());
                    					}
                    					set(
                    						current,
                    						"Sel",
                    						lv_Sel_4_0,
                    						"org.xtext.example.mydsl.MyDsl.Selecao");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getDefineAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefine"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000003F070L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020050L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000060050L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000780000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000000L});

}