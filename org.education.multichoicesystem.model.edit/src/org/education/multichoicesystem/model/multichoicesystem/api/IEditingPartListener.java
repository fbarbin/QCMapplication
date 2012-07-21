package org.education.multichoicesystem.model.multichoicesystem.api;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * 
 * @author Florian Barbin
 *
 */
public interface IEditingPartListener {

	/**
	 * 
	 * @param feature
	 * @param element
	 */
	void firePropertyChanged(EStructuralFeature feature, EObject element);
}
