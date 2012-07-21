/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.education.multichoicesystem.model.multichoicesystem.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.education.multichoicesystem.model.multichoicesystem.Answer;
import org.education.multichoicesystem.model.multichoicesystem.MultichoicesystemPackage;
import org.education.multichoicesystem.model.multichoicesystem.Statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.education.multichoicesystem.model.multichoicesystem.impl.StatementImpl#getAnswers <em>Answers</em>}</li>
 *   <li>{@link org.education.multichoicesystem.model.multichoicesystem.impl.StatementImpl#isIsMultiple <em>Is Multiple</em>}</li>
 *   <li>{@link org.education.multichoicesystem.model.multichoicesystem.impl.StatementImpl#getPoints <em>Points</em>}</li>
 *   <li>{@link org.education.multichoicesystem.model.multichoicesystem.impl.StatementImpl#getPenality <em>Penality</em>}</li>
 *   <li>{@link org.education.multichoicesystem.model.multichoicesystem.impl.StatementImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.education.multichoicesystem.model.multichoicesystem.impl.StatementImpl#getImage <em>Image</em>}</li>
 *   <li>{@link org.education.multichoicesystem.model.multichoicesystem.impl.StatementImpl#getPointsByAnswer <em>Points By Answer</em>}</li>
 *   <li>{@link org.education.multichoicesystem.model.multichoicesystem.impl.StatementImpl#getPenalityByAnswer <em>Penality By Answer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StatementImpl extends EObjectImpl implements Statement {
	/**
	 * The cached value of the '{@link #getAnswers() <em>Answers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnswers()
	 * @generated
	 * @ordered
	 */
	protected EList<Answer> answers;

	/**
	 * The default value of the '{@link #isIsMultiple() <em>Is Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMultiple()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MULTIPLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsMultiple() <em>Is Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMultiple()
	 * @generated
	 * @ordered
	 */
	protected boolean isMultiple = IS_MULTIPLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPoints() <em>Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoints()
	 * @generated
	 * @ordered
	 */
	protected static final int POINTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPoints() <em>Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoints()
	 * @generated
	 * @ordered
	 */
	protected int points = POINTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPenality() <em>Penality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPenality()
	 * @generated
	 * @ordered
	 */
	protected static final int PENALITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPenality() <em>Penality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPenality()
	 * @generated
	 * @ordered
	 */
	protected int penality = PENALITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected String image = IMAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPointsByAnswer() <em>Points By Answer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointsByAnswer()
	 * @generated
	 * @ordered
	 */
	protected static final int POINTS_BY_ANSWER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPointsByAnswer() <em>Points By Answer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointsByAnswer()
	 * @generated
	 * @ordered
	 */
	protected int pointsByAnswer = POINTS_BY_ANSWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPenalityByAnswer() <em>Penality By Answer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPenalityByAnswer()
	 * @generated
	 * @ordered
	 */
	protected static final int PENALITY_BY_ANSWER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPenalityByAnswer() <em>Penality By Answer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPenalityByAnswer()
	 * @generated
	 * @ordered
	 */
	protected int penalityByAnswer = PENALITY_BY_ANSWER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MultichoicesystemPackage.Literals.STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Answer> getAnswers() {
		if (answers == null) {
			answers = new EObjectContainmentEList<Answer>(Answer.class, this, MultichoicesystemPackage.STATEMENT__ANSWERS);
		}
		return answers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsMultiple() {
		return isMultiple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMultiple(boolean newIsMultiple) {
		boolean oldIsMultiple = isMultiple;
		isMultiple = newIsMultiple;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MultichoicesystemPackage.STATEMENT__IS_MULTIPLE, oldIsMultiple, isMultiple));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPoints() {
		return points;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoints(int newPoints) {
		int oldPoints = points;
		points = newPoints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MultichoicesystemPackage.STATEMENT__POINTS, oldPoints, points));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPenality() {
		return penality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPenality(int newPenality) {
		int oldPenality = penality;
		penality = newPenality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MultichoicesystemPackage.STATEMENT__PENALITY, oldPenality, penality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MultichoicesystemPackage.STATEMENT__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImage() {
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImage(String newImage) {
		String oldImage = image;
		image = newImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MultichoicesystemPackage.STATEMENT__IMAGE, oldImage, image));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPointsByAnswer() {
		return pointsByAnswer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPointsByAnswer(int newPointsByAnswer) {
		int oldPointsByAnswer = pointsByAnswer;
		pointsByAnswer = newPointsByAnswer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MultichoicesystemPackage.STATEMENT__POINTS_BY_ANSWER, oldPointsByAnswer, pointsByAnswer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPenalityByAnswer() {
		return penalityByAnswer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPenalityByAnswer(int newPenalityByAnswer) {
		int oldPenalityByAnswer = penalityByAnswer;
		penalityByAnswer = newPenalityByAnswer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MultichoicesystemPackage.STATEMENT__PENALITY_BY_ANSWER, oldPenalityByAnswer, penalityByAnswer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MultichoicesystemPackage.STATEMENT__ANSWERS:
				return ((InternalEList<?>)getAnswers()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MultichoicesystemPackage.STATEMENT__ANSWERS:
				return getAnswers();
			case MultichoicesystemPackage.STATEMENT__IS_MULTIPLE:
				return isIsMultiple();
			case MultichoicesystemPackage.STATEMENT__POINTS:
				return getPoints();
			case MultichoicesystemPackage.STATEMENT__PENALITY:
				return getPenality();
			case MultichoicesystemPackage.STATEMENT__VALUE:
				return getValue();
			case MultichoicesystemPackage.STATEMENT__IMAGE:
				return getImage();
			case MultichoicesystemPackage.STATEMENT__POINTS_BY_ANSWER:
				return getPointsByAnswer();
			case MultichoicesystemPackage.STATEMENT__PENALITY_BY_ANSWER:
				return getPenalityByAnswer();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MultichoicesystemPackage.STATEMENT__ANSWERS:
				getAnswers().clear();
				getAnswers().addAll((Collection<? extends Answer>)newValue);
				return;
			case MultichoicesystemPackage.STATEMENT__IS_MULTIPLE:
				setIsMultiple((Boolean)newValue);
				return;
			case MultichoicesystemPackage.STATEMENT__POINTS:
				setPoints((Integer)newValue);
				return;
			case MultichoicesystemPackage.STATEMENT__PENALITY:
				setPenality((Integer)newValue);
				return;
			case MultichoicesystemPackage.STATEMENT__VALUE:
				setValue((String)newValue);
				return;
			case MultichoicesystemPackage.STATEMENT__IMAGE:
				setImage((String)newValue);
				return;
			case MultichoicesystemPackage.STATEMENT__POINTS_BY_ANSWER:
				setPointsByAnswer((Integer)newValue);
				return;
			case MultichoicesystemPackage.STATEMENT__PENALITY_BY_ANSWER:
				setPenalityByAnswer((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MultichoicesystemPackage.STATEMENT__ANSWERS:
				getAnswers().clear();
				return;
			case MultichoicesystemPackage.STATEMENT__IS_MULTIPLE:
				setIsMultiple(IS_MULTIPLE_EDEFAULT);
				return;
			case MultichoicesystemPackage.STATEMENT__POINTS:
				setPoints(POINTS_EDEFAULT);
				return;
			case MultichoicesystemPackage.STATEMENT__PENALITY:
				setPenality(PENALITY_EDEFAULT);
				return;
			case MultichoicesystemPackage.STATEMENT__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case MultichoicesystemPackage.STATEMENT__IMAGE:
				setImage(IMAGE_EDEFAULT);
				return;
			case MultichoicesystemPackage.STATEMENT__POINTS_BY_ANSWER:
				setPointsByAnswer(POINTS_BY_ANSWER_EDEFAULT);
				return;
			case MultichoicesystemPackage.STATEMENT__PENALITY_BY_ANSWER:
				setPenalityByAnswer(PENALITY_BY_ANSWER_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MultichoicesystemPackage.STATEMENT__ANSWERS:
				return answers != null && !answers.isEmpty();
			case MultichoicesystemPackage.STATEMENT__IS_MULTIPLE:
				return isMultiple != IS_MULTIPLE_EDEFAULT;
			case MultichoicesystemPackage.STATEMENT__POINTS:
				return points != POINTS_EDEFAULT;
			case MultichoicesystemPackage.STATEMENT__PENALITY:
				return penality != PENALITY_EDEFAULT;
			case MultichoicesystemPackage.STATEMENT__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case MultichoicesystemPackage.STATEMENT__IMAGE:
				return IMAGE_EDEFAULT == null ? image != null : !IMAGE_EDEFAULT.equals(image);
			case MultichoicesystemPackage.STATEMENT__POINTS_BY_ANSWER:
				return pointsByAnswer != POINTS_BY_ANSWER_EDEFAULT;
			case MultichoicesystemPackage.STATEMENT__PENALITY_BY_ANSWER:
				return penalityByAnswer != PENALITY_BY_ANSWER_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isMultiple: ");
		result.append(isMultiple);
		result.append(", points: ");
		result.append(points);
		result.append(", penality: ");
		result.append(penality);
		result.append(", value: ");
		result.append(value);
		result.append(", image: ");
		result.append(image);
		result.append(", pointsByAnswer: ");
		result.append(pointsByAnswer);
		result.append(", penalityByAnswer: ");
		result.append(penalityByAnswer);
		result.append(')');
		return result.toString();
	}

} //StatementImpl
