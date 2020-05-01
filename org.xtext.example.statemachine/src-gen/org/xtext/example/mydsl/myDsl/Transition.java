/**
 * generated by Xtext 2.9.2
 */
package org.xtext.example.mydsl.myDsl;

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
 *   <li>{@link org.xtext.example.mydsl.myDsl.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Transition#getEvent <em>Event</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject
{
  /**
   * Returns the value of the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' containment reference.
   * @see #setSource(State)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getTransition_Source()
   * @model containment="true"
   * @generated
   */
  State getSource();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Transition#getSource <em>Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' containment reference.
   * @see #getSource()
   * @generated
   */
  void setSource(State value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' containment reference.
   * @see #setTarget(State)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getTransition_Target()
   * @model containment="true"
   * @generated
   */
  State getTarget();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Transition#getTarget <em>Target</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' containment reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(State value);

  /**
   * Returns the value of the '<em><b>Event</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Event</em>' attribute.
   * @see #setEvent(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getTransition_Event()
   * @model
   * @generated
   */
  String getEvent();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Transition#getEvent <em>Event</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Event</em>' attribute.
   * @see #getEvent()
   * @generated
   */
  void setEvent(String value);

} // Transition