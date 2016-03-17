/**
 */
package packages.Vue.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import packages.Vue.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VueFactoryImpl extends EFactoryImpl implements VueFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VueFactory init() {
		try {
			VueFactory theVueFactory = (VueFactory)EPackage.Registry.INSTANCE.getEFactory(VuePackage.eNS_URI);
			if (theVueFactory != null) {
				return theVueFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new VueFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VueFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case VuePackage.CARTE: return createCarte();
			case VuePackage.BARBULE: return createBarbule();
			case VuePackage.FENETRE: return createFenetre();
			case VuePackage.ZONE_PRESSION: return createZonePression();
			case VuePackage.ZONE_SELECTION: return createZoneSelection();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Carte createCarte() {
		CarteImpl carte = new CarteImpl();
		return carte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Barbule createBarbule() {
		BarbuleImpl barbule = new BarbuleImpl();
		return barbule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fenetre createFenetre() {
		FenetreImpl fenetre = new FenetreImpl();
		return fenetre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZonePression createZonePression() {
		ZonePressionImpl zonePression = new ZonePressionImpl();
		return zonePression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZoneSelection createZoneSelection() {
		ZoneSelectionImpl zoneSelection = new ZoneSelectionImpl();
		return zoneSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VuePackage getVuePackage() {
		return (VuePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static VuePackage getPackage() {
		return VuePackage.eINSTANCE;
	}

} //VueFactoryImpl
