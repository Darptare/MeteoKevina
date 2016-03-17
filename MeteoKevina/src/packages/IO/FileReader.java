/**
 */
package packages.IO;

import packages.Prevision.Donnee;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Reader</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see packages.IO.IOPackage#getFileReader()
 * @model
 * @generated
 */
public interface FileReader extends InterRead {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void parseFile(String path_to_file);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	Donnee getDonnees();

} // FileReader
