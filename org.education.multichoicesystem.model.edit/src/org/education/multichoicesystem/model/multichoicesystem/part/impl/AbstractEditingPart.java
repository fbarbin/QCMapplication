package org.education.multichoicesystem.model.multichoicesystem.part.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.education.multichoicesystem.model.multichoicesystem.api.IEditingPart;
import org.education.multichoicesystem.model.multichoicesystem.api.IEditingPartCallBack;
import org.education.multichoicesystem.model.multichoicesystem.api.Messages;
import org.education.multichoicesystem.model.multichoicesystem.part.provider.MultichoicesystemEditingPartAdapterFactory;
import org.education.multichoicesystem.model.multichoicesystem.provider.MultichoiceEditPlugin;

/**
 * 
 * @author Florian Barbin
 * 
 */
public abstract class AbstractEditingPart implements IEditingPart {

	protected EObject element;

	// protected Collection<IEditingPartListener> editingPartListeners;

	protected Composite control;

	protected MultichoicesystemEditingPartAdapterFactory adapterFactory = new MultichoicesystemEditingPartAdapterFactory();

	protected IEditingPartCallBack callBack;

	@Override
	public void setTarget(Notifier element) {

		if (element instanceof EObject) {
			this.element = (EObject) element;
			// this.element.eAdapters().add(this);
		}

	}

	@Override
	public void refresh() {
		if (this.element != null) {
			for (EStructuralFeature feature : this.element.eClass()
					.getEStructuralFeatures())
				refreshFeature(feature);
		} else
			throw new IllegalStateException(
					Messages.AbstractEditingPart_error_1);
	}

	/**
	 * Refreshes the given feature value.
	 * 
	 * @param object
	 *            the feature to refresh value.
	 */
	protected abstract void refreshFeature(Object object);

	// @Override
	// public void addListener(IEditingPartListener listener) {
	// editingPartListeners.add(listener);
	// }

	// @Override
	// public void notify(EStructuralFeature feature) {
	// for (IEditingPartListener editingPartListener : editingPartListeners)
	// editingPartListener.firePropertyChanged(feature, element);
	// }

	@Override
	public void notifyChanged(Notification notification) {
		refreshFeature(notification.getFeature());

	}

	@Override
	public Notifier getTarget() {
		return element;
	}

	@Override
	public boolean isAdapterForType(Object type) {
		return false;
	}

	@Override
	public Control getControl() {
		return control;
	}

	@Override
	public void dispose() {
		if (control != null && element != null) {
			control.dispose();
			this.element.eAdapters().remove(this);
			control = null;
			element = null;
		} else
			throw new IllegalStateException(
					Messages.AbstractEditingPart_error_2);
	}

	@Override
	public void setCallBack(IEditingPartCallBack callBack) {
		this.callBack = callBack;

	}

	/**
	 * 
	 * @param parent
	 * @param title
	 * @return
	 */
	protected Composite createHeader(Composite parent, String title) {
		Composite header = new Composite(parent, SWT.BORDER_SOLID);
		Color backgroundColor = new Color(Display.getCurrent(), 255, 255, 255);
		GridLayout layout = new GridLayout(2, true);
		header.setLayout(layout);
		header.setBackground(backgroundColor);
		GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
		gridData.heightHint = 70;
		header.setLayoutData(gridData);

		{
			Label titleLabel = new Label(header, SWT.TRANSPARENT);
			titleLabel.setFont(new Font(Display.getCurrent(), "Arial", 14,
					SWT.BOLD));
			titleLabel.setText(title);
			titleLabel.setBackground(backgroundColor);
			titleLabel.setLayoutData(new GridData(
					GridData.VERTICAL_ALIGN_BEGINNING));
		}
		{
			Label img = new Label(header, SWT.NONE);
			img.setLayoutData(new GridData(SWT.RIGHT, SWT.TOP, true, true));
			Object imageDesc = getResourceLocator().getImage("header.png");
			Image image = ExtendedImageRegistry.INSTANCE.getImage(imageDesc);
			img.setImage(image);
		}
		return header;
	}

	protected ResourceLocator getResourceLocator() {
		return MultichoiceEditPlugin.INSTANCE;
	}

	protected Image getImageFromName(String string) {
		Object imageDesc = getResourceLocator().getImage(string);
		return ExtendedImageRegistry.INSTANCE.getImage(imageDesc);
	}

	protected Button createHomeButton(Composite parent) {
		Button homeButton = new Button(parent, SWT.PUSH);
		homeButton.setText(Messages.SystemEditingPart_home);
		homeButton
				.setImage(getImageFromName("48px-Crystal_Clear_app_kfm_home.png"));
		return homeButton;
	}

	protected Button createConnectionButton(Composite userConnection) {
		final Button buttonUser = new Button(userConnection, SWT.PUSH);
		buttonUser.setText(Messages.SystemEditingPart_connection);
		GridData buttonUserData = new GridData();
		buttonUser.setLayoutData(buttonUserData);
		buttonUser.setImage(getImageFromName("checkmark_32.png"));
		return buttonUser;
	}

}
