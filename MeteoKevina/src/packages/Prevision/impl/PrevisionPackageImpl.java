/**
 */
package packages.Prevision.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
import packages.Prevision.Coordonnee;
import packages.Prevision.Donnee;
import packages.Prevision.InterPrev;
import packages.Prevision.Prevision;
import packages.Prevision.PrevisionFactory;
import packages.Prevision.PrevisionPackage;
import packages.Prevision.Vent;
import packages.Vue.VuePackage;
import packages.Vue.impl.VuePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PrevisionPackageImpl extends EPackageImpl implements PrevisionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass donneeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coordonneeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interPrevEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass previsionEClass = null;

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
	 * @see packages.Prevision.PrevisionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PrevisionPackageImpl() {
		super(eNS_URI, PrevisionFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PrevisionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PrevisionPackage init() {
		if (isInited) return (PrevisionPackage)EPackage.Registry.INSTANCE.getEPackage(PrevisionPackage.eNS_URI);

		// Obtain or create and register package
		PrevisionPackageImpl thePrevisionPackage = (PrevisionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PrevisionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PrevisionPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ParametresPackageImpl theParametresPackage = (ParametresPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ParametresPackage.eNS_URI) instanceof ParametresPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ParametresPackage.eNS_URI) : ParametresPackage.eINSTANCE);
		VuePackageImpl theVuePackage = (VuePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VuePackage.eNS_URI) instanceof VuePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VuePackage.eNS_URI) : VuePackage.eINSTANCE);
		EditionPackageImpl theEditionPackage = (EditionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EditionPackage.eNS_URI) instanceof EditionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EditionPackage.eNS_URI) : EditionPackage.eINSTANCE);
		CalculPackageImpl theCalculPackage = (CalculPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CalculPackage.eNS_URI) instanceof CalculPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CalculPackage.eNS_URI) : CalculPackage.eINSTANCE);
		IOPackageImpl theIOPackage = (IOPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IOPackage.eNS_URI) instanceof IOPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IOPackage.eNS_URI) : IOPackage.eINSTANCE);

		// Create package meta-data objects
		thePrevisionPackage.createPackageContents();
		theParametresPackage.createPackageContents();
		theVuePackage.createPackageContents();
		theEditionPackage.createPackageContents();
		theCalculPackage.createPackageContents();
		theIOPackage.createPackageContents();

		// Initialize created meta-data
		thePrevisionPackage.initializePackageContents();
		theParametresPackage.initializePackageContents();
		theVuePackage.initializePackageContents();
		theEditionPackage.initializePackageContents();
		theCalculPackage.initializePackageContents();
		theIOPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePrevisionPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PrevisionPackage.eNS_URI, thePrevisionPackage);
		return thePrevisionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDonnee() {
		return donneeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDonnee_Temps() {
		return (EAttribute)donneeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDonnee_Vent() {
		return (EReference)donneeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVent() {
		return ventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVent_Direction() {
		return (EAttribute)ventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVent_Vitesse_nd() {
		return (EAttribute)ventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVent_Vitesse_u() {
		return (EAttribute)ventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVent_Vitesse_v() {
		return (EAttribute)ventEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVent_Value() {
		return (EAttribute)ventEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVent_Coord() {
		return (EReference)ventEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoordonnee() {
		return coordonneeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoordonnee_Lon() {
		return (EAttribute)coordonneeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoordonnee_Lat() {
		return (EAttribute)coordonneeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterPrev() {
		return interPrevEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrevision() {
		return previsionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrevision_Donnees() {
		return (EReference)previsionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrevisionFactory getPrevisionFactory() {
		return (PrevisionFactory)getEFactoryInstance();
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
		donneeEClass = createEClass(DONNEE);
		createEAttribute(donneeEClass, DONNEE__TEMPS);
		createEReference(donneeEClass, DONNEE__VENT);

		ventEClass = createEClass(VENT);
		createEAttribute(ventEClass, VENT__DIRECTION);
		createEAttribute(ventEClass, VENT__VITESSE_ND);
		createEAttribute(ventEClass, VENT__VITESSE_U);
		createEAttribute(ventEClass, VENT__VITESSE_V);
		createEAttribute(ventEClass, VENT__VALUE);
		createEReference(ventEClass, VENT__COORD);

		coordonneeEClass = createEClass(COORDONNEE);
		createEAttribute(coordonneeEClass, COORDONNEE__LON);
		createEAttribute(coordonneeEClass, COORDONNEE__LAT);

		interPrevEClass = createEClass(INTER_PREV);

		previsionEClass = createEClass(PREVISION);
		createEReference(previsionEClass, PREVISION__DONNEES);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		previsionEClass.getESuperTypes().add(this.getInterPrev());

		// Initialize classes, features, and operations; add parameters
		initEClass(donneeEClass, Donnee.class, "Donnee", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDonnee_Temps(), ecorePackage.getEDouble(), "temps", null, 1, 1, Donnee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDonnee_Vent(), this.getVent(), null, "vent", null, 0, -1, Donnee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ventEClass, Vent.class, "Vent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVent_Direction(), ecorePackage.getEDouble(), "direction", null, 1, 1, Vent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVent_Vitesse_nd(), ecorePackage.getEDouble(), "vitesse_nd", null, 1, 1, Vent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVent_Vitesse_u(), ecorePackage.getEDouble(), "vitesse_u", null, 1, 1, Vent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVent_Vitesse_v(), ecorePackage.getEDouble(), "vitesse_v", null, 1, 1, Vent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVent_Value(), ecorePackage.getEDouble(), "value", null, 1, 1, Vent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVent_Coord(), this.getCoordonnee(), null, "coord", null, 1, 1, Vent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coordonneeEClass, Coordonnee.class, "Coordonnee", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCoordonnee_Lon(), ecorePackage.getEDouble(), "lon", null, 1, 1, Coordonnee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoordonnee_Lat(), ecorePackage.getEDouble(), "lat", null, 1, 1, Coordonnee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interPrevEClass, InterPrev.class, "InterPrev", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(previsionEClass, Prevision.class, "Prevision", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrevision_Donnees(), this.getDonnee(), null, "donnees", null, 0, -1, Prevision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //PrevisionPackageImpl
