package org.education.multichoicesystem.model.multichoicesystem.api;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.education.multichoicesystem.model.multichoicesystem.api.messages"; //$NON-NLS-1$
	public static String AbstractEditingPart_error_1;
	public static String AbstractEditingPart_error_2;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
