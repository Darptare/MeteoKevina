/**
 */
package packages.Vue.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import packages.Vue.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see packages.Vue.VuePackage
 * @generated
 */
public class VueAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static VuePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VueAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = VuePackage.eINSTANCE;
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
	protected VueSwitch<Adapter> modelSwitch =
		new VueSwitch<Adapter>() {
			@Override
			public Adapter caseCarte(Carte object) {
				return createCarteAdapter();
			}
			@Override
			public Adapter caseBarbule(Barbule object) {
				return createBarbuleAdapter();
			}
			@Override
			public Adapter caseInterView(InterView object) {
				return createInterViewAdapter();
			}
			@Override
			public Adapter caseFenetre(Fenetre object) {
				return createFenetreAdapter();
			}
			@Override
			public Adapter caseZonePression(ZonePression object) {
				return createZonePressionAdapter();
			}
			@Override
			public Adapter caseZoneSelection(ZoneSelection object) {
				return createZoneSelectionAdapter();
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
	 * Creates a new adapter for an object of class '{@link packages.Vue.Carte <em>Carte</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see packages.Vue.Carte
	 * @generated
	 */
	public Adapter createCarteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link packages.Vue.Barbule <em>Barbule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see packages.Vue.Barbule
	 * @generated
	 */
	public Adapter createBarbuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link packages.Vue.InterView <em>Inter View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see packages.Vue.InterView
	 * @generated
	 */
	public Adapter createInterViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link packages.Vue.Fenetre <em>Fenetre</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see packages.Vue.Fenetre
	 * @generated
	 */
	public Adapter createFenetreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link packages.Vue.ZonePression <em>Zone Pression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see packages.Vue.ZonePression
	 * @generated
	 */
	public Adapter createZonePressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link packages.Vue.ZoneSelection <em>Zone Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see packages.Vue.ZoneSelection
	 * @generated
	 */
	public Adapter createZoneSelectionAdapter() {
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

} //VueAdapterFactory
