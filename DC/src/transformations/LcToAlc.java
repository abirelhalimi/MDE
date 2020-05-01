package transformations;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.eclipse.emf.common.util.EList;

import dC.State;
import dC.StateMachine;
import dC.Transition;
import dC.impl.StateImpl;
import dC.impl.StateMachineImpl;

public class LcToAlc {
	
	public static StateMachine transformToAlc(StateMachine myModel) {
		
		EList<Transition> transitions = myModel.getTransitions();
		EList<State> states = myModel.getStates();
		EList<Transition> transformedTransitions = myModel.getTransitions();
		
		int i=0;
		for(Transition transition : transitions) {
			
			String event = transition.getEvent();
			
			if(event.startsWith("G")) {
				
				//creating a new state
				State state = new StateImpl();
				state.setName("S"+i);
				if(event.equals("Go_up")) {
					state.setOrd(event);
				}
				if(event.equals("Go_down")) {
					state.setInh(event);
				}
				
				states.remove(transition.getSource());
				states.remove(transition.getTarget());
				states.add(state);
				
				//removing the transition
				transformedTransitions.remove(transition);
				
				//looking for transitions with source equals to removedTransition.target
				for(Transition tr:transformedTransitions) {
					if(tr.getSource().equals(transition.getTarget())) {
						//setting source to new state
						tr.setSource(state);
					}
				}
				
				//looking for transitions with target equals to removedTransition.source 
				for(Transition tr:transformedTransitions) {
					if(tr.getTarget().equals(transition.getSource())) {
						//setting target to new state
						tr.setTarget(state);
					}
				}
				
				i++;
			}
			
		}
		StateMachine alc = new StateMachineImpl();
		alc.setTransitions(transformedTransitions);
		alc.setStates(states);
		return alc;
		
	}
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		StateMachine sm =  LoadSave.LoadModel("state","model/trans1.xmi");
		StateMachine alc = LcToAlc.transformToAlc(sm);
		LoadSave.SaveTransformedModel("alc.xmi", alc);
	}	
	

}
