/**
 */
package dC.impl;

import dC.DCPackage;
import dC.State;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dC.impl.StateImpl#getName <em>Name</em>}</li>
 *   <li>{@link dC.impl.StateImpl#isIsActive <em>Is Active</em>}</li>
 *   <li>{@link dC.impl.StateImpl#getOrd <em>Ord</em>}</li>
 *   <li>{@link dC.impl.StateImpl#getInh <em>Inh</em>}</li>
 *   <li>{@link dC.impl.StateImpl#getOrdIf <em>Ord If</em>}</li>
 *   <li>{@link dC.impl.StateImpl#getInhIf <em>Inh If</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateImpl extends MinimalEObjectImpl.Container implements State {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsActive() <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsActive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ACTIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsActive() <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsActive()
	 * @generated
	 * @ordered
	 */
	protected boolean isActive = IS_ACTIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrd() <em>Ord</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrd()
	 * @generated
	 * @ordered
	 */
	protected static final String ORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrd() <em>Ord</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrd()
	 * @generated
	 * @ordered
	 */
	protected String ord = ORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getInh() <em>Inh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInh()
	 * @generated
	 * @ordered
	 */
	protected static final String INH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInh() <em>Inh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInh()
	 * @generated
	 * @ordered
	 */
	protected String inh = INH_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrdIf() <em>Ord If</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrdIf()
	 * @generated
	 * @ordered
	 */
	protected static final String ORD_IF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrdIf() <em>Ord If</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrdIf()
	 * @generated
	 * @ordered
	 */
	protected String ordIf = ORD_IF_EDEFAULT;

	/**
	 * The default value of the '{@link #getInhIf() <em>Inh If</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInhIf()
	 * @generated
	 * @ordered
	 */
	protected static final String INH_IF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInhIf() <em>Inh If</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInhIf()
	 * @generated
	 * @ordered
	 */
	protected String inhIf = INH_IF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DCPackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DCPackage.STATE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsActive() {
		return isActive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsActive(boolean newIsActive) {
		boolean oldIsActive = isActive;
		isActive = newIsActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DCPackage.STATE__IS_ACTIVE, oldIsActive, isActive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrd() {
		return ord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrd(String newOrd) {
		String oldOrd = ord;
		ord = newOrd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DCPackage.STATE__ORD, oldOrd, ord));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInh() {
		return inh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInh(String newInh) {
		String oldInh = inh;
		inh = newInh;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DCPackage.STATE__INH, oldInh, inh));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrdIf() {
		return ordIf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrdIf(String newOrdIf) {
		String oldOrdIf = ordIf;
		ordIf = newOrdIf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DCPackage.STATE__ORD_IF, oldOrdIf, ordIf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInhIf() {
		return inhIf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInhIf(String newInhIf) {
		String oldInhIf = inhIf;
		inhIf = newInhIf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DCPackage.STATE__INH_IF, oldInhIf, inhIf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DCPackage.STATE__NAME:
				return getName();
			case DCPackage.STATE__IS_ACTIVE:
				return isIsActive();
			case DCPackage.STATE__ORD:
				return getOrd();
			case DCPackage.STATE__INH:
				return getInh();
			case DCPackage.STATE__ORD_IF:
				return getOrdIf();
			case DCPackage.STATE__INH_IF:
				return getInhIf();
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
			case DCPackage.STATE__NAME:
				setName((String)newValue);
				return;
			case DCPackage.STATE__IS_ACTIVE:
				setIsActive((Boolean)newValue);
				return;
			case DCPackage.STATE__ORD:
				setOrd((String)newValue);
				return;
			case DCPackage.STATE__INH:
				setInh((String)newValue);
				return;
			case DCPackage.STATE__ORD_IF:
				setOrdIf((String)newValue);
				return;
			case DCPackage.STATE__INH_IF:
				setInhIf((String)newValue);
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
			case DCPackage.STATE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DCPackage.STATE__IS_ACTIVE:
				setIsActive(IS_ACTIVE_EDEFAULT);
				return;
			case DCPackage.STATE__ORD:
				setOrd(ORD_EDEFAULT);
				return;
			case DCPackage.STATE__INH:
				setInh(INH_EDEFAULT);
				return;
			case DCPackage.STATE__ORD_IF:
				setOrdIf(ORD_IF_EDEFAULT);
				return;
			case DCPackage.STATE__INH_IF:
				setInhIf(INH_IF_EDEFAULT);
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
			case DCPackage.STATE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DCPackage.STATE__IS_ACTIVE:
				return isActive != IS_ACTIVE_EDEFAULT;
			case DCPackage.STATE__ORD:
				return ORD_EDEFAULT == null ? ord != null : !ORD_EDEFAULT.equals(ord);
			case DCPackage.STATE__INH:
				return INH_EDEFAULT == null ? inh != null : !INH_EDEFAULT.equals(inh);
			case DCPackage.STATE__ORD_IF:
				return ORD_IF_EDEFAULT == null ? ordIf != null : !ORD_IF_EDEFAULT.equals(ordIf);
			case DCPackage.STATE__INH_IF:
				return INH_IF_EDEFAULT == null ? inhIf != null : !INH_IF_EDEFAULT.equals(inhIf);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", isActive: ");
		result.append(isActive);
		result.append(", Ord: ");
		result.append(ord);
		result.append(", Inh: ");
		result.append(inh);
		result.append(", OrdIf: ");
		result.append(ordIf);
		result.append(", InhIf: ");
		result.append(inhIf);
		result.append(')');
		return result.toString();
	}

} //StateImpl
