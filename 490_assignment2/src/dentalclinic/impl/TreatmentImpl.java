/**
 */
package dentalclinic.impl;

import dentalclinic.DentalclinicPackage;
import dentalclinic.Product;
import dentalclinic.Treatment;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Treatment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dentalclinic.impl.TreatmentImpl#getName <em>Name</em>}</li>
 *   <li>{@link dentalclinic.impl.TreatmentImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link dentalclinic.impl.TreatmentImpl#getTimeSlots <em>Time Slots</em>}</li>
 *   <li>{@link dentalclinic.impl.TreatmentImpl#getProduct <em>Product</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TreatmentImpl extends MinimalEObjectImpl.Container implements Treatment {
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
	 * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected static final int PRICE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected int price = PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeSlots() <em>Time Slots</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeSlots()
	 * @generated
	 * @ordered
	 */
	protected static final int TIME_SLOTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTimeSlots() <em>Time Slots</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeSlots()
	 * @generated
	 * @ordered
	 */
	protected int timeSlots = TIME_SLOTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProduct() <em>Product</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduct()
	 * @generated
	 * @ordered
	 */
	protected EList<Product> product;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TreatmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DentalclinicPackage.Literals.TREATMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DentalclinicPackage.TREATMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrice(int newPrice) {
		int oldPrice = price;
		price = newPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DentalclinicPackage.TREATMENT__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTimeSlots() {
		return timeSlots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeSlots(int newTimeSlots) {
		int oldTimeSlots = timeSlots;
		timeSlots = newTimeSlots;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DentalclinicPackage.TREATMENT__TIME_SLOTS, oldTimeSlots, timeSlots));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Product> getProduct() {
		if (product == null) {
			product = new EObjectContainmentEList<Product>(Product.class, this, DentalclinicPackage.TREATMENT__PRODUCT);
		}
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int calcTotalPrice() {
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
			case DentalclinicPackage.TREATMENT__PRODUCT:
				return ((InternalEList<?>)getProduct()).basicRemove(otherEnd, msgs);
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
			case DentalclinicPackage.TREATMENT__NAME:
				return getName();
			case DentalclinicPackage.TREATMENT__PRICE:
				return getPrice();
			case DentalclinicPackage.TREATMENT__TIME_SLOTS:
				return getTimeSlots();
			case DentalclinicPackage.TREATMENT__PRODUCT:
				return getProduct();
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
			case DentalclinicPackage.TREATMENT__NAME:
				setName((String)newValue);
				return;
			case DentalclinicPackage.TREATMENT__PRICE:
				setPrice((Integer)newValue);
				return;
			case DentalclinicPackage.TREATMENT__TIME_SLOTS:
				setTimeSlots((Integer)newValue);
				return;
			case DentalclinicPackage.TREATMENT__PRODUCT:
				getProduct().clear();
				getProduct().addAll((Collection<? extends Product>)newValue);
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
			case DentalclinicPackage.TREATMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DentalclinicPackage.TREATMENT__PRICE:
				setPrice(PRICE_EDEFAULT);
				return;
			case DentalclinicPackage.TREATMENT__TIME_SLOTS:
				setTimeSlots(TIME_SLOTS_EDEFAULT);
				return;
			case DentalclinicPackage.TREATMENT__PRODUCT:
				getProduct().clear();
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
			case DentalclinicPackage.TREATMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DentalclinicPackage.TREATMENT__PRICE:
				return price != PRICE_EDEFAULT;
			case DentalclinicPackage.TREATMENT__TIME_SLOTS:
				return timeSlots != TIME_SLOTS_EDEFAULT;
			case DentalclinicPackage.TREATMENT__PRODUCT:
				return product != null && !product.isEmpty();
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
			case DentalclinicPackage.TREATMENT___CALC_TOTAL_PRICE:
				return calcTotalPrice();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", price: ");
		result.append(price);
		result.append(", timeSlots: ");
		result.append(timeSlots);
		result.append(')');
		return result.toString();
	}

} //TreatmentImpl
