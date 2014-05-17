/**
 */
package dentalclinic;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Treatment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dentalclinic.Treatment#getName <em>Name</em>}</li>
 *   <li>{@link dentalclinic.Treatment#getPrice <em>Price</em>}</li>
 *   <li>{@link dentalclinic.Treatment#getTimeSlots <em>Time Slots</em>}</li>
 *   <li>{@link dentalclinic.Treatment#getProduct <em>Product</em>}</li>
 * </ul>
 * </p>
 *
 * @see dentalclinic.DentalclinicPackage#getTreatment()
 * @model abstract="true"
 * @generated
 */
public interface Treatment extends EObject {
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
	 * @see dentalclinic.DentalclinicPackage#getTreatment_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dentalclinic.Treatment#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' attribute.
	 * @see #setPrice(int)
	 * @see dentalclinic.DentalclinicPackage#getTreatment_Price()
	 * @model
	 * @generated
	 */
	int getPrice();

	/**
	 * Sets the value of the '{@link dentalclinic.Treatment#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(int value);

	/**
	 * Returns the value of the '<em><b>Time Slots</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Slots</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Slots</em>' attribute.
	 * @see #setTimeSlots(int)
	 * @see dentalclinic.DentalclinicPackage#getTreatment_TimeSlots()
	 * @model
	 * @generated
	 */
	int getTimeSlots();

	/**
	 * Sets the value of the '{@link dentalclinic.Treatment#getTimeSlots <em>Time Slots</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Slots</em>' attribute.
	 * @see #getTimeSlots()
	 * @generated
	 */
	void setTimeSlots(int value);

	/**
	 * Returns the value of the '<em><b>Product</b></em>' containment reference list.
	 * The list contents are of type {@link dentalclinic.Product}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' containment reference list.
	 * @see dentalclinic.DentalclinicPackage#getTreatment_Product()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Product> getProduct();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	int calcTotalPrice();

} // Treatment
