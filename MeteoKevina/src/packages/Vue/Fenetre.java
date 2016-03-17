/**
 */
package packages.Vue;

import java.util.ArrayList;

import packages.Prevision.Vent;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fenetre</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link packages.Vue.Fenetre#getCarte <em>Carte</em>}</li>
 * </ul>
 * </p>
 *
 * @see packages.Vue.VuePackage#getFenetre()
 * @model
 * @generated
 */
public interface Fenetre extends InterView {
	/**
	 * Returns the value of the '<em><b>Carte</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Carte</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carte</em>' reference.
	 * @see #setCarte(Carte)
	 * @see packages.Vue.VuePackage#getFenetre_Carte()
	 * @model required="true"
	 * @generated
	 */
	Carte getCarte();

	/**
	 * Sets the value of the '{@link packages.Vue.Fenetre#getCarte <em>Carte</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carte</em>' reference.
	 * @see #getCarte()
	 * @generated
	 */
	void setCarte(Carte value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void start();
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void start(ArrayList<Vent> list);

} // Fenetre
