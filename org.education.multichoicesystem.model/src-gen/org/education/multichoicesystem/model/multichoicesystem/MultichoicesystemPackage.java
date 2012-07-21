/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.education.multichoicesystem.model.multichoicesystem;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.education.multichoicesystem.model.multichoicesystem.MultichoicesystemFactory
 * @model kind="package"
 * @generated
 */
public interface MultichoicesystemPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "multichoicesystem";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://education/multichoice/model/multichoicesystem";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "multichoicesystem";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MultichoicesystemPackage eINSTANCE = org.education.multichoicesystem.model.multichoicesystem.impl.MultichoicesystemPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.education.multichoicesystem.model.multichoicesystem.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.education.multichoicesystem.model.multichoicesystem.impl.SystemImpl
	 * @see org.education.multichoicesystem.model.multichoicesystem.impl.MultichoicesystemPackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Administrators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__ADMINISTRATORS = 0;

	/**
	 * The feature id for the '<em><b>Users</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__USERS = 1;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.education.multichoicesystem.model.multichoicesystem.impl.MultipleChoiceImpl <em>Multiple Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.education.multichoicesystem.model.multichoicesystem.impl.MultipleChoiceImpl
	 * @see org.education.multichoicesystem.model.multichoicesystem.impl.MultichoicesystemPackageImpl#getMultipleChoice()
	 * @generated
	 */
	int MULTIPLE_CHOICE = 1;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE__STATEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Time Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE__TIME_LIMIT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Multiple Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.education.multichoicesystem.model.multichoicesystem.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.education.multichoicesystem.model.multichoicesystem.impl.UserImpl
	 * @see org.education.multichoicesystem.model.multichoicesystem.impl.MultichoicesystemPackageImpl#getUser()
	 * @generated
	 */
	int USER = 2;

	/**
	 * The feature id for the '<em><b>Filled QC Ms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__FILLED_QC_MS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__NAME = 1;

	/**
	 * The feature id for the '<em><b>Pwd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__PWD = 2;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.education.multichoicesystem.model.multichoicesystem.impl.AdministratorImpl <em>Administrator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.education.multichoicesystem.model.multichoicesystem.impl.AdministratorImpl
	 * @see org.education.multichoicesystem.model.multichoicesystem.impl.MultichoicesystemPackageImpl#getAdministrator()
	 * @generated
	 */
	int ADMINISTRATOR = 3;

	/**
	 * The feature id for the '<em><b>Multiple Choices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR__MULTIPLE_CHOICES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR__NAME = 1;

	/**
	 * The feature id for the '<em><b>Pwd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR__PWD = 2;

	/**
	 * The number of structural features of the '<em>Administrator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.education.multichoicesystem.model.multichoicesystem.impl.MultipleChoiceInstImpl <em>Multiple Choice Inst</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.education.multichoicesystem.model.multichoicesystem.impl.MultipleChoiceInstImpl
	 * @see org.education.multichoicesystem.model.multichoicesystem.impl.MultichoicesystemPackageImpl#getMultipleChoiceInst()
	 * @generated
	 */
	int MULTIPLE_CHOICE_INST = 4;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE_INST__DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>Can Edit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE_INST__CAN_EDIT = 1;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE_INST__STATEMENTS = 2;

	/**
	 * The number of structural features of the '<em>Multiple Choice Inst</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE_INST_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.education.multichoicesystem.model.multichoicesystem.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.education.multichoicesystem.model.multichoicesystem.impl.StatementImpl
	 * @see org.education.multichoicesystem.model.multichoicesystem.impl.MultichoicesystemPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 5;

	/**
	 * The feature id for the '<em><b>Answers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__ANSWERS = 0;

	/**
	 * The feature id for the '<em><b>Is Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__IS_MULTIPLE = 1;

	/**
	 * The feature id for the '<em><b>Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__POINTS = 2;

	/**
	 * The feature id for the '<em><b>Penality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__PENALITY = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__VALUE = 4;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__IMAGE = 5;

	/**
	 * The feature id for the '<em><b>Points By Answer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__POINTS_BY_ANSWER = 6;

	/**
	 * The feature id for the '<em><b>Penality By Answer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__PENALITY_BY_ANSWER = 7;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.education.multichoicesystem.model.multichoicesystem.impl.AnswerImpl <em>Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.education.multichoicesystem.model.multichoicesystem.impl.AnswerImpl
	 * @see org.education.multichoicesystem.model.multichoicesystem.impl.MultichoicesystemPackageImpl#getAnswer()
	 * @generated
	 */
	int ANSWER = 6;

	/**
	 * The feature id for the '<em><b>Is Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER__IS_RIGHT = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.education.multichoicesystem.model.multichoicesystem.impl.StatementInstImpl <em>Statement Inst</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.education.multichoicesystem.model.multichoicesystem.impl.StatementInstImpl
	 * @see org.education.multichoicesystem.model.multichoicesystem.impl.MultichoicesystemPackageImpl#getStatementInst()
	 * @generated
	 */
	int STATEMENT_INST = 7;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_INST__DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>Choices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_INST__CHOICES = 1;

	/**
	 * The number of structural features of the '<em>Statement Inst</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_INST_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link org.education.multichoicesystem.model.multichoicesystem.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see org.education.multichoicesystem.model.multichoicesystem.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link org.education.multichoicesystem.model.multichoicesystem.System#getAdministrators <em>Administrators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Administrators</em>'.
	 * @see org.education.multichoicesystem.model.multichoicesystem.System#getAdministrators()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Administrators();

	/**
	 * Returns the meta object for the containment reference list '{@link org.education.multichoicesystem.model.multichoicesystem.System#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Users</em>'.
	 * @see org.education.multichoicesystem.model.multichoicesystem.System#getUsers()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Users();

	/**
	 * Returns the meta object for class '{@link org.education.multichoicesystem.model.multichoicesystem.MultipleChoice <em>Multiple Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiple Choice</em>'.
	 * @see org.education.multichoicesystem.model.multichoicesystem.MultipleChoice
	 * @generated
	 */
	EClass getMultipleChoice();

	/**
	 * Returns the meta object for the containment reference list '{@link org.education.multichoicesystem.model.multichoicesystem.MultipleChoice#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see org.education.multichoicesystem.model.multichoicesystem.MultipleChoice#getStatements()
	 * @see #getMultipleChoice()
	 * @generated
	 */
	EReference getMultipleChoice_Statements();

	/**
	 * Returns the meta object for the attribute '{@link org.education.multichoicesystem.model.multichoicesystem.MultipleChoice#getTimeLimit <em>Time Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Limit</em>'.
	 * @see org.education.multichoicesystem.model.multichoicesystem.MultipleChoice#getTimeLimit()
	 * @see #getMultipleChoice()
	 * @generated
	 */
	EAttribute getMultipleChoice_TimeLimit();

	/**
	 * Returns the meta object for the attribute '{@link org.education.multichoicesystem.model.multichoicesystem.MultipleChoice#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.education.multichoicesystem.model.multichoicesystem.MultipleChoice#getName()
	 * @see #getMultipleChoice()
	 * @generated
	 */
	EAttribute getMultipleChoice_Name();

	/**
	 * Returns the meta object for class '{@link org.education.multichoicesystem.model.multichoicesystem.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see org.education.multichoicesystem.model.multichoicesystem.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the containment reference list '{@link org.education.multichoicesystem.model.multichoicesystem.User#getFilledQCMs <em>Filled QC Ms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filled QC Ms</em>'.
	 * @see org.education.multichoicesystem.model.multichoicesystem.User#getFilledQCMs()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_FilledQCMs();

	/**
	 * Returns the meta object for the attribute '{@link org.education.multichoicesystem.model.multichoicesystem.User#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.education.multichoicesystem.model.multichoicesystem.User#getName()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.education.multichoicesystem.model.multichoicesystem.User#getPwd <em>Pwd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pwd</em>'.
	 * @see org.education.multichoicesystem.model.multichoicesystem.User#getPwd()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Pwd();

	/**
	 * Returns the meta object for class '{@link org.education.multichoicesystem.model.multichoicesystem.Administrator <em>Administrator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Administrator</em>'.
	 * @see org.education.multichoicesystem.model.multichoicesystem.Administrator
	 * @generated
	 */
	EClass getAdministrator();

	/**
	 * Returns the meta object for the containment reference list '{@link org.education.multichoicesystem.model.multichoicesystem.Administrator#getMultipleChoices <em>Multiple Choices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Multiple Choices</em>'.
	 * @see org.education.multichoicesystem.model.multichoicesystem.Administrator#getMultipleChoices()
	 * @see #getAdministrator()
	 * @generated
	 */
	EReference getAdministrator_MultipleChoices();

	/**
	 * Returns the meta object for the attribute '{@link org.education.multichoicesystem.model.multichoicesystem.Administrator#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.education.multichoicesystem.model.multichoicesystem.Administrator#getName()
	 * @see #getAdministrator()
	 * @generated
	 */
	EAttribute getAdministrator_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.education.multichoicesystem.model.multichoicesystem.Administrator#getPwd <em>Pwd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pwd</em>'.
	 * @see org.education.multichoicesystem.model.multichoicesystem.Administrator#getPwd()
	 * @see #getAdministrator()
	 * @generated
	 */
	EAttribute getAdministrator_Pwd();

	/**
	 * Returns the meta object for class '{@link org.education.multichoicesystem.model.multichoicesystem.MultipleChoiceInst <em>Multiple Choice Inst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiple Choice Inst</em>'.
	 * @see org.education.multichoicesystem.model.multichoicesystem.MultipleChoiceInst
	 * @generated
	 */
	EClass getMultipleChoiceInst();

	/**
	 * Returns the meta object for the reference '{@link org.education.multichoicesystem.model.multichoicesystem.MultipleChoiceInst#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Definition</em>'.
	 * @see org.education.multichoicesystem.model.multichoicesystem.MultipleChoiceInst#getDefinition()
	 * @see #getMultipleChoiceInst()
	 * @generated
	 */
	EReference getMultipleChoiceInst_Definition();

	/**
	 * Returns the meta object for the attribute '{@link org.education.multichoicesystem.model.multichoicesystem.MultipleChoiceInst#isCanEdit <em>Can Edit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Can Edit</em>'.
	 * @see org.education.multichoicesystem.model.multichoicesystem.MultipleChoiceInst#isCanEdit()
	 * @see #getMultipleChoiceInst()
	 * @generated
	 */
	EAttribute getMultipleChoiceInst_CanEdit();

	/**
	 * Returns the meta object for the containment reference list '{@link org.education.multichoicesystem.model.multichoicesystem.MultipleChoiceInst#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see org.education.multichoicesystem.model.multichoicesystem.MultipleChoiceInst#getStatements()
	 * @see #getMultipleChoiceInst()
	 * @generated
	 */
	EReference getMultipleChoiceInst_Statements();

	/**
	 * Returns the meta object for class '{@link org.education.multichoicesystem.model.multichoicesystem.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see org.education.multichoicesystem.model.multichoicesystem.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.education.multichoicesystem.model.multichoicesystem.Statement#getAnswers <em>Answers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Answers</em>'.
	 * @see org.education.multichoicesystem.model.multichoicesystem.Statement#getAnswers()
	 * @see #getStatement()
	 * @generated
	 */
	EReference getStatement_Answers();

	/**
	 * Returns the meta object for the attribute '{@link org.education.multichoicesystem.model.multichoicesystem.Statement#isIsMultiple <em>Is Multiple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Multiple</em>'.
	 * @see org.education.multichoicesystem.model.multichoicesystem.Statement#isIsMultiple()
	 * @see #getStatement()
	 * @generated
	 */
	EAttribute getStatement_IsMultiple();

	/**
	 * Returns the meta object for the attribute '{@link org.education.multichoicesystem.model.multichoicesystem.Statement#getPoints <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Points</em>'.
	 * @see org.education.multichoicesystem.model.multichoicesystem.Statement#getPoints()
	 * @see #getStatement()
	 * @generated
	 */
	EAttribute getStatement_Points();

	/**
	 * Returns the meta object for the attribute '{@link org.education.multichoicesystem.model.multichoicesystem.Statement#getPenality <em>Penality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Penality</em>'.
	 * @see org.education.multichoicesystem.model.multichoicesystem.Statement#getPenality()
	 * @see #getStatement()
	 * @generated
	 */
	EAttribute getStatement_Penality();

	/**
	 * Returns the meta object for the attribute '{@link org.education.multichoicesystem.model.multichoicesystem.Statement#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.education.multichoicesystem.model.multichoicesystem.Statement#getValue()
	 * @see #getStatement()
	 * @generated
	 */
	EAttribute getStatement_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.education.multichoicesystem.model.multichoicesystem.Statement#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see org.education.multichoicesystem.model.multichoicesystem.Statement#getImage()
	 * @see #getStatement()
	 * @generated
	 */
	EAttribute getStatement_Image();

	/**
	 * Returns the meta object for the attribute '{@link org.education.multichoicesystem.model.multichoicesystem.Statement#getPointsByAnswer <em>Points By Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Points By Answer</em>'.
	 * @see org.education.multichoicesystem.model.multichoicesystem.Statement#getPointsByAnswer()
	 * @see #getStatement()
	 * @generated
	 */
	EAttribute getStatement_PointsByAnswer();

	/**
	 * Returns the meta object for the attribute '{@link org.education.multichoicesystem.model.multichoicesystem.Statement#getPenalityByAnswer <em>Penality By Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Penality By Answer</em>'.
	 * @see org.education.multichoicesystem.model.multichoicesystem.Statement#getPenalityByAnswer()
	 * @see #getStatement()
	 * @generated
	 */
	EAttribute getStatement_PenalityByAnswer();

	/**
	 * Returns the meta object for class '{@link org.education.multichoicesystem.model.multichoicesystem.Answer <em>Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Answer</em>'.
	 * @see org.education.multichoicesystem.model.multichoicesystem.Answer
	 * @generated
	 */
	EClass getAnswer();

	/**
	 * Returns the meta object for the attribute '{@link org.education.multichoicesystem.model.multichoicesystem.Answer#isIsRight <em>Is Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Right</em>'.
	 * @see org.education.multichoicesystem.model.multichoicesystem.Answer#isIsRight()
	 * @see #getAnswer()
	 * @generated
	 */
	EAttribute getAnswer_IsRight();

	/**
	 * Returns the meta object for the attribute '{@link org.education.multichoicesystem.model.multichoicesystem.Answer#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.education.multichoicesystem.model.multichoicesystem.Answer#getValue()
	 * @see #getAnswer()
	 * @generated
	 */
	EAttribute getAnswer_Value();

	/**
	 * Returns the meta object for class '{@link org.education.multichoicesystem.model.multichoicesystem.StatementInst <em>Statement Inst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement Inst</em>'.
	 * @see org.education.multichoicesystem.model.multichoicesystem.StatementInst
	 * @generated
	 */
	EClass getStatementInst();

	/**
	 * Returns the meta object for the reference '{@link org.education.multichoicesystem.model.multichoicesystem.StatementInst#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Definition</em>'.
	 * @see org.education.multichoicesystem.model.multichoicesystem.StatementInst#getDefinition()
	 * @see #getStatementInst()
	 * @generated
	 */
	EReference getStatementInst_Definition();

	/**
	 * Returns the meta object for the reference list '{@link org.education.multichoicesystem.model.multichoicesystem.StatementInst#getChoices <em>Choices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Choices</em>'.
	 * @see org.education.multichoicesystem.model.multichoicesystem.StatementInst#getChoices()
	 * @see #getStatementInst()
	 * @generated
	 */
	EReference getStatementInst_Choices();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MultichoicesystemFactory getMultichoicesystemFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.education.multichoicesystem.model.multichoicesystem.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.education.multichoicesystem.model.multichoicesystem.impl.SystemImpl
		 * @see org.education.multichoicesystem.model.multichoicesystem.impl.MultichoicesystemPackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '<em><b>Administrators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__ADMINISTRATORS = eINSTANCE.getSystem_Administrators();

		/**
		 * The meta object literal for the '<em><b>Users</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__USERS = eINSTANCE.getSystem_Users();

		/**
		 * The meta object literal for the '{@link org.education.multichoicesystem.model.multichoicesystem.impl.MultipleChoiceImpl <em>Multiple Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.education.multichoicesystem.model.multichoicesystem.impl.MultipleChoiceImpl
		 * @see org.education.multichoicesystem.model.multichoicesystem.impl.MultichoicesystemPackageImpl#getMultipleChoice()
		 * @generated
		 */
		EClass MULTIPLE_CHOICE = eINSTANCE.getMultipleChoice();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLE_CHOICE__STATEMENTS = eINSTANCE.getMultipleChoice_Statements();

		/**
		 * The meta object literal for the '<em><b>Time Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLE_CHOICE__TIME_LIMIT = eINSTANCE.getMultipleChoice_TimeLimit();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLE_CHOICE__NAME = eINSTANCE.getMultipleChoice_Name();

		/**
		 * The meta object literal for the '{@link org.education.multichoicesystem.model.multichoicesystem.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.education.multichoicesystem.model.multichoicesystem.impl.UserImpl
		 * @see org.education.multichoicesystem.model.multichoicesystem.impl.MultichoicesystemPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Filled QC Ms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__FILLED_QC_MS = eINSTANCE.getUser_FilledQCMs();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__NAME = eINSTANCE.getUser_Name();

		/**
		 * The meta object literal for the '<em><b>Pwd</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__PWD = eINSTANCE.getUser_Pwd();

		/**
		 * The meta object literal for the '{@link org.education.multichoicesystem.model.multichoicesystem.impl.AdministratorImpl <em>Administrator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.education.multichoicesystem.model.multichoicesystem.impl.AdministratorImpl
		 * @see org.education.multichoicesystem.model.multichoicesystem.impl.MultichoicesystemPackageImpl#getAdministrator()
		 * @generated
		 */
		EClass ADMINISTRATOR = eINSTANCE.getAdministrator();

		/**
		 * The meta object literal for the '<em><b>Multiple Choices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADMINISTRATOR__MULTIPLE_CHOICES = eINSTANCE.getAdministrator_MultipleChoices();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADMINISTRATOR__NAME = eINSTANCE.getAdministrator_Name();

		/**
		 * The meta object literal for the '<em><b>Pwd</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADMINISTRATOR__PWD = eINSTANCE.getAdministrator_Pwd();

		/**
		 * The meta object literal for the '{@link org.education.multichoicesystem.model.multichoicesystem.impl.MultipleChoiceInstImpl <em>Multiple Choice Inst</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.education.multichoicesystem.model.multichoicesystem.impl.MultipleChoiceInstImpl
		 * @see org.education.multichoicesystem.model.multichoicesystem.impl.MultichoicesystemPackageImpl#getMultipleChoiceInst()
		 * @generated
		 */
		EClass MULTIPLE_CHOICE_INST = eINSTANCE.getMultipleChoiceInst();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLE_CHOICE_INST__DEFINITION = eINSTANCE.getMultipleChoiceInst_Definition();

		/**
		 * The meta object literal for the '<em><b>Can Edit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLE_CHOICE_INST__CAN_EDIT = eINSTANCE.getMultipleChoiceInst_CanEdit();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLE_CHOICE_INST__STATEMENTS = eINSTANCE.getMultipleChoiceInst_Statements();

		/**
		 * The meta object literal for the '{@link org.education.multichoicesystem.model.multichoicesystem.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.education.multichoicesystem.model.multichoicesystem.impl.StatementImpl
		 * @see org.education.multichoicesystem.model.multichoicesystem.impl.MultichoicesystemPackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '<em><b>Answers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT__ANSWERS = eINSTANCE.getStatement_Answers();

		/**
		 * The meta object literal for the '<em><b>Is Multiple</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATEMENT__IS_MULTIPLE = eINSTANCE.getStatement_IsMultiple();

		/**
		 * The meta object literal for the '<em><b>Points</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATEMENT__POINTS = eINSTANCE.getStatement_Points();

		/**
		 * The meta object literal for the '<em><b>Penality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATEMENT__PENALITY = eINSTANCE.getStatement_Penality();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATEMENT__VALUE = eINSTANCE.getStatement_Value();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATEMENT__IMAGE = eINSTANCE.getStatement_Image();

		/**
		 * The meta object literal for the '<em><b>Points By Answer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATEMENT__POINTS_BY_ANSWER = eINSTANCE.getStatement_PointsByAnswer();

		/**
		 * The meta object literal for the '<em><b>Penality By Answer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATEMENT__PENALITY_BY_ANSWER = eINSTANCE.getStatement_PenalityByAnswer();

		/**
		 * The meta object literal for the '{@link org.education.multichoicesystem.model.multichoicesystem.impl.AnswerImpl <em>Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.education.multichoicesystem.model.multichoicesystem.impl.AnswerImpl
		 * @see org.education.multichoicesystem.model.multichoicesystem.impl.MultichoicesystemPackageImpl#getAnswer()
		 * @generated
		 */
		EClass ANSWER = eINSTANCE.getAnswer();

		/**
		 * The meta object literal for the '<em><b>Is Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANSWER__IS_RIGHT = eINSTANCE.getAnswer_IsRight();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANSWER__VALUE = eINSTANCE.getAnswer_Value();

		/**
		 * The meta object literal for the '{@link org.education.multichoicesystem.model.multichoicesystem.impl.StatementInstImpl <em>Statement Inst</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.education.multichoicesystem.model.multichoicesystem.impl.StatementInstImpl
		 * @see org.education.multichoicesystem.model.multichoicesystem.impl.MultichoicesystemPackageImpl#getStatementInst()
		 * @generated
		 */
		EClass STATEMENT_INST = eINSTANCE.getStatementInst();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT_INST__DEFINITION = eINSTANCE.getStatementInst_Definition();

		/**
		 * The meta object literal for the '<em><b>Choices</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT_INST__CHOICES = eINSTANCE.getStatementInst_Choices();

	}

} //MultichoicesystemPackage
