/**
 */
package packages.Edition.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import packages.Edition.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EditionFactoryImpl extends EFactoryImpl implements EditionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EditionFactory init() {
		try {
			EditionFactory theEditionFactory = (EditionFactory)EPackage.Registry.INSTANCE.getEFactory(EditionPackage.eNS_URI);
			if (theEditionFactory != null) {
				return theEditionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EditionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EditionFactoryImpl() {
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
			case EditionPackage.EDIT_DONNEE: return createEditDonnee();
			case EditionPackage.CREATE_DONNEE: return createCreateDonnee();
			case EditionPackage.EDTION: return createEdtion();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EditDonnee createEditDonnee() {
		EditDonneeImpl editDonnee = new EditDonneeImpl();
		return editDonnee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateDonnee createCreateDonnee() {
		CreateDonneeImpl createDonnee = new CreateDonneeImpl();
		return createDonnee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Edtion createEdtion() {
		EdtionImpl edtion = new EdtionImpl();
		return edtion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EditionPackage getEditionPackage() {
		return (EditionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EditionPackage getPackage() {
		return EditionPackage.eINSTANCE;
	}

} //EditionFactoryImpl
