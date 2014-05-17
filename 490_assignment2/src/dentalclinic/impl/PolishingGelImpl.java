/**
 */
package dentalclinic.impl;

import dentalclinic.DentalclinicPackage;
import dentalclinic.PolishingGel;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Polishing Gel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dentalclinic.impl.PolishingGelImpl#getBottleCost <em>Bottle Cost</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PolishingGelImpl extends ProductImpl implements PolishingGel {
	/**
	 * The default value of the '{@link #getBottleCost() <em>Bottle Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBottleCost()
	 * @generated
	 * @ordered
	 */
	protected static final int BOTTLE_COST_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBottleCost() <em>Bottle Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBottleCost()
	 * @generated
	 * @ordered
	 */
	protected int bottleCost = BOTTLE_COST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolishingGelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DentalclinicPackage.Literals.POLISHING_GEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBottleCost() {
		return bottleCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBottleCost(int newBottleCost) {
		int oldBottleCost = bottleCost;
		bottleCost = newBottleCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DentalclinicPackage.POLISHING_GEL__BOTTLE_COST, oldBottleCost, bottleCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DentalclinicPackage.POLISHING_GEL__BOTTLE_COST:
				return getBottleCost();
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
			case DentalclinicPackage.POLISHING_GEL__BOTTLE_COST:
				setBottleCost((Integer)newValue);
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
			case DentalclinicPackage.POLISHING_GEL__BOTTLE_COST:
				setBottleCost(BOTTLE_COST_EDEFAULT);
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
			case DentalclinicPackage.POLISHING_GEL__BOTTLE_COST:
				return bottleCost != BOTTLE_COST_EDEFAULT;
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
		result.append(" (bottleCost: ");
		result.append(bottleCost);
		result.append(')');
		return result.toString();
	}

} //PolishingGelImpl
