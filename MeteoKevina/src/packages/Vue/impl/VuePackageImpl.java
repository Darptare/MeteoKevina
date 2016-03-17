/**
 */
package packages.Vue.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import packages.Calcul.CalculPackage;

import packages.Calcul.impl.CalculPackageImpl;

import packages.Edition.EditionPackage;

import packages.Edition.impl.EditionPackageImpl;

import packages.IO.IOPackage;

import packages.IO.impl.IOPackageImpl;

import packages.Parametres.ParametresPackage;

import packages.Parametres.impl.ParametresPackageImpl;

import packages.Prevision.PrevisionPackage;

import packages.Prevision.impl.PrevisionPackageImpl;

import packages.Vue.Barbule;
import packages.Vue.Carte;
import packages.Vue.Fenetre;
import packages.Vue.InterView;
import packages.Vue.VueFactory;
import packages.Vue.VuePackage;
import packages.Vue.ZonePression;
import packages.Vue.ZoneSelection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VuePackageImpl extends EPackageImpl implements VuePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass carteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass barbuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fenetreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zonePressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zoneSelectionEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see packages.Vue.VuePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VuePackageImpl() {
		super(eNS_URI, VueFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link VuePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static VuePackage init() {
		if (isInited) return (VuePackage)EPackage.Registry.INSTANCE.getEPackage(VuePackage.eNS_URI);

		// Obtain or create and register package
		VuePackageImpl theVuePackage = (VuePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof VuePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new VuePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ParametresPackageImpl theParametresPackage = (ParametresPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ParametresPackage.eNS_URI) instanceof ParametresPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ParametresPackage.eNS_URI) : ParametresPackage.eINSTANCE);
		EditionPackageImpl theEditionPackage = (EditionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EditionPackage.eNS_URI) instanceof EditionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EditionPackage.eNS_URI) : EditionPackage.eINSTANCE);
		CalculPackageImpl theCalculPackage = (CalculPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CalculPackage.eNS_URI) instanceof CalculPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CalculPackage.eNS_URI) : CalculPackage.eINSTANCE);
		PrevisionPackageImpl thePrevisionPackage = (PrevisionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PrevisionPackage.eNS_URI) instanceof PrevisionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PrevisionPackage.eNS_URI) : PrevisionPackage.eINSTANCE);
		IOPackageImpl theIOPackage = (IOPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IOPackage.eNS_URI) instanceof IOPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IOPackage.eNS_URI) : IOPackage.eINSTANCE);

		// Create package meta-data objects
		theVuePackage.createPackageContents();
		theParametresPackage.createPackageContents();
		theEditionPackage.createPackageContents();
		theCalculPackage.createPackageContents();
		thePrevisionPackage.createPackageContents();
		theIOPackage.createPackageContents();

		// Initialize created meta-data
		theVuePackage.initializePackageContents();
		theParametresPackage.initializePackageContents();
		theEditionPackage.initializePackageContents();
		theCalculPackage.initializePackageContents();
		thePrevisionPackage.initializePackageContents();
		theIOPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theVuePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(VuePackage.eNS_URI, theVuePackage);
		return theVuePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCarte() {
		return carteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarte_Barbules() {
		return (EReference)carteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarte_ZoneSelection() {
		return (EReference)carteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarte_ZonePression() {
		return (EReference)carteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCarte__Dezoomer() {
		return carteEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCarte__Zoomer() {
		return carteEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBarbule() {
		return barbuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBarbule__CreateBarb__double_double_double_double_double_double() {
		return barbuleEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBarbule__AfficherBarb__Vent() {
		return barbuleEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterView() {
		return interViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFenetre() {
		return fenetreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFenetre_Carte() {
		return (EReference)fenetreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZonePression() {
		return zonePressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZoneSelection() {
		return zoneSelectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VueFactory getVueFactory() {
		return (VueFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		carteEClass = createEClass(CARTE);
		createEReference(carteEClass, CARTE__BARBULES);
		createEReference(carteEClass, CARTE__ZONE_SELECTION);
		createEReference(carteEClass, CARTE__ZONE_PRESSION);
		createEOperation(carteEClass, CARTE___DEZOOMER);
		createEOperation(carteEClass, CARTE___ZOOMER);

		barbuleEClass = createEClass(BARBULE);
		createEOperation(barbuleEClass, BARBULE___CREATE_BARB__DOUBLE_DOUBLE_DOUBLE_DOUBLE_DOUBLE_DOUBLE);
		createEOperation(barbuleEClass, BARBULE___AFFICHER_BARB__VENT);

		interViewEClass = createEClass(INTER_VIEW);

		fenetreEClass = createEClass(FENETRE);
		createEReference(fenetreEClass, FENETRE__CARTE);

		zonePressionEClass = createEClass(ZONE_PRESSION);

		zoneSelectionEClass = createEClass(ZONE_SELECTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		PrevisionPackage thePrevisionPackage = (PrevisionPackage)EPackage.Registry.INSTANCE.getEPackage(PrevisionPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		fenetreEClass.getESuperTypes().add(this.getInterView());

		// Initialize classes, features, and operations; add parameters
		initEClass(carteEClass, Carte.class, "Carte", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCarte_Barbules(), this.getBarbule(), null, "barbules", null, 0, -1, Carte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCarte_ZoneSelection(), this.getZoneSelection(), null, "zoneSelection", null, 0, 1, Carte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCarte_ZonePression(), this.getZonePression(), null, "zonePression", null, 0, -1, Carte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getCarte__Dezoomer(), null, "dezoomer", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCarte__Zoomer(), null, "zoomer", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(barbuleEClass, Barbule.class, "Barbule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getBarbule__CreateBarb__double_double_double_double_double_double(), null, "createBarb", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "temps", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "pression", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "vitesse", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "direction", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "latitude", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "longitude", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getBarbule__AfficherBarb__Vent(), null, "afficherBarb", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, thePrevisionPackage.getVent(), "donnee", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(interViewEClass, InterView.class, "InterView", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fenetreEClass, Fenetre.class, "Fenetre", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFenetre_Carte(), this.getCarte(), null, "carte", null, 1, 1, Fenetre.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zonePressionEClass, ZonePression.class, "ZonePression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(zoneSelectionEClass, ZoneSelection.class, "ZoneSelection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //VuePackageImpl
