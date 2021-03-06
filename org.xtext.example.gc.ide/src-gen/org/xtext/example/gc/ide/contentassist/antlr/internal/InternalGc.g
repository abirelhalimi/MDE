/*
 * generated by Xtext 2.9.2
 */
grammar InternalGc;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.example.gc.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.example.gc.ide.contentassist.antlr.internal;

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
import org.xtext.example.gc.services.GcGrammarAccess;

}
@parser::members {
	private GcGrammarAccess grammarAccess;

	public void setGrammarAccess(GcGrammarAccess grammarAccess) {
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
}

// Entry rule entryRuleModel
entryRuleModel
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModelAccess().getConditionsAssignment()); }
		(rule__Model__ConditionsAssignment)*
		{ after(grammarAccess.getModelAccess().getConditionsAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePosition
entryRulePosition
:
{ before(grammarAccess.getPositionRule()); }
	 rulePosition
{ after(grammarAccess.getPositionRule()); } 
	 EOF 
;

// Rule Position
rulePosition 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPositionAccess().getAlternatives()); }
		(rule__Position__Alternatives)
		{ after(grammarAccess.getPositionAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCondition
entryRuleCondition
:
{ before(grammarAccess.getConditionRule()); }
	 ruleCondition
{ after(grammarAccess.getConditionRule()); } 
	 EOF 
;

// Rule Condition
ruleCondition 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getConditionAccess().getGroup()); }
		(rule__Condition__Group__0)
		{ after(grammarAccess.getConditionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Position__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPositionAccess().getOrdKeyword_0()); }
		'Ord'
		{ after(grammarAccess.getPositionAccess().getOrdKeyword_0()); }
	)
	|
	(
		{ before(grammarAccess.getPositionAccess().getInhKeyword_1()); }
		'Inh'
		{ after(grammarAccess.getPositionAccess().getInhKeyword_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Condition__Group__0__Impl
	rule__Condition__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConditionAccess().getIFTerminalRuleCall_0()); }
	RULE_IF
	{ after(grammarAccess.getConditionAccess().getIFTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Condition__Group__1__Impl
	rule__Condition__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConditionAccess().getConditionAssignment_1()); }
	(rule__Condition__ConditionAssignment_1)
	{ after(grammarAccess.getConditionAccess().getConditionAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Condition__Group__2__Impl
	rule__Condition__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConditionAccess().getTHENTerminalRuleCall_2()); }
	RULE_THEN
	{ after(grammarAccess.getConditionAccess().getTHENTerminalRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Condition__Group__3__Impl
	rule__Condition__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConditionAccess().getPositionAssignment_3()); }
	(rule__Condition__PositionAssignment_3)
	{ after(grammarAccess.getConditionAccess().getPositionAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Condition__Group__4__Impl
	rule__Condition__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConditionAccess().getLeftParenthesisKeyword_4()); }
	'('
	{ after(grammarAccess.getConditionAccess().getLeftParenthesisKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Condition__Group__5__Impl
	rule__Condition__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConditionAccess().getEventAssignment_5()); }
	(rule__Condition__EventAssignment_5)
	{ after(grammarAccess.getConditionAccess().getEventAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Condition__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConditionAccess().getRightParenthesisKeyword_6()); }
	')'
	{ after(grammarAccess.getConditionAccess().getRightParenthesisKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Model__ConditionsAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getConditionsConditionParserRuleCall_0()); }
		ruleCondition
		{ after(grammarAccess.getModelAccess().getConditionsConditionParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__ConditionAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConditionAccess().getConditionSTRINGTerminalRuleCall_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getConditionAccess().getConditionSTRINGTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__PositionAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConditionAccess().getPositionPositionParserRuleCall_3_0()); }
		rulePosition
		{ after(grammarAccess.getConditionAccess().getPositionPositionParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__EventAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConditionAccess().getEventIDTerminalRuleCall_5_0()); }
		RULE_ID
		{ after(grammarAccess.getConditionAccess().getEventIDTerminalRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_IF : 'if';

RULE_THEN : 'then';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
