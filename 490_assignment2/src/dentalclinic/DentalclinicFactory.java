/**
 */
package dentalclinic;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see dentalclinic.DentalclinicPackage
 * @generated
 */
public interface DentalclinicFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DentalclinicFactory eINSTANCE = dentalclinic.impl.DentalclinicFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Appointment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Appointment</em>'.
	 * @generated
	 */
	Appointment createAppointment();

	/**
	 * Returns a new object of class '<em>Dentist</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dentist</em>'.
	 * @generated
	 */
	Dentist createDentist();

	/**
	 * Returns a new object of class '<em>Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Client</em>'.
	 * @generated
	 */
	Client createClient();

	/**
	 * Returns a new object of class '<em>Polishing Gel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Polishing Gel</em>'.
	 * @generated
	 */
	PolishingGel createPolishingGel();

	/**
	 * Returns a new object of class '<em>Amalgam</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Amalgam</em>'.
	 * @generated
	 */
	Amalgam createAmalgam();

	/**
	 * Returns a new object of class '<em>Gold Crown</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gold Crown</em>'.
	 * @generated
	 */
	GoldCrown createGoldCrown();

	/**
	 * Returns a new object of class '<em>Crown</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Crown</em>'.
	 * @generated
	 */
	Crown createCrown();

	/**
	 * Returns a new object of class '<em>Scaling</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scaling</em>'.
	 * @generated
	 */
	Scaling createScaling();

	/**
	 * Returns a new object of class '<em>Filling</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Filling</em>'.
	 * @generated
	 */
	Filling createFilling();

	/**
	 * Returns a new object of class '<em>Checkup</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Checkup</em>'.
	 * @generated
	 */
	Checkup createCheckup();

	/**
	 * Returns a new object of class '<em>Minor Surgery</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Minor Surgery</em>'.
	 * @generated
	 */
	MinorSurgery createMinorSurgery();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DentalclinicPackage getDentalclinicPackage();

} //DentalclinicFactory
