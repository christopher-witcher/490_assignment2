/**
 */
package dentalclinic.impl;

import dentalclinic.Appointment;
import dentalclinic.ApptStatus;
import dentalclinic.Client;
import dentalclinic.DentalclinicPackage;
import dentalclinic.Dentist;
import dentalclinic.Product;
import dentalclinic.Treatment;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Appointment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dentalclinic.impl.AppointmentImpl#getTreatments <em>Treatments</em>}</li>
 *   <li>{@link dentalclinic.impl.AppointmentImpl#getDentist <em>Dentist</em>}</li>
 *   <li>{@link dentalclinic.impl.AppointmentImpl#getProducts <em>Products</em>}</li>
 *   <li>{@link dentalclinic.impl.AppointmentImpl#getClient <em>Client</em>}</li>
 *   <li>{@link dentalclinic.impl.AppointmentImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link dentalclinic.impl.AppointmentImpl#getDate <em>Date</em>}</li>
 *   <li>{@link dentalclinic.impl.AppointmentImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link dentalclinic.impl.AppointmentImpl#getTimeSlots <em>Time Slots</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AppointmentImpl extends MinimalEObjectImpl.Container implements Appointment {
	/**
	 * The cached value of the '{@link #getTreatments() <em>Treatments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreatments()
	 * @generated
	 * @ordered
	 */
	protected EList<Treatment> treatments;

	/**
	 * The cached value of the '{@link #getDentist() <em>Dentist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDentist()
	 * @generated
	 * @ordered
	 */
	protected Dentist dentist;

	/**
	 * The cached value of the '{@link #getProducts() <em>Products</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducts()
	 * @generated
	 * @ordered
	 */
	protected EList<Product> products;

	/**
	 * The cached value of the '{@link #getClient() <em>Client</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClient()
	 * @generated
	 * @ordered
	 */
	protected Client client;

	/**
	 * The default value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected static final int COST_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected int cost = COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ApptStatus STATUS_EDEFAULT = ApptStatus.ACTIVE;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected ApptStatus status = STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTimeSlots() <em>Time Slots</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeSlots()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> timeSlots;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AppointmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DentalclinicPackage.Literals.APPOINTMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Treatment> getTreatments() {
		if (treatments == null) {
			treatments = new EObjectContainmentEList<Treatment>(Treatment.class, this, DentalclinicPackage.APPOINTMENT__TREATMENTS);
		}
		return treatments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dentist getDentist() {
		return dentist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDentist(Dentist newDentist, NotificationChain msgs) {
		Dentist oldDentist = dentist;
		dentist = newDentist;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DentalclinicPackage.APPOINTMENT__DENTIST, oldDentist, newDentist);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDentist(Dentist newDentist) {
		if (newDentist != dentist) {
			NotificationChain msgs = null;
			if (dentist != null)
				msgs = ((InternalEObject)dentist).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DentalclinicPackage.APPOINTMENT__DENTIST, null, msgs);
			if (newDentist != null)
				msgs = ((InternalEObject)newDentist).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DentalclinicPackage.APPOINTMENT__DENTIST, null, msgs);
			msgs = basicSetDentist(newDentist, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DentalclinicPackage.APPOINTMENT__DENTIST, newDentist, newDentist));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Product> getProducts() {
		if (products == null) {
			products = new EObjectContainmentEList<Product>(Product.class, this, DentalclinicPackage.APPOINTMENT__PRODUCTS);
		}
		return products;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Client getClient() {
		return client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClient(Client newClient, NotificationChain msgs) {
		Client oldClient = client;
		client = newClient;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DentalclinicPackage.APPOINTMENT__CLIENT, oldClient, newClient);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClient(Client newClient) {
		if (newClient != client) {
			NotificationChain msgs = null;
			if (client != null)
				msgs = ((InternalEObject)client).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DentalclinicPackage.APPOINTMENT__CLIENT, null, msgs);
			if (newClient != null)
				msgs = ((InternalEObject)newClient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DentalclinicPackage.APPOINTMENT__CLIENT, null, msgs);
			msgs = basicSetClient(newClient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DentalclinicPackage.APPOINTMENT__CLIENT, newClient, newClient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCost() {
		return cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCost(int newCost) {
		int oldCost = cost;
		cost = newCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DentalclinicPackage.APPOINTMENT__COST, oldCost, cost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DentalclinicPackage.APPOINTMENT__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApptStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(ApptStatus newStatus) {
		ApptStatus oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DentalclinicPackage.APPOINTMENT__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getTimeSlots() {
		if (timeSlots == null) {
			timeSlots = new EDataTypeUniqueEList<Integer>(Integer.class, this, DentalclinicPackage.APPOINTMENT__TIME_SLOTS);
		}
		return timeSlots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int calcCost() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DentalclinicPackage.APPOINTMENT__TREATMENTS:
				return ((InternalEList<?>)getTreatments()).basicRemove(otherEnd, msgs);
			case DentalclinicPackage.APPOINTMENT__DENTIST:
				return basicSetDentist(null, msgs);
			case DentalclinicPackage.APPOINTMENT__PRODUCTS:
				return ((InternalEList<?>)getProducts()).basicRemove(otherEnd, msgs);
			case DentalclinicPackage.APPOINTMENT__CLIENT:
				return basicSetClient(null, msgs);
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
			case DentalclinicPackage.APPOINTMENT__TREATMENTS:
				return getTreatments();
			case DentalclinicPackage.APPOINTMENT__DENTIST:
				return getDentist();
			case DentalclinicPackage.APPOINTMENT__PRODUCTS:
				return getProducts();
			case DentalclinicPackage.APPOINTMENT__CLIENT:
				return getClient();
			case DentalclinicPackage.APPOINTMENT__COST:
				return getCost();
			case DentalclinicPackage.APPOINTMENT__DATE:
				return getDate();
			case DentalclinicPackage.APPOINTMENT__STATUS:
				return getStatus();
			case DentalclinicPackage.APPOINTMENT__TIME_SLOTS:
				return getTimeSlots();
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
			case DentalclinicPackage.APPOINTMENT__TREATMENTS:
				getTreatments().clear();
				getTreatments().addAll((Collection<? extends Treatment>)newValue);
				return;
			case DentalclinicPackage.APPOINTMENT__DENTIST:
				setDentist((Dentist)newValue);
				return;
			case DentalclinicPackage.APPOINTMENT__PRODUCTS:
				getProducts().clear();
				getProducts().addAll((Collection<? extends Product>)newValue);
				return;
			case DentalclinicPackage.APPOINTMENT__CLIENT:
				setClient((Client)newValue);
				return;
			case DentalclinicPackage.APPOINTMENT__COST:
				setCost((Integer)newValue);
				return;
			case DentalclinicPackage.APPOINTMENT__DATE:
				setDate((Date)newValue);
				return;
			case DentalclinicPackage.APPOINTMENT__STATUS:
				setStatus((ApptStatus)newValue);
				return;
			case DentalclinicPackage.APPOINTMENT__TIME_SLOTS:
				getTimeSlots().clear();
				getTimeSlots().addAll((Collection<? extends Integer>)newValue);
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
			case DentalclinicPackage.APPOINTMENT__TREATMENTS:
				getTreatments().clear();
				return;
			case DentalclinicPackage.APPOINTMENT__DENTIST:
				setDentist((Dentist)null);
				return;
			case DentalclinicPackage.APPOINTMENT__PRODUCTS:
				getProducts().clear();
				return;
			case DentalclinicPackage.APPOINTMENT__CLIENT:
				setClient((Client)null);
				return;
			case DentalclinicPackage.APPOINTMENT__COST:
				setCost(COST_EDEFAULT);
				return;
			case DentalclinicPackage.APPOINTMENT__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case DentalclinicPackage.APPOINTMENT__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case DentalclinicPackage.APPOINTMENT__TIME_SLOTS:
				getTimeSlots().clear();
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
			case DentalclinicPackage.APPOINTMENT__TREATMENTS:
				return treatments != null && !treatments.isEmpty();
			case DentalclinicPackage.APPOINTMENT__DENTIST:
				return dentist != null;
			case DentalclinicPackage.APPOINTMENT__PRODUCTS:
				return products != null && !products.isEmpty();
			case DentalclinicPackage.APPOINTMENT__CLIENT:
				return client != null;
			case DentalclinicPackage.APPOINTMENT__COST:
				return cost != COST_EDEFAULT;
			case DentalclinicPackage.APPOINTMENT__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case DentalclinicPackage.APPOINTMENT__STATUS:
				return status != STATUS_EDEFAULT;
			case DentalclinicPackage.APPOINTMENT__TIME_SLOTS:
				return timeSlots != null && !timeSlots.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case DentalclinicPackage.APPOINTMENT___CALC_COST:
				return calcCost();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (cost: ");
		result.append(cost);
		result.append(", date: ");
		result.append(date);
		result.append(", status: ");
		result.append(status);
		result.append(", timeSlots: ");
		result.append(timeSlots);
		result.append(')');
		return result.toString();
	}

} //AppointmentImpl
