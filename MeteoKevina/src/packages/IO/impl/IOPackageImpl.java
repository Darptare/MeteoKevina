/**
 */
package packages.IO.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import packages.Calcul.CalculPackage;

import packages.Calcul.impl.CalculPackageImpl;

import packages.Edition.EditionPackage;

import packages.Edition.impl.EditionPackageImpl;

import packages.IO.FileReader;
import packages.IO.IOFactory;
import packages.IO.IOPackage;
import packages.IO.InterRead;
import packages.IO.InterWrite;
import packages.IO.NetcdfWriter;

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
public class IOPackageImpl extends EPackageImpl implements IOPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileReaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass netcdfWriterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interReadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interWriteEClass = null;

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
	 * @see packages.IO.IOPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IOPackageImpl() {
		super(eNS_URI, IOFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link IOPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IOPackage init() {
		if (isInited) return (IOPackage)EPackage.Registry.INSTANCE.getEPackage(IOPackage.eNS_URI);

		// Obtain or create and register package
		IOPackageImpl theIOPackage = (IOPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof IOPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new IOPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ParametresPackageImpl theParametresPackage = (ParametresPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ParametresPackage.eNS_URI) instanceof ParametresPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ParametresPackage.eNS_URI) : ParametresPackage.eINSTANCE);
		VuePackageImpl theVuePackage = (VuePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VuePackage.eNS_URI) instanceof VuePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VuePackage.eNS_URI) : VuePackage.eINSTANCE);
		EditionPackageImpl theEditionPackage = (EditionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EditionPackage.eNS_URI) instanceof EditionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EditionPackage.eNS_URI) : EditionPackage.eINSTANCE);
		CalculPackageImpl theCalculPackage = (CalculPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CalculPackage.eNS_URI) instanceof CalculPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CalculPackage.eNS_URI) : CalculPackage.eINSTANCE);
		PrevisionPackageImpl thePrevisionPackage = (PrevisionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PrevisionPackage.eNS_URI) instanceof PrevisionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PrevisionPackage.eNS_URI) : PrevisionPackage.eINSTANCE);

		// Create package meta-data objects
		theIOPackage.createPackageContents();
		theParametresPackage.createPackageContents();
		theVuePackage.createPackageContents();
		theEditionPackage.createPackageContents();
		theCalculPackage.createPackageContents();
		thePrevisionPackage.createPackageContents();

		// Initialize created meta-data
		theIOPackage.initializePackageContents();
		theParametresPackage.initializePackageContents();
		theVuePackage.initializePackageContents();
		theEditionPackage.initializePackageContents();
		theCalculPackage.initializePackageContents();
		thePrevisionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIOPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IOPackage.eNS_URI, theIOPackage);
		return theIOPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileReader() {
		return fileReaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFileReader__ParseFile__String() {
		return fileReaderEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFileReader__GetDonnees() {
		return fileReaderEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetcdfWriter() {
		return netcdfWriterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterRead() {
		return interReadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterWrite() {
		return interWriteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IOFactory getIOFactory() {
		return (IOFactory)getEFactoryInstance();
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
		fileReaderEClass = createEClass(FILE_READER);
		createEOperation(fileReaderEClass, FILE_READER___PARSE_FILE__STRING);
		createEOperation(fileReaderEClass, FILE_READER___GET_DONNEES);

		netcdfWriterEClass = createEClass(NETCDF_WRITER);

		interReadEClass = createEClass(INTER_READ);

		interWriteEClass = createEClass(INTER_WRITE);
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
		fileReaderEClass.getESuperTypes().add(this.getInterRead());
		netcdfWriterEClass.getESuperTypes().add(this.getInterWrite());

		// Initialize classes, features, and operations; add parameters
		initEClass(fileReaderEClass, FileReader.class, "FileReader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getFileReader__ParseFile__String(), null, "parseFile", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "path_to_file", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getFileReader__GetDonnees(), thePrevisionPackage.getDonnee(), "getDonnees", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(netcdfWriterEClass, NetcdfWriter.class, "NetcdfWriter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interReadEClass, InterRead.class, "InterRead", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interWriteEClass, InterWrite.class, "InterWrite", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //IOPackageImpl
