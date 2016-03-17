/**
 */
package packages.Vue.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import packages.Vue.Barbule;
import packages.Vue.Carte;
import packages.Vue.VuePackage;
import packages.Vue.ZonePression;
import packages.Vue.ZoneSelection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Carte</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link packages.Vue.impl.CarteImpl#getBarbules <em>Barbules</em>}</li>
 *   <li>{@link packages.Vue.impl.CarteImpl#getZoneSelection <em>Zone Selection</em>}</li>
 *   <li>{@link packages.Vue.impl.CarteImpl#getZonePression <em>Zone Pression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CarteImpl extends MinimalEObjectImpl.Container implements Carte {
	/**
	 * The cached value of the '{@link #getBarbules() <em>Barbules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBarbules()
	 * @generated
	 * @ordered
	 */
	protected EList<Barbule> barbules;

	/**
	 * The cached value of the '{@link #getZoneSelection() <em>Zone Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZoneSelection()
	 * @generated
	 * @ordered
	 */
	protected ZoneSelection zoneSelection;

	/**
	 * The cached value of the '{@link #getZonePression() <em>Zone Pression</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZonePression()
	 * @generated
	 * @ordered
	 */
	protected EList<ZonePression> zonePression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CarteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VuePackage.Literals.CARTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Barbule> getBarbules() {
		if (barbules == null) {
			barbules = new EObjectResolvingEList<Barbule>(Barbule.class, this, VuePackage.CARTE__BARBULES);
		}
		return barbules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZoneSelection getZoneSelection() {
		if (zoneSelection != null && zoneSelection.eIsProxy()) {
			InternalEObject oldZoneSelection = (InternalEObject)zoneSelection;
			zoneSelection = (ZoneSelection)eResolveProxy(oldZoneSelection);
			if (zoneSelection != oldZoneSelection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VuePackage.CARTE__ZONE_SELECTION, oldZoneSelection, zoneSelection));
			}
		}
		return zoneSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZoneSelection basicGetZoneSelection() {
		return zoneSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZoneSelection(ZoneSelection newZoneSelection) {
		ZoneSelection oldZoneSelection = zoneSelection;
		zoneSelection = newZoneSelection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VuePackage.CARTE__ZONE_SELECTION, oldZoneSelection, zoneSelection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ZonePression> getZonePression() {
		if (zonePression == null) {
			zonePression = new EObjectResolvingEList<ZonePression>(ZonePression.class, this, VuePackage.CARTE__ZONE_PRESSION);
		}
		return zonePression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dezoomer() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void zoomer() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VuePackage.CARTE__BARBULES:
				return getBarbules();
			case VuePackage.CARTE__ZONE_SELECTION:
				if (resolve) return getZoneSelection();
				return basicGetZoneSelection();
			case VuePackage.CARTE__ZONE_PRESSION:
				return getZonePression();
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
			case VuePackage.CARTE__BARBULES:
				getBarbules().clear();
				getBarbules().addAll((Collection<? extends Barbule>)newValue);
				return;
			case VuePackage.CARTE__ZONE_SELECTION:
				setZoneSelection((ZoneSelection)newValue);
				return;
			case VuePackage.CARTE__ZONE_PRESSION:
				getZonePression().clear();
				getZonePression().addAll((Collection<? extends ZonePression>)newValue);
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
			case VuePackage.CARTE__BARBULES:
				getBarbules().clear();
				return;
			case VuePackage.CARTE__ZONE_SELECTION:
				setZoneSelection((ZoneSelection)null);
				return;
			case VuePackage.CARTE__ZONE_PRESSION:
				getZonePression().clear();
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
			case VuePackage.CARTE__BARBULES:
				return barbules != null && !barbules.isEmpty();
			case VuePackage.CARTE__ZONE_SELECTION:
				return zoneSelection != null;
			case VuePackage.CARTE__ZONE_PRESSION:
				return zonePression != null && !zonePression.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case VuePackage.CARTE___DEZOOMER:
				dezoomer();
				return null;
			case VuePackage.CARTE___ZOOMER:
				zoomer();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //CarteImpl
