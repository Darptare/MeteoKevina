/**
 */
package packages.Prevision.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import packages.Prevision.Donnee;
import packages.Prevision.Prevision;
import packages.Prevision.PrevisionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prevision</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link packages.Prevision.impl.PrevisionImpl#getDonnees <em>Donnees</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrevisionImpl extends MinimalEObjectImpl.Container implements Prevision {
	/**
	 * The cached value of the '{@link #getDonnees() <em>Donnees</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDonnees()
	 * @generated
	 * @ordered
	 */
	protected EList<Donnee> donnees;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrevisionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrevisionPackage.Literals.PREVISION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Donnee> getDonnees() {
		if (donnees == null) {
			donnees = new EObjectResolvingEList<Donnee>(Donnee.class, this, PrevisionPackage.PREVISION__DONNEES);
		}
		return donnees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PrevisionPackage.PREVISION__DONNEES:
				return getDonnees();
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
			case PrevisionPackage.PREVISION__DONNEES:
				getDonnees().clear();
				getDonnees().addAll((Collection<? extends Donnee>)newValue);
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
			case PrevisionPackage.PREVISION__DONNEES:
				getDonnees().clear();
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
			case PrevisionPackage.PREVISION__DONNEES:
				return donnees != null && !donnees.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PrevisionImpl
