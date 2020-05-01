/**
 */
package myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statemachine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link myDsl.Statemachine#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link myDsl.Statemachine#getState <em>State</em>}</li>
 * </ul>
 *
 * @see myDsl.MyDslPackage#getStatemachine()
 * @model
 * @generated
 */
public interface Statemachine extends EObject {
	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link myDsl.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see myDsl.MyDslPackage#getStatemachine_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' containment reference.
	 * @see #setState(State)
	 * @see myDsl.MyDslPackage#getStatemachine_State()
	 * @model containment="true"
	 * @generated
	 */
	State getState();

	/**
	 * Sets the value of the '{@link myDsl.Statemachine#getState <em>State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' containment reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(State value);

} // Statemachine
