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
 * A representation of the model object '<em><b>Multiple Choice Inst</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.education.multichoicesystem.model.multichoicesystem.MultipleChoiceInst#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.education.multichoicesystem.model.multichoicesystem.MultipleChoiceInst#isCanEdit <em>Can Edit</em>}</li>
 *   <li>{@link org.education.multichoicesystem.model.multichoicesystem.MultipleChoiceInst#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.education.multichoicesystem.model.multichoicesystem.MultichoicesystemPackage#getMultipleChoiceInst()
 * @model
 * @generated
 */
public interface MultipleChoiceInst extends EObject {
	/**
	 * Returns the value of the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' reference.
	 * @see #setDefinition(MultipleChoice)
	 * @see org.education.multichoicesystem.model.multichoicesystem.MultichoicesystemPackage#getMultipleChoiceInst_Definition()
	 * @model required="true"
	 * @generated
	 */
	MultipleChoice getDefinition();

	/**
	 * Sets the value of the '{@link org.education.multichoicesystem.model.multichoicesystem.MultipleChoiceInst#getDefinition <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(MultipleChoice value);

	/**
	 * Returns the value of the '<em><b>Can Edit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Can Edit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Can Edit</em>' attribute.
	 * @see #setCanEdit(boolean)
	 * @see org.education.multichoicesystem.model.multichoicesystem.MultichoicesystemPackage#getMultipleChoiceInst_CanEdit()
	 * @model
	 * @generated
	 */
	boolean isCanEdit();

	/**
	 * Sets the value of the '{@link org.education.multichoicesystem.model.multichoicesystem.MultipleChoiceInst#isCanEdit <em>Can Edit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can Edit</em>' attribute.
	 * @see #isCanEdit()
	 * @generated
	 */
	void setCanEdit(boolean value);

	/**
	 * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
	 * The list contents are of type {@link org.education.multichoicesystem.model.multichoicesystem.StatementInst}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statements</em>' containment reference list.
	 * @see org.education.multichoicesystem.model.multichoicesystem.MultichoicesystemPackage#getMultipleChoiceInst_Statements()
	 * @model containment="true"
	 * @generated
	 */
	EList<StatementInst> getStatements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void awardedPoints();

} // MultipleChoiceInst
