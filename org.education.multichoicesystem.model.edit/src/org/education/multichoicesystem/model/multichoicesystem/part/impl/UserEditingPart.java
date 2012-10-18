package org.education.multichoicesystem.model.multichoicesystem.part.impl;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.education.multichoicesystem.model.multichoicesystem.MultipleChoiceInst;
import org.education.multichoicesystem.model.multichoicesystem.User;
import org.education.multichoicesystem.model.multichoicesystem.api.IEditingPart;
import org.education.multichoicesystem.model.multichoicesystem.api.IEditingPartCallBack;

/**
 * 
 * @author Florian Barbin
 * 
 */
public class UserEditingPart extends AbstractEditingPart {

	private Composite mainPage;

	@Override
	public void createControl(Composite parent) {
		control = new Composite(parent, SWT.NONE);
		// Color backgroundColor = new Color(Display.getCurrent(), 255, 255,
		// 255);

		StackLayout layout = new StackLayout();
		control.setLayout(layout);
		// control.setBackground(backgroundColor);
		createMainPage();
		// createUserPage();
		layout.topControl = mainPage;

	}

	private void createMainPage() {
		mainPage = new Composite(control, SWT.NONE);
		// Color backgroundColor = new Color(Display.getCurrent(), 255, 255,
		// 255);

		GridLayout layout = new GridLayout();
		mainPage.setLayout(layout);
		// mainPage.setBackground(backgroundColor);
		mainPage.setLayoutData(new GridData(GridData.FILL_BOTH));
		createHeader(mainPage, "Liste des évaluations QCM");
		{
			Composite mainPageContent = new Composite(mainPage, SWT.NONE);
			Color backgroundColor = new Color(Display.getCurrent(), 255, 255,
					255);

			GridLayout layoutMPC = new GridLayout(2, false);
			layoutMPC.horizontalSpacing = 20;
			mainPageContent.setLayout(layoutMPC);
			mainPageContent.setBackground(backgroundColor);
			mainPageContent.setLayoutData(new GridData(GridData.FILL_BOTH));
			for (final MultipleChoiceInst multipleChoiceInst : ((User) element)
					.getFilledQCMs()) {
				{
					Label label = new Label(mainPageContent, SWT.NONE);
					label.setText(multipleChoiceInst.getDefinition().getName());
					label.setLayoutData(new GridData());
					label.setBackground(backgroundColor);
				}

				{

					Button button = new Button(mainPageContent, SWT.PUSH);

					if (multipleChoiceInst.isCanEdit()) {
						button.setText(Messages.UserEditingPart_go);
					} else {
						button.setText("Evalué");
						button.setEnabled(false);
					}
					GridData data = new GridData();
					data.widthHint = 100;
					button.setLayoutData(data);
					button.addListener(SWT.Selection, new Listener() {

						@Override
						public void handleEvent(Event event) {
							openMultipleChoiceInst(multipleChoiceInst);
						}
					});

				}
			}
			{
				Button deconnexionButton = new Button(mainPage, SWT.PUSH);
				deconnexionButton.setText(Messages.UserEditingPart_disconnect);
				deconnexionButton.addListener(SWT.Selection, new Listener() {

					@Override
					public void handleEvent(Event event) {
						callBack.callBack();

					}
				});
			}
		}

	}

	private void openMultipleChoiceInst(MultipleChoiceInst multipleChoiceInst) {
		displayMultipleChoice(multipleChoiceInst);
	}

	private void displayMultipleChoice(MultipleChoiceInst multipleChoiceInst) {
		IEditingPart editingPart = (IEditingPart) adapterFactory.adapt(
				multipleChoiceInst, IEditingPart.class);
		editingPart.createControl(control);
		editingPart.setCallBack(new CallBack());
		Control composite = editingPart.getControl();
		StackLayout layout = (StackLayout) control.getLayout();
		layout.topControl = composite;
		control.layout();

	}

	@Override
	protected void refreshFeature(Object object) {
		// TODO Auto-generated method stub

	}

	private class CallBack implements IEditingPartCallBack {

		@Override
		public void callBack() {
			StackLayout layout = (StackLayout) control.getLayout();
			layout.topControl = mainPage;
			control.layout();

		}

	}

}
