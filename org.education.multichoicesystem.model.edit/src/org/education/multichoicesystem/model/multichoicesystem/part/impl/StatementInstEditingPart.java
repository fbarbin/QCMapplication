package org.education.multichoicesystem.model.multichoicesystem.part.impl;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.education.multichoicesystem.model.multichoicesystem.Answer;
import org.education.multichoicesystem.model.multichoicesystem.StatementInst;
import org.education.multichoicesystem.model.multichoicesystem.api.AbstractEditingPart;
import org.education.multichoicesystem.model.multichoicesystem.api.IEditingPart;

/**
 * 
 * @author Florian Barbin
 * 
 */
public class StatementInstEditingPart extends AbstractEditingPart {

	@Override
	public void createControl(Composite parent) {
		control = new Composite(parent, SWT.NONE);
		// Color backgroundColor = new Color(Display.getCurrent(), 255, 255,
		// 255);

		GridLayout layout = new GridLayout();
		control.setLayout(layout);
		// control.setBackground(backgroundColor);
		Label label = new Label(control, SWT.NONE);
		label.setText(((StatementInst) element).getDefinition().getValue());
		displayAnswers();

	}

	private void displayAnswers() {
		for (Answer answer : ((StatementInst) element).getDefinition()
				.getAnswers()) {
			displayOneAnswer(answer);
		}

	}

	private void displayOneAnswer(Answer answer) {
		IEditingPart editingPart = (IEditingPart) adapterFactory.adapt(answer,
				IEditingPart.class);
		editingPart.createControl(control);

	}

	@Override
	protected void refreshFeature(Object object) {
		// TODO Auto-generated method stub

	}

}
