/**
 */
package packages.Edition.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import packages.Calcul.CalculPackage;

import packages.Calcul.impl.CalculPackageImpl;

import packages.Edition.CreateDonnee;
import packages.Edition.EditDonnee;
import packages.Edition.EditionFactory;
import packages.Edition.EditionPackage;
import packages.Edition.Edtion;
import packages.Edition.InterEdit;

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
public class EditionPackageImpl extends EPackageImpl implements EditionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass editDonneeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createDonneeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interEditEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edtionEClass = null;

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
	 * @see packages.Edition.EditionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EditionPackageImpl() {
		super(eNS_URI, EditionFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EditionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EditionPackage init() {
		if (isInited) return (EditionPackage)EPackage.Registry.INSTANCE.getEPackage(EditionPackage.eNS_URI);

		// Obtain or create and register package
		EditionPackageImpl theEditionPackage = (EditionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EditionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EditionPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ParametresPackageImpl theParametresPackage = (ParametresPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ParametresPackage.eNS_URI) instanceof ParametresPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ParametresPackage.eNS_URI) : ParametresPackage.eINSTANCE);
		VuePackageImpl theVuePackage = (VuePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VuePackage.eNS_URI) instanceof VuePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VuePackage.eNS_URI) : VuePackage.eINSTANCE);
		CalculPackageImpl theCalculPackage = (CalculPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CalculPackage.eNS_URI) instanceof CalculPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CalculPackage.eNS_URI) : CalculPackage.eINSTANCE);
		PrevisionPackageImpl thePrevisionPackage = (PrevisionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PrevisionPackage.eNS_URI) instanceof PrevisionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PrevisionPackage.eNS_URI) : PrevisionPackage.eINSTANCE);
		IOPackageImpl theIOPackage = (IOPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IOPackage.eNS_URI) instanceof IOPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IOPackage.eNS_URI) : IOPackage.eINSTANCE);

		// Create package meta-data objects
		theEditionPackage.createPackageContents();
		theParametresPackage.createPackageContents();
		theVuePackage.createPackageContents();
		theCalculPackage.createPackageContents();
		thePrevisionPackage.createPackageContents();
		theIOPackage.createPackageContents();

		// Initialize created meta-data
		theEditionPackage.initializePackageContents();
		theParametresPackage.initializePackageContents();
		theVuePackage.initializePackageContents();
		theCalculPackage.initializePackageContents();
		thePrevisionPackage.initializePackageContents();
		theIOPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEditionPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EditionPackage.eNS_URI, theEditionPackage);
		return theEditionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEditDonnee() {
		return editDonneeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEditDonnee__ChangeDirection__Donnee_double() {
		return editDonneeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEditDonnee__ChangePression__Donnee_double() {
		return editDonneeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEditDonnee__ChangeContraste__Donnee_double() {
		return editDonneeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateDonnee() {
		return createDonneeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCreateDonnee__Create__double_double_double_double_double_double() {
		return createDonneeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterEdit() {
		return interEditEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEdtion() {
		return edtionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EditionFactory getEditionFactory() {
		return (EditionFactory)getEFactoryInstance();
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
		editDonneeEClass = createEClass(EDIT_DONNEE);
		createEOperation(editDonneeEClass, EDIT_DONNEE___CHANGE_DIRECTION__DONNEE_DOUBLE);
		createEOperation(editDonneeEClass, EDIT_DONNEE___CHANGE_PRESSION__DONNEE_DOUBLE);
		createEOperation(editDonneeEClass, EDIT_DONNEE___CHANGE_CONTRASTE__DONNEE_DOUBLE);

		createDonneeEClass = createEClass(CREATE_DONNEE);
		createEOperation(createDonneeEClass, CREATE_DONNEE___CREATE__DOUBLE_DOUBLE_DOUBLE_DOUBLE_DOUBLE_DOUBLE);

		interEditEClass = createEClass(INTER_EDIT);

		edtionEClass = createEClass(EDTION);
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
		editDonneeEClass.getESuperTypes().add(this.getEdtion());
		createDonneeEClass.getESuperTypes().add(this.getEdtion());
		edtionEClass.getESuperTypes().add(this.getInterEdit());

		// Initialize classes, features, and operations; add parameters
		initEClass(editDonneeEClass, EditDonnee.class, "EditDonnee", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getEditDonnee__ChangeDirection__Donnee_double(), null, "changeDirection", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, thePrevisionPackage.getDonnee(), "donnee", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "dir", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEditDonnee__ChangePression__Donnee_double(), null, "changePression", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, thePrevisionPackage.getDonnee(), "donnee", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "pression", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEditDonnee__ChangeContraste__Donnee_double(), null, "changeContraste", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, thePrevisionPackage.getDonnee(), "donnee", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "contraste", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(createDonneeEClass, CreateDonnee.class, "CreateDonnee", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getCreateDonnee__Create__double_double_double_double_double_double(), thePrevisionPackage.getDonnee(), "create", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "temps", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "pression", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "vitesse", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "direction", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "latitude", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "longitude", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(interEditEClass, InterEdit.class, "InterEdit", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(edtionEClass, Edtion.class, "Edtion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //EditionPackageImpl
