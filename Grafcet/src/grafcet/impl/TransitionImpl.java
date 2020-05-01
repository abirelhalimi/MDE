/**
 */
package grafcet.impl;

import grafcet.GrafcetPackage;
import grafcet.Step;
import grafcet.Transition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link grafcet.impl.TransitionImpl#getOutgoingConnections <em>Outgoing Connections</em>}</li>
 *   <li>{@link grafcet.impl.TransitionImpl#getOutcomingConnections <em>Outcoming Connections</em>}</li>
 *   <li>{@link grafcet.impl.TransitionImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends ElementImpl implements Transition {
	/**
	 * The cached value of the '{@link #getOutgoingConnections() <em>Outgoing Connections</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingConnections()
	 * @generated
	 * @ordered
	 */
	protected Step outgoingConnections;

	/**
	 * The cached value of the '{@link #getOutcomingConnections() <em>Outcoming Connections</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutcomingConnections()
	 * @generated
	 * @ordered
	 */
	protected Step outcomingConnections;

	/**
	 * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected String condition = CONDITION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrafcetPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Step getOutgoingConnections() {
		if (outgoingConnections != null && outgoingConnections.eIsProxy()) {
			InternalEObject oldOutgoingConnections = (InternalEObject)outgoingConnections;
			outgoingConnections = (Step)eResolveProxy(oldOutgoingConnections);
			if (outgoingConnections != oldOutgoingConnections) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GrafcetPackage.TRANSITION__OUTGOING_CONNECTIONS, oldOutgoingConnections, outgoingConnections));
			}
		}
		return outgoingConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step basicGetOutgoingConnections() {
		return outgoingConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutgoingConnections(Step newOutgoingConnections) {
		Step oldOutgoingConnections = outgoingConnections;
		outgoingConnections = newOutgoingConnections;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetPackage.TRANSITION__OUTGOING_CONNECTIONS, oldOutgoingConnections, outgoingConnections));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Step getOutcomingConnections() {
		if (outcomingConnections != null && outcomingConnections.eIsProxy()) {
			InternalEObject oldOutcomingConnections = (InternalEObject)outcomingConnections;
			outcomingConnections = (Step)eResolveProxy(oldOutcomingConnections);
			if (outcomingConnections != oldOutcomingConnections) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GrafcetPackage.TRANSITION__OUTCOMING_CONNECTIONS, oldOutcomingConnections, outcomingConnections));
			}
		}
		return outcomingConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step basicGetOutcomingConnections() {
		return outcomingConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutcomingConnections(Step newOutcomingConnections) {
		Step oldOutcomingConnections = outcomingConnections;
		outcomingConnections = newOutcomingConnections;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetPackage.TRANSITION__OUTCOMING_CONNECTIONS, oldOutcomingConnections, outcomingConnections));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCondition(String newCondition) {
		String oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetPackage.TRANSITION__CONDITION, oldCondition, condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GrafcetPackage.TRANSITION__OUTGOING_CONNECTIONS:
				if (resolve) return getOutgoingConnections();
				return basicGetOutgoingConnections();
			case GrafcetPackage.TRANSITION__OUTCOMING_CONNECTIONS:
				if (resolve) return getOutcomingConnections();
				return basicGetOutcomingConnections();
			case GrafcetPackage.TRANSITION__CONDITION:
				return getCondition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GrafcetPackage.TRANSITION__OUTGOING_CONNECTIONS:
				setOutgoingConnections((Step)newValue);
				return;
			case GrafcetPackage.TRANSITION__OUTCOMING_CONNECTIONS:
				setOutcomingConnections((Step)newValue);
				return;
			case GrafcetPackage.TRANSITION__CONDITION:
				setCondition((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GrafcetPackage.TRANSITION__OUTGOING_CONNECTIONS:
				setOutgoingConnections((Step)null);
				return;
			case GrafcetPackage.TRANSITION__OUTCOMING_CONNECTIONS:
				setOutcomingConnections((Step)null);
				return;
			case GrafcetPackage.TRANSITION__CONDITION:
				setCondition(CONDITION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GrafcetPackage.TRANSITION__OUTGOING_CONNECTIONS:
				return outgoingConnections != null;
			case GrafcetPackage.TRANSITION__OUTCOMING_CONNECTIONS:
				return outcomingConnections != null;
			case GrafcetPackage.TRANSITION__CONDITION:
				return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (condition: ");
		result.append(condition);
		result.append(')');
		return result.toString();
	}

} //TransitionImpl
