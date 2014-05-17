/**
 */
package dentalclinic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Appt Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see dentalclinic.DentalclinicPackage#getApptStatus()
 * @model
 * @generated
 */
public enum ApptStatus implements Enumerator {
	/**
	 * The '<em><b>Active</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTIVE_VALUE
	 * @generated
	 * @ordered
	 */
	ACTIVE(0, "active", "active"),

	/**
	 * The '<em><b>Cancelled</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CANCELLED_VALUE
	 * @generated
	 * @ordered
	 */
	CANCELLED(1, "cancelled", "cancelled"),

	/**
	 * The '<em><b>Past</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAST_VALUE
	 * @generated
	 * @ordered
	 */
	PAST(2, "past", "past");

	/**
	 * The '<em><b>Active</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Active</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACTIVE
	 * @model name="active"
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVE_VALUE = 0;

	/**
	 * The '<em><b>Cancelled</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cancelled</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CANCELLED
	 * @model name="cancelled"
	 * @generated
	 * @ordered
	 */
	public static final int CANCELLED_VALUE = 1;

	/**
	 * The '<em><b>Past</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Past</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PAST
	 * @model name="past"
	 * @generated
	 * @ordered
	 */
	public static final int PAST_VALUE = 2;

	/**
	 * An array of all the '<em><b>Appt Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ApptStatus[] VALUES_ARRAY =
		new ApptStatus[] {
			ACTIVE,
			CANCELLED,
			PAST,
		};

	/**
	 * A public read-only list of all the '<em><b>Appt Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ApptStatus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Appt Status</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApptStatus get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ApptStatus result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Appt Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApptStatus getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ApptStatus result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Appt Status</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApptStatus get(int value) {
		switch (value) {
			case ACTIVE_VALUE: return ACTIVE;
			case CANCELLED_VALUE: return CANCELLED;
			case PAST_VALUE: return PAST;
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
	private ApptStatus(int value, String name, String literal) {
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
	
} //ApptStatus
