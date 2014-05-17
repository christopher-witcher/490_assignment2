/**
 */
package dentalclinic.util;

import dentalclinic.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see dentalclinic.DentalclinicPackage
 * @generated
 */
public class DentalclinicAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DentalclinicPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DentalclinicAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DentalclinicPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DentalclinicSwitch<Adapter> modelSwitch =
		new DentalclinicSwitch<Adapter>() {
			@Override
			public Adapter caseAppointment(Appointment object) {
				return createAppointmentAdapter();
			}
			@Override
			public Adapter caseTreatment(Treatment object) {
				return createTreatmentAdapter();
			}
			@Override
			public Adapter caseDentist(Dentist object) {
				return createDentistAdapter();
			}
			@Override
			public Adapter caseProduct(Product object) {
				return createProductAdapter();
			}
			@Override
			public Adapter caseClient(Client object) {
				return createClientAdapter();
			}
			@Override
			public Adapter casePolishingGel(PolishingGel object) {
				return createPolishingGelAdapter();
			}
			@Override
			public Adapter caseAmalgam(Amalgam object) {
				return createAmalgamAdapter();
			}
			@Override
			public Adapter caseGoldCrown(GoldCrown object) {
				return createGoldCrownAdapter();
			}
			@Override
			public Adapter caseCrown(Crown object) {
				return createCrownAdapter();
			}
			@Override
			public Adapter caseScaling(Scaling object) {
				return createScalingAdapter();
			}
			@Override
			public Adapter caseFilling(Filling object) {
				return createFillingAdapter();
			}
			@Override
			public Adapter caseCheckup(Checkup object) {
				return createCheckupAdapter();
			}
			@Override
			public Adapter caseMinorSurgery(MinorSurgery object) {
				return createMinorSurgeryAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link dentalclinic.Appointment <em>Appointment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dentalclinic.Appointment
	 * @generated
	 */
	public Adapter createAppointmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dentalclinic.Treatment <em>Treatment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dentalclinic.Treatment
	 * @generated
	 */
	public Adapter createTreatmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dentalclinic.Dentist <em>Dentist</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dentalclinic.Dentist
	 * @generated
	 */
	public Adapter createDentistAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dentalclinic.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dentalclinic.Product
	 * @generated
	 */
	public Adapter createProductAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dentalclinic.Client <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dentalclinic.Client
	 * @generated
	 */
	public Adapter createClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dentalclinic.PolishingGel <em>Polishing Gel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dentalclinic.PolishingGel
	 * @generated
	 */
	public Adapter createPolishingGelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dentalclinic.Amalgam <em>Amalgam</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dentalclinic.Amalgam
	 * @generated
	 */
	public Adapter createAmalgamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dentalclinic.GoldCrown <em>Gold Crown</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dentalclinic.GoldCrown
	 * @generated
	 */
	public Adapter createGoldCrownAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dentalclinic.Crown <em>Crown</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dentalclinic.Crown
	 * @generated
	 */
	public Adapter createCrownAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dentalclinic.Scaling <em>Scaling</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dentalclinic.Scaling
	 * @generated
	 */
	public Adapter createScalingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dentalclinic.Filling <em>Filling</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dentalclinic.Filling
	 * @generated
	 */
	public Adapter createFillingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dentalclinic.Checkup <em>Checkup</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dentalclinic.Checkup
	 * @generated
	 */
	public Adapter createCheckupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dentalclinic.MinorSurgery <em>Minor Surgery</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dentalclinic.MinorSurgery
	 * @generated
	 */
	public Adapter createMinorSurgeryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DentalclinicAdapterFactory
