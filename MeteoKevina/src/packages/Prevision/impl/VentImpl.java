/**
 */
package packages.Prevision.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import packages.Prevision.Coordonnee;
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
 *   <li>{@link packages.Prevision.impl.VentImpl#getVitesse_nd <em>Vitesse nd</em>}</li>
 *   <li>{@link packages.Prevision.impl.VentImpl#getVitesse_u <em>Vitesse u</em>}</li>
 *   <li>{@link packages.Prevision.impl.VentImpl#getVitesse_v <em>Vitesse v</em>}</li>
 *   <li>{@link packages.Prevision.impl.VentImpl#getValue <em>Value</em>}</li>
 *   <li>{@link packages.Prevision.impl.VentImpl#getCoord <em>Coord</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VentImpl extends MinimalEObjectImpl.Container implements Vent {
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
	 * The default value of the '{@link #getVitesse_nd() <em>Vitesse nd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitesse_nd()
	 * @generated
	 * @ordered
	 */
	protected static final double VITESSE_ND_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVitesse_nd() <em>Vitesse nd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitesse_nd()
	 * @generated
	 * @ordered
	 */
	protected double vitesse_nd = VITESSE_ND_EDEFAULT;

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
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final double VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected double value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCoord() <em>Coord</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoord()
	 * @generated
	 * @ordered
	 */
	protected Coordonnee coord;

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
	public double getVitesse_nd() {
		return vitesse_nd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVitesse_nd(double newVitesse_nd) {
		double oldVitesse_nd = vitesse_nd;
		vitesse_nd = newVitesse_nd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrevisionPackage.VENT__VITESSE_ND, oldVitesse_nd, vitesse_nd));
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
	public double getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(double newValue) {
		double oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrevisionPackage.VENT__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coordonnee getCoord() {
		if (coord != null && coord.eIsProxy()) {
			InternalEObject oldCoord = (InternalEObject)coord;
			coord = (Coordonnee)eResolveProxy(oldCoord);
			if (coord != oldCoord) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PrevisionPackage.VENT__COORD, oldCoord, coord));
			}
		}
		return coord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coordonnee basicGetCoord() {
		return coord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoord(Coordonnee newCoord) {
		Coordonnee oldCoord = coord;
		coord = newCoord;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrevisionPackage.VENT__COORD, oldCoord, coord));
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
			case PrevisionPackage.VENT__VITESSE_ND:
				return getVitesse_nd();
			case PrevisionPackage.VENT__VITESSE_U:
				return getVitesse_u();
			case PrevisionPackage.VENT__VITESSE_V:
				return getVitesse_v();
			case PrevisionPackage.VENT__VALUE:
				return getValue();
			case PrevisionPackage.VENT__COORD:
				if (resolve) return getCoord();
				return basicGetCoord();
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
			case PrevisionPackage.VENT__VITESSE_ND:
				setVitesse_nd((Double)newValue);
				return;
			case PrevisionPackage.VENT__VITESSE_U:
				setVitesse_u((Double)newValue);
				return;
			case PrevisionPackage.VENT__VITESSE_V:
				setVitesse_v((Double)newValue);
				return;
			case PrevisionPackage.VENT__VALUE:
				setValue((Double)newValue);
				return;
			case PrevisionPackage.VENT__COORD:
				setCoord((Coordonnee)newValue);
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
			case PrevisionPackage.VENT__VITESSE_ND:
				setVitesse_nd(VITESSE_ND_EDEFAULT);
				return;
			case PrevisionPackage.VENT__VITESSE_U:
				setVitesse_u(VITESSE_U_EDEFAULT);
				return;
			case PrevisionPackage.VENT__VITESSE_V:
				setVitesse_v(VITESSE_V_EDEFAULT);
				return;
			case PrevisionPackage.VENT__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case PrevisionPackage.VENT__COORD:
				setCoord((Coordonnee)null);
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
			case PrevisionPackage.VENT__VITESSE_ND:
				return vitesse_nd != VITESSE_ND_EDEFAULT;
			case PrevisionPackage.VENT__VITESSE_U:
				return vitesse_u != VITESSE_U_EDEFAULT;
			case PrevisionPackage.VENT__VITESSE_V:
				return vitesse_v != VITESSE_V_EDEFAULT;
			case PrevisionPackage.VENT__VALUE:
				return value != VALUE_EDEFAULT;
			case PrevisionPackage.VENT__COORD:
				return coord != null;
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
		result.append(", vitesse_nd: ");
		result.append(vitesse_nd);
		result.append(", vitesse_u: ");
		result.append(vitesse_u);
		result.append(", vitesse_v: ");
		result.append(vitesse_v);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //VentImpl
