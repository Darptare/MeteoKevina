/**
 */
package packages.Edition;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see packages.Edition.EditionPackage
 * @generated
 */
public interface EditionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EditionFactory eINSTANCE = packages.Edition.impl.EditionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Edit Donnee</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Edit Donnee</em>'.
	 * @generated
	 */
	EditDonnee createEditDonnee();

	/**
	 * Returns a new object of class '<em>Create Donnee</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Donnee</em>'.
	 * @generated
	 */
	CreateDonnee createCreateDonnee();

	/**
	 * Returns a new object of class '<em>Edtion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Edtion</em>'.
	 * @generated
	 */
	Edtion createEdtion();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EditionPackage getEditionPackage();

} //EditionFactory
