/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.education.multichoicesystem.model.multichoicesystem;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.education.multichoicesystem.model.multichoicesystem.System#getAdministrators <em>Administrators</em>}</li>
 *   <li>{@link org.education.multichoicesystem.model.multichoicesystem.System#getUsers <em>Users</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.education.multichoicesystem.model.multichoicesystem.MultichoicesystemPackage#getSystem()
 * @model
 * @generated
 */
public interface System extends EObject {
	/**
	 * Returns the value of the '<em><b>Administrators</b></em>' containment reference list.
	 * The list contents are of type {@link org.education.multichoicesystem.model.multichoicesystem.Administrator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Administrators</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Administrators</em>' containment reference list.
	 * @see org.education.multichoicesystem.model.multichoicesystem.MultichoicesystemPackage#getSystem_Administrators()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Administrator> getAdministrators();

	/**
	 * Returns the value of the '<em><b>Users</b></em>' containment reference list.
	 * The list contents are of type {@link org.education.multichoicesystem.model.multichoicesystem.User}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Users</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Users</em>' containment reference list.
	 * @see org.education.multichoicesystem.model.multichoicesystem.MultichoicesystemPackage#getSystem_Users()
	 * @model containment="true"
	 * @generated
	 */
	EList<User> getUsers();

} // System
