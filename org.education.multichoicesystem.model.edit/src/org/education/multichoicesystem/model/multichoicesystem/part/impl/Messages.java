package org.education.multichoicesystem.model.multichoicesystem.part.impl;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.education.multichoicesystem.model.multichoicesystem.part.impl.messages"; //$NON-NLS-1$
	public static String MultipleChoiceEditingPart_name;
	public static String MultipleChoiceInstEditingPart_validate;
	public static String SystemEditingPart_admin;
	public static String SystemEditingPart_connection;
	public static String SystemEditingPart_home;
	public static String SystemEditingPart_pwd;
	public static String SystemEditingPart_user;
	public static String SystemEditingPart_userName;
	public static String UserEditingPart_disconnect;
	public static String UserEditingPart_go;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
