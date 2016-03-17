/**
 */
package packages.Vue;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see packages.Vue.VuePackage
 * @generated
 */
public interface VueFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VueFactory eINSTANCE = packages.Vue.impl.VueFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Carte</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Carte</em>'.
	 * @generated
	 */
	Carte createCarte();

	/**
	 * Returns a new object of class '<em>Barbule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Barbule</em>'.
	 * @generated
	 */
	Barbule createBarbule();

	/**
	 * Returns a new object of class '<em>Fenetre</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fenetre</em>'.
	 * @generated
	 */
	Fenetre createFenetre();

	/**
	 * Returns a new object of class '<em>Zone Pression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Zone Pression</em>'.
	 * @generated
	 */
	ZonePression createZonePression();

	/**
	 * Returns a new object of class '<em>Zone Selection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Zone Selection</em>'.
	 * @generated
	 */
	ZoneSelection createZoneSelection();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	VuePackage getVuePackage();

} //VueFactory
