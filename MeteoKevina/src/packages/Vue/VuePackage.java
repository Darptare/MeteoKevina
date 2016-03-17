/**
 */
package packages.Vue;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see packages.Vue.VueFactory
 * @model kind="package"
 * @generated
 */
public interface VuePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Vue";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://packages/vue";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "vue";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VuePackage eINSTANCE = packages.Vue.impl.VuePackageImpl.init();

	/**
	 * The meta object id for the '{@link packages.Vue.impl.CarteImpl <em>Carte</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see packages.Vue.impl.CarteImpl
	 * @see packages.Vue.impl.VuePackageImpl#getCarte()
	 * @generated
	 */
	int CARTE = 0;

	/**
	 * The feature id for the '<em><b>Barbules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTE__BARBULES = 0;

	/**
	 * The feature id for the '<em><b>Zone Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTE__ZONE_SELECTION = 1;

	/**
	 * The feature id for the '<em><b>Zone Pression</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTE__ZONE_PRESSION = 2;

	/**
	 * The number of structural features of the '<em>Carte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTE_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Dezoomer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTE___DEZOOMER = 0;

	/**
	 * The operation id for the '<em>Zoomer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTE___ZOOMER = 1;

	/**
	 * The number of operations of the '<em>Carte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link packages.Vue.impl.BarbuleImpl <em>Barbule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see packages.Vue.impl.BarbuleImpl
	 * @see packages.Vue.impl.VuePackageImpl#getBarbule()
	 * @generated
	 */
	int BARBULE = 1;

	/**
	 * The number of structural features of the '<em>Barbule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARBULE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Create Barb</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARBULE___CREATE_BARB__DOUBLE_DOUBLE_DOUBLE_DOUBLE_DOUBLE_DOUBLE = 0;

	/**
	 * The operation id for the '<em>Afficher Barb</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARBULE___AFFICHER_BARB__VENT = 1;

	/**
	 * The number of operations of the '<em>Barbule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARBULE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link packages.Vue.InterView <em>Inter View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see packages.Vue.InterView
	 * @see packages.Vue.impl.VuePackageImpl#getInterView()
	 * @generated
	 */
	int INTER_VIEW = 2;

	/**
	 * The number of structural features of the '<em>Inter View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_VIEW_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Inter View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_VIEW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link packages.Vue.impl.FenetreImpl <em>Fenetre</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see packages.Vue.impl.FenetreImpl
	 * @see packages.Vue.impl.VuePackageImpl#getFenetre()
	 * @generated
	 */
	int FENETRE = 3;

	/**
	 * The feature id for the '<em><b>Carte</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FENETRE__CARTE = INTER_VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fenetre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FENETRE_FEATURE_COUNT = INTER_VIEW_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Fenetre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FENETRE_OPERATION_COUNT = INTER_VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link packages.Vue.impl.ZonePressionImpl <em>Zone Pression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see packages.Vue.impl.ZonePressionImpl
	 * @see packages.Vue.impl.VuePackageImpl#getZonePression()
	 * @generated
	 */
	int ZONE_PRESSION = 4;

	/**
	 * The number of structural features of the '<em>Zone Pression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_PRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Zone Pression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_PRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link packages.Vue.impl.ZoneSelectionImpl <em>Zone Selection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see packages.Vue.impl.ZoneSelectionImpl
	 * @see packages.Vue.impl.VuePackageImpl#getZoneSelection()
	 * @generated
	 */
	int ZONE_SELECTION = 5;

	/**
	 * The number of structural features of the '<em>Zone Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_SELECTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Zone Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_SELECTION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link packages.Vue.Carte <em>Carte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Carte</em>'.
	 * @see packages.Vue.Carte
	 * @generated
	 */
	EClass getCarte();

	/**
	 * Returns the meta object for the reference list '{@link packages.Vue.Carte#getBarbules <em>Barbules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Barbules</em>'.
	 * @see packages.Vue.Carte#getBarbules()
	 * @see #getCarte()
	 * @generated
	 */
	EReference getCarte_Barbules();

	/**
	 * Returns the meta object for the reference '{@link packages.Vue.Carte#getZoneSelection <em>Zone Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Zone Selection</em>'.
	 * @see packages.Vue.Carte#getZoneSelection()
	 * @see #getCarte()
	 * @generated
	 */
	EReference getCarte_ZoneSelection();

	/**
	 * Returns the meta object for the reference list '{@link packages.Vue.Carte#getZonePression <em>Zone Pression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Zone Pression</em>'.
	 * @see packages.Vue.Carte#getZonePression()
	 * @see #getCarte()
	 * @generated
	 */
	EReference getCarte_ZonePression();

	/**
	 * Returns the meta object for the '{@link packages.Vue.Carte#dezoomer() <em>Dezoomer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Dezoomer</em>' operation.
	 * @see packages.Vue.Carte#dezoomer()
	 * @generated
	 */
	EOperation getCarte__Dezoomer();

	/**
	 * Returns the meta object for the '{@link packages.Vue.Carte#zoomer() <em>Zoomer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Zoomer</em>' operation.
	 * @see packages.Vue.Carte#zoomer()
	 * @generated
	 */
	EOperation getCarte__Zoomer();

	/**
	 * Returns the meta object for class '{@link packages.Vue.Barbule <em>Barbule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Barbule</em>'.
	 * @see packages.Vue.Barbule
	 * @generated
	 */
	EClass getBarbule();

	/**
	 * Returns the meta object for the '{@link packages.Vue.Barbule#createBarb(double, double, double, double, double, double) <em>Create Barb</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Barb</em>' operation.
	 * @see packages.Vue.Barbule#createBarb(double, double, double, double, double, double)
	 * @generated
	 */
	EOperation getBarbule__CreateBarb__double_double_double_double_double_double();

	/**
	 * Returns the meta object for the '{@link packages.Vue.Barbule#afficherBarb(packages.Prevision.Vent) <em>Afficher Barb</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Afficher Barb</em>' operation.
	 * @see packages.Vue.Barbule#afficherBarb(packages.Prevision.Vent)
	 * @generated
	 */
	EOperation getBarbule__AfficherBarb__Vent();

	/**
	 * Returns the meta object for class '{@link packages.Vue.InterView <em>Inter View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inter View</em>'.
	 * @see packages.Vue.InterView
	 * @generated
	 */
	EClass getInterView();

	/**
	 * Returns the meta object for class '{@link packages.Vue.Fenetre <em>Fenetre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fenetre</em>'.
	 * @see packages.Vue.Fenetre
	 * @generated
	 */
	EClass getFenetre();

	/**
	 * Returns the meta object for the reference '{@link packages.Vue.Fenetre#getCarte <em>Carte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Carte</em>'.
	 * @see packages.Vue.Fenetre#getCarte()
	 * @see #getFenetre()
	 * @generated
	 */
	EReference getFenetre_Carte();

	/**
	 * Returns the meta object for class '{@link packages.Vue.ZonePression <em>Zone Pression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zone Pression</em>'.
	 * @see packages.Vue.ZonePression
	 * @generated
	 */
	EClass getZonePression();

	/**
	 * Returns the meta object for class '{@link packages.Vue.ZoneSelection <em>Zone Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zone Selection</em>'.
	 * @see packages.Vue.ZoneSelection
	 * @generated
	 */
	EClass getZoneSelection();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VueFactory getVueFactory();

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
		 * The meta object literal for the '{@link packages.Vue.impl.CarteImpl <em>Carte</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see packages.Vue.impl.CarteImpl
		 * @see packages.Vue.impl.VuePackageImpl#getCarte()
		 * @generated
		 */
		EClass CARTE = eINSTANCE.getCarte();

		/**
		 * The meta object literal for the '<em><b>Barbules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARTE__BARBULES = eINSTANCE.getCarte_Barbules();

		/**
		 * The meta object literal for the '<em><b>Zone Selection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARTE__ZONE_SELECTION = eINSTANCE.getCarte_ZoneSelection();

		/**
		 * The meta object literal for the '<em><b>Zone Pression</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARTE__ZONE_PRESSION = eINSTANCE.getCarte_ZonePression();

		/**
		 * The meta object literal for the '<em><b>Dezoomer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CARTE___DEZOOMER = eINSTANCE.getCarte__Dezoomer();

		/**
		 * The meta object literal for the '<em><b>Zoomer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CARTE___ZOOMER = eINSTANCE.getCarte__Zoomer();

		/**
		 * The meta object literal for the '{@link packages.Vue.impl.BarbuleImpl <em>Barbule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see packages.Vue.impl.BarbuleImpl
		 * @see packages.Vue.impl.VuePackageImpl#getBarbule()
		 * @generated
		 */
		EClass BARBULE = eINSTANCE.getBarbule();

		/**
		 * The meta object literal for the '<em><b>Create Barb</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BARBULE___CREATE_BARB__DOUBLE_DOUBLE_DOUBLE_DOUBLE_DOUBLE_DOUBLE = eINSTANCE.getBarbule__CreateBarb__double_double_double_double_double_double();

		/**
		 * The meta object literal for the '<em><b>Afficher Barb</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BARBULE___AFFICHER_BARB__VENT = eINSTANCE.getBarbule__AfficherBarb__Vent();

		/**
		 * The meta object literal for the '{@link packages.Vue.InterView <em>Inter View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see packages.Vue.InterView
		 * @see packages.Vue.impl.VuePackageImpl#getInterView()
		 * @generated
		 */
		EClass INTER_VIEW = eINSTANCE.getInterView();

		/**
		 * The meta object literal for the '{@link packages.Vue.impl.FenetreImpl <em>Fenetre</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see packages.Vue.impl.FenetreImpl
		 * @see packages.Vue.impl.VuePackageImpl#getFenetre()
		 * @generated
		 */
		EClass FENETRE = eINSTANCE.getFenetre();

		/**
		 * The meta object literal for the '<em><b>Carte</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FENETRE__CARTE = eINSTANCE.getFenetre_Carte();

		/**
		 * The meta object literal for the '{@link packages.Vue.impl.ZonePressionImpl <em>Zone Pression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see packages.Vue.impl.ZonePressionImpl
		 * @see packages.Vue.impl.VuePackageImpl#getZonePression()
		 * @generated
		 */
		EClass ZONE_PRESSION = eINSTANCE.getZonePression();

		/**
		 * The meta object literal for the '{@link packages.Vue.impl.ZoneSelectionImpl <em>Zone Selection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see packages.Vue.impl.ZoneSelectionImpl
		 * @see packages.Vue.impl.VuePackageImpl#getZoneSelection()
		 * @generated
		 */
		EClass ZONE_SELECTION = eINSTANCE.getZoneSelection();

	}

} //VuePackage
