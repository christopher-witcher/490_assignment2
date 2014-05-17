/**
 */
package dentalclinic.provider;


import dentalclinic.Appointment;
import dentalclinic.DentalclinicFactory;
import dentalclinic.DentalclinicPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link dentalclinic.Appointment} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AppointmentItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppointmentItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addCostPropertyDescriptor(object);
			addDatePropertyDescriptor(object);
			addStatusPropertyDescriptor(object);
			addTimeSlotsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Cost feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCostPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Appointment_cost_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Appointment_cost_feature", "_UI_Appointment_type"),
				 DentalclinicPackage.Literals.APPOINTMENT__COST,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Appointment_date_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Appointment_date_feature", "_UI_Appointment_type"),
				 DentalclinicPackage.Literals.APPOINTMENT__DATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Status feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStatusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Appointment_status_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Appointment_status_feature", "_UI_Appointment_type"),
				 DentalclinicPackage.Literals.APPOINTMENT__STATUS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Time Slots feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimeSlotsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Appointment_timeSlots_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Appointment_timeSlots_feature", "_UI_Appointment_type"),
				 DentalclinicPackage.Literals.APPOINTMENT__TIME_SLOTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(DentalclinicPackage.Literals.APPOINTMENT__TREATMENTS);
			childrenFeatures.add(DentalclinicPackage.Literals.APPOINTMENT__DENTIST);
			childrenFeatures.add(DentalclinicPackage.Literals.APPOINTMENT__PRODUCTS);
			childrenFeatures.add(DentalclinicPackage.Literals.APPOINTMENT__CLIENT);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Appointment.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Appointment"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Appointment appointment = (Appointment)object;
		return getString("_UI_Appointment_type") + " " + appointment.getCost();
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Appointment.class)) {
			case DentalclinicPackage.APPOINTMENT__COST:
			case DentalclinicPackage.APPOINTMENT__DATE:
			case DentalclinicPackage.APPOINTMENT__STATUS:
			case DentalclinicPackage.APPOINTMENT__TIME_SLOTS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DentalclinicPackage.APPOINTMENT__TREATMENTS:
			case DentalclinicPackage.APPOINTMENT__DENTIST:
			case DentalclinicPackage.APPOINTMENT__PRODUCTS:
			case DentalclinicPackage.APPOINTMENT__CLIENT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(DentalclinicPackage.Literals.APPOINTMENT__TREATMENTS,
				 DentalclinicFactory.eINSTANCE.createScaling()));

		newChildDescriptors.add
			(createChildParameter
				(DentalclinicPackage.Literals.APPOINTMENT__TREATMENTS,
				 DentalclinicFactory.eINSTANCE.createFilling()));

		newChildDescriptors.add
			(createChildParameter
				(DentalclinicPackage.Literals.APPOINTMENT__TREATMENTS,
				 DentalclinicFactory.eINSTANCE.createCheckup()));

		newChildDescriptors.add
			(createChildParameter
				(DentalclinicPackage.Literals.APPOINTMENT__TREATMENTS,
				 DentalclinicFactory.eINSTANCE.createMinorSurgery()));

		newChildDescriptors.add
			(createChildParameter
				(DentalclinicPackage.Literals.APPOINTMENT__DENTIST,
				 DentalclinicFactory.eINSTANCE.createDentist()));

		newChildDescriptors.add
			(createChildParameter
				(DentalclinicPackage.Literals.APPOINTMENT__PRODUCTS,
				 DentalclinicFactory.eINSTANCE.createPolishingGel()));

		newChildDescriptors.add
			(createChildParameter
				(DentalclinicPackage.Literals.APPOINTMENT__PRODUCTS,
				 DentalclinicFactory.eINSTANCE.createAmalgam()));

		newChildDescriptors.add
			(createChildParameter
				(DentalclinicPackage.Literals.APPOINTMENT__PRODUCTS,
				 DentalclinicFactory.eINSTANCE.createGoldCrown()));

		newChildDescriptors.add
			(createChildParameter
				(DentalclinicPackage.Literals.APPOINTMENT__PRODUCTS,
				 DentalclinicFactory.eINSTANCE.createCrown()));

		newChildDescriptors.add
			(createChildParameter
				(DentalclinicPackage.Literals.APPOINTMENT__CLIENT,
				 DentalclinicFactory.eINSTANCE.createClient()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return DentalclinicEditPlugin.INSTANCE;
	}

}
