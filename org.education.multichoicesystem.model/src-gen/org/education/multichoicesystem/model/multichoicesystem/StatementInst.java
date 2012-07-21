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
 * A representation of the model object '<em><b>Statement Inst</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.education.multichoicesystem.model.multichoicesystem.StatementInst#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.education.multichoicesystem.model.multichoicesystem.StatementInst#getChoices <em>Choices</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.education.multichoicesystem.model.multichoicesystem.MultichoicesystemPackage#getStatementInst()
 * @model
 * @generated
 */
public interface StatementInst extends EObject {
	/**
	 * Returns the value of the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' reference.
	 * @see #setDefinition(Statement)
	 * @see org.education.multichoicesystem.model.multichoicesystem.MultichoicesystemPackage#getStatementInst_Definition()
	 * @model required="true"
	 * @generated
	 */
	Statement getDefinition();

	/**
	 * Sets the value of the '{@link org.education.multichoicesystem.model.multichoicesystem.StatementInst#getDefinition <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(Statement value);

	/**
	 * Returns the value of the '<em><b>Choices</b></em>' reference list.
	 * The list contents are of type {@link org.education.multichoicesystem.model.multichoicesystem.Answer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Choices</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Choices</em>' reference list.
	 * @see org.education.multichoicesystem.model.multichoicesystem.MultichoicesystemPackage#getStatementInst_Choices()
	 * @model
	 * @generated
	 */
	EList<Answer> getChoices();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void awardedPoints();

} // StatementInst
