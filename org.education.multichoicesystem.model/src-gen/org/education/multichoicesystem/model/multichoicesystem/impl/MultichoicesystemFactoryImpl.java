/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.education.multichoicesystem.model.multichoicesystem.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.education.multichoicesystem.model.multichoicesystem.Administrator;
import org.education.multichoicesystem.model.multichoicesystem.Answer;
import org.education.multichoicesystem.model.multichoicesystem.MultichoicesystemFactory;
import org.education.multichoicesystem.model.multichoicesystem.MultichoicesystemPackage;
import org.education.multichoicesystem.model.multichoicesystem.MultipleChoice;
import org.education.multichoicesystem.model.multichoicesystem.MultipleChoiceInst;
import org.education.multichoicesystem.model.multichoicesystem.Statement;
import org.education.multichoicesystem.model.multichoicesystem.StatementInst;
import org.education.multichoicesystem.model.multichoicesystem.User;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MultichoicesystemFactoryImpl extends EFactoryImpl implements MultichoicesystemFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MultichoicesystemFactory init() {
		try {
			MultichoicesystemFactory theMultichoicesystemFactory = (MultichoicesystemFactory)EPackage.Registry.INSTANCE.getEFactory("http://education/multichoice/model/multichoicesystem"); 
			if (theMultichoicesystemFactory != null) {
				return theMultichoicesystemFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MultichoicesystemFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultichoicesystemFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MultichoicesystemPackage.SYSTEM: return createSystem();
			case MultichoicesystemPackage.MULTIPLE_CHOICE: return createMultipleChoice();
			case MultichoicesystemPackage.USER: return createUser();
			case MultichoicesystemPackage.ADMINISTRATOR: return createAdministrator();
			case MultichoicesystemPackage.MULTIPLE_CHOICE_INST: return createMultipleChoiceInst();
			case MultichoicesystemPackage.STATEMENT: return createStatement();
			case MultichoicesystemPackage.ANSWER: return createAnswer();
			case MultichoicesystemPackage.STATEMENT_INST: return createStatementInst();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.education.multichoicesystem.model.multichoicesystem.System createSystem() {
		SystemImpl system = new SystemImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleChoice createMultipleChoice() {
		MultipleChoiceImpl multipleChoice = new MultipleChoiceImpl();
		return multipleChoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User createUser() {
		UserImpl user = new UserImpl();
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Administrator createAdministrator() {
		AdministratorImpl administrator = new AdministratorImpl();
		return administrator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleChoiceInst createMultipleChoiceInst() {
		MultipleChoiceInstImpl multipleChoiceInst = new MultipleChoiceInstImpl();
		return multipleChoiceInst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement createStatement() {
		StatementImpl statement = new StatementImpl();
		return statement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Answer createAnswer() {
		AnswerImpl answer = new AnswerImpl();
		return answer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatementInst createStatementInst() {
		StatementInstImpl statementInst = new StatementInstImpl();
		return statementInst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultichoicesystemPackage getMultichoicesystemPackage() {
		return (MultichoicesystemPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MultichoicesystemPackage getPackage() {
		return MultichoicesystemPackage.eINSTANCE;
	}

} //MultichoicesystemFactoryImpl
