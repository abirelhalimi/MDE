/**
 */
package grafcet;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link grafcet.Transition#getOutgoingConnections <em>Outgoing Connections</em>}</li>
 *   <li>{@link grafcet.Transition#getOutcomingConnections <em>Outcoming Connections</em>}</li>
 *   <li>{@link grafcet.Transition#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see grafcet.GrafcetPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends Element {
	/**
	 * Returns the value of the '<em><b>Outgoing Connections</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Connections</em>' reference.
	 * @see #setOutgoingConnections(Step)
	 * @see grafcet.GrafcetPackage#getTransition_OutgoingConnections()
	 * @model required="true"
	 * @generated
	 */
	Step getOutgoingConnections();

	/**
	 * Sets the value of the '{@link grafcet.Transition#getOutgoingConnections <em>Outgoing Connections</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outgoing Connections</em>' reference.
	 * @see #getOutgoingConnections()
	 * @generated
	 */
	void setOutgoingConnections(Step value);

	/**
	 * Returns the value of the '<em><b>Outcoming Connections</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outcoming Connections</em>' reference.
	 * @see #setOutcomingConnections(Step)
	 * @see grafcet.GrafcetPackage#getTransition_OutcomingConnections()
	 * @model required="true"
	 * @generated
	 */
	Step getOutcomingConnections();

	/**
	 * Sets the value of the '{@link grafcet.Transition#getOutcomingConnections <em>Outcoming Connections</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outcoming Connections</em>' reference.
	 * @see #getOutcomingConnections()
	 * @generated
	 */
	void setOutcomingConnections(Step value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(String)
	 * @see grafcet.GrafcetPackage#getTransition_Condition()
	 * @model
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link grafcet.Transition#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

} // Transition
