/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.education.multichoicesystem.model.multichoicesystem.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.education.multichoicesystem.model.multichoicesystem.util.MultichoicesystemAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MultichoicesystemItemProviderAdapterFactory extends MultichoicesystemAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultichoicesystemItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.education.multichoicesystem.model.multichoicesystem.System} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemItemProvider systemItemProvider;

	/**
	 * This creates an adapter for a {@link org.education.multichoicesystem.model.multichoicesystem.System}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSystemAdapter() {
		if (systemItemProvider == null) {
			systemItemProvider = new SystemItemProvider(this);
		}

		return systemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.education.multichoicesystem.model.multichoicesystem.MultipleChoice} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultipleChoiceItemProvider multipleChoiceItemProvider;

	/**
	 * This creates an adapter for a {@link org.education.multichoicesystem.model.multichoicesystem.MultipleChoice}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMultipleChoiceAdapter() {
		if (multipleChoiceItemProvider == null) {
			multipleChoiceItemProvider = new MultipleChoiceItemProvider(this);
		}

		return multipleChoiceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.education.multichoicesystem.model.multichoicesystem.User} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserItemProvider userItemProvider;

	/**
	 * This creates an adapter for a {@link org.education.multichoicesystem.model.multichoicesystem.User}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUserAdapter() {
		if (userItemProvider == null) {
			userItemProvider = new UserItemProvider(this);
		}

		return userItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.education.multichoicesystem.model.multichoicesystem.Administrator} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdministratorItemProvider administratorItemProvider;

	/**
	 * This creates an adapter for a {@link org.education.multichoicesystem.model.multichoicesystem.Administrator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAdministratorAdapter() {
		if (administratorItemProvider == null) {
			administratorItemProvider = new AdministratorItemProvider(this);
		}

		return administratorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.education.multichoicesystem.model.multichoicesystem.MultipleChoiceInst} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultipleChoiceInstItemProvider multipleChoiceInstItemProvider;

	/**
	 * This creates an adapter for a {@link org.education.multichoicesystem.model.multichoicesystem.MultipleChoiceInst}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMultipleChoiceInstAdapter() {
		if (multipleChoiceInstItemProvider == null) {
			multipleChoiceInstItemProvider = new MultipleChoiceInstItemProvider(this);
		}

		return multipleChoiceInstItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.education.multichoicesystem.model.multichoicesystem.Statement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatementItemProvider statementItemProvider;

	/**
	 * This creates an adapter for a {@link org.education.multichoicesystem.model.multichoicesystem.Statement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStatementAdapter() {
		if (statementItemProvider == null) {
			statementItemProvider = new StatementItemProvider(this);
		}

		return statementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.education.multichoicesystem.model.multichoicesystem.Answer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnswerItemProvider answerItemProvider;

	/**
	 * This creates an adapter for a {@link org.education.multichoicesystem.model.multichoicesystem.Answer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAnswerAdapter() {
		if (answerItemProvider == null) {
			answerItemProvider = new AnswerItemProvider(this);
		}

		return answerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.education.multichoicesystem.model.multichoicesystem.StatementInst} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatementInstItemProvider statementInstItemProvider;

	/**
	 * This creates an adapter for a {@link org.education.multichoicesystem.model.multichoicesystem.StatementInst}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStatementInstAdapter() {
		if (statementInstItemProvider == null) {
			statementInstItemProvider = new StatementInstItemProvider(this);
		}

		return statementInstItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (systemItemProvider != null) systemItemProvider.dispose();
		if (multipleChoiceItemProvider != null) multipleChoiceItemProvider.dispose();
		if (userItemProvider != null) userItemProvider.dispose();
		if (administratorItemProvider != null) administratorItemProvider.dispose();
		if (multipleChoiceInstItemProvider != null) multipleChoiceInstItemProvider.dispose();
		if (statementItemProvider != null) statementItemProvider.dispose();
		if (answerItemProvider != null) answerItemProvider.dispose();
		if (statementInstItemProvider != null) statementInstItemProvider.dispose();
	}

}
