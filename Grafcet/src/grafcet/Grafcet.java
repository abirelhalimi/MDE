/**
 */
package grafcet;

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
 *   <li>{@link grafcet.Grafcet#getElements <em>Elements</em>}</li>
 *   <li>{@link grafcet.Grafcet#getConnections <em>Connections</em>}</li>
 * </ul>
 *
 * @see grafcet.GrafcetPackage#getGrafcet()
 * @model
 * @generated
 */
public interface Grafcet extends LocatedElement {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link grafcet.Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see grafcet.GrafcetPackage#getGrafcet_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getElements();

	/**
	 * Returns the value of the '<em><b>Connections</b></em>' reference list.
	 * The list contents are of type {@link grafcet.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections</em>' reference list.
	 * @see grafcet.GrafcetPackage#getGrafcet_Connections()
	 * @model
	 * @generated
	 */
	EList<Transition> getConnections();

} // Grafcet
