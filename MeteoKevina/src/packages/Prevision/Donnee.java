/**
 */
package packages.Prevision;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Donnee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link packages.Prevision.Donnee#getTemps <em>Temps</em>}</li>
 *   <li>{@link packages.Prevision.Donnee#getVent <em>Vent</em>}</li>
 * </ul>
 * </p>
 *
 * @see packages.Prevision.PrevisionPackage#getDonnee()
 * @model
 * @generated
 */
public interface Donnee extends EObject {
	/**
	 * Returns the value of the '<em><b>Temps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temps</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temps</em>' attribute.
	 * @see #setTemps(double)
	 * @see packages.Prevision.PrevisionPackage#getDonnee_Temps()
	 * @model required="true"
	 * @generated
	 */
	double getTemps();

	/**
	 * Sets the value of the '{@link packages.Prevision.Donnee#getTemps <em>Temps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temps</em>' attribute.
	 * @see #getTemps()
	 * @generated
	 */
	void setTemps(double value);

	/**
	 * Returns the value of the '<em><b>Vent</b></em>' reference list.
	 * The list contents are of type {@link packages.Prevision.Vent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vent</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vent</em>' reference list.
	 * @see packages.Prevision.PrevisionPackage#getDonnee_Vent()
	 * @model
	 * @generated
	 */
	EList<Vent> getVent();

} // Donnee
