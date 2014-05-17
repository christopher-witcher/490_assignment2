/**
 */
package dentalclinic.impl;

import dentalclinic.Client;
import dentalclinic.DentalclinicPackage;
import dentalclinic.Dentist;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dentist</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dentalclinic.impl.DentistImpl#getName <em>Name</em>}</li>
 *   <li>{@link dentalclinic.impl.DentistImpl#getSchedule <em>Schedule</em>}</li>
 *   <li>{@link dentalclinic.impl.DentistImpl#getPrefDentist <em>Pref Dentist</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DentistImpl extends MinimalEObjectImpl.Container implements Dentist {
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
	 * The cached value of the '{@link #getSchedule() <em>Schedule</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedule()
	 * @generated
	 * @ordered
	 */
	protected EList<Map> schedule;

	/**
	 * The cached value of the '{@link #getPrefDentist() <em>Pref Dentist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefDentist()
	 * @generated
	 * @ordered
	 */
	protected Client prefDentist;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DentistImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DentalclinicPackage.Literals.DENTIST;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DentalclinicPackage.DENTIST__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Map> getSchedule() {
		if (schedule == null) {
			schedule = new EDataTypeUniqueEList<Map>(Map.class, this, DentalclinicPackage.DENTIST__SCHEDULE);
		}
		return schedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Client getPrefDentist() {
		return prefDentist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrefDentist(Client newPrefDentist, NotificationChain msgs) {
		Client oldPrefDentist = prefDentist;
		prefDentist = newPrefDentist;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DentalclinicPackage.DENTIST__PREF_DENTIST, oldPrefDentist, newPrefDentist);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrefDentist(Client newPrefDentist) {
		if (newPrefDentist != prefDentist) {
			NotificationChain msgs = null;
			if (prefDentist != null)
				msgs = ((InternalEObject)prefDentist).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DentalclinicPackage.DENTIST__PREF_DENTIST, null, msgs);
			if (newPrefDentist != null)
				msgs = ((InternalEObject)newPrefDentist).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DentalclinicPackage.DENTIST__PREF_DENTIST, null, msgs);
			msgs = basicSetPrefDentist(newPrefDentist, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DentalclinicPackage.DENTIST__PREF_DENTIST, newPrefDentist, newPrefDentist));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DentalclinicPackage.DENTIST__PREF_DENTIST:
				return basicSetPrefDentist(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DentalclinicPackage.DENTIST__NAME:
				return getName();
			case DentalclinicPackage.DENTIST__SCHEDULE:
				return getSchedule();
			case DentalclinicPackage.DENTIST__PREF_DENTIST:
				return getPrefDentist();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DentalclinicPackage.DENTIST__NAME:
				setName((String)newValue);
				return;
			case DentalclinicPackage.DENTIST__SCHEDULE:
				getSchedule().clear();
				getSchedule().addAll((Collection<? extends Map>)newValue);
				return;
			case DentalclinicPackage.DENTIST__PREF_DENTIST:
				setPrefDentist((Client)newValue);
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
			case DentalclinicPackage.DENTIST__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DentalclinicPackage.DENTIST__SCHEDULE:
				getSchedule().clear();
				return;
			case DentalclinicPackage.DENTIST__PREF_DENTIST:
				setPrefDentist((Client)null);
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
			case DentalclinicPackage.DENTIST__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DentalclinicPackage.DENTIST__SCHEDULE:
				return schedule != null && !schedule.isEmpty();
			case DentalclinicPackage.DENTIST__PREF_DENTIST:
				return prefDentist != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", schedule: ");
		result.append(schedule);
		result.append(')');
		return result.toString();
	}

} //DentistImpl
