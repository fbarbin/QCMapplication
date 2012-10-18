package org.education.multichoicesystem.model.multichoicesystem.part.impl;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.education.multichoicesystem.model.multichoicesystem.Answer;

/**
 * 
 * @author Florian Barbin
 *
 */
public class AnswerEditingPart extends AbstractEditingPart {

	@Override
	public void createControl(Composite parent) {
		control = new Composite(parent, SWT.NONE);
		// Color backgroundColor = new Color(Display.getCurrent(), 255, 255,
		// 255);

		GridLayout layout = new GridLayout(2, false);
		control.setLayout(layout);
		// control.setBackground(backgroundColor);
		Label label = new Label(control, SWT.NONE);
		label.setText(((Answer) element).getValue());
		Button button = new Button(control, SWT.RADIO);

	}

	@Override
	protected void refreshFeature(Object object) {
		// TODO Auto-generated method stub

	}

}
