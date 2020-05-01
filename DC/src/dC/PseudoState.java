/**
 */
package dC;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pseudo State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dC.PseudoState#getReferencedState <em>Referenced State</em>}</li>
 * </ul>
 *
 * @see dC.DCPackage#getPseudoState()
 * @model
 * @generated
 */
public interface PseudoState extends State {
	/**
	 * Returns the value of the '<em><b>Referenced State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced State</em>' reference.
	 * @see #setReferencedState(State)
	 * @see dC.DCPackage#getPseudoState_ReferencedState()
	 * @model
	 * @generated
	 */
	State getReferencedState();

	/**
	 * Sets the value of the '{@link dC.PseudoState#getReferencedState <em>Referenced State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced State</em>' reference.
	 * @see #getReferencedState()
	 * @generated
	 */
	void setReferencedState(State value);

} // PseudoState
