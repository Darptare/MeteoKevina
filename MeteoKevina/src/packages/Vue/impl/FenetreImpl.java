/**
 */
package packages.Vue.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import packages.Vue.Carte;
import packages.Vue.Fenetre;
import packages.Vue.VuePackage;
import test.Demo;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fenetre</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link packages.Vue.impl.FenetreImpl#getCarte <em>Carte</em>}</li>
 * </ul>
 * </p>
 *
 * @generated NOT
 */
public class FenetreImpl extends MinimalEObjectImpl.Container implements Fenetre {
	/**
	 * The cached value of the '{@link #getCarte() <em>Carte</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarte()
	 * @generated
	 * @ordered
	 */
	protected Carte carte;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FenetreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VuePackage.Literals.FENETRE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Carte getCarte() {
		if (carte != null && carte.eIsProxy()) {
			InternalEObject oldCarte = (InternalEObject)carte;
			carte = (Carte)eResolveProxy(oldCarte);
			if (carte != oldCarte) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VuePackage.FENETRE__CARTE, oldCarte, carte));
			}
		}
		return carte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Carte basicGetCarte() {
		return carte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCarte(Carte newCarte) {
		Carte oldCarte = carte;
		carte = newCarte;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VuePackage.FENETRE__CARTE, oldCarte, carte));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void start() {

		new Demo().setVisible(true);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VuePackage.FENETRE__CARTE:
				if (resolve) return getCarte();
				return basicGetCarte();
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
			case VuePackage.FENETRE__CARTE:
				setCarte((Carte)newValue);
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
			case VuePackage.FENETRE__CARTE:
				setCarte((Carte)null);
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
			case VuePackage.FENETRE__CARTE:
				return carte != null;
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
			case VuePackage.FENETRE___START:
				start();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //FenetreImpl
