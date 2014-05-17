/**
 */
package dentalclinic.util;

import dentalclinic.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see dentalclinic.DentalclinicPackage
 * @generated
 */
public class DentalclinicSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DentalclinicPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DentalclinicSwitch() {
		if (modelPackage == null) {
			modelPackage = DentalclinicPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DentalclinicPackage.APPOINTMENT: {
				Appointment appointment = (Appointment)theEObject;
				T result = caseAppointment(appointment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DentalclinicPackage.TREATMENT: {
				Treatment treatment = (Treatment)theEObject;
				T result = caseTreatment(treatment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DentalclinicPackage.DENTIST: {
				Dentist dentist = (Dentist)theEObject;
				T result = caseDentist(dentist);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DentalclinicPackage.PRODUCT: {
				Product product = (Product)theEObject;
				T result = caseProduct(product);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DentalclinicPackage.CLIENT: {
				Client client = (Client)theEObject;
				T result = caseClient(client);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DentalclinicPackage.POLISHING_GEL: {
				PolishingGel polishingGel = (PolishingGel)theEObject;
				T result = casePolishingGel(polishingGel);
				if (result == null) result = caseProduct(polishingGel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DentalclinicPackage.AMALGAM: {
				Amalgam amalgam = (Amalgam)theEObject;
				T result = caseAmalgam(amalgam);
				if (result == null) result = caseProduct(amalgam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DentalclinicPackage.GOLD_CROWN: {
				GoldCrown goldCrown = (GoldCrown)theEObject;
				T result = caseGoldCrown(goldCrown);
				if (result == null) result = caseProduct(goldCrown);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DentalclinicPackage.CROWN: {
				Crown crown = (Crown)theEObject;
				T result = caseCrown(crown);
				if (result == null) result = caseProduct(crown);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DentalclinicPackage.SCALING: {
				Scaling scaling = (Scaling)theEObject;
				T result = caseScaling(scaling);
				if (result == null) result = caseTreatment(scaling);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DentalclinicPackage.FILLING: {
				Filling filling = (Filling)theEObject;
				T result = caseFilling(filling);
				if (result == null) result = caseTreatment(filling);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DentalclinicPackage.CHECKUP: {
				Checkup checkup = (Checkup)theEObject;
				T result = caseCheckup(checkup);
				if (result == null) result = caseTreatment(checkup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DentalclinicPackage.MINOR_SURGERY: {
				MinorSurgery minorSurgery = (MinorSurgery)theEObject;
				T result = caseMinorSurgery(minorSurgery);
				if (result == null) result = caseTreatment(minorSurgery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Appointment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Appointment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAppointment(Appointment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Treatment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Treatment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTreatment(Treatment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dentist</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dentist</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDentist(Dentist object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProduct(Product object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Client</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Client</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClient(Client object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Polishing Gel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Polishing Gel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolishingGel(PolishingGel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Amalgam</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Amalgam</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAmalgam(Amalgam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gold Crown</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gold Crown</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGoldCrown(GoldCrown object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Crown</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Crown</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCrown(Crown object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scaling</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scaling</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScaling(Scaling object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filling</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filling</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilling(Filling object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Checkup</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Checkup</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCheckup(Checkup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Minor Surgery</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Minor Surgery</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMinorSurgery(MinorSurgery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DentalclinicSwitch
