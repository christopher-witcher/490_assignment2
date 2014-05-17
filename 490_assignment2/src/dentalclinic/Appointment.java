/**
 */
package dentalclinic;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Appointment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dentalclinic.Appointment#getTreatments <em>Treatments</em>}</li>
 *   <li>{@link dentalclinic.Appointment#getDentist <em>Dentist</em>}</li>
 *   <li>{@link dentalclinic.Appointment#getProducts <em>Products</em>}</li>
 *   <li>{@link dentalclinic.Appointment#getClient <em>Client</em>}</li>
 *   <li>{@link dentalclinic.Appointment#getCost <em>Cost</em>}</li>
 *   <li>{@link dentalclinic.Appointment#getDate <em>Date</em>}</li>
 *   <li>{@link dentalclinic.Appointment#getStatus <em>Status</em>}</li>
 *   <li>{@link dentalclinic.Appointment#getTimeSlots <em>Time Slots</em>}</li>
 * </ul>
 * </p>
 *
 * @see dentalclinic.DentalclinicPackage#getAppointment()
 * @model
 * @generated
 */
public interface Appointment extends EObject {
	/**
	 * Returns the value of the '<em><b>Treatments</b></em>' containment reference list.
	 * The list contents are of type {@link dentalclinic.Treatment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Treatments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Treatments</em>' containment reference list.
	 * @see dentalclinic.DentalclinicPackage#getAppointment_Treatments()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Treatment> getTreatments();

	/**
	 * Returns the value of the '<em><b>Dentist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dentist</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dentist</em>' containment reference.
	 * @see #setDentist(Dentist)
	 * @see dentalclinic.DentalclinicPackage#getAppointment_Dentist()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Dentist getDentist();

	/**
	 * Sets the value of the '{@link dentalclinic.Appointment#getDentist <em>Dentist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dentist</em>' containment reference.
	 * @see #getDentist()
	 * @generated
	 */
	void setDentist(Dentist value);

	/**
	 * Returns the value of the '<em><b>Products</b></em>' containment reference list.
	 * The list contents are of type {@link dentalclinic.Product}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Products</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Products</em>' containment reference list.
	 * @see dentalclinic.DentalclinicPackage#getAppointment_Products()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Product> getProducts();

	/**
	 * Returns the value of the '<em><b>Client</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client</em>' containment reference.
	 * @see #setClient(Client)
	 * @see dentalclinic.DentalclinicPackage#getAppointment_Client()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Client getClient();

	/**
	 * Sets the value of the '{@link dentalclinic.Appointment#getClient <em>Client</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client</em>' containment reference.
	 * @see #getClient()
	 * @generated
	 */
	void setClient(Client value);

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(int)
	 * @see dentalclinic.DentalclinicPackage#getAppointment_Cost()
	 * @model
	 * @generated
	 */
	int getCost();

	/**
	 * Sets the value of the '{@link dentalclinic.Appointment#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(int value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see dentalclinic.DentalclinicPackage#getAppointment_Date()
	 * @model
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link dentalclinic.Appointment#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link dentalclinic.ApptStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see dentalclinic.ApptStatus
	 * @see #setStatus(ApptStatus)
	 * @see dentalclinic.DentalclinicPackage#getAppointment_Status()
	 * @model
	 * @generated
	 */
	ApptStatus getStatus();

	/**
	 * Sets the value of the '{@link dentalclinic.Appointment#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see dentalclinic.ApptStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(ApptStatus value);

	/**
	 * Returns the value of the '<em><b>Time Slots</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Slots</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Slots</em>' attribute list.
	 * @see dentalclinic.DentalclinicPackage#getAppointment_TimeSlots()
	 * @model required="true"
	 * @generated
	 */
	EList<Integer> getTimeSlots();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	int calcCost();

} // Appointment
