/**
 */
package dentalclinic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Client Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see dentalclinic.DentalclinicPackage#getClientType()
 * @model
 * @generated
 */
public enum ClientType implements Enumerator {
	/**
	 * The '<em><b>Delta Care</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELTA_CARE_VALUE
	 * @generated
	 * @ordered
	 */
	DELTA_CARE(0, "deltaCare", "deltaCare"),

	/**
	 * The '<em><b>Inactive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INACTIVE_VALUE
	 * @generated
	 * @ordered
	 */
	INACTIVE(1, "inactive", "inactive"),

	/**
	 * The '<em><b>Private</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIVATE_VALUE
	 * @generated
	 * @ordered
	 */
	PRIVATE(2, "private", "private");

	/**
	 * The '<em><b>Delta Care</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Delta Care</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DELTA_CARE
	 * @model name="deltaCare"
	 * @generated
	 * @ordered
	 */
	public static final int DELTA_CARE_VALUE = 0;

	/**
	 * The '<em><b>Inactive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Inactive</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INACTIVE
	 * @model name="inactive"
	 * @generated
	 * @ordered
	 */
	public static final int INACTIVE_VALUE = 1;

	/**
	 * The '<em><b>Private</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Private</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRIVATE
	 * @model name="private"
	 * @generated
	 * @ordered
	 */
	public static final int PRIVATE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Client Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ClientType[] VALUES_ARRAY =
		new ClientType[] {
			DELTA_CARE,
			INACTIVE,
			PRIVATE,
		};

	/**
	 * A public read-only list of all the '<em><b>Client Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ClientType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Client Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ClientType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ClientType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Client Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ClientType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ClientType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Client Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ClientType get(int value) {
		switch (value) {
			case DELTA_CARE_VALUE: return DELTA_CARE;
			case INACTIVE_VALUE: return INACTIVE;
			case PRIVATE_VALUE: return PRIVATE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ClientType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ClientType
