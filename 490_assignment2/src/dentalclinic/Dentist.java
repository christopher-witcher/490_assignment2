/**
 */
package dentalclinic;

import java.util.Map;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dentist</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dentalclinic.Dentist#getName <em>Name</em>}</li>
 *   <li>{@link dentalclinic.Dentist#getSchedule <em>Schedule</em>}</li>
 *   <li>{@link dentalclinic.Dentist#getPrefDentist <em>Pref Dentist</em>}</li>
 * </ul>
 * </p>
 *
 * @see dentalclinic.DentalclinicPackage#getDentist()
 * @model
 * @generated
 */
public interface Dentist extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see dentalclinic.DentalclinicPackage#getDentist_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dentalclinic.Dentist#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Schedule</b></em>' attribute list.
	 * The list contents are of type {@link java.util.Map}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedule</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedule</em>' attribute list.
	 * @see dentalclinic.DentalclinicPackage#getDentist_Schedule()
	 * @model dataType="dentalclinic.schedule" required="true"
	 * @generated
	 */
	EList<Map> getSchedule();

	/**
	 * Returns the value of the '<em><b>Pref Dentist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pref Dentist</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pref Dentist</em>' containment reference.
	 * @see #setPrefDentist(Client)
	 * @see dentalclinic.DentalclinicPackage#getDentist_PrefDentist()
	 * @model containment="true"
	 * @generated
	 */
	Client getPrefDentist();

	/**
	 * Sets the value of the '{@link dentalclinic.Dentist#getPrefDentist <em>Pref Dentist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pref Dentist</em>' containment reference.
	 * @see #getPrefDentist()
	 * @generated
	 */
	void setPrefDentist(Client value);

} // Dentist
