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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_START", "RULE_END", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'=>'", "'->'", "'-->'", "'[*]'"
    };
    public static final int RULE_END=5;
    public static final int RULE_START=4;
    public static final int RULE_ID=7;
    public static final int RULE_WS=11;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_INT=8;
    public static final int RULE_ML_COMMENT=9;
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
    // InternalMyDsl.g:71:1: ruleModel returns [EObject current=null] : ( (lv_statemachine_0_0= ruleStatemachine ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_statemachine_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( (lv_statemachine_0_0= ruleStatemachine ) ) )
            // InternalMyDsl.g:78:2: ( (lv_statemachine_0_0= ruleStatemachine ) )
            {
            // InternalMyDsl.g:78:2: ( (lv_statemachine_0_0= ruleStatemachine ) )
            // InternalMyDsl.g:79:3: (lv_statemachine_0_0= ruleStatemachine )
            {
            // InternalMyDsl.g:79:3: (lv_statemachine_0_0= ruleStatemachine )
            // InternalMyDsl.g:80:4: lv_statemachine_0_0= ruleStatemachine
            {

            				newCompositeNode(grammarAccess.getModelAccess().getStatemachineStatemachineParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_statemachine_0_0=ruleStatemachine();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getModelRule());
            				}
            				set(
            					current,
            					"statemachine",
            					lv_statemachine_0_0,
            					"org.xtext.example.mydsl.MyDsl.Statemachine");
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


    // $ANTLR start "entryRuleStatemachine"
    // InternalMyDsl.g:100:1: entryRuleStatemachine returns [EObject current=null] : iv_ruleStatemachine= ruleStatemachine EOF ;
    public final EObject entryRuleStatemachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatemachine = null;


        try {
            // InternalMyDsl.g:100:53: (iv_ruleStatemachine= ruleStatemachine EOF )
            // InternalMyDsl.g:101:2: iv_ruleStatemachine= ruleStatemachine EOF
            {
             newCompositeNode(grammarAccess.getStatemachineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatemachine=ruleStatemachine();

            state._fsp--;

             current =iv_ruleStatemachine; 
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
    // $ANTLR end "entryRuleStatemachine"


    // $ANTLR start "ruleStatemachine"
    // InternalMyDsl.g:107:1: ruleStatemachine returns [EObject current=null] : (this_START_0= RULE_START ( ( (lv_transitions_1_0= ruleTransition ) )* | ( (lv_state_2_0= ruleState ) ) ) this_END_3= RULE_END ) ;
    public final EObject ruleStatemachine() throws RecognitionException {
        EObject current = null;

        Token this_START_0=null;
        Token this_END_3=null;
        EObject lv_transitions_1_0 = null;

        EObject lv_state_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:113:2: ( (this_START_0= RULE_START ( ( (lv_transitions_1_0= ruleTransition ) )* | ( (lv_state_2_0= ruleState ) ) ) this_END_3= RULE_END ) )
            // InternalMyDsl.g:114:2: (this_START_0= RULE_START ( ( (lv_transitions_1_0= ruleTransition ) )* | ( (lv_state_2_0= ruleState ) ) ) this_END_3= RULE_END )
            {
            // InternalMyDsl.g:114:2: (this_START_0= RULE_START ( ( (lv_transitions_1_0= ruleTransition ) )* | ( (lv_state_2_0= ruleState ) ) ) this_END_3= RULE_END )
            // InternalMyDsl.g:115:3: this_START_0= RULE_START ( ( (lv_transitions_1_0= ruleTransition ) )* | ( (lv_state_2_0= ruleState ) ) ) this_END_3= RULE_END
            {
            this_START_0=(Token)match(input,RULE_START,FOLLOW_3); 

            			newLeafNode(this_START_0, grammarAccess.getStatemachineAccess().getSTARTTerminalRuleCall_0());
            		
            // InternalMyDsl.g:119:3: ( ( (lv_transitions_1_0= ruleTransition ) )* | ( (lv_state_2_0= ruleState ) ) )
            int alt2=2;
            switch ( input.LA(1) ) {
            case 16:
                {
                int LA2_1 = input.LA(2);

                if ( ((LA2_1>=13 && LA2_1<=15)) ) {
                    alt2=1;
                }
                else if ( (LA2_1==RULE_END) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA2_2 = input.LA(2);

                if ( ((LA2_2>=13 && LA2_2<=15)) ) {
                    alt2=1;
                }
                else if ( (LA2_2==RULE_END) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_END:
                {
                alt2=1;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:120:4: ( (lv_transitions_1_0= ruleTransition ) )*
                    {
                    // InternalMyDsl.g:120:4: ( (lv_transitions_1_0= ruleTransition ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==RULE_ID||LA1_0==16) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalMyDsl.g:121:5: (lv_transitions_1_0= ruleTransition )
                    	    {
                    	    // InternalMyDsl.g:121:5: (lv_transitions_1_0= ruleTransition )
                    	    // InternalMyDsl.g:122:6: lv_transitions_1_0= ruleTransition
                    	    {

                    	    						newCompositeNode(grammarAccess.getStatemachineAccess().getTransitionsTransitionParserRuleCall_1_0_0());
                    	    					
                    	    pushFollow(FOLLOW_3);
                    	    lv_transitions_1_0=ruleTransition();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getStatemachineRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"transitions",
                    	    							lv_transitions_1_0,
                    	    							"org.xtext.example.mydsl.MyDsl.Transition");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:140:4: ( (lv_state_2_0= ruleState ) )
                    {
                    // InternalMyDsl.g:140:4: ( (lv_state_2_0= ruleState ) )
                    // InternalMyDsl.g:141:5: (lv_state_2_0= ruleState )
                    {
                    // InternalMyDsl.g:141:5: (lv_state_2_0= ruleState )
                    // InternalMyDsl.g:142:6: lv_state_2_0= ruleState
                    {

                    						newCompositeNode(grammarAccess.getStatemachineAccess().getStateStateParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_state_2_0=ruleState();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStatemachineRule());
                    						}
                    						set(
                    							current,
                    							"state",
                    							lv_state_2_0,
                    							"org.xtext.example.mydsl.MyDsl.State");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_END_3=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_3, grammarAccess.getStatemachineAccess().getENDTerminalRuleCall_2());
            		

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
    // $ANTLR end "ruleStatemachine"


    // $ANTLR start "entryRuleTransition"
    // InternalMyDsl.g:168:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalMyDsl.g:168:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalMyDsl.g:169:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
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
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalMyDsl.g:175:1: ruleTransition returns [EObject current=null] : ( ( (lv_source_0_0= ruleState ) ) ruleArrow ( (lv_target_2_0= ruleState ) ) ( (lv_event_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token lv_event_3_0=null;
        EObject lv_source_0_0 = null;

        EObject lv_target_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:181:2: ( ( ( (lv_source_0_0= ruleState ) ) ruleArrow ( (lv_target_2_0= ruleState ) ) ( (lv_event_3_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:182:2: ( ( (lv_source_0_0= ruleState ) ) ruleArrow ( (lv_target_2_0= ruleState ) ) ( (lv_event_3_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:182:2: ( ( (lv_source_0_0= ruleState ) ) ruleArrow ( (lv_target_2_0= ruleState ) ) ( (lv_event_3_0= RULE_STRING ) ) )
            // InternalMyDsl.g:183:3: ( (lv_source_0_0= ruleState ) ) ruleArrow ( (lv_target_2_0= ruleState ) ) ( (lv_event_3_0= RULE_STRING ) )
            {
            // InternalMyDsl.g:183:3: ( (lv_source_0_0= ruleState ) )
            // InternalMyDsl.g:184:4: (lv_source_0_0= ruleState )
            {
            // InternalMyDsl.g:184:4: (lv_source_0_0= ruleState )
            // InternalMyDsl.g:185:5: lv_source_0_0= ruleState
            {

            					newCompositeNode(grammarAccess.getTransitionAccess().getSourceStateParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_source_0_0=ruleState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransitionRule());
            					}
            					set(
            						current,
            						"source",
            						lv_source_0_0,
            						"org.xtext.example.mydsl.MyDsl.State");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            			newCompositeNode(grammarAccess.getTransitionAccess().getArrowParserRuleCall_1());
            		
            pushFollow(FOLLOW_6);
            ruleArrow();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalMyDsl.g:209:3: ( (lv_target_2_0= ruleState ) )
            // InternalMyDsl.g:210:4: (lv_target_2_0= ruleState )
            {
            // InternalMyDsl.g:210:4: (lv_target_2_0= ruleState )
            // InternalMyDsl.g:211:5: lv_target_2_0= ruleState
            {

            					newCompositeNode(grammarAccess.getTransitionAccess().getTargetStateParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_target_2_0=ruleState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransitionRule());
            					}
            					set(
            						current,
            						"target",
            						lv_target_2_0,
            						"org.xtext.example.mydsl.MyDsl.State");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:228:3: ( (lv_event_3_0= RULE_STRING ) )
            // InternalMyDsl.g:229:4: (lv_event_3_0= RULE_STRING )
            {
            // InternalMyDsl.g:229:4: (lv_event_3_0= RULE_STRING )
            // InternalMyDsl.g:230:5: lv_event_3_0= RULE_STRING
            {
            lv_event_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_event_3_0, grammarAccess.getTransitionAccess().getEventSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"event",
            						lv_event_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


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
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleArrow"
    // InternalMyDsl.g:250:1: entryRuleArrow returns [String current=null] : iv_ruleArrow= ruleArrow EOF ;
    public final String entryRuleArrow() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArrow = null;


        try {
            // InternalMyDsl.g:250:45: (iv_ruleArrow= ruleArrow EOF )
            // InternalMyDsl.g:251:2: iv_ruleArrow= ruleArrow EOF
            {
             newCompositeNode(grammarAccess.getArrowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArrow=ruleArrow();

            state._fsp--;

             current =iv_ruleArrow.getText(); 
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
    // $ANTLR end "entryRuleArrow"


    // $ANTLR start "ruleArrow"
    // InternalMyDsl.g:257:1: ruleArrow returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '=>' | kw= '->' | kw= '-->' ) ;
    public final AntlrDatatypeRuleToken ruleArrow() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:263:2: ( (kw= '=>' | kw= '->' | kw= '-->' ) )
            // InternalMyDsl.g:264:2: (kw= '=>' | kw= '->' | kw= '-->' )
            {
            // InternalMyDsl.g:264:2: (kw= '=>' | kw= '->' | kw= '-->' )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt3=1;
                }
                break;
            case 14:
                {
                alt3=2;
                }
                break;
            case 15:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:265:3: kw= '=>'
                    {
                    kw=(Token)match(input,13,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getArrowAccess().getEqualsSignGreaterThanSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:271:3: kw= '->'
                    {
                    kw=(Token)match(input,14,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getArrowAccess().getHyphenMinusGreaterThanSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:277:3: kw= '-->'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getArrowAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_2());
                    		

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
    // $ANTLR end "ruleArrow"


    // $ANTLR start "entryRuleState"
    // InternalMyDsl.g:286:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalMyDsl.g:286:46: (iv_ruleState= ruleState EOF )
            // InternalMyDsl.g:287:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
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
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalMyDsl.g:293:1: ruleState returns [EObject current=null] : (otherlv_0= '[*]' | ( (lv_s_1_0= RULE_ID ) ) ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_s_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:299:2: ( (otherlv_0= '[*]' | ( (lv_s_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:300:2: (otherlv_0= '[*]' | ( (lv_s_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:300:2: (otherlv_0= '[*]' | ( (lv_s_1_0= RULE_ID ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:301:3: otherlv_0= '[*]'
                    {
                    otherlv_0=(Token)match(input,16,FOLLOW_2); 

                    			newLeafNode(otherlv_0, grammarAccess.getStateAccess().getLeftSquareBracketAsteriskRightSquareBracketKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:306:3: ( (lv_s_1_0= RULE_ID ) )
                    {
                    // InternalMyDsl.g:306:3: ( (lv_s_1_0= RULE_ID ) )
                    // InternalMyDsl.g:307:4: (lv_s_1_0= RULE_ID )
                    {
                    // InternalMyDsl.g:307:4: (lv_s_1_0= RULE_ID )
                    // InternalMyDsl.g:308:5: lv_s_1_0= RULE_ID
                    {
                    lv_s_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_s_1_0, grammarAccess.getStateAccess().getSIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getStateRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"s",
                    						lv_s_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

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
    // $ANTLR end "ruleState"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000000100A0L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010080L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000040L});

}