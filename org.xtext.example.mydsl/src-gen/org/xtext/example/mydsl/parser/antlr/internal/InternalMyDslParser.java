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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "')'", "'+'", "'-'", "'*'", "'expt'", "'/'"
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
    // InternalMyDsl.g:107:1: ruleGreeting returns [EObject current=null] : ( (otherlv_0= '(' ruleOp ( (lv_value_2_0= RULE_INT ) ) ( (lv_value_3_0= RULE_INT ) ) otherlv_4= ')' ) | ( (lv_value_5_0= RULE_INT ) ) ) ;
    public final EObject ruleGreeting() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_2_0=null;
        Token lv_value_3_0=null;
        Token otherlv_4=null;
        Token lv_value_5_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:113:2: ( ( (otherlv_0= '(' ruleOp ( (lv_value_2_0= RULE_INT ) ) ( (lv_value_3_0= RULE_INT ) ) otherlv_4= ')' ) | ( (lv_value_5_0= RULE_INT ) ) ) )
            // InternalMyDsl.g:114:2: ( (otherlv_0= '(' ruleOp ( (lv_value_2_0= RULE_INT ) ) ( (lv_value_3_0= RULE_INT ) ) otherlv_4= ')' ) | ( (lv_value_5_0= RULE_INT ) ) )
            {
            // InternalMyDsl.g:114:2: ( (otherlv_0= '(' ruleOp ( (lv_value_2_0= RULE_INT ) ) ( (lv_value_3_0= RULE_INT ) ) otherlv_4= ')' ) | ( (lv_value_5_0= RULE_INT ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
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
                    // InternalMyDsl.g:115:3: (otherlv_0= '(' ruleOp ( (lv_value_2_0= RULE_INT ) ) ( (lv_value_3_0= RULE_INT ) ) otherlv_4= ')' )
                    {
                    // InternalMyDsl.g:115:3: (otherlv_0= '(' ruleOp ( (lv_value_2_0= RULE_INT ) ) ( (lv_value_3_0= RULE_INT ) ) otherlv_4= ')' )
                    // InternalMyDsl.g:116:4: otherlv_0= '(' ruleOp ( (lv_value_2_0= RULE_INT ) ) ( (lv_value_3_0= RULE_INT ) ) otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getGreetingAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getGreetingAccess().getOpParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_4);
                    ruleOp();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			
                    // InternalMyDsl.g:127:4: ( (lv_value_2_0= RULE_INT ) )
                    // InternalMyDsl.g:128:5: (lv_value_2_0= RULE_INT )
                    {
                    // InternalMyDsl.g:128:5: (lv_value_2_0= RULE_INT )
                    // InternalMyDsl.g:129:6: lv_value_2_0= RULE_INT
                    {
                    lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_4); 

                    						newLeafNode(lv_value_2_0, grammarAccess.getGreetingAccess().getValueINTTerminalRuleCall_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGreetingRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_2_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalMyDsl.g:145:4: ( (lv_value_3_0= RULE_INT ) )
                    // InternalMyDsl.g:146:5: (lv_value_3_0= RULE_INT )
                    {
                    // InternalMyDsl.g:146:5: (lv_value_3_0= RULE_INT )
                    // InternalMyDsl.g:147:6: lv_value_3_0= RULE_INT
                    {
                    lv_value_3_0=(Token)match(input,RULE_INT,FOLLOW_5); 

                    						newLeafNode(lv_value_3_0, grammarAccess.getGreetingAccess().getValueINTTerminalRuleCall_0_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGreetingRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,12,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getGreetingAccess().getRightParenthesisKeyword_0_4());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:169:3: ( (lv_value_5_0= RULE_INT ) )
                    {
                    // InternalMyDsl.g:169:3: ( (lv_value_5_0= RULE_INT ) )
                    // InternalMyDsl.g:170:4: (lv_value_5_0= RULE_INT )
                    {
                    // InternalMyDsl.g:170:4: (lv_value_5_0= RULE_INT )
                    // InternalMyDsl.g:171:5: lv_value_5_0= RULE_INT
                    {
                    lv_value_5_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    					newLeafNode(lv_value_5_0, grammarAccess.getGreetingAccess().getValueINTTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getGreetingRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"value",
                    						lv_value_5_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }


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
    // InternalMyDsl.g:191:1: entryRuleOp returns [String current=null] : iv_ruleOp= ruleOp EOF ;
    public final String entryRuleOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOp = null;


        try {
            // InternalMyDsl.g:191:42: (iv_ruleOp= ruleOp EOF )
            // InternalMyDsl.g:192:2: iv_ruleOp= ruleOp EOF
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
    // InternalMyDsl.g:198:1: ruleOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '*' | kw= 'expt' | kw= '/' ) ;
    public final AntlrDatatypeRuleToken ruleOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:204:2: ( (kw= '+' | kw= '-' | kw= '*' | kw= 'expt' | kw= '/' ) )
            // InternalMyDsl.g:205:2: (kw= '+' | kw= '-' | kw= '*' | kw= 'expt' | kw= '/' )
            {
            // InternalMyDsl.g:205:2: (kw= '+' | kw= '-' | kw= '*' | kw= 'expt' | kw= '/' )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt2=1;
                }
                break;
            case 14:
                {
                alt2=2;
                }
                break;
            case 15:
                {
                alt2=3;
                }
                break;
            case 16:
                {
                alt2=4;
                }
                break;
            case 17:
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
                    // InternalMyDsl.g:206:3: kw= '+'
                    {
                    kw=(Token)match(input,13,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOpAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:212:3: kw= '-'
                    {
                    kw=(Token)match(input,14,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOpAccess().getHyphenMinusKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:218:3: kw= '*'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOpAccess().getAsteriskKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:224:3: kw= 'expt'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOpAccess().getExptKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:230:3: kw= '/'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000003E000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});

}