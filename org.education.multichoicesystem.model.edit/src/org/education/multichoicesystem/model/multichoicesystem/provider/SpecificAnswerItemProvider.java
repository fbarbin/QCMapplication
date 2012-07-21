package org.education.multichoicesystem.model.multichoicesystem.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.education.multichoicesystem.model.multichoicesystem.Answer;

/**
 * 
 * @author Florian Barbin
 *
 */
public class SpecificAnswerItemProvider extends AnswerItemProvider {

	public SpecificAnswerItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getText(Object object) {
		Answer answer = (Answer) object;
		return getString("_UI_Answer_type") + " " + answer.getValue();
	}

}
