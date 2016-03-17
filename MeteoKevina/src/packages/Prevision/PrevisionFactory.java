/**
 */
package packages.Prevision;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see packages.Prevision.PrevisionPackage
 * @generated
 */
public interface PrevisionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PrevisionFactory eINSTANCE = packages.Prevision.impl.PrevisionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Donnee</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Donnee</em>'.
	 * @generated
	 */
	Donnee createDonnee();

	/**
	 * Returns a new object of class '<em>Vent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vent</em>'.
	 * @generated
	 */
	Vent createVent();

	/**
	 * Returns a new object of class '<em>Coordonnee</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coordonnee</em>'.
	 * @generated
	 */
	Coordonnee createCoordonnee();

	/**
	 * Returns a new object of class '<em>Prevision</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prevision</em>'.
	 * @generated
	 */
	Prevision createPrevision();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PrevisionPackage getPrevisionPackage();

} //PrevisionFactory
