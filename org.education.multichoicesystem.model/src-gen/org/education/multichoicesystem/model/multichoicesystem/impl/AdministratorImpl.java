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
import org.education.multichoicesystem.model.multichoicesystem.Administrator;
import org.education.multichoicesystem.model.multichoicesystem.MultichoicesystemPackage;
import org.education.multichoicesystem.model.multichoicesystem.MultipleChoice;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Administrator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.education.multichoicesystem.model.multichoicesystem.impl.AdministratorImpl#getMultipleChoices <em>Multiple Choices</em>}</li>
 *   <li>{@link org.education.multichoicesystem.model.multichoicesystem.impl.AdministratorImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.education.multichoicesystem.model.multichoicesystem.impl.AdministratorImpl#getPwd <em>Pwd</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdministratorImpl extends EObjectImpl implements Administrator {
	/**
	 * The cached value of the '{@link #getMultipleChoices() <em>Multiple Choices</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultipleChoices()
	 * @generated
	 * @ordered
	 */
	protected EList<MultipleChoice> multipleChoices;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPwd() <em>Pwd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPwd()
	 * @generated
	 * @ordered
	 */
	protected static final String PWD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPwd() <em>Pwd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPwd()
	 * @generated
	 * @ordered
	 */
	protected String pwd = PWD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdministratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MultichoicesystemPackage.Literals.ADMINISTRATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MultipleChoice> getMultipleChoices() {
		if (multipleChoices == null) {
			multipleChoices = new EObjectContainmentEList<MultipleChoice>(MultipleChoice.class, this, MultichoicesystemPackage.ADMINISTRATOR__MULTIPLE_CHOICES);
		}
		return multipleChoices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MultichoicesystemPackage.ADMINISTRATOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPwd() {
		return pwd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPwd(String newPwd) {
		String oldPwd = pwd;
		pwd = newPwd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MultichoicesystemPackage.ADMINISTRATOR__PWD, oldPwd, pwd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MultichoicesystemPackage.ADMINISTRATOR__MULTIPLE_CHOICES:
				return ((InternalEList<?>)getMultipleChoices()).basicRemove(otherEnd, msgs);
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
			case MultichoicesystemPackage.ADMINISTRATOR__MULTIPLE_CHOICES:
				return getMultipleChoices();
			case MultichoicesystemPackage.ADMINISTRATOR__NAME:
				return getName();
			case MultichoicesystemPackage.ADMINISTRATOR__PWD:
				return getPwd();
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
			case MultichoicesystemPackage.ADMINISTRATOR__MULTIPLE_CHOICES:
				getMultipleChoices().clear();
				getMultipleChoices().addAll((Collection<? extends MultipleChoice>)newValue);
				return;
			case MultichoicesystemPackage.ADMINISTRATOR__NAME:
				setName((String)newValue);
				return;
			case MultichoicesystemPackage.ADMINISTRATOR__PWD:
				setPwd((String)newValue);
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
			case MultichoicesystemPackage.ADMINISTRATOR__MULTIPLE_CHOICES:
				getMultipleChoices().clear();
				return;
			case MultichoicesystemPackage.ADMINISTRATOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MultichoicesystemPackage.ADMINISTRATOR__PWD:
				setPwd(PWD_EDEFAULT);
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
			case MultichoicesystemPackage.ADMINISTRATOR__MULTIPLE_CHOICES:
				return multipleChoices != null && !multipleChoices.isEmpty();
			case MultichoicesystemPackage.ADMINISTRATOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MultichoicesystemPackage.ADMINISTRATOR__PWD:
				return PWD_EDEFAULT == null ? pwd != null : !PWD_EDEFAULT.equals(pwd);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", pwd: ");
		result.append(pwd);
		result.append(')');
		return result.toString();
	}

} //AdministratorImpl
