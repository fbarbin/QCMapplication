package org.education.multichoicesystem.model.multichoicesystem.part.impl;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.education.multichoicesystem.model.multichoicesystem.Administrator;
import org.education.multichoicesystem.model.multichoicesystem.MultipleChoiceInst;

public class AdministratorEditingPart extends AbstractEditingPart {

	private Composite mainPage;

	@Override
	public void createControl(Composite parent) {
		control = new Composite(parent, SWT.NONE);
		StackLayout layout = new StackLayout();
		control.setLayout(layout);
		// control.setBackground(backgroundColor);
		createMainPage();
		// createUserPage();
		layout.topControl = mainPage;
	}

	private void createMainPage() {
		mainPage = new Composite(control, SWT.NONE);
		GridLayout layout = new GridLayout(1, false);
		mainPage.setLayout(layout);
		// mainPage.setBackground(backgroundColor);
		mainPage.setLayoutData(new GridData(GridData.FILL_BOTH));
		createHeader(mainPage,
				"Administrateur: " + ((Administrator) element).getName());
		{
			Composite mainPageContent = new Composite(mainPage, SWT.NONE);
			GridLayout MPClayout = new GridLayout(2, false);
			mainPageContent.setLayout(MPClayout);
			mainPageContent.setLayoutData(new GridData(GridData.FILL_BOTH));

			{
				Composite mainPageMenu = new Composite(mainPageContent,
						SWT.BORDER);
				GridLayout MPMlayout = new GridLayout(1, false);
				mainPageMenu.setLayout(MPMlayout);
				mainPageMenu
						.setLayoutData(new GridData(GridData.FILL_VERTICAL));
				{
					Label menu = new Label(mainPageMenu, SWT.UNDERLINE_SINGLE);
					menu.setText("Menu Administrateur");
					menu.setFont(new Font(Display.getCurrent(), "Arial", 14,
							SWT.NONE));
				}
				{
					Label sep = new Label(mainPageMenu, SWT.SEPARATOR
							| SWT.HORIZONTAL);
					sep.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
				}

				{
					Button ids = new Button(mainPageMenu, SWT.PUSH);
					ids.setText("Changer les Identifiants");
					ids.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
				}
				{
					Button users = new Button(mainPageMenu, SWT.PUSH);
					users.setText("Gestion des Utilisateurs");
					users.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
				}
				{
					Button mcq = new Button(mainPageMenu, SWT.PUSH);
					mcq.setText("Gestion des QCM");
					mcq.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
				}

				{
					Button stat = new Button(mainPageMenu, SWT.PUSH);
					stat.setText("Statistiques");
					stat.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
				}
				{
					Button stat = new Button(mainPageMenu, SWT.PUSH);
					stat.setText("Déconnexion");
					GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
					gridData.horizontalAlignment = SWT.FILL;
					gridData.verticalAlignment = SWT.BOTTOM;
					gridData.grabExcessHorizontalSpace = true;
					gridData.grabExcessVerticalSpace = true;

					stat.setLayoutData(gridData);
					stat.addListener(SWT.Selection, new Listener() {

						@Override
						public void handleEvent(Event event) {
							callBack.callBack();

						}
					});
				}
			}
		}

	}

	@Override
	protected void refreshFeature(Object object) {
		// TODO Auto-generated method stub

	}

}
