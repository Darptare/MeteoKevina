/**
 */
package packages.Prevision;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prevision</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link packages.Prevision.Prevision#getDonnees <em>Donnees</em>}</li>
 * </ul>
 * </p>
 *
 * @see packages.Prevision.PrevisionPackage#getPrevision()
 * @model
 * @generated
 */
public interface Prevision extends InterPrev {
	/**
	 * Returns the value of the '<em><b>Donnees</b></em>' reference list.
	 * The list contents are of type {@link packages.Prevision.Donnee}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Donnees</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Donnees</em>' reference list.
	 * @see packages.Prevision.PrevisionPackage#getPrevision_Donnees()
	 * @model
	 * @generated
	 */
	EList<Donnee> getDonnees();

} // Prevision
