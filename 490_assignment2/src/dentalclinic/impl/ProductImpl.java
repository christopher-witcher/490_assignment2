/**
 */
package dentalclinic.impl;

import dentalclinic.DentalclinicPackage;
import dentalclinic.Product;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dentalclinic.impl.ProductImpl#getCustomerCost <em>Customer Cost</em>}</li>
 *   <li>{@link dentalclinic.impl.ProductImpl#getName <em>Name</em>}</li>
 *   <li>{@link dentalclinic.impl.ProductImpl#getTreatmentCost <em>Treatment Cost</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ProductImpl extends MinimalEObjectImpl.Container implements Product {
	/**
	 * The default value of the '{@link #getCustomerCost() <em>Customer Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerCost()
	 * @generated
	 * @ordered
	 */
	protected static final int CUSTOMER_COST_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCustomerCost() <em>Customer Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerCost()
	 * @generated
	 * @ordered
	 */
	protected int customerCost = CUSTOMER_COST_EDEFAULT;

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
	 * The default value of the '{@link #getTreatmentCost() <em>Treatment Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreatmentCost()
	 * @generated
	 * @ordered
	 */
	protected static final int TREATMENT_COST_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTreatmentCost() <em>Treatment Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreatmentCost()
	 * @generated
	 * @ordered
	 */
	protected int treatmentCost = TREATMENT_COST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DentalclinicPackage.Literals.PRODUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCustomerCost() {
		return customerCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomerCost(int newCustomerCost) {
		int oldCustomerCost = customerCost;
		customerCost = newCustomerCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DentalclinicPackage.PRODUCT__CUSTOMER_COST, oldCustomerCost, customerCost));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DentalclinicPackage.PRODUCT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTreatmentCost() {
		return treatmentCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTreatmentCost(int newTreatmentCost) {
		int oldTreatmentCost = treatmentCost;
		treatmentCost = newTreatmentCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DentalclinicPackage.PRODUCT__TREATMENT_COST, oldTreatmentCost, treatmentCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DentalclinicPackage.PRODUCT__CUSTOMER_COST:
				return getCustomerCost();
			case DentalclinicPackage.PRODUCT__NAME:
				return getName();
			case DentalclinicPackage.PRODUCT__TREATMENT_COST:
				return getTreatmentCost();
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
			case DentalclinicPackage.PRODUCT__CUSTOMER_COST:
				setCustomerCost((Integer)newValue);
				return;
			case DentalclinicPackage.PRODUCT__NAME:
				setName((String)newValue);
				return;
			case DentalclinicPackage.PRODUCT__TREATMENT_COST:
				setTreatmentCost((Integer)newValue);
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
			case DentalclinicPackage.PRODUCT__CUSTOMER_COST:
				setCustomerCost(CUSTOMER_COST_EDEFAULT);
				return;
			case DentalclinicPackage.PRODUCT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DentalclinicPackage.PRODUCT__TREATMENT_COST:
				setTreatmentCost(TREATMENT_COST_EDEFAULT);
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
			case DentalclinicPackage.PRODUCT__CUSTOMER_COST:
				return customerCost != CUSTOMER_COST_EDEFAULT;
			case DentalclinicPackage.PRODUCT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DentalclinicPackage.PRODUCT__TREATMENT_COST:
				return treatmentCost != TREATMENT_COST_EDEFAULT;
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
		result.append(" (customerCost: ");
		result.append(customerCost);
		result.append(", name: ");
		result.append(name);
		result.append(", treatmentCost: ");
		result.append(treatmentCost);
		result.append(')');
		return result.toString();
	}

} //ProductImpl
