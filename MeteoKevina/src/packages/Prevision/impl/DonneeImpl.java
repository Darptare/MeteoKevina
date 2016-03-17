/**
 */
package packages.Prevision.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import packages.Prevision.Coordonnee;
import packages.Prevision.Donnee;
import packages.Prevision.PrevisionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Donnee</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link packages.Prevision.impl.DonneeImpl#getCoord <em>Coord</em>}</li>
 *   <li>{@link packages.Prevision.impl.DonneeImpl#getTemps <em>Temps</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DonneeImpl extends MinimalEObjectImpl.Container implements Donnee {
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
	 * The default value of the '{@link #getTemps() <em>Temps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemps()
	 * @generated
	 * @ordered
	 */
	protected static final double TEMPS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTemps() <em>Temps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemps()
	 * @generated
	 * @ordered
	 */
	protected double temps = TEMPS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DonneeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrevisionPackage.Literals.DONNEE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PrevisionPackage.DONNEE__COORD, oldCoord, coord));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PrevisionPackage.DONNEE__COORD, oldCoord, coord));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTemps() {
		return temps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemps(double newTemps) {
		double oldTemps = temps;
		temps = newTemps;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrevisionPackage.DONNEE__TEMPS, oldTemps, temps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PrevisionPackage.DONNEE__COORD:
				if (resolve) return getCoord();
				return basicGetCoord();
			case PrevisionPackage.DONNEE__TEMPS:
				return getTemps();
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
			case PrevisionPackage.DONNEE__COORD:
				setCoord((Coordonnee)newValue);
				return;
			case PrevisionPackage.DONNEE__TEMPS:
				setTemps((Double)newValue);
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
			case PrevisionPackage.DONNEE__COORD:
				setCoord((Coordonnee)null);
				return;
			case PrevisionPackage.DONNEE__TEMPS:
				setTemps(TEMPS_EDEFAULT);
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
			case PrevisionPackage.DONNEE__COORD:
				return coord != null;
			case PrevisionPackage.DONNEE__TEMPS:
				return temps != TEMPS_EDEFAULT;
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
		result.append(" (temps: ");
		result.append(temps);
		result.append(')');
		return result.toString();
	}

} //DonneeImpl
