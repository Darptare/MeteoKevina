/**
 */
package packages.Parametres.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import packages.Calcul.CalculPackage;

import packages.Calcul.impl.CalculPackageImpl;

import packages.Edition.EditionPackage;

import packages.Edition.impl.EditionPackageImpl;

import packages.IO.IOPackage;

import packages.IO.impl.IOPackageImpl;

import packages.Parametres.InterParam;
import packages.Parametres.Parametres;
import packages.Parametres.ParametresFactory;
import packages.Parametres.ParametresPackage;

import packages.Prevision.PrevisionPackage;

import packages.Prevision.impl.PrevisionPackageImpl;

import packages.Vue.VuePackage;

import packages.Vue.impl.VuePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ParametresPackageImpl extends EPackageImpl implements ParametresPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parametresEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interParamEClass = null;

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
	 * @see packages.Parametres.ParametresPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ParametresPackageImpl() {
		super(eNS_URI, ParametresFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ParametresPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ParametresPackage init() {
		if (isInited) return (ParametresPackage)EPackage.Registry.INSTANCE.getEPackage(ParametresPackage.eNS_URI);

		// Obtain or create and register package
		ParametresPackageImpl theParametresPackage = (ParametresPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ParametresPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ParametresPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		VuePackageImpl theVuePackage = (VuePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VuePackage.eNS_URI) instanceof VuePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VuePackage.eNS_URI) : VuePackage.eINSTANCE);
		EditionPackageImpl theEditionPackage = (EditionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EditionPackage.eNS_URI) instanceof EditionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EditionPackage.eNS_URI) : EditionPackage.eINSTANCE);
		CalculPackageImpl theCalculPackage = (CalculPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CalculPackage.eNS_URI) instanceof CalculPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CalculPackage.eNS_URI) : CalculPackage.eINSTANCE);
		PrevisionPackageImpl thePrevisionPackage = (PrevisionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PrevisionPackage.eNS_URI) instanceof PrevisionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PrevisionPackage.eNS_URI) : PrevisionPackage.eINSTANCE);
		IOPackageImpl theIOPackage = (IOPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IOPackage.eNS_URI) instanceof IOPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IOPackage.eNS_URI) : IOPackage.eINSTANCE);

		// Create package meta-data objects
		theParametresPackage.createPackageContents();
		theVuePackage.createPackageContents();
		theEditionPackage.createPackageContents();
		theCalculPackage.createPackageContents();
		thePrevisionPackage.createPackageContents();
		theIOPackage.createPackageContents();

		// Initialize created meta-data
		theParametresPackage.initializePackageContents();
		theVuePackage.initializePackageContents();
		theEditionPackage.initializePackageContents();
		theCalculPackage.initializePackageContents();
		thePrevisionPackage.initializePackageContents();
		theIOPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theParametresPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ParametresPackage.eNS_URI, theParametresPackage);
		return theParametresPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParametres() {
		return parametresEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParametres_Langue() {
		return (EAttribute)parametresEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParametres_Unite() {
		return (EAttribute)parametresEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterParam() {
		return interParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParametresFactory getParametresFactory() {
		return (ParametresFactory)getEFactoryInstance();
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
		parametresEClass = createEClass(PARAMETRES);
		createEAttribute(parametresEClass, PARAMETRES__LANGUE);
		createEAttribute(parametresEClass, PARAMETRES__UNITE);

		interParamEClass = createEClass(INTER_PARAM);
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
		parametresEClass.getESuperTypes().add(this.getInterParam());

		// Initialize classes, features, and operations; add parameters
		initEClass(parametresEClass, Parametres.class, "Parametres", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParametres_Langue(), ecorePackage.getEString(), "langue", null, 0, 1, Parametres.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParametres_Unite(), ecorePackage.getEString(), "unite", null, 0, 1, Parametres.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interParamEClass, InterParam.class, "InterParam", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ParametresPackageImpl
