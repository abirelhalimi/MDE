package org.xtext.example.gc.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.gc.services.GcGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGcParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_IF", "RULE_STRING", "RULE_THEN", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Ord'", "'Inh'", "'('", "')'"
    };
    public static final int RULE_ID=7;
    public static final int RULE_WS=11;
    public static final int RULE_THEN=6;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_INT=8;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__13=13;
    public static final int RULE_IF=4;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalGcParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGcParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGcParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGc.g"; }



     	private GcGrammarAccess grammarAccess;

        public InternalGcParser(TokenStream input, GcGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected GcGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalGc.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalGc.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalGc.g:65:2: iv_ruleModel= ruleModel EOF
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
    // InternalGc.g:71:1: ruleModel returns [EObject current=null] : ( (lv_conditions_0_0= ruleCondition ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_conditions_0_0 = null;



        	enterRule();

        try {
            // InternalGc.g:77:2: ( ( (lv_conditions_0_0= ruleCondition ) )* )
            // InternalGc.g:78:2: ( (lv_conditions_0_0= ruleCondition ) )*
            {
            // InternalGc.g:78:2: ( (lv_conditions_0_0= ruleCondition ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_IF) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGc.g:79:3: (lv_conditions_0_0= ruleCondition )
            	    {
            	    // InternalGc.g:79:3: (lv_conditions_0_0= ruleCondition )
            	    // InternalGc.g:80:4: lv_conditions_0_0= ruleCondition
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getConditionsConditionParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_conditions_0_0=ruleCondition();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"conditions",
            	    					lv_conditions_0_0,
            	    					"org.xtext.example.gc.Gc.Condition");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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


    // $ANTLR start "entryRulePosition"
    // InternalGc.g:100:1: entryRulePosition returns [String current=null] : iv_rulePosition= rulePosition EOF ;
    public final String entryRulePosition() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePosition = null;


        try {
            // InternalGc.g:100:48: (iv_rulePosition= rulePosition EOF )
            // InternalGc.g:101:2: iv_rulePosition= rulePosition EOF
            {
             newCompositeNode(grammarAccess.getPositionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePosition=rulePosition();

            state._fsp--;

             current =iv_rulePosition.getText(); 
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
    // $ANTLR end "entryRulePosition"


    // $ANTLR start "rulePosition"
    // InternalGc.g:107:1: rulePosition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Ord' | kw= 'Inh' ) ;
    public final AntlrDatatypeRuleToken rulePosition() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGc.g:113:2: ( (kw= 'Ord' | kw= 'Inh' ) )
            // InternalGc.g:114:2: (kw= 'Ord' | kw= 'Inh' )
            {
            // InternalGc.g:114:2: (kw= 'Ord' | kw= 'Inh' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            else if ( (LA2_0==14) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalGc.g:115:3: kw= 'Ord'
                    {
                    kw=(Token)match(input,13,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPositionAccess().getOrdKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalGc.g:121:3: kw= 'Inh'
                    {
                    kw=(Token)match(input,14,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPositionAccess().getInhKeyword_1());
                    		

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
    // $ANTLR end "rulePosition"


    // $ANTLR start "entryRuleCondition"
    // InternalGc.g:130:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalGc.g:130:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalGc.g:131:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalGc.g:137:1: ruleCondition returns [EObject current=null] : (this_IF_0= RULE_IF ( (lv_condition_1_0= RULE_STRING ) ) this_THEN_2= RULE_THEN ( (lv_position_3_0= rulePosition ) ) otherlv_4= '(' ( (lv_event_5_0= RULE_ID ) ) otherlv_6= ')' ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token this_IF_0=null;
        Token lv_condition_1_0=null;
        Token this_THEN_2=null;
        Token otherlv_4=null;
        Token lv_event_5_0=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_position_3_0 = null;



        	enterRule();

        try {
            // InternalGc.g:143:2: ( (this_IF_0= RULE_IF ( (lv_condition_1_0= RULE_STRING ) ) this_THEN_2= RULE_THEN ( (lv_position_3_0= rulePosition ) ) otherlv_4= '(' ( (lv_event_5_0= RULE_ID ) ) otherlv_6= ')' ) )
            // InternalGc.g:144:2: (this_IF_0= RULE_IF ( (lv_condition_1_0= RULE_STRING ) ) this_THEN_2= RULE_THEN ( (lv_position_3_0= rulePosition ) ) otherlv_4= '(' ( (lv_event_5_0= RULE_ID ) ) otherlv_6= ')' )
            {
            // InternalGc.g:144:2: (this_IF_0= RULE_IF ( (lv_condition_1_0= RULE_STRING ) ) this_THEN_2= RULE_THEN ( (lv_position_3_0= rulePosition ) ) otherlv_4= '(' ( (lv_event_5_0= RULE_ID ) ) otherlv_6= ')' )
            // InternalGc.g:145:3: this_IF_0= RULE_IF ( (lv_condition_1_0= RULE_STRING ) ) this_THEN_2= RULE_THEN ( (lv_position_3_0= rulePosition ) ) otherlv_4= '(' ( (lv_event_5_0= RULE_ID ) ) otherlv_6= ')'
            {
            this_IF_0=(Token)match(input,RULE_IF,FOLLOW_4); 

            			newLeafNode(this_IF_0, grammarAccess.getConditionAccess().getIFTerminalRuleCall_0());
            		
            // InternalGc.g:149:3: ( (lv_condition_1_0= RULE_STRING ) )
            // InternalGc.g:150:4: (lv_condition_1_0= RULE_STRING )
            {
            // InternalGc.g:150:4: (lv_condition_1_0= RULE_STRING )
            // InternalGc.g:151:5: lv_condition_1_0= RULE_STRING
            {
            lv_condition_1_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_condition_1_0, grammarAccess.getConditionAccess().getConditionSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"condition",
            						lv_condition_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            this_THEN_2=(Token)match(input,RULE_THEN,FOLLOW_6); 

            			newLeafNode(this_THEN_2, grammarAccess.getConditionAccess().getTHENTerminalRuleCall_2());
            		
            // InternalGc.g:171:3: ( (lv_position_3_0= rulePosition ) )
            // InternalGc.g:172:4: (lv_position_3_0= rulePosition )
            {
            // InternalGc.g:172:4: (lv_position_3_0= rulePosition )
            // InternalGc.g:173:5: lv_position_3_0= rulePosition
            {

            					newCompositeNode(grammarAccess.getConditionAccess().getPositionPositionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_position_3_0=rulePosition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionRule());
            					}
            					set(
            						current,
            						"position",
            						lv_position_3_0,
            						"org.xtext.example.gc.Gc.Position");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getConditionAccess().getLeftParenthesisKeyword_4());
            		
            // InternalGc.g:194:3: ( (lv_event_5_0= RULE_ID ) )
            // InternalGc.g:195:4: (lv_event_5_0= RULE_ID )
            {
            // InternalGc.g:195:4: (lv_event_5_0= RULE_ID )
            // InternalGc.g:196:5: lv_event_5_0= RULE_ID
            {
            lv_event_5_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_event_5_0, grammarAccess.getConditionAccess().getEventIDTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"event",
            						lv_event_5_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getConditionAccess().getRightParenthesisKeyword_6());
            		

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
    // $ANTLR end "ruleCondition"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});

}