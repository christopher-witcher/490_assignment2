/**
 */
package dentalclinic;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Client</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dentalclinic.Client#getAddress <em>Address</em>}</li>
 *   <li>{@link dentalclinic.Client#getClientType <em>Client Type</em>}</li>
 *   <li>{@link dentalclinic.Client#getDeltaCareNum <em>Delta Care Num</em>}</li>
 *   <li>{@link dentalclinic.Client#getLastAppt <em>Last Appt</em>}</li>
 *   <li>{@link dentalclinic.Client#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see dentalclinic.DentalclinicPackage#getClient()
 * @model
 * @generated
 */
public interface Client extends EObject {
	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see dentalclinic.DentalclinicPackage#getClient_Address()
	 * @model
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link dentalclinic.Client#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Client Type</b></em>' attribute.
	 * The literals are from the enumeration {@link dentalclinic.ClientType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client Type</em>' attribute.
	 * @see dentalclinic.ClientType
	 * @see #setClientType(ClientType)
	 * @see dentalclinic.DentalclinicPackage#getClient_ClientType()
	 * @model
	 * @generated
	 */
	ClientType getClientType();

	/**
	 * Sets the value of the '{@link dentalclinic.Client#getClientType <em>Client Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Type</em>' attribute.
	 * @see dentalclinic.ClientType
	 * @see #getClientType()
	 * @generated
	 */
	void setClientType(ClientType value);

	/**
	 * Returns the value of the '<em><b>Delta Care Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delta Care Num</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delta Care Num</em>' attribute.
	 * @see #setDeltaCareNum(int)
	 * @see dentalclinic.DentalclinicPackage#getClient_DeltaCareNum()
	 * @model
	 * @generated
	 */
	int getDeltaCareNum();

	/**
	 * Sets the value of the '{@link dentalclinic.Client#getDeltaCareNum <em>Delta Care Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delta Care Num</em>' attribute.
	 * @see #getDeltaCareNum()
	 * @generated
	 */
	void setDeltaCareNum(int value);

	/**
	 * Returns the value of the '<em><b>Last Appt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Appt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Appt</em>' attribute.
	 * @see #setLastAppt(Date)
	 * @see dentalclinic.DentalclinicPackage#getClient_LastAppt()
	 * @model
	 * @generated
	 */
	Date getLastAppt();

	/**
	 * Sets the value of the '{@link dentalclinic.Client#getLastAppt <em>Last Appt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Appt</em>' attribute.
	 * @see #getLastAppt()
	 * @generated
	 */
	void setLastAppt(Date value);

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
	 * @see dentalclinic.DentalclinicPackage#getClient_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dentalclinic.Client#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Client
