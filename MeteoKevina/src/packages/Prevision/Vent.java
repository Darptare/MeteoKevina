/**
 */
package packages.Prevision;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link packages.Prevision.Vent#getDirection <em>Direction</em>}</li>
 *   <li>{@link packages.Prevision.Vent#getVitesse_u <em>Vitesse u</em>}</li>
 *   <li>{@link packages.Prevision.Vent#getVitesse_v <em>Vitesse v</em>}</li>
 * </ul>
 * </p>
 *
 * @see packages.Prevision.PrevisionPackage#getVent()
 * @model
 * @generated
 */
public interface Vent extends Donnee {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see #setDirection(double)
	 * @see packages.Prevision.PrevisionPackage#getVent_Direction()
	 * @model required="true"
	 * @generated
	 */
	double getDirection();

	/**
	 * Sets the value of the '{@link packages.Prevision.Vent#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(double value);

	/**
	 * Returns the value of the '<em><b>Vitesse u</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vitesse u</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vitesse u</em>' attribute.
	 * @see #setVitesse_u(double)
	 * @see packages.Prevision.PrevisionPackage#getVent_Vitesse_u()
	 * @model required="true"
	 * @generated
	 */
	double getVitesse_u();

	/**
	 * Sets the value of the '{@link packages.Prevision.Vent#getVitesse_u <em>Vitesse u</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vitesse u</em>' attribute.
	 * @see #getVitesse_u()
	 * @generated
	 */
	void setVitesse_u(double value);

	/**
	 * Returns the value of the '<em><b>Vitesse v</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vitesse v</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vitesse v</em>' attribute.
	 * @see #setVitesse_v(double)
	 * @see packages.Prevision.PrevisionPackage#getVent_Vitesse_v()
	 * @model required="true"
	 * @generated
	 */
	double getVitesse_v();

	/**
	 * Sets the value of the '{@link packages.Prevision.Vent#getVitesse_v <em>Vitesse v</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vitesse v</em>' attribute.
	 * @see #getVitesse_v()
	 * @generated
	 */
	void setVitesse_v(double value);

} // Vent
