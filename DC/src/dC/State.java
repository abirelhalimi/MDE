/**
 */
package dC;

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
 *   <li>{@link dC.State#getName <em>Name</em>}</li>
 *   <li>{@link dC.State#isIsActive <em>Is Active</em>}</li>
 *   <li>{@link dC.State#getOrd <em>Ord</em>}</li>
 *   <li>{@link dC.State#getInh <em>Inh</em>}</li>
 *   <li>{@link dC.State#getOrdIf <em>Ord If</em>}</li>
 *   <li>{@link dC.State#getInhIf <em>Inh If</em>}</li>
 * </ul>
 *
 * @see dC.DCPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see dC.DCPackage#getState_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dC.State#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is Active</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Active</em>' attribute.
	 * @see #setIsActive(boolean)
	 * @see dC.DCPackage#getState_IsActive()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsActive();

	/**
	 * Sets the value of the '{@link dC.State#isIsActive <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Active</em>' attribute.
	 * @see #isIsActive()
	 * @generated
	 */
	void setIsActive(boolean value);

	/**
	 * Returns the value of the '<em><b>Ord</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ord</em>' attribute.
	 * @see #setOrd(String)
	 * @see dC.DCPackage#getState_Ord()
	 * @model
	 * @generated
	 */
	String getOrd();

	/**
	 * Sets the value of the '{@link dC.State#getOrd <em>Ord</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ord</em>' attribute.
	 * @see #getOrd()
	 * @generated
	 */
	void setOrd(String value);

	/**
	 * Returns the value of the '<em><b>Inh</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inh</em>' attribute.
	 * @see #setInh(String)
	 * @see dC.DCPackage#getState_Inh()
	 * @model
	 * @generated
	 */
	String getInh();

	/**
	 * Sets the value of the '{@link dC.State#getInh <em>Inh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inh</em>' attribute.
	 * @see #getInh()
	 * @generated
	 */
	void setInh(String value);

	/**
	 * Returns the value of the '<em><b>Ord If</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ord If</em>' attribute.
	 * @see #setOrdIf(String)
	 * @see dC.DCPackage#getState_OrdIf()
	 * @model
	 * @generated
	 */
	String getOrdIf();

	/**
	 * Sets the value of the '{@link dC.State#getOrdIf <em>Ord If</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ord If</em>' attribute.
	 * @see #getOrdIf()
	 * @generated
	 */
	void setOrdIf(String value);

	/**
	 * Returns the value of the '<em><b>Inh If</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inh If</em>' attribute.
	 * @see #setInhIf(String)
	 * @see dC.DCPackage#getState_InhIf()
	 * @model
	 * @generated
	 */
	String getInhIf();

	/**
	 * Sets the value of the '{@link dC.State#getInhIf <em>Inh If</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inh If</em>' attribute.
	 * @see #getInhIf()
	 * @generated
	 */
	void setInhIf(String value);

} // State
