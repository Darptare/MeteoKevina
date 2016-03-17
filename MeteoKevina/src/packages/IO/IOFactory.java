/**
 */
package packages.IO;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see packages.IO.IOPackage
 * @generated
 */
public interface IOFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IOFactory eINSTANCE = packages.IO.impl.IOFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>File Reader</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Reader</em>'.
	 * @generated
	 */
	FileReader createFileReader();

	/**
	 * Returns a new object of class '<em>Netcdf Writer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Netcdf Writer</em>'.
	 * @generated
	 */
	NetcdfWriter createNetcdfWriter();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IOPackage getIOPackage();

} //IOFactory
