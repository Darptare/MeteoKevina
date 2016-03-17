/**
 */
package packages.Calcul;

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
 * @see packages.Calcul.CalculFactory
 * @model kind="package"
 * @generated
 */
public interface CalculPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Calcul";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://packages/calcul";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "calcul";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CalculPackage eINSTANCE = packages.Calcul.impl.CalculPackageImpl.init();

	/**
	 * The meta object id for the '{@link packages.Calcul.InterCalc <em>Inter Calc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see packages.Calcul.InterCalc
	 * @see packages.Calcul.impl.CalculPackageImpl#getInterCalc()
	 * @generated
	 */
	int INTER_CALC = 1;

	/**
	 * The number of structural features of the '<em>Inter Calc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_CALC_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Inter Calc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_CALC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link packages.Calcul.impl.CalculImpl <em>Calcul</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see packages.Calcul.impl.CalculImpl
	 * @see packages.Calcul.impl.CalculPackageImpl#getCalcul()
	 * @generated
	 */
	int CALCUL = 0;

	/**
	 * The number of structural features of the '<em>Calcul</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCUL_FEATURE_COUNT = INTER_CALC_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Interpoler</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCUL___INTERPOLER__DONNEE_DONNEE_DONNEE_DONNEE_DOUBLE_DOUBLE = INTER_CALC_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Calcul</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCUL_OPERATION_COUNT = INTER_CALC_OPERATION_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link packages.Calcul.Calcul <em>Calcul</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calcul</em>'.
	 * @see packages.Calcul.Calcul
	 * @generated
	 */
	EClass getCalcul();

	/**
	 * Returns the meta object for the '{@link packages.Calcul.Calcul#interpoler(packages.Prevision.Donnee, packages.Prevision.Donnee, packages.Prevision.Donnee, packages.Prevision.Donnee, double, double) <em>Interpoler</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Interpoler</em>' operation.
	 * @see packages.Calcul.Calcul#interpoler(packages.Prevision.Donnee, packages.Prevision.Donnee, packages.Prevision.Donnee, packages.Prevision.Donnee, double, double)
	 * @generated
	 */
	EOperation getCalcul__Interpoler__Donnee_Donnee_Donnee_Donnee_double_double();

	/**
	 * Returns the meta object for class '{@link packages.Calcul.InterCalc <em>Inter Calc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inter Calc</em>'.
	 * @see packages.Calcul.InterCalc
	 * @generated
	 */
	EClass getInterCalc();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CalculFactory getCalculFactory();

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
		 * The meta object literal for the '{@link packages.Calcul.impl.CalculImpl <em>Calcul</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see packages.Calcul.impl.CalculImpl
		 * @see packages.Calcul.impl.CalculPackageImpl#getCalcul()
		 * @generated
		 */
		EClass CALCUL = eINSTANCE.getCalcul();

		/**
		 * The meta object literal for the '<em><b>Interpoler</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CALCUL___INTERPOLER__DONNEE_DONNEE_DONNEE_DONNEE_DOUBLE_DOUBLE = eINSTANCE.getCalcul__Interpoler__Donnee_Donnee_Donnee_Donnee_double_double();

		/**
		 * The meta object literal for the '{@link packages.Calcul.InterCalc <em>Inter Calc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see packages.Calcul.InterCalc
		 * @see packages.Calcul.impl.CalculPackageImpl#getInterCalc()
		 * @generated
		 */
		EClass INTER_CALC = eINSTANCE.getInterCalc();

	}

} //CalculPackage
