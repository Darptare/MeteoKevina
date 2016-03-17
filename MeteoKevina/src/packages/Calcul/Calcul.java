/**
 */
package packages.Calcul;

import packages.Prevision.Donnee;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calcul</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see packages.Calcul.CalculPackage#getCalcul()
 * @model
 * @generated
 */
public interface Calcul extends InterCalc {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	double interpoler(Donnee prev1, Donnee prev2, Donnee prev3, Donnee prev4, double latitude, double longitude);

} // Calcul
