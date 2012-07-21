package org.education.multichoicesystem.model.multichoicesystem.provider;

import org.eclipse.emf.common.notify.Adapter;

/**
 * 
 * @author Florian Barbin
 *
 */
public class SpecificMultichoicesystemItemProviderAdapterFactory extends
		MultichoicesystemItemProviderAdapterFactory {
	
	@Override
	public Adapter createStatementAdapter() {
		if (statementItemProvider == null) {
			statementItemProvider = new SpecificStatementItemProvider(this);
		}

		return statementItemProvider;
	}
	
	@Override
	public Adapter createAnswerAdapter() {
		if (answerItemProvider == null) {
			answerItemProvider = new SpecificAnswerItemProvider(this);
		}

		return answerItemProvider;
	}
	
	@Override
	public Adapter createMultipleChoiceInstAdapter() {
		if (multipleChoiceInstItemProvider == null) {
			multipleChoiceInstItemProvider = new SpecificMultipleChoiceInstItemProvider(this);
		}

		return multipleChoiceInstItemProvider;
	}

}
