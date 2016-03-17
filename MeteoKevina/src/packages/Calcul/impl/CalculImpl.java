/**
 */
package packages.Calcul.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import packages.Calcul.Calcul;
import packages.Calcul.CalculPackage;

import packages.Prevision.Donnee;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Calcul</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CalculImpl extends MinimalEObjectImpl.Container implements Calcul {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalculImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CalculPackage.Literals.CALCUL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double interpoler(Donnee prev1, Donnee prev2, Donnee prev3, Donnee prev4, double latitude, double longitude) {
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
			case CalculPackage.CALCUL___INTERPOLER__DONNEE_DONNEE_DONNEE_DONNEE_DOUBLE_DOUBLE:
				return interpoler((Donnee)arguments.get(0), (Donnee)arguments.get(1), (Donnee)arguments.get(2), (Donnee)arguments.get(3), (Double)arguments.get(4), (Double)arguments.get(5));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CalculImpl
