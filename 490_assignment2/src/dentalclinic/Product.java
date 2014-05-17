/**
 */
package dentalclinic;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dentalclinic.Product#getCustomerCost <em>Customer Cost</em>}</li>
 *   <li>{@link dentalclinic.Product#getName <em>Name</em>}</li>
 *   <li>{@link dentalclinic.Product#getTreatmentCost <em>Treatment Cost</em>}</li>
 * </ul>
 * </p>
 *
 * @see dentalclinic.DentalclinicPackage#getProduct()
 * @model abstract="true"
 * @generated
 */
public interface Product extends EObject {
	/**
	 * Returns the value of the '<em><b>Customer Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Cost</em>' attribute.
	 * @see #setCustomerCost(int)
	 * @see dentalclinic.DentalclinicPackage#getProduct_CustomerCost()
	 * @model
	 * @generated
	 */
	int getCustomerCost();

	/**
	 * Sets the value of the '{@link dentalclinic.Product#getCustomerCost <em>Customer Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Cost</em>' attribute.
	 * @see #getCustomerCost()
	 * @generated
	 */
	void setCustomerCost(int value);

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
	 * @see dentalclinic.DentalclinicPackage#getProduct_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dentalclinic.Product#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Treatment Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Treatment Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Treatment Cost</em>' attribute.
	 * @see #setTreatmentCost(int)
	 * @see dentalclinic.DentalclinicPackage#getProduct_TreatmentCost()
	 * @model
	 * @generated
	 */
	int getTreatmentCost();

	/**
	 * Sets the value of the '{@link dentalclinic.Product#getTreatmentCost <em>Treatment Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Treatment Cost</em>' attribute.
	 * @see #getTreatmentCost()
	 * @generated
	 */
	void setTreatmentCost(int value);

} // Product
