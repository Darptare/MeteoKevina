/**
 */
package packages.Edition;

import packages.Prevision.Donnee;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edit Donnee</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see packages.Edition.EditionPackage#getEditDonnee()
 * @model
 * @generated
 */
public interface EditDonnee extends Edtion {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void changeDirection(Donnee donnee, double dir);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void changePression(Donnee donnee, double pression);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void changeContraste(Donnee donnee, double contraste);

} // EditDonnee
