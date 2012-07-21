package org.education.multichoicesystem.model.multichoicesystem.part.impl;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.ProgressBar;
import org.education.multichoicesystem.model.multichoicesystem.MultipleChoiceInst;
import org.education.multichoicesystem.model.multichoicesystem.StatementInst;
import org.education.multichoicesystem.model.multichoicesystem.api.AbstractEditingPart;
import org.education.multichoicesystem.model.multichoicesystem.api.IEditingPart;

/**
 * 
 * @author Florian Barbin
 * 
 */
public class MultipleChoiceInstEditingPart extends AbstractEditingPart {

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

		GridLayout layout = new GridLayout(1, false);
		mainPage.setLayout(layout);
		// mainPage.setBackground(backgroundColor);
		mainPage.setLayoutData(new GridData(GridData.FILL_BOTH));
		createHeader(mainPage, ((MultipleChoiceInst) element).getDefinition()
				.getName());
		{
			Composite MCQTime = new Composite(mainPage, SWT.NONE);
			GridLayout layoutMCQTime = new GridLayout(2, false);
			MCQTime.setLayout(layoutMCQTime);
			MCQTime.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
			
			{
				Label remainingTime = new Label(MCQTime, SWT.NONE);
				remainingTime.setText("Temps restant (5 min) :");
				ProgressBar pb1 = new ProgressBar(MCQTime, SWT.HORIZONTAL | SWT.SMOOTH);
			    pb1.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
			    pb1.setMinimum(0);
			    pb1.setMaximum(30);
			    pb1.setSelection(10);
			}
		}
		{
			Composite MCQContent = new Composite(mainPage, SWT.NONE);
			GridLayout layoutMCQC = new GridLayout(1, false);
			MCQContent.setLayout(layoutMCQC);
			MCQContent.setLayoutData(new GridData(GridData.FILL_BOTH));
			if (element instanceof MultipleChoiceInst) {
				for (StatementInst statementInst : ((MultipleChoiceInst) element)
						.getStatements()) {
					displayStatementInst(statementInst, MCQContent);
				}
			}
		}
		{
			Button validateButton = new Button(mainPage, SWT.PUSH);
			validateButton
					.setText(Messages.MultipleChoiceInstEditingPart_validate);
			validateButton.addListener(SWT.Selection, new Listener() {

				@Override
				public void handleEvent(Event event) {
					callBack.callBack();
				}
			});
		}
	}

	private void displayStatementInst(StatementInst statementInst,
			Composite parent) {
		IEditingPart editingPart = (IEditingPart) adapterFactory.adapt(
				statementInst, IEditingPart.class);
		editingPart.createControl(parent);
		// Control composite = editingPart.getControl();
		// StackLayout layout = (StackLayout) control.getLayout();
		// layout.topControl = composite;
		// control.layout();
	}

	@Override
	protected void refreshFeature(Object object) {
		// TODO Auto-generated method stub

	}

}
