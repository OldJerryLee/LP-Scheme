/*
 * generated by Xtext 2.12.0
 */
grammar InternalMyDsl;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
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

}
@parser::members {
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
		{ before(grammarAccess.getModelAccess().getGreetingsAssignment()); }
		(rule__Model__GreetingsAssignment)
		{ after(grammarAccess.getModelAccess().getGreetingsAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGreeting
entryRuleGreeting
:
{ before(grammarAccess.getGreetingRule()); }
	 ruleGreeting
{ after(grammarAccess.getGreetingRule()); } 
	 EOF 
;

// Rule Greeting
ruleGreeting 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGreetingAccess().getAlternatives()); }
		(rule__Greeting__Alternatives)
		{ after(grammarAccess.getGreetingAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleOp
entryRuleOp
:
{ before(grammarAccess.getOpRule()); }
	 ruleOp
{ after(grammarAccess.getOpRule()); } 
	 EOF 
;

// Rule Op
ruleOp 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getOpAccess().getAlternatives()); }
		(rule__Op__Alternatives)
		{ after(grammarAccess.getOpAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Greeting__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGreetingAccess().getGroup_0()); }
		(rule__Greeting__Group_0__0)
		{ after(grammarAccess.getGreetingAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getGreetingAccess().getValueAssignment_1()); }
		(rule__Greeting__ValueAssignment_1)
		{ after(grammarAccess.getGreetingAccess().getValueAssignment_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Op__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOpAccess().getPlusSignKeyword_0()); }
		'+'
		{ after(grammarAccess.getOpAccess().getPlusSignKeyword_0()); }
	)
	|
	(
		{ before(grammarAccess.getOpAccess().getHyphenMinusKeyword_1()); }
		'-'
		{ after(grammarAccess.getOpAccess().getHyphenMinusKeyword_1()); }
	)
	|
	(
		{ before(grammarAccess.getOpAccess().getAsteriskKeyword_2()); }
		'*'
		{ after(grammarAccess.getOpAccess().getAsteriskKeyword_2()); }
	)
	|
	(
		{ before(grammarAccess.getOpAccess().getExptKeyword_3()); }
		'expt'
		{ after(grammarAccess.getOpAccess().getExptKeyword_3()); }
	)
	|
	(
		{ before(grammarAccess.getOpAccess().getSolidusKeyword_4()); }
		'/'
		{ after(grammarAccess.getOpAccess().getSolidusKeyword_4()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Greeting__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Greeting__Group_0__0__Impl
	rule__Greeting__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Greeting__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGreetingAccess().getLeftParenthesisKeyword_0_0()); }
	'('
	{ after(grammarAccess.getGreetingAccess().getLeftParenthesisKeyword_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Greeting__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Greeting__Group_0__1__Impl
	rule__Greeting__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Greeting__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGreetingAccess().getOpParserRuleCall_0_1()); }
	ruleOp
	{ after(grammarAccess.getGreetingAccess().getOpParserRuleCall_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Greeting__Group_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Greeting__Group_0__2__Impl
	rule__Greeting__Group_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Greeting__Group_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGreetingAccess().getValueAssignment_0_2()); }
	(rule__Greeting__ValueAssignment_0_2)
	{ after(grammarAccess.getGreetingAccess().getValueAssignment_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Greeting__Group_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Greeting__Group_0__3__Impl
	rule__Greeting__Group_0__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Greeting__Group_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGreetingAccess().getValueAssignment_0_3()); }
	(rule__Greeting__ValueAssignment_0_3)
	{ after(grammarAccess.getGreetingAccess().getValueAssignment_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Greeting__Group_0__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Greeting__Group_0__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Greeting__Group_0__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGreetingAccess().getRightParenthesisKeyword_0_4()); }
	')'
	{ after(grammarAccess.getGreetingAccess().getRightParenthesisKeyword_0_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Model__GreetingsAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0()); }
		ruleGreeting
		{ after(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Greeting__ValueAssignment_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGreetingAccess().getValueINTTerminalRuleCall_0_2_0()); }
		RULE_INT
		{ after(grammarAccess.getGreetingAccess().getValueINTTerminalRuleCall_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Greeting__ValueAssignment_0_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGreetingAccess().getValueINTTerminalRuleCall_0_3_0()); }
		RULE_INT
		{ after(grammarAccess.getGreetingAccess().getValueINTTerminalRuleCall_0_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Greeting__ValueAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGreetingAccess().getValueINTTerminalRuleCall_1_0()); }
		RULE_INT
		{ after(grammarAccess.getGreetingAccess().getValueINTTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
