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
 * A representation of the model object '<em><b>Administrator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.education.multichoicesystem.model.multichoicesystem.Administrator#getMultipleChoices <em>Multiple Choices</em>}</li>
 *   <li>{@link org.education.multichoicesystem.model.multichoicesystem.Administrator#getName <em>Name</em>}</li>
 *   <li>{@link org.education.multichoicesystem.model.multichoicesystem.Administrator#getPwd <em>Pwd</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.education.multichoicesystem.model.multichoicesystem.MultichoicesystemPackage#getAdministrator()
 * @model
 * @generated
 */
public interface Administrator extends EObject {
	/**
	 * Returns the value of the '<em><b>Multiple Choices</b></em>' containment reference list.
	 * The list contents are of type {@link org.education.multichoicesystem.model.multichoicesystem.MultipleChoice}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiple Choices</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiple Choices</em>' containment reference list.
	 * @see org.education.multichoicesystem.model.multichoicesystem.MultichoicesystemPackage#getAdministrator_MultipleChoices()
	 * @model containment="true"
	 * @generated
	 */
	EList<MultipleChoice> getMultipleChoices();

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
	 * @see org.education.multichoicesystem.model.multichoicesystem.MultichoicesystemPackage#getAdministrator_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.education.multichoicesystem.model.multichoicesystem.Administrator#getName <em>Name</em>}' attribute.
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
	 * @see org.education.multichoicesystem.model.multichoicesystem.MultichoicesystemPackage#getAdministrator_Pwd()
	 * @model
	 * @generated
	 */
	String getPwd();

	/**
	 * Sets the value of the '{@link org.education.multichoicesystem.model.multichoicesystem.Administrator#getPwd <em>Pwd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pwd</em>' attribute.
	 * @see #getPwd()
	 * @generated
	 */
	void setPwd(String value);

} // Administrator
