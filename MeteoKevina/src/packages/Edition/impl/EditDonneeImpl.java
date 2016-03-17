/**
 */
package packages.Edition.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import packages.Edition.EditDonnee;
import packages.Edition.EditionPackage;

import packages.Prevision.Donnee;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edit Donnee</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EditDonneeImpl extends EdtionImpl implements EditDonnee {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EditDonneeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EditionPackage.Literals.EDIT_DONNEE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeDirection(Donnee donnee, double dir) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changePression(Donnee donnee, double pression) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeContraste(Donnee donnee, double contraste) {
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
			case EditionPackage.EDIT_DONNEE___CHANGE_DIRECTION__DONNEE_DOUBLE:
				changeDirection((Donnee)arguments.get(0), (Double)arguments.get(1));
				return null;
			case EditionPackage.EDIT_DONNEE___CHANGE_PRESSION__DONNEE_DOUBLE:
				changePression((Donnee)arguments.get(0), (Double)arguments.get(1));
				return null;
			case EditionPackage.EDIT_DONNEE___CHANGE_CONTRASTE__DONNEE_DOUBLE:
				changeContraste((Donnee)arguments.get(0), (Double)arguments.get(1));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //EditDonneeImpl
