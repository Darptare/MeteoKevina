/**
 */
package packages.Edition.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import packages.Edition.CreateDonnee;
import packages.Edition.EditionPackage;

import packages.Prevision.Donnee;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create Donnee</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CreateDonneeImpl extends EdtionImpl implements CreateDonnee {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateDonneeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EditionPackage.Literals.CREATE_DONNEE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Donnee create(double temps, double pression, double vitesse, double direction, double latitude, double longitude) {
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
			case EditionPackage.CREATE_DONNEE___CREATE__DOUBLE_DOUBLE_DOUBLE_DOUBLE_DOUBLE_DOUBLE:
				return create((Double)arguments.get(0), (Double)arguments.get(1), (Double)arguments.get(2), (Double)arguments.get(3), (Double)arguments.get(4), (Double)arguments.get(5));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CreateDonneeImpl
