/**
 */
package packages.Calcul;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see packages.Calcul.CalculPackage
 * @generated
 */
public interface CalculFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CalculFactory eINSTANCE = packages.Calcul.impl.CalculFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Calcul</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calcul</em>'.
	 * @generated
	 */
	Calcul createCalcul();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CalculPackage getCalculPackage();

} //CalculFactory
