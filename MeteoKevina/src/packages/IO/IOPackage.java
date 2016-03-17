/**
 */
package packages.IO;

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
 * @see packages.IO.IOFactory
 * @model kind="package"
 * @generated
 */
public interface IOPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "IO";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://packages/io";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "io";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IOPackage eINSTANCE = packages.IO.impl.IOPackageImpl.init();

	/**
	 * The meta object id for the '{@link packages.IO.InterRead <em>Inter Read</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see packages.IO.InterRead
	 * @see packages.IO.impl.IOPackageImpl#getInterRead()
	 * @generated
	 */
	int INTER_READ = 2;

	/**
	 * The number of structural features of the '<em>Inter Read</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_READ_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Inter Read</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_READ_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link packages.IO.impl.FileReaderImpl <em>File Reader</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see packages.IO.impl.FileReaderImpl
	 * @see packages.IO.impl.IOPackageImpl#getFileReader()
	 * @generated
	 */
	int FILE_READER = 0;

	/**
	 * The number of structural features of the '<em>File Reader</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_READER_FEATURE_COUNT = INTER_READ_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Parse File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_READER___PARSE_FILE__STRING = INTER_READ_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Donnees</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_READER___GET_DONNEES = INTER_READ_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>File Reader</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_READER_OPERATION_COUNT = INTER_READ_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link packages.IO.InterWrite <em>Inter Write</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see packages.IO.InterWrite
	 * @see packages.IO.impl.IOPackageImpl#getInterWrite()
	 * @generated
	 */
	int INTER_WRITE = 3;

	/**
	 * The number of structural features of the '<em>Inter Write</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_WRITE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Inter Write</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_WRITE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link packages.IO.impl.NetcdfWriterImpl <em>Netcdf Writer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see packages.IO.impl.NetcdfWriterImpl
	 * @see packages.IO.impl.IOPackageImpl#getNetcdfWriter()
	 * @generated
	 */
	int NETCDF_WRITER = 1;

	/**
	 * The number of structural features of the '<em>Netcdf Writer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETCDF_WRITER_FEATURE_COUNT = INTER_WRITE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Netcdf Writer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETCDF_WRITER_OPERATION_COUNT = INTER_WRITE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link packages.IO.FileReader <em>File Reader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Reader</em>'.
	 * @see packages.IO.FileReader
	 * @generated
	 */
	EClass getFileReader();

	/**
	 * Returns the meta object for the '{@link packages.IO.FileReader#parseFile(java.lang.String) <em>Parse File</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Parse File</em>' operation.
	 * @see packages.IO.FileReader#parseFile(java.lang.String)
	 * @generated
	 */
	EOperation getFileReader__ParseFile__String();

	/**
	 * Returns the meta object for the '{@link packages.IO.FileReader#getDonnees() <em>Get Donnees</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Donnees</em>' operation.
	 * @see packages.IO.FileReader#getDonnees()
	 * @generated
	 */
	EOperation getFileReader__GetDonnees();

	/**
	 * Returns the meta object for class '{@link packages.IO.NetcdfWriter <em>Netcdf Writer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Netcdf Writer</em>'.
	 * @see packages.IO.NetcdfWriter
	 * @generated
	 */
	EClass getNetcdfWriter();

	/**
	 * Returns the meta object for class '{@link packages.IO.InterRead <em>Inter Read</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inter Read</em>'.
	 * @see packages.IO.InterRead
	 * @generated
	 */
	EClass getInterRead();

	/**
	 * Returns the meta object for class '{@link packages.IO.InterWrite <em>Inter Write</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inter Write</em>'.
	 * @see packages.IO.InterWrite
	 * @generated
	 */
	EClass getInterWrite();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IOFactory getIOFactory();

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
		 * The meta object literal for the '{@link packages.IO.impl.FileReaderImpl <em>File Reader</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see packages.IO.impl.FileReaderImpl
		 * @see packages.IO.impl.IOPackageImpl#getFileReader()
		 * @generated
		 */
		EClass FILE_READER = eINSTANCE.getFileReader();

		/**
		 * The meta object literal for the '<em><b>Parse File</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FILE_READER___PARSE_FILE__STRING = eINSTANCE.getFileReader__ParseFile__String();

		/**
		 * The meta object literal for the '<em><b>Get Donnees</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FILE_READER___GET_DONNEES = eINSTANCE.getFileReader__GetDonnees();

		/**
		 * The meta object literal for the '{@link packages.IO.impl.NetcdfWriterImpl <em>Netcdf Writer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see packages.IO.impl.NetcdfWriterImpl
		 * @see packages.IO.impl.IOPackageImpl#getNetcdfWriter()
		 * @generated
		 */
		EClass NETCDF_WRITER = eINSTANCE.getNetcdfWriter();

		/**
		 * The meta object literal for the '{@link packages.IO.InterRead <em>Inter Read</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see packages.IO.InterRead
		 * @see packages.IO.impl.IOPackageImpl#getInterRead()
		 * @generated
		 */
		EClass INTER_READ = eINSTANCE.getInterRead();

		/**
		 * The meta object literal for the '{@link packages.IO.InterWrite <em>Inter Write</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see packages.IO.InterWrite
		 * @see packages.IO.impl.IOPackageImpl#getInterWrite()
		 * @generated
		 */
		EClass INTER_WRITE = eINSTANCE.getInterWrite();

	}

} //IOPackage
