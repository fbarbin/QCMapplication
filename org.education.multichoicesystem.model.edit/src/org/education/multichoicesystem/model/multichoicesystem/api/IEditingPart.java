package org.education.multichoicesystem.model.multichoicesystem.api;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

/**
 * 
 * @author Florian Barbin
 * 
 */
public interface IEditingPart extends Adapter {

	// /**
	// *
	// * @param listener
	// */
	// void addListener(IEditingPartListener listener);

	// /**
	// *
	// * @param feature
	// */
	// void notify(EStructuralFeature feature);

	void createControl(Composite parent);

	/**
	 * 
	 * @return the editing part control
	 */
	Control getControl();

	/**
	 * Refresh editing part
	 */
	void refresh();

	/**
	 * Disposes the editing part.
	 */
	void dispose();

	/**
	 * Set a callback to return to previous editing part.
	 * 
	 * @param callBack
	 *            the call back set by previous editing part.
	 */
	void setCallBack(IEditingPartCallBack callBack);
}
