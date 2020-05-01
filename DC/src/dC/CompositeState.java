/**
 */
package dC;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dC.CompositeState#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link dC.CompositeState#getContainer <em>Container</em>}</li>
 * </ul>
 *
 * @see dC.DCPackage#getCompositeState()
 * @model
 * @generated
 */
public interface CompositeState extends State {
	/**
	 * Returns the value of the '<em><b>Initial State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial State</em>' reference.
	 * @see #setInitialState(InitialState)
	 * @see dC.DCPackage#getCompositeState_InitialState()
	 * @model required="true"
	 * @generated
	 */
	InitialState getInitialState();

	/**
	 * Sets the value of the '{@link dC.CompositeState#getInitialState <em>Initial State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial State</em>' reference.
	 * @see #getInitialState()
	 * @generated
	 */
	void setInitialState(InitialState value);

	/**
	 * Returns the value of the '<em><b>Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' containment reference.
	 * @see #setContainer(State)
	 * @see dC.DCPackage#getCompositeState_Container()
	 * @model containment="true"
	 * @generated
	 */
	State getContainer();

	/**
	 * Sets the value of the '{@link dC.CompositeState#getContainer <em>Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' containment reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(State value);

} // CompositeState
