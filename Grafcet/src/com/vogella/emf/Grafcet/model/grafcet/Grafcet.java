/**
 */
package com.vogella.emf.Grafcet.model.grafcet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grafcet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.vogella.emf.Grafcet.model.grafcet.Grafcet#getElements <em>Elements</em>}</li>
 *   <li>{@link com.vogella.emf.Grafcet.model.grafcet.Grafcet#getConnections <em>Connections</em>}</li>
 * </ul>
 *
 * @see com.vogella.emf.Grafcet.model.grafcet.GrafcetPackage#getGrafcet()
 * @model
 * @generated
 */
public interface Grafcet extends LocatedElement {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link com.vogella.emf.Grafcet.model.grafcet.Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see com.vogella.emf.Grafcet.model.grafcet.GrafcetPackage#getGrafcet_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getElements();

	/**
	 * Returns the value of the '<em><b>Connections</b></em>' reference list.
	 * The list contents are of type {@link com.vogella.emf.Grafcet.model.grafcet.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections</em>' reference list.
	 * @see com.vogella.emf.Grafcet.model.grafcet.GrafcetPackage#getGrafcet_Connections()
	 * @model
	 * @generated
	 */
	EList<Transition> getConnections();

} // Grafcet
