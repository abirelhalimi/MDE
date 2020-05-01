package transformations;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.eclipse.emf.common.util.EList;
import org.xtext.example.gc.gc.Condition;
import org.xtext.example.gc.gc.Model;

import dC.State;
import dC.StateMachine;
import dC.Transition;
import dC.impl.StateMachineImpl;

public class AlcToDc {
	
	public static StateMachine transformToDc(StateMachine myModel, Model gcs) {
		
		String conditionOrd = null, conditionInh = null;
		
		EList<State> states = myModel.getStates();
		EList<Condition> conditions = gcs.getConditions();
		EList<Transition> transitions = myModel.getTransitions();
		
		for(Condition condition : conditions) {
			if(condition.getPosition().equals("Ord")) {
				conditionOrd = condition.getCondition();
			}
			if(condition.getPosition().equals("Inh")) {
				conditionInh = condition.getCondition();
			}	
		}
		
		for(State state: states) {
			
			if(state.getOrd() != null && state.getInh() != null) {
				
				state.setOrdIf(conditionOrd);
				state.setInhIf(conditionInh);
				
				for(Transition transition: transitions) {
					if(transition.getSource().getName().equals(state.getName())) {
						transition.setSource(state);
					}
					
					if(transition.getTarget().getName().equals(state.getName())) {
						transition.setTarget(state);
					}
				}
			}
		}
		
		
		
		StateMachine dc = new StateMachineImpl();
		dc.setStates(states);
		dc.setTransitions(transitions);
		
		return dc;
	}
	public static void main(String[] args) throws FileNotFoundException, IOException {
		StateMachine sm =  LoadSave.LoadModel("state","alc.xmi");
		StateMachine dc = LcToAlc.transformToAlc(sm);
		LoadSave.SaveTransformedModel("dc.xmi", dc);
	}
}
