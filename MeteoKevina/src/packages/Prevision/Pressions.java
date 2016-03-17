/**
 */
package packages.Prevision;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pressions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link packages.Prevision.Pressions#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see packages.Prevision.PrevisionPackage#getPressions()
 * @model
 * @generated
 */
public interface Pressions extends Donnee {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see packages.Prevision.PrevisionPackage#getPressions_Value()
	 * @model required="true"
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link packages.Prevision.Pressions#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

} // Pressions
