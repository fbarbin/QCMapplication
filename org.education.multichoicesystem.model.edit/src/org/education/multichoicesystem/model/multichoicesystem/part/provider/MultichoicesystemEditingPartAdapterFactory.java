package org.education.multichoicesystem.model.multichoicesystem.part.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.education.multichoicesystem.model.multichoicesystem.api.IEditingPart;
import org.education.multichoicesystem.model.multichoicesystem.part.impl.AdministratorEditingPart;
import org.education.multichoicesystem.model.multichoicesystem.part.impl.AnswerEditingPart;
import org.education.multichoicesystem.model.multichoicesystem.part.impl.MultipleChoiceEditingPart;
import org.education.multichoicesystem.model.multichoicesystem.part.impl.MultipleChoiceInstEditingPart;
import org.education.multichoicesystem.model.multichoicesystem.part.impl.StatementInstEditingPart;
import org.education.multichoicesystem.model.multichoicesystem.part.impl.SystemEditingPart;
import org.education.multichoicesystem.model.multichoicesystem.part.impl.UserEditingPart;
import org.education.multichoicesystem.model.multichoicesystem.util.MultichoicesystemAdapterFactory;

/**
 * 
 * @author Florian Barbin
 * 
 */
public class MultichoicesystemEditingPartAdapterFactory extends
		MultichoicesystemAdapterFactory {

	private Collection<Object> supportedTypes = new ArrayList<Object>();

	public MultichoicesystemEditingPartAdapterFactory() {
		super();
		supportedTypes.add(IEditingPart.class);

	}

	@Override
	public boolean isFactoryForType(Object object) {
		return (supportedTypes.contains(object) || super
				.isFactoryForType(object));
	}

	@Override
	public Adapter createMultipleChoiceAdapter() {
		return new MultipleChoiceEditingPart();
	}

	@Override
	public Adapter createSystemAdapter() {
		return new SystemEditingPart();
	}

	@Override
	public Adapter createUserAdapter() {
		return new UserEditingPart();
	}

	@Override
	public Adapter createMultipleChoiceInstAdapter() {
		return new MultipleChoiceInstEditingPart();
	}

	@Override
	public Adapter createStatementInstAdapter() {
		return new StatementInstEditingPart();
	}

	@Override
	public Adapter createAnswerAdapter() {
		return new AnswerEditingPart();
	}

	@Override
	public Adapter createAdministratorAdapter() {
		return new AdministratorEditingPart();
	}

}
