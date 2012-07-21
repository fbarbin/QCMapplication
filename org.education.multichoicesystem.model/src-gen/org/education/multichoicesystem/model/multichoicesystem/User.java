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
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.education.multichoicesystem.model.multichoicesystem.User#getFilledQCMs <em>Filled QC Ms</em>}</li>
 *   <li>{@link org.education.multichoicesystem.model.multichoicesystem.User#getName <em>Name</em>}</li>
 *   <li>{@link org.education.multichoicesystem.model.multichoicesystem.User#getPwd <em>Pwd</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.education.multichoicesystem.model.multichoicesystem.MultichoicesystemPackage#getUser()
 * @model
 * @generated
 */
public interface User extends EObject {
	/**
	 * Returns the value of the '<em><b>Filled QC Ms</b></em>' containment reference list.
	 * The list contents are of type {@link org.education.multichoicesystem.model.multichoicesystem.MultipleChoiceInst}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filled QC Ms</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filled QC Ms</em>' containment reference list.
	 * @see org.education.multichoicesystem.model.multichoicesystem.MultichoicesystemPackage#getUser_FilledQCMs()
	 * @model containment="true"
	 * @generated
	 */
	EList<MultipleChoiceInst> getFilledQCMs();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.education.multichoicesystem.model.multichoicesystem.MultichoicesystemPackage#getUser_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.education.multichoicesystem.model.multichoicesystem.User#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Pwd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pwd</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pwd</em>' attribute.
	 * @see #setPwd(String)
	 * @see org.education.multichoicesystem.model.multichoicesystem.MultichoicesystemPackage#getUser_Pwd()
	 * @model
	 * @generated
	 */
	String getPwd();

	/**
	 * Sets the value of the '{@link org.education.multichoicesystem.model.multichoicesystem.User#getPwd <em>Pwd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pwd</em>' attribute.
	 * @see #getPwd()
	 * @generated
	 */
	void setPwd(String value);

} // User
