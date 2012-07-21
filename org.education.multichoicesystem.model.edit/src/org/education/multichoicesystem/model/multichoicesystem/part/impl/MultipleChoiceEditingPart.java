package org.education.multichoicesystem.model.multichoicesystem.part.impl;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.education.multichoicesystem.model.multichoicesystem.api.AbstractEditingPart;

/**
 * 
 * @author Florian Barbin
 * 
 */
public class MultipleChoiceEditingPart extends AbstractEditingPart {

	@Override
	public void createControl(Composite parent) {
		control = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		control.setLayout(layout);

		Label label = new Label(control, SWT.NONE);
		label.setText(Messages.MultipleChoiceEditingPart_name);
		GridData labelData = new GridData();
		label.setData(labelData);

		Text text = new Text(control, SWT.BORDER);
		GridData textData = new GridData(GridData.FILL_HORIZONTAL);
		text.setData(textData);

	}

	@Override
	protected void refreshFeature(Object feature) {
		// TODO Auto-generated method stub

	}

	// private

}
