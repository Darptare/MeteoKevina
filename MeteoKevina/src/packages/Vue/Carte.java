/**
 */
package packages.Vue;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Carte</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link packages.Vue.Carte#getBarbules <em>Barbules</em>}</li>
 *   <li>{@link packages.Vue.Carte#getZoneSelection <em>Zone Selection</em>}</li>
 *   <li>{@link packages.Vue.Carte#getZonePression <em>Zone Pression</em>}</li>
 * </ul>
 * </p>
 *
 * @see packages.Vue.VuePackage#getCarte()
 * @model
 * @generated
 */
public interface Carte extends EObject {
	/**
	 * Returns the value of the '<em><b>Barbules</b></em>' reference list.
	 * The list contents are of type {@link packages.Vue.Barbule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Barbules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Barbules</em>' reference list.
	 * @see packages.Vue.VuePackage#getCarte_Barbules()
	 * @model
	 * @generated
	 */
	EList<Barbule> getBarbules();

	/**
	 * Returns the value of the '<em><b>Zone Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zone Selection</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zone Selection</em>' reference.
	 * @see #setZoneSelection(ZoneSelection)
	 * @see packages.Vue.VuePackage#getCarte_ZoneSelection()
	 * @model
	 * @generated
	 */
	ZoneSelection getZoneSelection();

	/**
	 * Sets the value of the '{@link packages.Vue.Carte#getZoneSelection <em>Zone Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zone Selection</em>' reference.
	 * @see #getZoneSelection()
	 * @generated
	 */
	void setZoneSelection(ZoneSelection value);

	/**
	 * Returns the value of the '<em><b>Zone Pression</b></em>' reference list.
	 * The list contents are of type {@link packages.Vue.ZonePression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zone Pression</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zone Pression</em>' reference list.
	 * @see packages.Vue.VuePackage#getCarte_ZonePression()
	 * @model
	 * @generated
	 */
	EList<ZonePression> getZonePression();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void dezoomer();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void zoomer();

} // Carte
