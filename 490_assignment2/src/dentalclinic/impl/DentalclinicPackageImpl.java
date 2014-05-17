/**
 */
package dentalclinic.impl;

import dentalclinic.Amalgam;
import dentalclinic.Appointment;
import dentalclinic.ApptStatus;
import dentalclinic.Checkup;
import dentalclinic.Client;
import dentalclinic.ClientType;
import dentalclinic.Crown;
import dentalclinic.DentalclinicFactory;
import dentalclinic.DentalclinicPackage;
import dentalclinic.Dentist;
import dentalclinic.Filling;
import dentalclinic.GoldCrown;
import dentalclinic.MinorSurgery;
import dentalclinic.PolishingGel;
import dentalclinic.Product;
import dentalclinic.Scaling;
import dentalclinic.Treatment;

import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DentalclinicPackageImpl extends EPackageImpl implements DentalclinicPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appointmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass treatmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dentistEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass polishingGelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass amalgamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goldCrownEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass crownEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scalingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fillingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minorSurgeryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum apptStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum clientTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType scheduleEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see dentalclinic.DentalclinicPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DentalclinicPackageImpl() {
		super(eNS_URI, DentalclinicFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DentalclinicPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DentalclinicPackage init() {
		if (isInited) return (DentalclinicPackage)EPackage.Registry.INSTANCE.getEPackage(DentalclinicPackage.eNS_URI);

		// Obtain or create and register package
		DentalclinicPackageImpl theDentalclinicPackage = (DentalclinicPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DentalclinicPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DentalclinicPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theDentalclinicPackage.createPackageContents();

		// Initialize created meta-data
		theDentalclinicPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDentalclinicPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DentalclinicPackage.eNS_URI, theDentalclinicPackage);
		return theDentalclinicPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAppointment() {
		return appointmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointment_Treatments() {
		return (EReference)appointmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointment_Dentist() {
		return (EReference)appointmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointment_Products() {
		return (EReference)appointmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointment_Client() {
		return (EReference)appointmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppointment_Cost() {
		return (EAttribute)appointmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppointment_Date() {
		return (EAttribute)appointmentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppointment_Status() {
		return (EAttribute)appointmentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppointment_TimeSlots() {
		return (EAttribute)appointmentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAppointment__CalcCost() {
		return appointmentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTreatment() {
		return treatmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTreatment_Name() {
		return (EAttribute)treatmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTreatment_Price() {
		return (EAttribute)treatmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTreatment_TimeSlots() {
		return (EAttribute)treatmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTreatment_Product() {
		return (EReference)treatmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTreatment__CalcTotalPrice() {
		return treatmentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDentist() {
		return dentistEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDentist_Name() {
		return (EAttribute)dentistEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDentist_Schedule() {
		return (EAttribute)dentistEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDentist_PrefDentist() {
		return (EReference)dentistEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProduct() {
		return productEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProduct_CustomerCost() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProduct_Name() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProduct_TreatmentCost() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClient() {
		return clientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClient_Address() {
		return (EAttribute)clientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClient_ClientType() {
		return (EAttribute)clientEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClient_DeltaCareNum() {
		return (EAttribute)clientEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClient_LastAppt() {
		return (EAttribute)clientEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClient_Name() {
		return (EAttribute)clientEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolishingGel() {
		return polishingGelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolishingGel_BottleCost() {
		return (EAttribute)polishingGelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAmalgam() {
		return amalgamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGoldCrown() {
		return goldCrownEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCrown() {
		return crownEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScaling() {
		return scalingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilling() {
		return fillingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCheckup() {
		return checkupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMinorSurgery() {
		return minorSurgeryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getApptStatus() {
		return apptStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getClientType() {
		return clientTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getschedule() {
		return scheduleEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DentalclinicFactory getDentalclinicFactory() {
		return (DentalclinicFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		appointmentEClass = createEClass(APPOINTMENT);
		createEReference(appointmentEClass, APPOINTMENT__TREATMENTS);
		createEReference(appointmentEClass, APPOINTMENT__DENTIST);
		createEReference(appointmentEClass, APPOINTMENT__PRODUCTS);
		createEReference(appointmentEClass, APPOINTMENT__CLIENT);
		createEAttribute(appointmentEClass, APPOINTMENT__COST);
		createEAttribute(appointmentEClass, APPOINTMENT__DATE);
		createEAttribute(appointmentEClass, APPOINTMENT__STATUS);
		createEAttribute(appointmentEClass, APPOINTMENT__TIME_SLOTS);
		createEOperation(appointmentEClass, APPOINTMENT___CALC_COST);

		treatmentEClass = createEClass(TREATMENT);
		createEAttribute(treatmentEClass, TREATMENT__NAME);
		createEAttribute(treatmentEClass, TREATMENT__PRICE);
		createEAttribute(treatmentEClass, TREATMENT__TIME_SLOTS);
		createEReference(treatmentEClass, TREATMENT__PRODUCT);
		createEOperation(treatmentEClass, TREATMENT___CALC_TOTAL_PRICE);

		dentistEClass = createEClass(DENTIST);
		createEAttribute(dentistEClass, DENTIST__NAME);
		createEAttribute(dentistEClass, DENTIST__SCHEDULE);
		createEReference(dentistEClass, DENTIST__PREF_DENTIST);

		productEClass = createEClass(PRODUCT);
		createEAttribute(productEClass, PRODUCT__CUSTOMER_COST);
		createEAttribute(productEClass, PRODUCT__NAME);
		createEAttribute(productEClass, PRODUCT__TREATMENT_COST);

		clientEClass = createEClass(CLIENT);
		createEAttribute(clientEClass, CLIENT__ADDRESS);
		createEAttribute(clientEClass, CLIENT__CLIENT_TYPE);
		createEAttribute(clientEClass, CLIENT__DELTA_CARE_NUM);
		createEAttribute(clientEClass, CLIENT__LAST_APPT);
		createEAttribute(clientEClass, CLIENT__NAME);

		polishingGelEClass = createEClass(POLISHING_GEL);
		createEAttribute(polishingGelEClass, POLISHING_GEL__BOTTLE_COST);

		amalgamEClass = createEClass(AMALGAM);

		goldCrownEClass = createEClass(GOLD_CROWN);

		crownEClass = createEClass(CROWN);

		scalingEClass = createEClass(SCALING);

		fillingEClass = createEClass(FILLING);

		checkupEClass = createEClass(CHECKUP);

		minorSurgeryEClass = createEClass(MINOR_SURGERY);

		// Create enums
		apptStatusEEnum = createEEnum(APPT_STATUS);
		clientTypeEEnum = createEEnum(CLIENT_TYPE);

		// Create data types
		scheduleEDataType = createEDataType(SCHEDULE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		polishingGelEClass.getESuperTypes().add(this.getProduct());
		amalgamEClass.getESuperTypes().add(this.getProduct());
		goldCrownEClass.getESuperTypes().add(this.getProduct());
		crownEClass.getESuperTypes().add(this.getProduct());
		scalingEClass.getESuperTypes().add(this.getTreatment());
		fillingEClass.getESuperTypes().add(this.getTreatment());
		checkupEClass.getESuperTypes().add(this.getTreatment());
		minorSurgeryEClass.getESuperTypes().add(this.getTreatment());

		// Initialize classes, features, and operations; add parameters
		initEClass(appointmentEClass, Appointment.class, "Appointment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAppointment_Treatments(), this.getTreatment(), null, "treatments", null, 1, -1, Appointment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAppointment_Dentist(), this.getDentist(), null, "dentist", null, 1, 1, Appointment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAppointment_Products(), this.getProduct(), null, "products", null, 1, -1, Appointment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAppointment_Client(), this.getClient(), null, "client", null, 1, 1, Appointment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppointment_Cost(), ecorePackage.getEInt(), "cost", null, 0, 1, Appointment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppointment_Date(), ecorePackage.getEDate(), "date", null, 0, 1, Appointment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppointment_Status(), this.getApptStatus(), "status", null, 0, 1, Appointment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppointment_TimeSlots(), ecorePackage.getEInt(), "timeSlots", null, 1, -1, Appointment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAppointment__CalcCost(), ecorePackage.getEInt(), "calcCost", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(treatmentEClass, Treatment.class, "Treatment", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTreatment_Name(), ecorePackage.getEString(), "name", null, 0, 1, Treatment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTreatment_Price(), ecorePackage.getEInt(), "price", null, 0, 1, Treatment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTreatment_TimeSlots(), ecorePackage.getEInt(), "timeSlots", null, 0, 1, Treatment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTreatment_Product(), this.getProduct(), null, "product", null, 1, -1, Treatment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTreatment__CalcTotalPrice(), ecorePackage.getEInt(), "calcTotalPrice", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dentistEClass, Dentist.class, "Dentist", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDentist_Name(), ecorePackage.getEString(), "name", null, 0, 1, Dentist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDentist_Schedule(), this.getschedule(), "schedule", null, 1, -1, Dentist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDentist_PrefDentist(), this.getClient(), null, "prefDentist", null, 0, 1, Dentist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productEClass, Product.class, "Product", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProduct_CustomerCost(), ecorePackage.getEInt(), "customerCost", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_Name(), ecorePackage.getEString(), "name", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_TreatmentCost(), ecorePackage.getEInt(), "treatmentCost", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clientEClass, Client.class, "Client", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClient_Address(), ecorePackage.getEString(), "address", null, 0, 1, Client.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClient_ClientType(), this.getClientType(), "clientType", null, 0, 1, Client.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClient_DeltaCareNum(), ecorePackage.getEInt(), "deltaCareNum", null, 0, 1, Client.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClient_LastAppt(), ecorePackage.getEDate(), "lastAppt", null, 0, 1, Client.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClient_Name(), ecorePackage.getEString(), "name", null, 0, 1, Client.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(polishingGelEClass, PolishingGel.class, "PolishingGel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPolishingGel_BottleCost(), ecorePackage.getEInt(), "bottleCost", null, 0, 1, PolishingGel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(amalgamEClass, Amalgam.class, "Amalgam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(goldCrownEClass, GoldCrown.class, "GoldCrown", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(crownEClass, Crown.class, "Crown", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(scalingEClass, Scaling.class, "Scaling", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fillingEClass, Filling.class, "Filling", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(checkupEClass, Checkup.class, "Checkup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(minorSurgeryEClass, MinorSurgery.class, "MinorSurgery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(apptStatusEEnum, ApptStatus.class, "ApptStatus");
		addEEnumLiteral(apptStatusEEnum, ApptStatus.ACTIVE);
		addEEnumLiteral(apptStatusEEnum, ApptStatus.CANCELLED);
		addEEnumLiteral(apptStatusEEnum, ApptStatus.PAST);

		initEEnum(clientTypeEEnum, ClientType.class, "ClientType");
		addEEnumLiteral(clientTypeEEnum, ClientType.DELTA_CARE);
		addEEnumLiteral(clientTypeEEnum, ClientType.INACTIVE);
		addEEnumLiteral(clientTypeEEnum, ClientType.PRIVATE);

		// Initialize data types
		initEDataType(scheduleEDataType, Map.class, "schedule", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //DentalclinicPackageImpl
