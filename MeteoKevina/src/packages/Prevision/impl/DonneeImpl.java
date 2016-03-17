/**
 */
package packages.Prevision.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import packages.Prevision.Donnee;
import packages.Prevision.PrevisionPackage;
import packages.Prevision.Vent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Donnee</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link packages.Prevision.impl.DonneeImpl#getTemps <em>Temps</em>}</li>
 *   <li>{@link packages.Prevision.impl.DonneeImpl#getVent <em>Vent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DonneeImpl extends MinimalEObjectImpl.Container implements Donnee {
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
	 * The cached value of the '{@link #getVent() <em>Vent</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVent()
	 * @generated
	 * @ordered
	 */
	protected EList<Vent> vent;

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
	public EList<Vent> getVent() {
		if (vent == null) {
			vent = new EObjectResolvingEList<Vent>(Vent.class, this, PrevisionPackage.DONNEE__VENT);
		}
		return vent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PrevisionPackage.DONNEE__TEMPS:
				return getTemps();
			case PrevisionPackage.DONNEE__VENT:
				return getVent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PrevisionPackage.DONNEE__TEMPS:
				setTemps((Double)newValue);
				return;
			case PrevisionPackage.DONNEE__VENT:
				getVent().clear();
				getVent().addAll((Collection<? extends Vent>)newValue);
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
			case PrevisionPackage.DONNEE__TEMPS:
				setTemps(TEMPS_EDEFAULT);
				return;
			case PrevisionPackage.DONNEE__VENT:
				getVent().clear();
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
			case PrevisionPackage.DONNEE__TEMPS:
				return temps != TEMPS_EDEFAULT;
			case PrevisionPackage.DONNEE__VENT:
				return vent != null && !vent.isEmpty();
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
