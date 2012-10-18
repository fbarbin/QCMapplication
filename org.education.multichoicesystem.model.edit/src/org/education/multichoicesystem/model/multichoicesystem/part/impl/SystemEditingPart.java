package org.education.multichoicesystem.model.multichoicesystem.part.impl;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.education.multichoicesystem.model.multichoicesystem.Administrator;
import org.education.multichoicesystem.model.multichoicesystem.System;
import org.education.multichoicesystem.model.multichoicesystem.User;
import org.education.multichoicesystem.model.multichoicesystem.api.IEditingPart;
import org.education.multichoicesystem.model.multichoicesystem.api.IEditingPartCallBack;

/**
 * 
 * @author Florian Barbin
 * 
 */
public class SystemEditingPart extends AbstractEditingPart {

	private Composite mainPage;
	private Composite userPage;
	private Composite adminPage;

	@Override
	public void createControl(Composite parent) {
		// Color backgroundColor = new Color(Display.getCurrent(), 255, 255,
		// 255);
		control = new Composite(parent, SWT.BORDER_SOLID);

		StackLayout layout = new StackLayout();
		control.setLayout(layout);
		// control.setBackground(backgroundColor);
		createMainPage();
		createUserPage();
		createAdminPage();
		layout.topControl = mainPage;

	}

	private void createMainPage() {
		// Color backgroundColor = new Color(Display.getCurrent(), 255, 255,
		// 255);
		{
			mainPage = new Composite(control, SWT.NONE);
			GridLayout layout = new GridLayout();
			mainPage.setLayout(layout);
			mainPage.setLayoutData(new GridData(GridData.FILL_BOTH));
		}
		// header
		{
			createHeader(mainPage, "Menu Principale");
			// Composite mainPageHeader = new Composite(mainPage,
			// SWT.BORDER_SOLID);
			// Color backgroundColor = new Color(Display.getCurrent(), 255, 255,
			// 255);
			// GridLayout layout = new GridLayout(2, true);
			// mainPageHeader.setLayout(layout);
			// mainPageHeader.setBackground(backgroundColor);
			// GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
			// gridData.heightHint = 70;
			// mainPageHeader.setLayoutData(gridData);
			// Label title = new Label(mainPageHeader, SWT.TRANSPARENT);
			// title.setFont(new Font(Display.getCurrent(), "Arial", 14,
			// SWT.BOLD));
			// title.setText("Menu Principale");
			// title.setBackground(backgroundColor);
			// title.setLayoutData(new
			// GridData(GridData.VERTICAL_ALIGN_BEGINNING));
			// {
			// Object imageDesc =
			// getResourceLocator().getImage("full/obj16/Answer");
			// Image image =
			// JFaceResources.getResources().createImageWithDefault((ImageDescriptor)
			// imageDesc);
			// }
		}

		// content
		{
			Composite mainPageContent = new Composite(mainPage,
					SWT.BORDER_SOLID);
			GridLayout layout = new GridLayout(2, false);
			mainPageContent.setLayout(layout);
			// mainPage.setBackground(backgroundColor);
			mainPageContent.setLayoutData(new GridData(GridData.FILL_BOTH));

			{
				Button buttonAdmin = new Button(mainPageContent, SWT.PUSH);

				buttonAdmin
						.setImage(getImageFromName("48px-Crystal_Clear_app_kuser.png"));
				buttonAdmin.setText(Messages.SystemEditingPart_admin);
				GridData buttonAdminData = new GridData(SWT.RIGHT, SWT.CENTER,
						true, true, 1, 1);
				buttonAdmin.setLayoutData(buttonAdminData);
				buttonAdmin.addListener(SWT.Selection, new Listener() {

					@Override
					public void handleEvent(Event event) {
						StackLayout layout = (StackLayout) control.getLayout();
						layout.topControl = adminPage;
						control.layout();
					}
				});
			}
			{
				Button buttonUser = new Button(mainPageContent, SWT.PUSH);
				buttonUser.setText(Messages.SystemEditingPart_user);
				buttonUser
						.setImage(getImageFromName("48px-Crystal_Clear_app_personal.png"));
				GridData buttonUserData = new GridData(SWT.LEFT, SWT.CENTER,
						true, true, 1, 1);
				buttonUser.setLayoutData(buttonUserData);
				buttonUser.addListener(SWT.Selection, new Listener() {

					@Override
					public void handleEvent(Event event) {
						StackLayout layout = (StackLayout) control.getLayout();
						layout.topControl = userPage;
						control.layout();
					}
				});
			}
		}

	}

	private void createUserPage() {
		// Color backgroundColor = new Color(Display.getCurrent(), 255, 255,
		// 255);
		userPage = new Composite(control, SWT.NONE);

		GridLayout layout = new GridLayout();
		userPage.setLayout(layout);
		// userPage.setBackground(backgroundColor);
		createHeader(userPage, "Connexion Utilisateur");
		{
			Composite mainUserPage = new Composite(userPage, SWT.NONE);

			GridLayout layoutMUP = new GridLayout();
			mainUserPage.setLayout(layoutMUP);
			mainUserPage.setLayoutData(new GridData(GridData.FILL_BOTH));
			{
				Composite userConnection = new Composite(mainUserPage,
						SWT.BORDER);
				GridLayout layoutUC = new GridLayout(2, false);
				userConnection.setLayout(layoutUC);
				GridData uCGridData = new GridData(SWT.CENTER, SWT.CENTER,
						true, true, 1, 1);
				userConnection.setLayoutData(uCGridData);
				final Text userText;
				final Text pwdText;

				{
					Label userLabel = new Label(userConnection, SWT.NONE);
					userLabel.setText(Messages.SystemEditingPart_userName);
					GridData userLabelData = new GridData();
					userLabel.setLayoutData(userLabelData);
				}
				{
					userText = new Text(userConnection, SWT.BORDER);
					GridData userTextData = new GridData();
					userTextData.widthHint = 100;
					userText.setLayoutData(userTextData);
				}
				{
					Label pwdLabel = new Label(userConnection, SWT.NONE);
					pwdLabel.setText(Messages.SystemEditingPart_pwd);
					GridData pwdLabelData = new GridData();
					pwdLabel.setLayoutData(pwdLabelData);
				}
				{
					pwdText = new Text(userConnection, SWT.BORDER);
					GridData pwdTextData = new GridData();
					pwdTextData.widthHint = 100;
					pwdText.setLayoutData(pwdTextData);
				}

				// connection button
				{
					final Button buttonUser = createConnectionButton(userConnection);
					buttonUser.addListener(SWT.Selection, new Listener() {

						@Override
						public void handleEvent(Event event) {
							openUser(userText.getText(), pwdText.getText());

						}
					});
				}

			}
			// home button
			{
				Button homeButton = createHomeButton(mainUserPage);
				homeButton.addListener(SWT.Selection, new Listener() {

					@Override
					public void handleEvent(Event event) {
						StackLayout layout = (StackLayout) control.getLayout();
						layout.topControl = mainPage;
						control.layout();
					}
				});
			}
		}
	}

	private void createAdminPage() {
		// Color backgroundColor = new Color(Display.getCurrent(), 255, 255,
		// 255);
		adminPage = new Composite(control, SWT.NONE);

		GridLayout layout = new GridLayout();
		adminPage.setLayout(layout);
		// userPage.setBackground(backgroundColor);
		createHeader(adminPage, "Connexion Administrateur");
		{
			Composite mainUserPage = new Composite(adminPage, SWT.NONE);

			GridLayout layoutMUP = new GridLayout();
			mainUserPage.setLayout(layoutMUP);
			mainUserPage.setLayoutData(new GridData(GridData.FILL_BOTH));
			{
				Composite userConnection = new Composite(mainUserPage,
						SWT.BORDER);
				GridLayout layoutUC = new GridLayout(2, false);
				userConnection.setLayout(layoutUC);
				GridData uCGridData = new GridData(SWT.CENTER, SWT.CENTER,
						true, true, 1, 1);
				userConnection.setLayoutData(uCGridData);
				final Text userText;
				final Text pwdText;

				{
					Label userLabel = new Label(userConnection, SWT.NONE);
					userLabel.setText(Messages.SystemEditingPart_userName);
					GridData userLabelData = new GridData();
					userLabel.setLayoutData(userLabelData);
				}
				{
					userText = new Text(userConnection, SWT.BORDER);
					GridData userTextData = new GridData();
					userTextData.widthHint = 100;
					userText.setLayoutData(userTextData);
				}
				{
					Label pwdLabel = new Label(userConnection, SWT.NONE);
					pwdLabel.setText(Messages.SystemEditingPart_pwd);
					GridData pwdLabelData = new GridData();
					pwdLabel.setLayoutData(pwdLabelData);
				}
				{
					pwdText = new Text(userConnection, SWT.BORDER);
					GridData pwdTextData = new GridData();
					pwdTextData.widthHint = 100;
					pwdText.setLayoutData(pwdTextData);
				}

				// connection button
				{
					final Button buttonUser = createConnectionButton(userConnection);
					buttonUser.addListener(SWT.Selection, new Listener() {

						@Override
						public void handleEvent(Event event) {
							openAdmin(userText.getText(), pwdText.getText());

						}
					});
				}

			}
			// home button
			{
				Button homeButton = createHomeButton(mainUserPage);
				homeButton.addListener(SWT.Selection, new Listener() {

					@Override
					public void handleEvent(Event event) {
						StackLayout layout = (StackLayout) control.getLayout();
						layout.topControl = mainPage;
						control.layout();
					}
				});
			}
		}
	}

	private void openAdmin(String adminName, String pwd) {
		for (Administrator currentAdministrator : ((System) element)
				.getAdministrators()) {
			if (currentAdministrator.getName().equals(adminName)) {
				displayAdmin(currentAdministrator);
				break;
			}
		}

	}

	private void openUser(String userName, String pwd) {
		for (User currentUser : ((System) element).getUsers()) {
			if (currentUser.getName().equals(userName)) {
				displayUser(currentUser);
				break;
			}
		}

	}

	private void displayUser(User currentUser) {
		IEditingPart editingPart = (IEditingPart) adapterFactory.adapt(
				currentUser, IEditingPart.class);
		editingPart.createControl(control);
		editingPart.setCallBack(new CallBackUser());
		Control userComposite = editingPart.getControl();
		StackLayout layout = (StackLayout) control.getLayout();
		layout.topControl = userComposite;
		control.layout();

	}

	private void displayAdmin(Administrator currentAdministrator) {
		IEditingPart editingPart = (IEditingPart) adapterFactory.adapt(
				currentAdministrator, IEditingPart.class);
		editingPart.createControl(control);
		editingPart.setCallBack(new CallBackAdmin());
		Control userComposite = editingPart.getControl();
		StackLayout layout = (StackLayout) control.getLayout();
		layout.topControl = userComposite;
		control.layout();

	}

	@Override
	protected void refreshFeature(Object feature) {
		// TODO Auto-generated method stub

	}

	private class CallBackUser implements IEditingPartCallBack {

		@Override
		public void callBack() {
			StackLayout layout = (StackLayout) control.getLayout();
			layout.topControl = userPage;
			control.layout();

		}

	}

	private class CallBackAdmin implements IEditingPartCallBack {

		@Override
		public void callBack() {
			StackLayout layout = (StackLayout) control.getLayout();
			layout.topControl = adminPage;
			control.layout();

		}

	}

}
