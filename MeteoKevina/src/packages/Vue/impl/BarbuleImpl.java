/**
 */
package packages.Vue.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import packages.Prevision.Vent;

import packages.Vue.Barbule;
import packages.Vue.VuePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Barbule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class BarbuleImpl extends MinimalEObjectImpl.Container implements Barbule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BarbuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VuePackage.Literals.BARBULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createBarb(double temps, double pression, double vitesse, double direction, double latitude, double longitude) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void afficherBarb(Vent donnee) {
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case VuePackage.BARBULE___CREATE_BARB__DOUBLE_DOUBLE_DOUBLE_DOUBLE_DOUBLE_DOUBLE:
				createBarb((Double)arguments.get(0), (Double)arguments.get(1), (Double)arguments.get(2), (Double)arguments.get(3), (Double)arguments.get(4), (Double)arguments.get(5));
				return null;
			case VuePackage.BARBULE___AFFICHER_BARB__VENT:
				afficherBarb((Vent)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //BarbuleImpl
