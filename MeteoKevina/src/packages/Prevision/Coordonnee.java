/**
 */
package packages.Prevision;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coordonnee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link packages.Prevision.Coordonnee#getLon <em>Lon</em>}</li>
 *   <li>{@link packages.Prevision.Coordonnee#getLat <em>Lat</em>}</li>
 * </ul>
 * </p>
 *
 * @see packages.Prevision.PrevisionPackage#getCoordonnee()
 * @model
 * @generated
 */
public interface Coordonnee extends EObject {
	/**
	 * Returns the value of the '<em><b>Lon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lon</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lon</em>' attribute.
	 * @see #setLon(double)
	 * @see packages.Prevision.PrevisionPackage#getCoordonnee_Lon()
	 * @model required="true"
	 * @generated
	 */
	double getLon();

	/**
	 * Sets the value of the '{@link packages.Prevision.Coordonnee#getLon <em>Lon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lon</em>' attribute.
	 * @see #getLon()
	 * @generated
	 */
	void setLon(double value);

	/**
	 * Returns the value of the '<em><b>Lat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lat</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lat</em>' attribute.
	 * @see #setLat(double)
	 * @see packages.Prevision.PrevisionPackage#getCoordonnee_Lat()
	 * @model required="true"
	 * @generated
	 */
	double getLat();

	/**
	 * Sets the value of the '{@link packages.Prevision.Coordonnee#getLat <em>Lat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lat</em>' attribute.
	 * @see #getLat()
	 * @generated
	 */
	void setLat(double value);

} // Coordonnee
