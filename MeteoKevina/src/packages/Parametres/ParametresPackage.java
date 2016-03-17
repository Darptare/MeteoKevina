/**
 */
package packages.Parametres;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see packages.Parametres.ParametresFactory
 * @model kind="package"
 * @generated
 */
public interface ParametresPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Parametres";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://packages/parametres";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "parametres";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ParametresPackage eINSTANCE = packages.Parametres.impl.ParametresPackageImpl.init();

	/**
	 * The meta object id for the '{@link packages.Parametres.InterParam <em>Inter Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see packages.Parametres.InterParam
	 * @see packages.Parametres.impl.ParametresPackageImpl#getInterParam()
	 * @generated
	 */
	int INTER_PARAM = 1;

	/**
	 * The number of structural features of the '<em>Inter Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_PARAM_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Inter Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_PARAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link packages.Parametres.impl.ParametresImpl <em>Parametres</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see packages.Parametres.impl.ParametresImpl
	 * @see packages.Parametres.impl.ParametresPackageImpl#getParametres()
	 * @generated
	 */
	int PARAMETRES = 0;

	/**
	 * The feature id for the '<em><b>Langue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRES__LANGUE = INTER_PARAM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRES__UNITE = INTER_PARAM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parametres</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRES_FEATURE_COUNT = INTER_PARAM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Parametres</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRES_OPERATION_COUNT = INTER_PARAM_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link packages.Parametres.Parametres <em>Parametres</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parametres</em>'.
	 * @see packages.Parametres.Parametres
	 * @generated
	 */
	EClass getParametres();

	/**
	 * Returns the meta object for the attribute '{@link packages.Parametres.Parametres#getLangue <em>Langue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Langue</em>'.
	 * @see packages.Parametres.Parametres#getLangue()
	 * @see #getParametres()
	 * @generated
	 */
	EAttribute getParametres_Langue();

	/**
	 * Returns the meta object for the attribute '{@link packages.Parametres.Parametres#getUnite <em>Unite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unite</em>'.
	 * @see packages.Parametres.Parametres#getUnite()
	 * @see #getParametres()
	 * @generated
	 */
	EAttribute getParametres_Unite();

	/**
	 * Returns the meta object for class '{@link packages.Parametres.InterParam <em>Inter Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inter Param</em>'.
	 * @see packages.Parametres.InterParam
	 * @generated
	 */
	EClass getInterParam();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ParametresFactory getParametresFactory();

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
		 * The meta object literal for the '{@link packages.Parametres.impl.ParametresImpl <em>Parametres</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see packages.Parametres.impl.ParametresImpl
		 * @see packages.Parametres.impl.ParametresPackageImpl#getParametres()
		 * @generated
		 */
		EClass PARAMETRES = eINSTANCE.getParametres();

		/**
		 * The meta object literal for the '<em><b>Langue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETRES__LANGUE = eINSTANCE.getParametres_Langue();

		/**
		 * The meta object literal for the '<em><b>Unite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETRES__UNITE = eINSTANCE.getParametres_Unite();

		/**
		 * The meta object literal for the '{@link packages.Parametres.InterParam <em>Inter Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see packages.Parametres.InterParam
		 * @see packages.Parametres.impl.ParametresPackageImpl#getInterParam()
		 * @generated
		 */
		EClass INTER_PARAM = eINSTANCE.getInterParam();

	}

} //ParametresPackage
