/**
 */
package packages.Edition;

import packages.Prevision.Donnee;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create Donnee</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see packages.Edition.EditionPackage#getCreateDonnee()
 * @model
 * @generated
 */
public interface CreateDonnee extends Edtion {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	Donnee create(double temps, double pression, double vitesse, double direction, double latitude, double longitude);

} // CreateDonnee
