/**
 */
package dentalclinic.impl;

import dentalclinic.Client;
import dentalclinic.ClientType;
import dentalclinic.DentalclinicPackage;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Client</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dentalclinic.impl.ClientImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link dentalclinic.impl.ClientImpl#getClientType <em>Client Type</em>}</li>
 *   <li>{@link dentalclinic.impl.ClientImpl#getDeltaCareNum <em>Delta Care Num</em>}</li>
 *   <li>{@link dentalclinic.impl.ClientImpl#getLastAppt <em>Last Appt</em>}</li>
 *   <li>{@link dentalclinic.impl.ClientImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClientImpl extends MinimalEObjectImpl.Container implements Client {
	/**
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected String address = ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getClientType() <em>Client Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientType()
	 * @generated
	 * @ordered
	 */
	protected static final ClientType CLIENT_TYPE_EDEFAULT = ClientType.DELTA_CARE;

	/**
	 * The cached value of the '{@link #getClientType() <em>Client Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientType()
	 * @generated
	 * @ordered
	 */
	protected ClientType clientType = CLIENT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeltaCareNum() <em>Delta Care Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaCareNum()
	 * @generated
	 * @ordered
	 */
	protected static final int DELTA_CARE_NUM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDeltaCareNum() <em>Delta Care Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaCareNum()
	 * @generated
	 * @ordered
	 */
	protected int deltaCareNum = DELTA_CARE_NUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastAppt() <em>Last Appt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastAppt()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_APPT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastAppt() <em>Last Appt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastAppt()
	 * @generated
	 * @ordered
	 */
	protected Date lastAppt = LAST_APPT_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DentalclinicPackage.Literals.CLIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(String newAddress) {
		String oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DentalclinicPackage.CLIENT__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClientType getClientType() {
		return clientType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClientType(ClientType newClientType) {
		ClientType oldClientType = clientType;
		clientType = newClientType == null ? CLIENT_TYPE_EDEFAULT : newClientType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DentalclinicPackage.CLIENT__CLIENT_TYPE, oldClientType, clientType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDeltaCareNum() {
		return deltaCareNum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeltaCareNum(int newDeltaCareNum) {
		int oldDeltaCareNum = deltaCareNum;
		deltaCareNum = newDeltaCareNum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DentalclinicPackage.CLIENT__DELTA_CARE_NUM, oldDeltaCareNum, deltaCareNum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLastAppt() {
		return lastAppt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastAppt(Date newLastAppt) {
		Date oldLastAppt = lastAppt;
		lastAppt = newLastAppt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DentalclinicPackage.CLIENT__LAST_APPT, oldLastAppt, lastAppt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DentalclinicPackage.CLIENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DentalclinicPackage.CLIENT__ADDRESS:
				return getAddress();
			case DentalclinicPackage.CLIENT__CLIENT_TYPE:
				return getClientType();
			case DentalclinicPackage.CLIENT__DELTA_CARE_NUM:
				return getDeltaCareNum();
			case DentalclinicPackage.CLIENT__LAST_APPT:
				return getLastAppt();
			case DentalclinicPackage.CLIENT__NAME:
				return getName();
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
			case DentalclinicPackage.CLIENT__ADDRESS:
				setAddress((String)newValue);
				return;
			case DentalclinicPackage.CLIENT__CLIENT_TYPE:
				setClientType((ClientType)newValue);
				return;
			case DentalclinicPackage.CLIENT__DELTA_CARE_NUM:
				setDeltaCareNum((Integer)newValue);
				return;
			case DentalclinicPackage.CLIENT__LAST_APPT:
				setLastAppt((Date)newValue);
				return;
			case DentalclinicPackage.CLIENT__NAME:
				setName((String)newValue);
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
			case DentalclinicPackage.CLIENT__ADDRESS:
				setAddress(ADDRESS_EDEFAULT);
				return;
			case DentalclinicPackage.CLIENT__CLIENT_TYPE:
				setClientType(CLIENT_TYPE_EDEFAULT);
				return;
			case DentalclinicPackage.CLIENT__DELTA_CARE_NUM:
				setDeltaCareNum(DELTA_CARE_NUM_EDEFAULT);
				return;
			case DentalclinicPackage.CLIENT__LAST_APPT:
				setLastAppt(LAST_APPT_EDEFAULT);
				return;
			case DentalclinicPackage.CLIENT__NAME:
				setName(NAME_EDEFAULT);
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
			case DentalclinicPackage.CLIENT__ADDRESS:
				return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
			case DentalclinicPackage.CLIENT__CLIENT_TYPE:
				return clientType != CLIENT_TYPE_EDEFAULT;
			case DentalclinicPackage.CLIENT__DELTA_CARE_NUM:
				return deltaCareNum != DELTA_CARE_NUM_EDEFAULT;
			case DentalclinicPackage.CLIENT__LAST_APPT:
				return LAST_APPT_EDEFAULT == null ? lastAppt != null : !LAST_APPT_EDEFAULT.equals(lastAppt);
			case DentalclinicPackage.CLIENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (address: ");
		result.append(address);
		result.append(", clientType: ");
		result.append(clientType);
		result.append(", deltaCareNum: ");
		result.append(deltaCareNum);
		result.append(", lastAppt: ");
		result.append(lastAppt);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ClientImpl
