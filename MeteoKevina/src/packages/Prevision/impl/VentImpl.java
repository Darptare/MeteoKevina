/**
 */
package packages.Prevision.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import packages.Prevision.PrevisionPackage;
import packages.Prevision.Vent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link packages.Prevision.impl.VentImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link packages.Prevision.impl.VentImpl#getVitesse_u <em>Vitesse u</em>}</li>
 *   <li>{@link packages.Prevision.impl.VentImpl#getVitesse_v <em>Vitesse v</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VentImpl extends DonneeImpl implements Vent {
	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final double DIRECTION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected double direction = DIRECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getVitesse_u() <em>Vitesse u</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitesse_u()
	 * @generated
	 * @ordered
	 */
	protected static final double VITESSE_U_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVitesse_u() <em>Vitesse u</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitesse_u()
	 * @generated
	 * @ordered
	 */
	protected double vitesse_u = VITESSE_U_EDEFAULT;

	/**
	 * The default value of the '{@link #getVitesse_v() <em>Vitesse v</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitesse_v()
	 * @generated
	 * @ordered
	 */
	protected static final double VITESSE_V_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVitesse_v() <em>Vitesse v</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitesse_v()
	 * @generated
	 * @ordered
	 */
	protected double vitesse_v = VITESSE_V_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrevisionPackage.Literals.VENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(double newDirection) {
		double oldDirection = direction;
		direction = newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrevisionPackage.VENT__DIRECTION, oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getVitesse_u() {
		return vitesse_u;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVitesse_u(double newVitesse_u) {
		double oldVitesse_u = vitesse_u;
		vitesse_u = newVitesse_u;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrevisionPackage.VENT__VITESSE_U, oldVitesse_u, vitesse_u));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getVitesse_v() {
		return vitesse_v;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVitesse_v(double newVitesse_v) {
		double oldVitesse_v = vitesse_v;
		vitesse_v = newVitesse_v;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrevisionPackage.VENT__VITESSE_V, oldVitesse_v, vitesse_v));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PrevisionPackage.VENT__DIRECTION:
				return getDirection();
			case PrevisionPackage.VENT__VITESSE_U:
				return getVitesse_u();
			case PrevisionPackage.VENT__VITESSE_V:
				return getVitesse_v();
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
			case PrevisionPackage.VENT__DIRECTION:
				setDirection((Double)newValue);
				return;
			case PrevisionPackage.VENT__VITESSE_U:
				setVitesse_u((Double)newValue);
				return;
			case PrevisionPackage.VENT__VITESSE_V:
				setVitesse_v((Double)newValue);
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
			case PrevisionPackage.VENT__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
				return;
			case PrevisionPackage.VENT__VITESSE_U:
				setVitesse_u(VITESSE_U_EDEFAULT);
				return;
			case PrevisionPackage.VENT__VITESSE_V:
				setVitesse_v(VITESSE_V_EDEFAULT);
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
			case PrevisionPackage.VENT__DIRECTION:
				return direction != DIRECTION_EDEFAULT;
			case PrevisionPackage.VENT__VITESSE_U:
				return vitesse_u != VITESSE_U_EDEFAULT;
			case PrevisionPackage.VENT__VITESSE_V:
				return vitesse_v != VITESSE_V_EDEFAULT;
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
		result.append(" (direction: ");
		result.append(direction);
		result.append(", vitesse_u: ");
		result.append(vitesse_u);
		result.append(", vitesse_v: ");
		result.append(vitesse_v);
		result.append(')');
		return result.toString();
	}

} //VentImpl
