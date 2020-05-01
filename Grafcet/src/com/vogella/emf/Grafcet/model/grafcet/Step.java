/**
 */
package com.vogella.emf.Grafcet.model.grafcet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.vogella.emf.Grafcet.model.grafcet.Step#isIsInitial <em>Is Initial</em>}</li>
 *   <li>{@link com.vogella.emf.Grafcet.model.grafcet.Step#isIsActive <em>Is Active</em>}</li>
 *   <li>{@link com.vogella.emf.Grafcet.model.grafcet.Step#getAction <em>Action</em>}</li>
 *   <li>{@link com.vogella.emf.Grafcet.model.grafcet.Step#getIncomingConnections <em>Incoming Connections</em>}</li>
 *   <li>{@link com.vogella.emf.Grafcet.model.grafcet.Step#getOutgoingConnections <em>Outgoing Connections</em>}</li>
 * </ul>
 *
 * @see com.vogella.emf.Grafcet.model.grafcet.GrafcetPackage#getStep()
 * @model
 * @generated
 */
public interface Step extends Element {
	/**
	 * Returns the value of the '<em><b>Is Initial</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Initial</em>' attribute.
	 * @see #setIsInitial(boolean)
	 * @see com.vogella.emf.Grafcet.model.grafcet.GrafcetPackage#getStep_IsInitial()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsInitial();

	/**
	 * Sets the value of the '{@link com.vogella.emf.Grafcet.model.grafcet.Step#isIsInitial <em>Is Initial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Initial</em>' attribute.
	 * @see #isIsInitial()
	 * @generated
	 */
	void setIsInitial(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Active</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Active</em>' attribute.
	 * @see #setIsActive(boolean)
	 * @see com.vogella.emf.Grafcet.model.grafcet.GrafcetPackage#getStep_IsActive()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsActive();

	/**
	 * Sets the value of the '{@link com.vogella.emf.Grafcet.model.grafcet.Step#isIsActive <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Active</em>' attribute.
	 * @see #isIsActive()
	 * @generated
	 */
	void setIsActive(boolean value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see #setAction(String)
	 * @see com.vogella.emf.Grafcet.model.grafcet.GrafcetPackage#getStep_Action()
	 * @model
	 * @generated
	 */
	String getAction();

	/**
	 * Sets the value of the '{@link com.vogella.emf.Grafcet.model.grafcet.Step#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(String value);

	/**
	 * Returns the value of the '<em><b>Incoming Connections</b></em>' reference list.
	 * The list contents are of type {@link com.vogella.emf.Grafcet.model.grafcet.Step}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Connections</em>' reference list.
	 * @see com.vogella.emf.Grafcet.model.grafcet.GrafcetPackage#getStep_IncomingConnections()
	 * @model
	 * @generated
	 */
	EList<Step> getIncomingConnections();

	/**
	 * Returns the value of the '<em><b>Outgoing Connections</b></em>' reference list.
	 * The list contents are of type {@link com.vogella.emf.Grafcet.model.grafcet.Step}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Connections</em>' reference list.
	 * @see com.vogella.emf.Grafcet.model.grafcet.GrafcetPackage#getStep_OutgoingConnections()
	 * @model
	 * @generated
	 */
	EList<Step> getOutgoingConnections();

} // Step
