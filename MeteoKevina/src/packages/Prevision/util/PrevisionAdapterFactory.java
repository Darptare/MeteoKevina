/**
 */
package packages.Prevision.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import packages.Prevision.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see packages.Prevision.PrevisionPackage
 * @generated
 */
public class PrevisionAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PrevisionPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrevisionAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PrevisionPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrevisionSwitch<Adapter> modelSwitch =
		new PrevisionSwitch<Adapter>() {
			@Override
			public Adapter caseDonnee(Donnee object) {
				return createDonneeAdapter();
			}
			@Override
			public Adapter caseVent(Vent object) {
				return createVentAdapter();
			}
			@Override
			public Adapter caseCoordonnee(Coordonnee object) {
				return createCoordonneeAdapter();
			}
			@Override
			public Adapter caseInterPrev(InterPrev object) {
				return createInterPrevAdapter();
			}
			@Override
			public Adapter casePrevision(Prevision object) {
				return createPrevisionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link packages.Prevision.Donnee <em>Donnee</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see packages.Prevision.Donnee
	 * @generated
	 */
	public Adapter createDonneeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link packages.Prevision.Vent <em>Vent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see packages.Prevision.Vent
	 * @generated
	 */
	public Adapter createVentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link packages.Prevision.Coordonnee <em>Coordonnee</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see packages.Prevision.Coordonnee
	 * @generated
	 */
	public Adapter createCoordonneeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link packages.Prevision.InterPrev <em>Inter Prev</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see packages.Prevision.InterPrev
	 * @generated
	 */
	public Adapter createInterPrevAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link packages.Prevision.Prevision <em>Prevision</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see packages.Prevision.Prevision
	 * @generated
	 */
	public Adapter createPrevisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PrevisionAdapterFactory
