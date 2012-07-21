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
import org.education.multichoicesystem.model.multichoicesystem.MultichoicesystemPackage;
import org.education.multichoicesystem.model.multichoicesystem.MultipleChoice;
import org.education.multichoicesystem.model.multichoicesystem.MultipleChoiceInst;
import org.education.multichoicesystem.model.multichoicesystem.StatementInst;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multiple Choice Inst</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.education.multichoicesystem.model.multichoicesystem.impl.MultipleChoiceInstImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.education.multichoicesystem.model.multichoicesystem.impl.MultipleChoiceInstImpl#isCanEdit <em>Can Edit</em>}</li>
 *   <li>{@link org.education.multichoicesystem.model.multichoicesystem.impl.MultipleChoiceInstImpl#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultipleChoiceInstImpl extends EObjectImpl implements MultipleChoiceInst {
	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected MultipleChoice definition;

	/**
	 * The default value of the '{@link #isCanEdit() <em>Can Edit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanEdit()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CAN_EDIT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCanEdit() <em>Can Edit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanEdit()
	 * @generated
	 * @ordered
	 */
	protected boolean canEdit = CAN_EDIT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStatements() <em>Statements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatements()
	 * @generated
	 * @ordered
	 */
	protected EList<StatementInst> statements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultipleChoiceInstImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MultichoicesystemPackage.Literals.MULTIPLE_CHOICE_INST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleChoice getDefinition() {
		if (definition != null && definition.eIsProxy()) {
			InternalEObject oldDefinition = (InternalEObject)definition;
			definition = (MultipleChoice)eResolveProxy(oldDefinition);
			if (definition != oldDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MultichoicesystemPackage.MULTIPLE_CHOICE_INST__DEFINITION, oldDefinition, definition));
			}
		}
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleChoice basicGetDefinition() {
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinition(MultipleChoice newDefinition) {
		MultipleChoice oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MultichoicesystemPackage.MULTIPLE_CHOICE_INST__DEFINITION, oldDefinition, definition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCanEdit() {
		return canEdit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCanEdit(boolean newCanEdit) {
		boolean oldCanEdit = canEdit;
		canEdit = newCanEdit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MultichoicesystemPackage.MULTIPLE_CHOICE_INST__CAN_EDIT, oldCanEdit, canEdit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StatementInst> getStatements() {
		if (statements == null) {
			statements = new EObjectContainmentEList<StatementInst>(StatementInst.class, this, MultichoicesystemPackage.MULTIPLE_CHOICE_INST__STATEMENTS);
		}
		return statements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void awardedPoints() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MultichoicesystemPackage.MULTIPLE_CHOICE_INST__STATEMENTS:
				return ((InternalEList<?>)getStatements()).basicRemove(otherEnd, msgs);
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
			case MultichoicesystemPackage.MULTIPLE_CHOICE_INST__DEFINITION:
				if (resolve) return getDefinition();
				return basicGetDefinition();
			case MultichoicesystemPackage.MULTIPLE_CHOICE_INST__CAN_EDIT:
				return isCanEdit();
			case MultichoicesystemPackage.MULTIPLE_CHOICE_INST__STATEMENTS:
				return getStatements();
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
			case MultichoicesystemPackage.MULTIPLE_CHOICE_INST__DEFINITION:
				setDefinition((MultipleChoice)newValue);
				return;
			case MultichoicesystemPackage.MULTIPLE_CHOICE_INST__CAN_EDIT:
				setCanEdit((Boolean)newValue);
				return;
			case MultichoicesystemPackage.MULTIPLE_CHOICE_INST__STATEMENTS:
				getStatements().clear();
				getStatements().addAll((Collection<? extends StatementInst>)newValue);
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
			case MultichoicesystemPackage.MULTIPLE_CHOICE_INST__DEFINITION:
				setDefinition((MultipleChoice)null);
				return;
			case MultichoicesystemPackage.MULTIPLE_CHOICE_INST__CAN_EDIT:
				setCanEdit(CAN_EDIT_EDEFAULT);
				return;
			case MultichoicesystemPackage.MULTIPLE_CHOICE_INST__STATEMENTS:
				getStatements().clear();
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
			case MultichoicesystemPackage.MULTIPLE_CHOICE_INST__DEFINITION:
				return definition != null;
			case MultichoicesystemPackage.MULTIPLE_CHOICE_INST__CAN_EDIT:
				return canEdit != CAN_EDIT_EDEFAULT;
			case MultichoicesystemPackage.MULTIPLE_CHOICE_INST__STATEMENTS:
				return statements != null && !statements.isEmpty();
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
		result.append(" (canEdit: ");
		result.append(canEdit);
		result.append(')');
		return result.toString();
	}

} //MultipleChoiceInstImpl
