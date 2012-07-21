package org.education.multichoicesystem.model.multichoicesystem.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.education.multichoicesystem.model.multichoicesystem.Statement;

/**
 * 
 * @author Florian Barbin
 *
 */
public class SpecificStatementItemProvider extends StatementItemProvider {

	public SpecificStatementItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getText(Object object) {
		Statement statement = (Statement)object;
		return getString("_UI_Statement_type") + " " + statement.getValue();
	}
}
