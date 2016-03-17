/**
 */
package packages.Vue;

import org.eclipse.emf.ecore.EObject;

import packages.Prevision.Vent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Barbule</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see packages.Vue.VuePackage#getBarbule()
 * @model
 * @generated
 */
public interface Barbule extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void createBarb(double temps, double pression, double vitesse, double direction, double latitude, double longitude);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void afficherBarb(Vent donnee);

} // Barbule
