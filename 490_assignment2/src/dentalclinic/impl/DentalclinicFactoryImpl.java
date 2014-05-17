/**
 */
package dentalclinic.impl;

import dentalclinic.*;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DentalclinicFactoryImpl extends EFactoryImpl implements DentalclinicFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DentalclinicFactory init() {
		try {
			DentalclinicFactory theDentalclinicFactory = (DentalclinicFactory)EPackage.Registry.INSTANCE.getEFactory(DentalclinicPackage.eNS_URI);
			if (theDentalclinicFactory != null) {
				return theDentalclinicFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DentalclinicFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DentalclinicFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DentalclinicPackage.APPOINTMENT: return createAppointment();
			case DentalclinicPackage.DENTIST: return createDentist();
			case DentalclinicPackage.CLIENT: return createClient();
			case DentalclinicPackage.POLISHING_GEL: return createPolishingGel();
			case DentalclinicPackage.AMALGAM: return createAmalgam();
			case DentalclinicPackage.GOLD_CROWN: return createGoldCrown();
			case DentalclinicPackage.CROWN: return createCrown();
			case DentalclinicPackage.SCALING: return createScaling();
			case DentalclinicPackage.FILLING: return createFilling();
			case DentalclinicPackage.CHECKUP: return createCheckup();
			case DentalclinicPackage.MINOR_SURGERY: return createMinorSurgery();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case DentalclinicPackage.APPT_STATUS:
				return createApptStatusFromString(eDataType, initialValue);
			case DentalclinicPackage.CLIENT_TYPE:
				return createClientTypeFromString(eDataType, initialValue);
			case DentalclinicPackage.SCHEDULE:
				return createscheduleFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case DentalclinicPackage.APPT_STATUS:
				return convertApptStatusToString(eDataType, instanceValue);
			case DentalclinicPackage.CLIENT_TYPE:
				return convertClientTypeToString(eDataType, instanceValue);
			case DentalclinicPackage.SCHEDULE:
				return convertscheduleToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Appointment createAppointment() {
		AppointmentImpl appointment = new AppointmentImpl();
		return appointment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dentist createDentist() {
		DentistImpl dentist = new DentistImpl();
		return dentist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Client createClient() {
		ClientImpl client = new ClientImpl();
		return client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolishingGel createPolishingGel() {
		PolishingGelImpl polishingGel = new PolishingGelImpl();
		return polishingGel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Amalgam createAmalgam() {
		AmalgamImpl amalgam = new AmalgamImpl();
		return amalgam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoldCrown createGoldCrown() {
		GoldCrownImpl goldCrown = new GoldCrownImpl();
		return goldCrown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Crown createCrown() {
		CrownImpl crown = new CrownImpl();
		return crown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scaling createScaling() {
		ScalingImpl scaling = new ScalingImpl();
		return scaling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Filling createFilling() {
		FillingImpl filling = new FillingImpl();
		return filling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Checkup createCheckup() {
		CheckupImpl checkup = new CheckupImpl();
		return checkup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MinorSurgery createMinorSurgery() {
		MinorSurgeryImpl minorSurgery = new MinorSurgeryImpl();
		return minorSurgery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApptStatus createApptStatusFromString(EDataType eDataType, String initialValue) {
		ApptStatus result = ApptStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertApptStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClientType createClientTypeFromString(EDataType eDataType, String initialValue) {
		ClientType result = ClientType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClientTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map createscheduleFromString(EDataType eDataType, String initialValue) {
		return (Map)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertscheduleToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DentalclinicPackage getDentalclinicPackage() {
		return (DentalclinicPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DentalclinicPackage getPackage() {
		return DentalclinicPackage.eINSTANCE;
	}

} //DentalclinicFactoryImpl
