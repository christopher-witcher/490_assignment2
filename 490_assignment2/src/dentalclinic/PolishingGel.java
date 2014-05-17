/**
 */
package dentalclinic;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Polishing Gel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dentalclinic.PolishingGel#getBottleCost <em>Bottle Cost</em>}</li>
 * </ul>
 * </p>
 *
 * @see dentalclinic.DentalclinicPackage#getPolishingGel()
 * @model
 * @generated
 */
public interface PolishingGel extends Product {
	/**
	 * Returns the value of the '<em><b>Bottle Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bottle Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bottle Cost</em>' attribute.
	 * @see #setBottleCost(int)
	 * @see dentalclinic.DentalclinicPackage#getPolishingGel_BottleCost()
	 * @model
	 * @generated
	 */
	int getBottleCost();

	/**
	 * Sets the value of the '{@link dentalclinic.PolishingGel#getBottleCost <em>Bottle Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bottle Cost</em>' attribute.
	 * @see #getBottleCost()
	 * @generated
	 */
	void setBottleCost(int value);

} // PolishingGel
