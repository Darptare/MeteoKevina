/**
 */
package packages.Edition;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see packages.Edition.EditionFactory
 * @model kind="package"
 * @generated
 */
public interface EditionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Edition";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://packages/edition";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "edition";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EditionPackage eINSTANCE = packages.Edition.impl.EditionPackageImpl.init();

	/**
	 * The meta object id for the '{@link packages.Edition.InterEdit <em>Inter Edit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see packages.Edition.InterEdit
	 * @see packages.Edition.impl.EditionPackageImpl#getInterEdit()
	 * @generated
	 */
	int INTER_EDIT = 2;

	/**
	 * The number of structural features of the '<em>Inter Edit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_EDIT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Inter Edit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_EDIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link packages.Edition.impl.EdtionImpl <em>Edtion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see packages.Edition.impl.EdtionImpl
	 * @see packages.Edition.impl.EditionPackageImpl#getEdtion()
	 * @generated
	 */
	int EDTION = 3;

	/**
	 * The number of structural features of the '<em>Edtion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDTION_FEATURE_COUNT = INTER_EDIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Edtion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDTION_OPERATION_COUNT = INTER_EDIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link packages.Edition.impl.EditDonneeImpl <em>Edit Donnee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see packages.Edition.impl.EditDonneeImpl
	 * @see packages.Edition.impl.EditionPackageImpl#getEditDonnee()
	 * @generated
	 */
	int EDIT_DONNEE = 0;

	/**
	 * The number of structural features of the '<em>Edit Donnee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_DONNEE_FEATURE_COUNT = EDTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Change Direction</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_DONNEE___CHANGE_DIRECTION__DONNEE_DOUBLE = EDTION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Change Pression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_DONNEE___CHANGE_PRESSION__DONNEE_DOUBLE = EDTION_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Change Contraste</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_DONNEE___CHANGE_CONTRASTE__DONNEE_DOUBLE = EDTION_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Edit Donnee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_DONNEE_OPERATION_COUNT = EDTION_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link packages.Edition.impl.CreateDonneeImpl <em>Create Donnee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see packages.Edition.impl.CreateDonneeImpl
	 * @see packages.Edition.impl.EditionPackageImpl#getCreateDonnee()
	 * @generated
	 */
	int CREATE_DONNEE = 1;

	/**
	 * The number of structural features of the '<em>Create Donnee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_DONNEE_FEATURE_COUNT = EDTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_DONNEE___CREATE__DOUBLE_DOUBLE_DOUBLE_DOUBLE_DOUBLE_DOUBLE = EDTION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Create Donnee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_DONNEE_OPERATION_COUNT = EDTION_OPERATION_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link packages.Edition.EditDonnee <em>Edit Donnee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edit Donnee</em>'.
	 * @see packages.Edition.EditDonnee
	 * @generated
	 */
	EClass getEditDonnee();

	/**
	 * Returns the meta object for the '{@link packages.Edition.EditDonnee#changeDirection(packages.Prevision.Donnee, double) <em>Change Direction</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Direction</em>' operation.
	 * @see packages.Edition.EditDonnee#changeDirection(packages.Prevision.Donnee, double)
	 * @generated
	 */
	EOperation getEditDonnee__ChangeDirection__Donnee_double();

	/**
	 * Returns the meta object for the '{@link packages.Edition.EditDonnee#changePression(packages.Prevision.Donnee, double) <em>Change Pression</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Pression</em>' operation.
	 * @see packages.Edition.EditDonnee#changePression(packages.Prevision.Donnee, double)
	 * @generated
	 */
	EOperation getEditDonnee__ChangePression__Donnee_double();

	/**
	 * Returns the meta object for the '{@link packages.Edition.EditDonnee#changeContraste(packages.Prevision.Donnee, double) <em>Change Contraste</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Contraste</em>' operation.
	 * @see packages.Edition.EditDonnee#changeContraste(packages.Prevision.Donnee, double)
	 * @generated
	 */
	EOperation getEditDonnee__ChangeContraste__Donnee_double();

	/**
	 * Returns the meta object for class '{@link packages.Edition.CreateDonnee <em>Create Donnee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Donnee</em>'.
	 * @see packages.Edition.CreateDonnee
	 * @generated
	 */
	EClass getCreateDonnee();

	/**
	 * Returns the meta object for the '{@link packages.Edition.CreateDonnee#create(double, double, double, double, double, double) <em>Create</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create</em>' operation.
	 * @see packages.Edition.CreateDonnee#create(double, double, double, double, double, double)
	 * @generated
	 */
	EOperation getCreateDonnee__Create__double_double_double_double_double_double();

	/**
	 * Returns the meta object for class '{@link packages.Edition.InterEdit <em>Inter Edit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inter Edit</em>'.
	 * @see packages.Edition.InterEdit
	 * @generated
	 */
	EClass getInterEdit();

	/**
	 * Returns the meta object for class '{@link packages.Edition.Edtion <em>Edtion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edtion</em>'.
	 * @see packages.Edition.Edtion
	 * @generated
	 */
	EClass getEdtion();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EditionFactory getEditionFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link packages.Edition.impl.EditDonneeImpl <em>Edit Donnee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see packages.Edition.impl.EditDonneeImpl
		 * @see packages.Edition.impl.EditionPackageImpl#getEditDonnee()
		 * @generated
		 */
		EClass EDIT_DONNEE = eINSTANCE.getEditDonnee();

		/**
		 * The meta object literal for the '<em><b>Change Direction</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EDIT_DONNEE___CHANGE_DIRECTION__DONNEE_DOUBLE = eINSTANCE.getEditDonnee__ChangeDirection__Donnee_double();

		/**
		 * The meta object literal for the '<em><b>Change Pression</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EDIT_DONNEE___CHANGE_PRESSION__DONNEE_DOUBLE = eINSTANCE.getEditDonnee__ChangePression__Donnee_double();

		/**
		 * The meta object literal for the '<em><b>Change Contraste</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EDIT_DONNEE___CHANGE_CONTRASTE__DONNEE_DOUBLE = eINSTANCE.getEditDonnee__ChangeContraste__Donnee_double();

		/**
		 * The meta object literal for the '{@link packages.Edition.impl.CreateDonneeImpl <em>Create Donnee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see packages.Edition.impl.CreateDonneeImpl
		 * @see packages.Edition.impl.EditionPackageImpl#getCreateDonnee()
		 * @generated
		 */
		EClass CREATE_DONNEE = eINSTANCE.getCreateDonnee();

		/**
		 * The meta object literal for the '<em><b>Create</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CREATE_DONNEE___CREATE__DOUBLE_DOUBLE_DOUBLE_DOUBLE_DOUBLE_DOUBLE = eINSTANCE.getCreateDonnee__Create__double_double_double_double_double_double();

		/**
		 * The meta object literal for the '{@link packages.Edition.InterEdit <em>Inter Edit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see packages.Edition.InterEdit
		 * @see packages.Edition.impl.EditionPackageImpl#getInterEdit()
		 * @generated
		 */
		EClass INTER_EDIT = eINSTANCE.getInterEdit();

		/**
		 * The meta object literal for the '{@link packages.Edition.impl.EdtionImpl <em>Edtion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see packages.Edition.impl.EdtionImpl
		 * @see packages.Edition.impl.EditionPackageImpl#getEdtion()
		 * @generated
		 */
		EClass EDTION = eINSTANCE.getEdtion();

	}

} //EditionPackage
