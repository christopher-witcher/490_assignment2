/**
 */
package dentalclinic;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see dentalclinic.DentalclinicFactory
 * @model kind="package"
 * @generated
 */
public interface DentalclinicPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dentalclinic";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://dentalclinic/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dentalclinic";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DentalclinicPackage eINSTANCE = dentalclinic.impl.DentalclinicPackageImpl.init();

	/**
	 * The meta object id for the '{@link dentalclinic.impl.AppointmentImpl <em>Appointment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dentalclinic.impl.AppointmentImpl
	 * @see dentalclinic.impl.DentalclinicPackageImpl#getAppointment()
	 * @generated
	 */
	int APPOINTMENT = 0;

	/**
	 * The feature id for the '<em><b>Treatments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPOINTMENT__TREATMENTS = 0;

	/**
	 * The feature id for the '<em><b>Dentist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPOINTMENT__DENTIST = 1;

	/**
	 * The feature id for the '<em><b>Products</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPOINTMENT__PRODUCTS = 2;

	/**
	 * The feature id for the '<em><b>Client</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPOINTMENT__CLIENT = 3;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPOINTMENT__COST = 4;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPOINTMENT__DATE = 5;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPOINTMENT__STATUS = 6;

	/**
	 * The feature id for the '<em><b>Time Slots</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPOINTMENT__TIME_SLOTS = 7;

	/**
	 * The number of structural features of the '<em>Appointment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPOINTMENT_FEATURE_COUNT = 8;

	/**
	 * The operation id for the '<em>Calc Cost</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPOINTMENT___CALC_COST = 0;

	/**
	 * The number of operations of the '<em>Appointment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPOINTMENT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link dentalclinic.impl.TreatmentImpl <em>Treatment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dentalclinic.impl.TreatmentImpl
	 * @see dentalclinic.impl.DentalclinicPackageImpl#getTreatment()
	 * @generated
	 */
	int TREATMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT__PRICE = 1;

	/**
	 * The feature id for the '<em><b>Time Slots</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT__TIME_SLOTS = 2;

	/**
	 * The feature id for the '<em><b>Product</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT__PRODUCT = 3;

	/**
	 * The number of structural features of the '<em>Treatment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Calc Total Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT___CALC_TOTAL_PRICE = 0;

	/**
	 * The number of operations of the '<em>Treatment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREATMENT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link dentalclinic.impl.DentistImpl <em>Dentist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dentalclinic.impl.DentistImpl
	 * @see dentalclinic.impl.DentalclinicPackageImpl#getDentist()
	 * @generated
	 */
	int DENTIST = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENTIST__NAME = 0;

	/**
	 * The feature id for the '<em><b>Schedule</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENTIST__SCHEDULE = 1;

	/**
	 * The feature id for the '<em><b>Pref Dentist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENTIST__PREF_DENTIST = 2;

	/**
	 * The number of structural features of the '<em>Dentist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENTIST_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Dentist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENTIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dentalclinic.impl.ProductImpl <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dentalclinic.impl.ProductImpl
	 * @see dentalclinic.impl.DentalclinicPackageImpl#getProduct()
	 * @generated
	 */
	int PRODUCT = 3;

	/**
	 * The feature id for the '<em><b>Customer Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__CUSTOMER_COST = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Treatment Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__TREATMENT_COST = 2;

	/**
	 * The number of structural features of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dentalclinic.impl.ClientImpl <em>Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dentalclinic.impl.ClientImpl
	 * @see dentalclinic.impl.DentalclinicPackageImpl#getClient()
	 * @generated
	 */
	int CLIENT = 4;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__ADDRESS = 0;

	/**
	 * The feature id for the '<em><b>Client Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__CLIENT_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Delta Care Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__DELTA_CARE_NUM = 2;

	/**
	 * The feature id for the '<em><b>Last Appt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__LAST_APPT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__NAME = 4;

	/**
	 * The number of structural features of the '<em>Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dentalclinic.impl.PolishingGelImpl <em>Polishing Gel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dentalclinic.impl.PolishingGelImpl
	 * @see dentalclinic.impl.DentalclinicPackageImpl#getPolishingGel()
	 * @generated
	 */
	int POLISHING_GEL = 5;

	/**
	 * The feature id for the '<em><b>Customer Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLISHING_GEL__CUSTOMER_COST = PRODUCT__CUSTOMER_COST;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLISHING_GEL__NAME = PRODUCT__NAME;

	/**
	 * The feature id for the '<em><b>Treatment Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLISHING_GEL__TREATMENT_COST = PRODUCT__TREATMENT_COST;

	/**
	 * The feature id for the '<em><b>Bottle Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLISHING_GEL__BOTTLE_COST = PRODUCT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Polishing Gel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLISHING_GEL_FEATURE_COUNT = PRODUCT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Polishing Gel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLISHING_GEL_OPERATION_COUNT = PRODUCT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dentalclinic.impl.AmalgamImpl <em>Amalgam</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dentalclinic.impl.AmalgamImpl
	 * @see dentalclinic.impl.DentalclinicPackageImpl#getAmalgam()
	 * @generated
	 */
	int AMALGAM = 6;

	/**
	 * The feature id for the '<em><b>Customer Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMALGAM__CUSTOMER_COST = PRODUCT__CUSTOMER_COST;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMALGAM__NAME = PRODUCT__NAME;

	/**
	 * The feature id for the '<em><b>Treatment Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMALGAM__TREATMENT_COST = PRODUCT__TREATMENT_COST;

	/**
	 * The number of structural features of the '<em>Amalgam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMALGAM_FEATURE_COUNT = PRODUCT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Amalgam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMALGAM_OPERATION_COUNT = PRODUCT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dentalclinic.impl.GoldCrownImpl <em>Gold Crown</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dentalclinic.impl.GoldCrownImpl
	 * @see dentalclinic.impl.DentalclinicPackageImpl#getGoldCrown()
	 * @generated
	 */
	int GOLD_CROWN = 7;

	/**
	 * The feature id for the '<em><b>Customer Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOLD_CROWN__CUSTOMER_COST = PRODUCT__CUSTOMER_COST;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOLD_CROWN__NAME = PRODUCT__NAME;

	/**
	 * The feature id for the '<em><b>Treatment Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOLD_CROWN__TREATMENT_COST = PRODUCT__TREATMENT_COST;

	/**
	 * The number of structural features of the '<em>Gold Crown</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOLD_CROWN_FEATURE_COUNT = PRODUCT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Gold Crown</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOLD_CROWN_OPERATION_COUNT = PRODUCT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dentalclinic.impl.CrownImpl <em>Crown</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dentalclinic.impl.CrownImpl
	 * @see dentalclinic.impl.DentalclinicPackageImpl#getCrown()
	 * @generated
	 */
	int CROWN = 8;

	/**
	 * The feature id for the '<em><b>Customer Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROWN__CUSTOMER_COST = PRODUCT__CUSTOMER_COST;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROWN__NAME = PRODUCT__NAME;

	/**
	 * The feature id for the '<em><b>Treatment Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROWN__TREATMENT_COST = PRODUCT__TREATMENT_COST;

	/**
	 * The number of structural features of the '<em>Crown</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROWN_FEATURE_COUNT = PRODUCT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Crown</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROWN_OPERATION_COUNT = PRODUCT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dentalclinic.impl.ScalingImpl <em>Scaling</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dentalclinic.impl.ScalingImpl
	 * @see dentalclinic.impl.DentalclinicPackageImpl#getScaling()
	 * @generated
	 */
	int SCALING = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING__NAME = TREATMENT__NAME;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING__PRICE = TREATMENT__PRICE;

	/**
	 * The feature id for the '<em><b>Time Slots</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING__TIME_SLOTS = TREATMENT__TIME_SLOTS;

	/**
	 * The feature id for the '<em><b>Product</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING__PRODUCT = TREATMENT__PRODUCT;

	/**
	 * The number of structural features of the '<em>Scaling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING_FEATURE_COUNT = TREATMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Calc Total Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING___CALC_TOTAL_PRICE = TREATMENT___CALC_TOTAL_PRICE;

	/**
	 * The number of operations of the '<em>Scaling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING_OPERATION_COUNT = TREATMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dentalclinic.impl.FillingImpl <em>Filling</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dentalclinic.impl.FillingImpl
	 * @see dentalclinic.impl.DentalclinicPackageImpl#getFilling()
	 * @generated
	 */
	int FILLING = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILLING__NAME = TREATMENT__NAME;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILLING__PRICE = TREATMENT__PRICE;

	/**
	 * The feature id for the '<em><b>Time Slots</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILLING__TIME_SLOTS = TREATMENT__TIME_SLOTS;

	/**
	 * The feature id for the '<em><b>Product</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILLING__PRODUCT = TREATMENT__PRODUCT;

	/**
	 * The number of structural features of the '<em>Filling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILLING_FEATURE_COUNT = TREATMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Calc Total Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILLING___CALC_TOTAL_PRICE = TREATMENT___CALC_TOTAL_PRICE;

	/**
	 * The number of operations of the '<em>Filling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILLING_OPERATION_COUNT = TREATMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dentalclinic.impl.CheckupImpl <em>Checkup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dentalclinic.impl.CheckupImpl
	 * @see dentalclinic.impl.DentalclinicPackageImpl#getCheckup()
	 * @generated
	 */
	int CHECKUP = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKUP__NAME = TREATMENT__NAME;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKUP__PRICE = TREATMENT__PRICE;

	/**
	 * The feature id for the '<em><b>Time Slots</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKUP__TIME_SLOTS = TREATMENT__TIME_SLOTS;

	/**
	 * The feature id for the '<em><b>Product</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKUP__PRODUCT = TREATMENT__PRODUCT;

	/**
	 * The number of structural features of the '<em>Checkup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKUP_FEATURE_COUNT = TREATMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Calc Total Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKUP___CALC_TOTAL_PRICE = TREATMENT___CALC_TOTAL_PRICE;

	/**
	 * The number of operations of the '<em>Checkup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKUP_OPERATION_COUNT = TREATMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dentalclinic.impl.MinorSurgeryImpl <em>Minor Surgery</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dentalclinic.impl.MinorSurgeryImpl
	 * @see dentalclinic.impl.DentalclinicPackageImpl#getMinorSurgery()
	 * @generated
	 */
	int MINOR_SURGERY = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINOR_SURGERY__NAME = TREATMENT__NAME;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINOR_SURGERY__PRICE = TREATMENT__PRICE;

	/**
	 * The feature id for the '<em><b>Time Slots</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINOR_SURGERY__TIME_SLOTS = TREATMENT__TIME_SLOTS;

	/**
	 * The feature id for the '<em><b>Product</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINOR_SURGERY__PRODUCT = TREATMENT__PRODUCT;

	/**
	 * The number of structural features of the '<em>Minor Surgery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINOR_SURGERY_FEATURE_COUNT = TREATMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Calc Total Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINOR_SURGERY___CALC_TOTAL_PRICE = TREATMENT___CALC_TOTAL_PRICE;

	/**
	 * The number of operations of the '<em>Minor Surgery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINOR_SURGERY_OPERATION_COUNT = TREATMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dentalclinic.ApptStatus <em>Appt Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dentalclinic.ApptStatus
	 * @see dentalclinic.impl.DentalclinicPackageImpl#getApptStatus()
	 * @generated
	 */
	int APPT_STATUS = 13;

	/**
	 * The meta object id for the '{@link dentalclinic.ClientType <em>Client Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dentalclinic.ClientType
	 * @see dentalclinic.impl.DentalclinicPackageImpl#getClientType()
	 * @generated
	 */
	int CLIENT_TYPE = 14;

	/**
	 * The meta object id for the '<em>schedule</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Map
	 * @see dentalclinic.impl.DentalclinicPackageImpl#getschedule()
	 * @generated
	 */
	int SCHEDULE = 15;


	/**
	 * Returns the meta object for class '{@link dentalclinic.Appointment <em>Appointment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Appointment</em>'.
	 * @see dentalclinic.Appointment
	 * @generated
	 */
	EClass getAppointment();

	/**
	 * Returns the meta object for the containment reference list '{@link dentalclinic.Appointment#getTreatments <em>Treatments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Treatments</em>'.
	 * @see dentalclinic.Appointment#getTreatments()
	 * @see #getAppointment()
	 * @generated
	 */
	EReference getAppointment_Treatments();

	/**
	 * Returns the meta object for the containment reference '{@link dentalclinic.Appointment#getDentist <em>Dentist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dentist</em>'.
	 * @see dentalclinic.Appointment#getDentist()
	 * @see #getAppointment()
	 * @generated
	 */
	EReference getAppointment_Dentist();

	/**
	 * Returns the meta object for the containment reference list '{@link dentalclinic.Appointment#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Products</em>'.
	 * @see dentalclinic.Appointment#getProducts()
	 * @see #getAppointment()
	 * @generated
	 */
	EReference getAppointment_Products();

	/**
	 * Returns the meta object for the containment reference '{@link dentalclinic.Appointment#getClient <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Client</em>'.
	 * @see dentalclinic.Appointment#getClient()
	 * @see #getAppointment()
	 * @generated
	 */
	EReference getAppointment_Client();

	/**
	 * Returns the meta object for the attribute '{@link dentalclinic.Appointment#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see dentalclinic.Appointment#getCost()
	 * @see #getAppointment()
	 * @generated
	 */
	EAttribute getAppointment_Cost();

	/**
	 * Returns the meta object for the attribute '{@link dentalclinic.Appointment#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see dentalclinic.Appointment#getDate()
	 * @see #getAppointment()
	 * @generated
	 */
	EAttribute getAppointment_Date();

	/**
	 * Returns the meta object for the attribute '{@link dentalclinic.Appointment#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see dentalclinic.Appointment#getStatus()
	 * @see #getAppointment()
	 * @generated
	 */
	EAttribute getAppointment_Status();

	/**
	 * Returns the meta object for the attribute list '{@link dentalclinic.Appointment#getTimeSlots <em>Time Slots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Time Slots</em>'.
	 * @see dentalclinic.Appointment#getTimeSlots()
	 * @see #getAppointment()
	 * @generated
	 */
	EAttribute getAppointment_TimeSlots();

	/**
	 * Returns the meta object for the '{@link dentalclinic.Appointment#calcCost() <em>Calc Cost</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calc Cost</em>' operation.
	 * @see dentalclinic.Appointment#calcCost()
	 * @generated
	 */
	EOperation getAppointment__CalcCost();

	/**
	 * Returns the meta object for class '{@link dentalclinic.Treatment <em>Treatment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Treatment</em>'.
	 * @see dentalclinic.Treatment
	 * @generated
	 */
	EClass getTreatment();

	/**
	 * Returns the meta object for the attribute '{@link dentalclinic.Treatment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dentalclinic.Treatment#getName()
	 * @see #getTreatment()
	 * @generated
	 */
	EAttribute getTreatment_Name();

	/**
	 * Returns the meta object for the attribute '{@link dentalclinic.Treatment#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see dentalclinic.Treatment#getPrice()
	 * @see #getTreatment()
	 * @generated
	 */
	EAttribute getTreatment_Price();

	/**
	 * Returns the meta object for the attribute '{@link dentalclinic.Treatment#getTimeSlots <em>Time Slots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Slots</em>'.
	 * @see dentalclinic.Treatment#getTimeSlots()
	 * @see #getTreatment()
	 * @generated
	 */
	EAttribute getTreatment_TimeSlots();

	/**
	 * Returns the meta object for the containment reference list '{@link dentalclinic.Treatment#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Product</em>'.
	 * @see dentalclinic.Treatment#getProduct()
	 * @see #getTreatment()
	 * @generated
	 */
	EReference getTreatment_Product();

	/**
	 * Returns the meta object for the '{@link dentalclinic.Treatment#calcTotalPrice() <em>Calc Total Price</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calc Total Price</em>' operation.
	 * @see dentalclinic.Treatment#calcTotalPrice()
	 * @generated
	 */
	EOperation getTreatment__CalcTotalPrice();

	/**
	 * Returns the meta object for class '{@link dentalclinic.Dentist <em>Dentist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dentist</em>'.
	 * @see dentalclinic.Dentist
	 * @generated
	 */
	EClass getDentist();

	/**
	 * Returns the meta object for the attribute '{@link dentalclinic.Dentist#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dentalclinic.Dentist#getName()
	 * @see #getDentist()
	 * @generated
	 */
	EAttribute getDentist_Name();

	/**
	 * Returns the meta object for the attribute list '{@link dentalclinic.Dentist#getSchedule <em>Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Schedule</em>'.
	 * @see dentalclinic.Dentist#getSchedule()
	 * @see #getDentist()
	 * @generated
	 */
	EAttribute getDentist_Schedule();

	/**
	 * Returns the meta object for the containment reference '{@link dentalclinic.Dentist#getPrefDentist <em>Pref Dentist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pref Dentist</em>'.
	 * @see dentalclinic.Dentist#getPrefDentist()
	 * @see #getDentist()
	 * @generated
	 */
	EReference getDentist_PrefDentist();

	/**
	 * Returns the meta object for class '{@link dentalclinic.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product</em>'.
	 * @see dentalclinic.Product
	 * @generated
	 */
	EClass getProduct();

	/**
	 * Returns the meta object for the attribute '{@link dentalclinic.Product#getCustomerCost <em>Customer Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customer Cost</em>'.
	 * @see dentalclinic.Product#getCustomerCost()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_CustomerCost();

	/**
	 * Returns the meta object for the attribute '{@link dentalclinic.Product#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dentalclinic.Product#getName()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Name();

	/**
	 * Returns the meta object for the attribute '{@link dentalclinic.Product#getTreatmentCost <em>Treatment Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Treatment Cost</em>'.
	 * @see dentalclinic.Product#getTreatmentCost()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_TreatmentCost();

	/**
	 * Returns the meta object for class '{@link dentalclinic.Client <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Client</em>'.
	 * @see dentalclinic.Client
	 * @generated
	 */
	EClass getClient();

	/**
	 * Returns the meta object for the attribute '{@link dentalclinic.Client#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see dentalclinic.Client#getAddress()
	 * @see #getClient()
	 * @generated
	 */
	EAttribute getClient_Address();

	/**
	 * Returns the meta object for the attribute '{@link dentalclinic.Client#getClientType <em>Client Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Client Type</em>'.
	 * @see dentalclinic.Client#getClientType()
	 * @see #getClient()
	 * @generated
	 */
	EAttribute getClient_ClientType();

	/**
	 * Returns the meta object for the attribute '{@link dentalclinic.Client#getDeltaCareNum <em>Delta Care Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delta Care Num</em>'.
	 * @see dentalclinic.Client#getDeltaCareNum()
	 * @see #getClient()
	 * @generated
	 */
	EAttribute getClient_DeltaCareNum();

	/**
	 * Returns the meta object for the attribute '{@link dentalclinic.Client#getLastAppt <em>Last Appt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Appt</em>'.
	 * @see dentalclinic.Client#getLastAppt()
	 * @see #getClient()
	 * @generated
	 */
	EAttribute getClient_LastAppt();

	/**
	 * Returns the meta object for the attribute '{@link dentalclinic.Client#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dentalclinic.Client#getName()
	 * @see #getClient()
	 * @generated
	 */
	EAttribute getClient_Name();

	/**
	 * Returns the meta object for class '{@link dentalclinic.PolishingGel <em>Polishing Gel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polishing Gel</em>'.
	 * @see dentalclinic.PolishingGel
	 * @generated
	 */
	EClass getPolishingGel();

	/**
	 * Returns the meta object for the attribute '{@link dentalclinic.PolishingGel#getBottleCost <em>Bottle Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bottle Cost</em>'.
	 * @see dentalclinic.PolishingGel#getBottleCost()
	 * @see #getPolishingGel()
	 * @generated
	 */
	EAttribute getPolishingGel_BottleCost();

	/**
	 * Returns the meta object for class '{@link dentalclinic.Amalgam <em>Amalgam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Amalgam</em>'.
	 * @see dentalclinic.Amalgam
	 * @generated
	 */
	EClass getAmalgam();

	/**
	 * Returns the meta object for class '{@link dentalclinic.GoldCrown <em>Gold Crown</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gold Crown</em>'.
	 * @see dentalclinic.GoldCrown
	 * @generated
	 */
	EClass getGoldCrown();

	/**
	 * Returns the meta object for class '{@link dentalclinic.Crown <em>Crown</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Crown</em>'.
	 * @see dentalclinic.Crown
	 * @generated
	 */
	EClass getCrown();

	/**
	 * Returns the meta object for class '{@link dentalclinic.Scaling <em>Scaling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scaling</em>'.
	 * @see dentalclinic.Scaling
	 * @generated
	 */
	EClass getScaling();

	/**
	 * Returns the meta object for class '{@link dentalclinic.Filling <em>Filling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filling</em>'.
	 * @see dentalclinic.Filling
	 * @generated
	 */
	EClass getFilling();

	/**
	 * Returns the meta object for class '{@link dentalclinic.Checkup <em>Checkup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Checkup</em>'.
	 * @see dentalclinic.Checkup
	 * @generated
	 */
	EClass getCheckup();

	/**
	 * Returns the meta object for class '{@link dentalclinic.MinorSurgery <em>Minor Surgery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Minor Surgery</em>'.
	 * @see dentalclinic.MinorSurgery
	 * @generated
	 */
	EClass getMinorSurgery();

	/**
	 * Returns the meta object for enum '{@link dentalclinic.ApptStatus <em>Appt Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Appt Status</em>'.
	 * @see dentalclinic.ApptStatus
	 * @generated
	 */
	EEnum getApptStatus();

	/**
	 * Returns the meta object for enum '{@link dentalclinic.ClientType <em>Client Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Client Type</em>'.
	 * @see dentalclinic.ClientType
	 * @generated
	 */
	EEnum getClientType();

	/**
	 * Returns the meta object for data type '{@link java.util.Map <em>schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>schedule</em>'.
	 * @see java.util.Map
	 * @model instanceClass="java.util.Map"
	 * @generated
	 */
	EDataType getschedule();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DentalclinicFactory getDentalclinicFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link dentalclinic.impl.AppointmentImpl <em>Appointment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dentalclinic.impl.AppointmentImpl
		 * @see dentalclinic.impl.DentalclinicPackageImpl#getAppointment()
		 * @generated
		 */
		EClass APPOINTMENT = eINSTANCE.getAppointment();

		/**
		 * The meta object literal for the '<em><b>Treatments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPOINTMENT__TREATMENTS = eINSTANCE.getAppointment_Treatments();

		/**
		 * The meta object literal for the '<em><b>Dentist</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPOINTMENT__DENTIST = eINSTANCE.getAppointment_Dentist();

		/**
		 * The meta object literal for the '<em><b>Products</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPOINTMENT__PRODUCTS = eINSTANCE.getAppointment_Products();

		/**
		 * The meta object literal for the '<em><b>Client</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPOINTMENT__CLIENT = eINSTANCE.getAppointment_Client();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPOINTMENT__COST = eINSTANCE.getAppointment_Cost();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPOINTMENT__DATE = eINSTANCE.getAppointment_Date();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPOINTMENT__STATUS = eINSTANCE.getAppointment_Status();

		/**
		 * The meta object literal for the '<em><b>Time Slots</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPOINTMENT__TIME_SLOTS = eINSTANCE.getAppointment_TimeSlots();

		/**
		 * The meta object literal for the '<em><b>Calc Cost</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APPOINTMENT___CALC_COST = eINSTANCE.getAppointment__CalcCost();

		/**
		 * The meta object literal for the '{@link dentalclinic.impl.TreatmentImpl <em>Treatment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dentalclinic.impl.TreatmentImpl
		 * @see dentalclinic.impl.DentalclinicPackageImpl#getTreatment()
		 * @generated
		 */
		EClass TREATMENT = eINSTANCE.getTreatment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TREATMENT__NAME = eINSTANCE.getTreatment_Name();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TREATMENT__PRICE = eINSTANCE.getTreatment_Price();

		/**
		 * The meta object literal for the '<em><b>Time Slots</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TREATMENT__TIME_SLOTS = eINSTANCE.getTreatment_TimeSlots();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TREATMENT__PRODUCT = eINSTANCE.getTreatment_Product();

		/**
		 * The meta object literal for the '<em><b>Calc Total Price</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TREATMENT___CALC_TOTAL_PRICE = eINSTANCE.getTreatment__CalcTotalPrice();

		/**
		 * The meta object literal for the '{@link dentalclinic.impl.DentistImpl <em>Dentist</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dentalclinic.impl.DentistImpl
		 * @see dentalclinic.impl.DentalclinicPackageImpl#getDentist()
		 * @generated
		 */
		EClass DENTIST = eINSTANCE.getDentist();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENTIST__NAME = eINSTANCE.getDentist_Name();

		/**
		 * The meta object literal for the '<em><b>Schedule</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENTIST__SCHEDULE = eINSTANCE.getDentist_Schedule();

		/**
		 * The meta object literal for the '<em><b>Pref Dentist</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DENTIST__PREF_DENTIST = eINSTANCE.getDentist_PrefDentist();

		/**
		 * The meta object literal for the '{@link dentalclinic.impl.ProductImpl <em>Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dentalclinic.impl.ProductImpl
		 * @see dentalclinic.impl.DentalclinicPackageImpl#getProduct()
		 * @generated
		 */
		EClass PRODUCT = eINSTANCE.getProduct();

		/**
		 * The meta object literal for the '<em><b>Customer Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__CUSTOMER_COST = eINSTANCE.getProduct_CustomerCost();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__NAME = eINSTANCE.getProduct_Name();

		/**
		 * The meta object literal for the '<em><b>Treatment Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__TREATMENT_COST = eINSTANCE.getProduct_TreatmentCost();

		/**
		 * The meta object literal for the '{@link dentalclinic.impl.ClientImpl <em>Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dentalclinic.impl.ClientImpl
		 * @see dentalclinic.impl.DentalclinicPackageImpl#getClient()
		 * @generated
		 */
		EClass CLIENT = eINSTANCE.getClient();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENT__ADDRESS = eINSTANCE.getClient_Address();

		/**
		 * The meta object literal for the '<em><b>Client Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENT__CLIENT_TYPE = eINSTANCE.getClient_ClientType();

		/**
		 * The meta object literal for the '<em><b>Delta Care Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENT__DELTA_CARE_NUM = eINSTANCE.getClient_DeltaCareNum();

		/**
		 * The meta object literal for the '<em><b>Last Appt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENT__LAST_APPT = eINSTANCE.getClient_LastAppt();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENT__NAME = eINSTANCE.getClient_Name();

		/**
		 * The meta object literal for the '{@link dentalclinic.impl.PolishingGelImpl <em>Polishing Gel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dentalclinic.impl.PolishingGelImpl
		 * @see dentalclinic.impl.DentalclinicPackageImpl#getPolishingGel()
		 * @generated
		 */
		EClass POLISHING_GEL = eINSTANCE.getPolishingGel();

		/**
		 * The meta object literal for the '<em><b>Bottle Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLISHING_GEL__BOTTLE_COST = eINSTANCE.getPolishingGel_BottleCost();

		/**
		 * The meta object literal for the '{@link dentalclinic.impl.AmalgamImpl <em>Amalgam</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dentalclinic.impl.AmalgamImpl
		 * @see dentalclinic.impl.DentalclinicPackageImpl#getAmalgam()
		 * @generated
		 */
		EClass AMALGAM = eINSTANCE.getAmalgam();

		/**
		 * The meta object literal for the '{@link dentalclinic.impl.GoldCrownImpl <em>Gold Crown</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dentalclinic.impl.GoldCrownImpl
		 * @see dentalclinic.impl.DentalclinicPackageImpl#getGoldCrown()
		 * @generated
		 */
		EClass GOLD_CROWN = eINSTANCE.getGoldCrown();

		/**
		 * The meta object literal for the '{@link dentalclinic.impl.CrownImpl <em>Crown</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dentalclinic.impl.CrownImpl
		 * @see dentalclinic.impl.DentalclinicPackageImpl#getCrown()
		 * @generated
		 */
		EClass CROWN = eINSTANCE.getCrown();

		/**
		 * The meta object literal for the '{@link dentalclinic.impl.ScalingImpl <em>Scaling</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dentalclinic.impl.ScalingImpl
		 * @see dentalclinic.impl.DentalclinicPackageImpl#getScaling()
		 * @generated
		 */
		EClass SCALING = eINSTANCE.getScaling();

		/**
		 * The meta object literal for the '{@link dentalclinic.impl.FillingImpl <em>Filling</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dentalclinic.impl.FillingImpl
		 * @see dentalclinic.impl.DentalclinicPackageImpl#getFilling()
		 * @generated
		 */
		EClass FILLING = eINSTANCE.getFilling();

		/**
		 * The meta object literal for the '{@link dentalclinic.impl.CheckupImpl <em>Checkup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dentalclinic.impl.CheckupImpl
		 * @see dentalclinic.impl.DentalclinicPackageImpl#getCheckup()
		 * @generated
		 */
		EClass CHECKUP = eINSTANCE.getCheckup();

		/**
		 * The meta object literal for the '{@link dentalclinic.impl.MinorSurgeryImpl <em>Minor Surgery</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dentalclinic.impl.MinorSurgeryImpl
		 * @see dentalclinic.impl.DentalclinicPackageImpl#getMinorSurgery()
		 * @generated
		 */
		EClass MINOR_SURGERY = eINSTANCE.getMinorSurgery();

		/**
		 * The meta object literal for the '{@link dentalclinic.ApptStatus <em>Appt Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dentalclinic.ApptStatus
		 * @see dentalclinic.impl.DentalclinicPackageImpl#getApptStatus()
		 * @generated
		 */
		EEnum APPT_STATUS = eINSTANCE.getApptStatus();

		/**
		 * The meta object literal for the '{@link dentalclinic.ClientType <em>Client Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dentalclinic.ClientType
		 * @see dentalclinic.impl.DentalclinicPackageImpl#getClientType()
		 * @generated
		 */
		EEnum CLIENT_TYPE = eINSTANCE.getClientType();

		/**
		 * The meta object literal for the '<em>schedule</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Map
		 * @see dentalclinic.impl.DentalclinicPackageImpl#getschedule()
		 * @generated
		 */
		EDataType SCHEDULE = eINSTANCE.getschedule();

	}

} //DentalclinicPackage
