/**
 */
package myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link myDsl.Model#getStatemachine <em>Statemachine</em>}</li>
 * </ul>
 *
 * @see myDsl.MyDslPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Statemachine</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statemachine</em>' containment reference.
	 * @see #setStatemachine(Statemachine)
	 * @see myDsl.MyDslPackage#getModel_Statemachine()
	 * @model containment="true"
	 * @generated
	 */
	Statemachine getStatemachine();

	/**
	 * Sets the value of the '{@link myDsl.Model#getStatemachine <em>Statemachine</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statemachine</em>' containment reference.
	 * @see #getStatemachine()
	 * @generated
	 */
	void setStatemachine(Statemachine value);

} // Model
