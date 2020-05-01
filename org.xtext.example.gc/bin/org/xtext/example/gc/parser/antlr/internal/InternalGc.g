/*
 * generated by Xtext 2.9.2
 */
grammar InternalGc;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.gc.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getModelAccess().getConditionsConditionParserRuleCall_0());
			}
			lv_conditions_0_0=ruleCondition
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getModelRule());
				}
				add(
					$current,
					"conditions",
					lv_conditions_0_0,
					"org.xtext.example.gc.Gc.Condition");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRulePosition
entryRulePosition returns [String current=null]:
	{ newCompositeNode(grammarAccess.getPositionRule()); }
	iv_rulePosition=rulePosition
	{ $current=$iv_rulePosition.current.getText(); }
	EOF;

// Rule Position
rulePosition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='Ord'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getPositionAccess().getOrdKeyword_0());
		}
		    |
		kw='Inh'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getPositionAccess().getInhKeyword_1());
		}
	)
;

// Entry rule entryRuleCondition
entryRuleCondition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConditionRule()); }
	iv_ruleCondition=ruleCondition
	{ $current=$iv_ruleCondition.current; }
	EOF;

// Rule Condition
ruleCondition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_IF_0=RULE_IF
		{
			newLeafNode(this_IF_0, grammarAccess.getConditionAccess().getIFTerminalRuleCall_0());
		}
		(
			(
				lv_condition_1_0=RULE_STRING
				{
					newLeafNode(lv_condition_1_0, grammarAccess.getConditionAccess().getConditionSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConditionRule());
					}
					setWithLastConsumed(
						$current,
						"condition",
						lv_condition_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		this_THEN_2=RULE_THEN
		{
			newLeafNode(this_THEN_2, grammarAccess.getConditionAccess().getTHENTerminalRuleCall_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getConditionAccess().getPositionPositionParserRuleCall_3_0());
				}
				lv_position_3_0=rulePosition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConditionRule());
					}
					set(
						$current,
						"position",
						lv_position_3_0,
						"org.xtext.example.gc.Gc.Position");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='('
		{
			newLeafNode(otherlv_4, grammarAccess.getConditionAccess().getLeftParenthesisKeyword_4());
		}
		(
			(
				lv_event_5_0=RULE_ID
				{
					newLeafNode(lv_event_5_0, grammarAccess.getConditionAccess().getEventIDTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConditionRule());
					}
					setWithLastConsumed(
						$current,
						"event",
						lv_event_5_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_6=')'
		{
			newLeafNode(otherlv_6, grammarAccess.getConditionAccess().getRightParenthesisKeyword_6());
		}
	)
;

RULE_IF : 'if';

RULE_THEN : 'then';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
