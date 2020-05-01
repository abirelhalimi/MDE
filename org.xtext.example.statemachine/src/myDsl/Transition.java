/**
 */
package myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link myDsl.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link myDsl.Transition#getArrow <em>Arrow</em>}</li>
 *   <li>{@link myDsl.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link myDsl.Transition#getEvent <em>Event</em>}</li>
 * </ul>
 *
 * @see myDsl.MyDslPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(State)
	 * @see myDsl.MyDslPackage#getTransition_Source()
	 * @model containment="true"
	 * @generated
	 */
	State getSource();

	/**
	 * Sets the value of the '{@link myDsl.Transition#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(State value);

	/**
	 * Returns the value of the '<em><b>Arrow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arrow</em>' attribute.
	 * @see #setArrow(String)
	 * @see myDsl.MyDslPackage#getTransition_Arrow()
	 * @model
	 * @generated
	 */
	String getArrow();

	/**
	 * Sets the value of the '{@link myDsl.Transition#getArrow <em>Arrow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arrow</em>' attribute.
	 * @see #getArrow()
	 * @generated
	 */
	void setArrow(String value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(Target)
	 * @see myDsl.MyDslPackage#getTransition_Target()
	 * @model containment="true"
	 * @generated
	 */
	Target getTarget();

	/**
	 * Sets the value of the '{@link myDsl.Transition#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Target value);

	/**
	 * Returns the value of the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' containment reference.
	 * @see #setEvent(Event)
	 * @see myDsl.MyDslPackage#getTransition_Event()
	 * @model containment="true"
	 * @generated
	 */
	Event getEvent();

	/**
	 * Sets the value of the '{@link myDsl.Transition#getEvent <em>Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' containment reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(Event value);

} // Transition
