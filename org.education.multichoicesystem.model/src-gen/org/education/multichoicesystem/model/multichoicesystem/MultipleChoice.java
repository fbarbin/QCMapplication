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
 * A representation of the model object '<em><b>Multiple Choice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.education.multichoicesystem.model.multichoicesystem.MultipleChoice#getStatements <em>Statements</em>}</li>
 *   <li>{@link org.education.multichoicesystem.model.multichoicesystem.MultipleChoice#getTimeLimit <em>Time Limit</em>}</li>
 *   <li>{@link org.education.multichoicesystem.model.multichoicesystem.MultipleChoice#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.education.multichoicesystem.model.multichoicesystem.MultichoicesystemPackage#getMultipleChoice()
 * @model
 * @generated
 */
public interface MultipleChoice extends EObject {
	/**
	 * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
	 * The list contents are of type {@link org.education.multichoicesystem.model.multichoicesystem.Statement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statements</em>' containment reference list.
	 * @see org.education.multichoicesystem.model.multichoicesystem.MultichoicesystemPackage#getMultipleChoice_Statements()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Statement> getStatements();

	/**
	 * Returns the value of the '<em><b>Time Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Limit</em>' attribute.
	 * @see #setTimeLimit(int)
	 * @see org.education.multichoicesystem.model.multichoicesystem.MultichoicesystemPackage#getMultipleChoice_TimeLimit()
	 * @model
	 * @generated
	 */
	int getTimeLimit();

	/**
	 * Sets the value of the '{@link org.education.multichoicesystem.model.multichoicesystem.MultipleChoice#getTimeLimit <em>Time Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Limit</em>' attribute.
	 * @see #getTimeLimit()
	 * @generated
	 */
	void setTimeLimit(int value);

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
	 * @see org.education.multichoicesystem.model.multichoicesystem.MultichoicesystemPackage#getMultipleChoice_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.education.multichoicesystem.model.multichoicesystem.MultipleChoice#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // MultipleChoice
