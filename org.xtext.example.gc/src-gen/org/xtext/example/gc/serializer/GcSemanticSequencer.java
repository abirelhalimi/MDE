/*
 * generated by Xtext 2.9.2
 */
package org.xtext.example.gc.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.gc.gc.Condition;
import org.xtext.example.gc.gc.GcPackage;
import org.xtext.example.gc.gc.Model;
import org.xtext.example.gc.services.GcGrammarAccess;

@SuppressWarnings("all")
public class GcSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private GcGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == GcPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case GcPackage.CONDITION:
				sequence_Condition(context, (Condition) semanticObject); 
				return; 
			case GcPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Condition returns Condition
	 *
	 * Constraint:
	 *     (condition=STRING position=Position event=ID)
	 */
	protected void sequence_Condition(ISerializationContext context, Condition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GcPackage.Literals.CONDITION__CONDITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GcPackage.Literals.CONDITION__CONDITION));
			if (transientValues.isValueTransient(semanticObject, GcPackage.Literals.CONDITION__POSITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GcPackage.Literals.CONDITION__POSITION));
			if (transientValues.isValueTransient(semanticObject, GcPackage.Literals.CONDITION__EVENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GcPackage.Literals.CONDITION__EVENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getConditionAccess().getConditionSTRINGTerminalRuleCall_1_0(), semanticObject.getCondition());
		feeder.accept(grammarAccess.getConditionAccess().getPositionPositionParserRuleCall_3_0(), semanticObject.getPosition());
		feeder.accept(grammarAccess.getConditionAccess().getEventIDTerminalRuleCall_5_0(), semanticObject.getEvent());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     conditions+=Condition+
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
