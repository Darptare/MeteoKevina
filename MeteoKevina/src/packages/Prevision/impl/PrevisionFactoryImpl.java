/**
 */
package packages.Prevision.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import packages.Prevision.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PrevisionFactoryImpl extends EFactoryImpl implements PrevisionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PrevisionFactory init() {
		try {
			PrevisionFactory thePrevisionFactory = (PrevisionFactory)EPackage.Registry.INSTANCE.getEFactory(PrevisionPackage.eNS_URI);
			if (thePrevisionFactory != null) {
				return thePrevisionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PrevisionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrevisionFactoryImpl() {
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
			case PrevisionPackage.DONNEE: return createDonnee();
			case PrevisionPackage.VENT: return createVent();
			case PrevisionPackage.COORDONNEE: return createCoordonnee();
			case PrevisionPackage.PREVISION: return createPrevision();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Donnee createDonnee() {
		DonneeImpl donnee = new DonneeImpl();
		return donnee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vent createVent() {
		VentImpl vent = new VentImpl();
		return vent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coordonnee createCoordonnee() {
		CoordonneeImpl coordonnee = new CoordonneeImpl();
		return coordonnee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Prevision createPrevision() {
		PrevisionImpl prevision = new PrevisionImpl();
		return prevision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrevisionPackage getPrevisionPackage() {
		return (PrevisionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PrevisionPackage getPackage() {
		return PrevisionPackage.eINSTANCE;
	}

} //PrevisionFactoryImpl
