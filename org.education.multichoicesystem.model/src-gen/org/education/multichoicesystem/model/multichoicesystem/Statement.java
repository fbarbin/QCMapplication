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
 * A representation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.education.multichoicesystem.model.multichoicesystem.Statement#getAnswers <em>Answers</em>}</li>
 *   <li>{@link org.education.multichoicesystem.model.multichoicesystem.Statement#isIsMultiple <em>Is Multiple</em>}</li>
 *   <li>{@link org.education.multichoicesystem.model.multichoicesystem.Statement#getPoints <em>Points</em>}</li>
 *   <li>{@link org.education.multichoicesystem.model.multichoicesystem.Statement#getPenality <em>Penality</em>}</li>
 *   <li>{@link org.education.multichoicesystem.model.multichoicesystem.Statement#getValue <em>Value</em>}</li>
 *   <li>{@link org.education.multichoicesystem.model.multichoicesystem.Statement#getImage <em>Image</em>}</li>
 *   <li>{@link org.education.multichoicesystem.model.multichoicesystem.Statement#getPointsByAnswer <em>Points By Answer</em>}</li>
 *   <li>{@link org.education.multichoicesystem.model.multichoicesystem.Statement#getPenalityByAnswer <em>Penality By Answer</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.education.multichoicesystem.model.multichoicesystem.MultichoicesystemPackage#getStatement()
 * @model
 * @generated
 */
public interface Statement extends EObject {
	/**
	 * Returns the value of the '<em><b>Answers</b></em>' containment reference list.
	 * The list contents are of type {@link org.education.multichoicesystem.model.multichoicesystem.Answer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Answers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Answers</em>' containment reference list.
	 * @see org.education.multichoicesystem.model.multichoicesystem.MultichoicesystemPackage#getStatement_Answers()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Answer> getAnswers();

	/**
	 * Returns the value of the '<em><b>Is Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Multiple</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Multiple</em>' attribute.
	 * @see #setIsMultiple(boolean)
	 * @see org.education.multichoicesystem.model.multichoicesystem.MultichoicesystemPackage#getStatement_IsMultiple()
	 * @model
	 * @generated
	 */
	boolean isIsMultiple();

	/**
	 * Sets the value of the '{@link org.education.multichoicesystem.model.multichoicesystem.Statement#isIsMultiple <em>Is Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Multiple</em>' attribute.
	 * @see #isIsMultiple()
	 * @generated
	 */
	void setIsMultiple(boolean value);

	/**
	 * Returns the value of the '<em><b>Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Points</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Points</em>' attribute.
	 * @see #setPoints(int)
	 * @see org.education.multichoicesystem.model.multichoicesystem.MultichoicesystemPackage#getStatement_Points()
	 * @model
	 * @generated
	 */
	int getPoints();

	/**
	 * Sets the value of the '{@link org.education.multichoicesystem.model.multichoicesystem.Statement#getPoints <em>Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Points</em>' attribute.
	 * @see #getPoints()
	 * @generated
	 */
	void setPoints(int value);

	/**
	 * Returns the value of the '<em><b>Penality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Penality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Penality</em>' attribute.
	 * @see #setPenality(int)
	 * @see org.education.multichoicesystem.model.multichoicesystem.MultichoicesystemPackage#getStatement_Penality()
	 * @model
	 * @generated
	 */
	int getPenality();

	/**
	 * Sets the value of the '{@link org.education.multichoicesystem.model.multichoicesystem.Statement#getPenality <em>Penality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Penality</em>' attribute.
	 * @see #getPenality()
	 * @generated
	 */
	void setPenality(int value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.education.multichoicesystem.model.multichoicesystem.MultichoicesystemPackage#getStatement_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.education.multichoicesystem.model.multichoicesystem.Statement#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' attribute.
	 * @see #setImage(String)
	 * @see org.education.multichoicesystem.model.multichoicesystem.MultichoicesystemPackage#getStatement_Image()
	 * @model
	 * @generated
	 */
	String getImage();

	/**
	 * Sets the value of the '{@link org.education.multichoicesystem.model.multichoicesystem.Statement#getImage <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' attribute.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(String value);

	/**
	 * Returns the value of the '<em><b>Points By Answer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Points By Answer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Points By Answer</em>' attribute.
	 * @see #setPointsByAnswer(int)
	 * @see org.education.multichoicesystem.model.multichoicesystem.MultichoicesystemPackage#getStatement_PointsByAnswer()
	 * @model
	 * @generated
	 */
	int getPointsByAnswer();

	/**
	 * Sets the value of the '{@link org.education.multichoicesystem.model.multichoicesystem.Statement#getPointsByAnswer <em>Points By Answer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Points By Answer</em>' attribute.
	 * @see #getPointsByAnswer()
	 * @generated
	 */
	void setPointsByAnswer(int value);

	/**
	 * Returns the value of the '<em><b>Penality By Answer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Penality By Answer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Penality By Answer</em>' attribute.
	 * @see #setPenalityByAnswer(int)
	 * @see org.education.multichoicesystem.model.multichoicesystem.MultichoicesystemPackage#getStatement_PenalityByAnswer()
	 * @model
	 * @generated
	 */
	int getPenalityByAnswer();

	/**
	 * Sets the value of the '{@link org.education.multichoicesystem.model.multichoicesystem.Statement#getPenalityByAnswer <em>Penality By Answer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Penality By Answer</em>' attribute.
	 * @see #getPenalityByAnswer()
	 * @generated
	 */
	void setPenalityByAnswer(int value);

} // Statement
