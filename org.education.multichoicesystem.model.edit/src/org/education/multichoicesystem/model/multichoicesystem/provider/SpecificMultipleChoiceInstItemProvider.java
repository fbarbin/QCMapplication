package org.education.multichoicesystem.model.multichoicesystem.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.education.multichoicesystem.model.multichoicesystem.MultipleChoice;
import org.education.multichoicesystem.model.multichoicesystem.MultipleChoiceInst;

/**
 * 
 * @author Florian Barbin
 *
 */
public class SpecificMultipleChoiceInstItemProvider extends
		MultipleChoiceInstItemProvider {

	public SpecificMultipleChoiceInstItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}
	
	@Override
	public String getText(Object object) {
		MultipleChoiceInst multipleChoiceInst = (MultipleChoiceInst)object;
		MultipleChoice multipleChoice = multipleChoiceInst.getDefinition();
		if(multipleChoice != null)
			return getString("_UI_MultipleChoiceInst_type") + " " + multipleChoice.getName();
		else
			return getString("_UI_MultipleChoiceInst_type");
	}

}
