/**
 */
package packages.Parametres.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import packages.Parametres.Parametres;
import packages.Parametres.ParametresPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parametres</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link packages.Parametres.impl.ParametresImpl#getLangue <em>Langue</em>}</li>
 *   <li>{@link packages.Parametres.impl.ParametresImpl#getUnite <em>Unite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParametresImpl extends MinimalEObjectImpl.Container implements Parametres {
	/**
	 * The default value of the '{@link #getLangue() <em>Langue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLangue()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLangue() <em>Langue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLangue()
	 * @generated
	 * @ordered
	 */
	protected String langue = LANGUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnite() <em>Unite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnite()
	 * @generated
	 * @ordered
	 */
	protected static final String UNITE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnite() <em>Unite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnite()
	 * @generated
	 * @ordered
	 */
	protected String unite = UNITE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParametresImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ParametresPackage.Literals.PARAMETRES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLangue() {
		return langue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLangue(String newLangue) {
		String oldLangue = langue;
		langue = newLangue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParametresPackage.PARAMETRES__LANGUE, oldLangue, langue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnite() {
		return unite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnite(String newUnite) {
		String oldUnite = unite;
		unite = newUnite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParametresPackage.PARAMETRES__UNITE, oldUnite, unite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ParametresPackage.PARAMETRES__LANGUE:
				return getLangue();
			case ParametresPackage.PARAMETRES__UNITE:
				return getUnite();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ParametresPackage.PARAMETRES__LANGUE:
				setLangue((String)newValue);
				return;
			case ParametresPackage.PARAMETRES__UNITE:
				setUnite((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ParametresPackage.PARAMETRES__LANGUE:
				setLangue(LANGUE_EDEFAULT);
				return;
			case ParametresPackage.PARAMETRES__UNITE:
				setUnite(UNITE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ParametresPackage.PARAMETRES__LANGUE:
				return LANGUE_EDEFAULT == null ? langue != null : !LANGUE_EDEFAULT.equals(langue);
			case ParametresPackage.PARAMETRES__UNITE:
				return UNITE_EDEFAULT == null ? unite != null : !UNITE_EDEFAULT.equals(unite);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (langue: ");
		result.append(langue);
		result.append(", unite: ");
		result.append(unite);
		result.append(')');
		return result.toString();
	}

} //ParametresImpl
