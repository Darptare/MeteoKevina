/**
 */
package packages.Calcul.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import packages.Calcul.Calcul;
import packages.Calcul.CalculFactory;
import packages.Calcul.CalculPackage;
import packages.Calcul.InterCalc;

import packages.Edition.EditionPackage;

import packages.Edition.impl.EditionPackageImpl;

import packages.IO.IOPackage;

import packages.IO.impl.IOPackageImpl;

import packages.Parametres.ParametresPackage;

import packages.Parametres.impl.ParametresPackageImpl;

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
public class CalculPackageImpl extends EPackageImpl implements CalculPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calculEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interCalcEClass = null;

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
	 * @see packages.Calcul.CalculPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CalculPackageImpl() {
		super(eNS_URI, CalculFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CalculPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CalculPackage init() {
		if (isInited) return (CalculPackage)EPackage.Registry.INSTANCE.getEPackage(CalculPackage.eNS_URI);

		// Obtain or create and register package
		CalculPackageImpl theCalculPackage = (CalculPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CalculPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CalculPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ParametresPackageImpl theParametresPackage = (ParametresPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ParametresPackage.eNS_URI) instanceof ParametresPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ParametresPackage.eNS_URI) : ParametresPackage.eINSTANCE);
		VuePackageImpl theVuePackage = (VuePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VuePackage.eNS_URI) instanceof VuePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VuePackage.eNS_URI) : VuePackage.eINSTANCE);
		EditionPackageImpl theEditionPackage = (EditionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EditionPackage.eNS_URI) instanceof EditionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EditionPackage.eNS_URI) : EditionPackage.eINSTANCE);
		PrevisionPackageImpl thePrevisionPackage = (PrevisionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PrevisionPackage.eNS_URI) instanceof PrevisionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PrevisionPackage.eNS_URI) : PrevisionPackage.eINSTANCE);
		IOPackageImpl theIOPackage = (IOPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IOPackage.eNS_URI) instanceof IOPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IOPackage.eNS_URI) : IOPackage.eINSTANCE);

		// Create package meta-data objects
		theCalculPackage.createPackageContents();
		theParametresPackage.createPackageContents();
		theVuePackage.createPackageContents();
		theEditionPackage.createPackageContents();
		thePrevisionPackage.createPackageContents();
		theIOPackage.createPackageContents();

		// Initialize created meta-data
		theCalculPackage.initializePackageContents();
		theParametresPackage.initializePackageContents();
		theVuePackage.initializePackageContents();
		theEditionPackage.initializePackageContents();
		thePrevisionPackage.initializePackageContents();
		theIOPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCalculPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CalculPackage.eNS_URI, theCalculPackage);
		return theCalculPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalcul() {
		return calculEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCalcul__Interpoler__Donnee_Donnee_Donnee_Donnee_double_double() {
		return calculEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterCalc() {
		return interCalcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalculFactory getCalculFactory() {
		return (CalculFactory)getEFactoryInstance();
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
		calculEClass = createEClass(CALCUL);
		createEOperation(calculEClass, CALCUL___INTERPOLER__DONNEE_DONNEE_DONNEE_DONNEE_DOUBLE_DOUBLE);

		interCalcEClass = createEClass(INTER_CALC);
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
		calculEClass.getESuperTypes().add(this.getInterCalc());

		// Initialize classes, features, and operations; add parameters
		initEClass(calculEClass, Calcul.class, "Calcul", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getCalcul__Interpoler__Donnee_Donnee_Donnee_Donnee_double_double(), ecorePackage.getEDouble(), "interpoler", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, thePrevisionPackage.getDonnee(), "prev1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, thePrevisionPackage.getDonnee(), "prev2", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, thePrevisionPackage.getDonnee(), "prev3", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, thePrevisionPackage.getDonnee(), "prev4", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "latitude", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "longitude", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(interCalcEClass, InterCalc.class, "InterCalc", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //CalculPackageImpl
