/**
 */
package myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link myDsl.State#getS <em>S</em>}</li>
 * </ul>
 *
 * @see myDsl.MyDslPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>S</em>' attribute.
	 * @see #setS(String)
	 * @see myDsl.MyDslPackage#getState_S()
	 * @model
	 * @generated
	 */
	String getS();

	/**
	 * Sets the value of the '{@link myDsl.State#getS <em>S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>S</em>' attribute.
	 * @see #getS()
	 * @generated
	 */
	void setS(String value);

} // State
