/**
 */
package packages.Prevision;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see packages.Prevision.PrevisionFactory
 * @model kind="package"
 * @generated
 */
public interface PrevisionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Prevision";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://packages/prevision";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "prevision";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PrevisionPackage eINSTANCE = packages.Prevision.impl.PrevisionPackageImpl.init();

	/**
	 * The meta object id for the '{@link packages.Prevision.impl.DonneeImpl <em>Donnee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see packages.Prevision.impl.DonneeImpl
	 * @see packages.Prevision.impl.PrevisionPackageImpl#getDonnee()
	 * @generated
	 */
	int DONNEE = 0;

	/**
	 * The feature id for the '<em><b>Coord</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONNEE__COORD = 0;

	/**
	 * The feature id for the '<em><b>Temps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONNEE__TEMPS = 1;

	/**
	 * The number of structural features of the '<em>Donnee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONNEE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Donnee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONNEE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link packages.Prevision.impl.VentImpl <em>Vent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see packages.Prevision.impl.VentImpl
	 * @see packages.Prevision.impl.PrevisionPackageImpl#getVent()
	 * @generated
	 */
	int VENT = 1;

	/**
	 * The feature id for the '<em><b>Coord</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENT__COORD = DONNEE__COORD;

	/**
	 * The feature id for the '<em><b>Temps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENT__TEMPS = DONNEE__TEMPS;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENT__DIRECTION = DONNEE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Vitesse u</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENT__VITESSE_U = DONNEE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Vitesse v</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENT__VITESSE_V = DONNEE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Vent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENT_FEATURE_COUNT = DONNEE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Vent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENT_OPERATION_COUNT = DONNEE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link packages.Prevision.impl.PressionsImpl <em>Pressions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see packages.Prevision.impl.PressionsImpl
	 * @see packages.Prevision.impl.PrevisionPackageImpl#getPressions()
	 * @generated
	 */
	int PRESSIONS = 2;

	/**
	 * The feature id for the '<em><b>Coord</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSIONS__COORD = DONNEE__COORD;

	/**
	 * The feature id for the '<em><b>Temps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSIONS__TEMPS = DONNEE__TEMPS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSIONS__VALUE = DONNEE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pressions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSIONS_FEATURE_COUNT = DONNEE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pressions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSIONS_OPERATION_COUNT = DONNEE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link packages.Prevision.impl.CoordonneeImpl <em>Coordonnee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see packages.Prevision.impl.CoordonneeImpl
	 * @see packages.Prevision.impl.PrevisionPackageImpl#getCoordonnee()
	 * @generated
	 */
	int COORDONNEE = 3;

	/**
	 * The feature id for the '<em><b>Lon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDONNEE__LON = 0;

	/**
	 * The feature id for the '<em><b>Lat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDONNEE__LAT = 1;

	/**
	 * The number of structural features of the '<em>Coordonnee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDONNEE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Coordonnee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDONNEE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link packages.Prevision.InterPrev <em>Inter Prev</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see packages.Prevision.InterPrev
	 * @see packages.Prevision.impl.PrevisionPackageImpl#getInterPrev()
	 * @generated
	 */
	int INTER_PREV = 4;

	/**
	 * The number of structural features of the '<em>Inter Prev</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_PREV_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Inter Prev</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_PREV_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link packages.Prevision.impl.PrevisionImpl <em>Prevision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see packages.Prevision.impl.PrevisionImpl
	 * @see packages.Prevision.impl.PrevisionPackageImpl#getPrevision()
	 * @generated
	 */
	int PREVISION = 5;

	/**
	 * The feature id for the '<em><b>Donnees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREVISION__DONNEES = INTER_PREV_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Prevision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREVISION_FEATURE_COUNT = INTER_PREV_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Prevision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREVISION_OPERATION_COUNT = INTER_PREV_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link packages.Prevision.Donnee <em>Donnee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Donnee</em>'.
	 * @see packages.Prevision.Donnee
	 * @generated
	 */
	EClass getDonnee();

	/**
	 * Returns the meta object for the reference '{@link packages.Prevision.Donnee#getCoord <em>Coord</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Coord</em>'.
	 * @see packages.Prevision.Donnee#getCoord()
	 * @see #getDonnee()
	 * @generated
	 */
	EReference getDonnee_Coord();

	/**
	 * Returns the meta object for the attribute '{@link packages.Prevision.Donnee#getTemps <em>Temps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temps</em>'.
	 * @see packages.Prevision.Donnee#getTemps()
	 * @see #getDonnee()
	 * @generated
	 */
	EAttribute getDonnee_Temps();

	/**
	 * Returns the meta object for class '{@link packages.Prevision.Vent <em>Vent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vent</em>'.
	 * @see packages.Prevision.Vent
	 * @generated
	 */
	EClass getVent();

	/**
	 * Returns the meta object for the attribute '{@link packages.Prevision.Vent#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see packages.Prevision.Vent#getDirection()
	 * @see #getVent()
	 * @generated
	 */
	EAttribute getVent_Direction();

	/**
	 * Returns the meta object for the attribute '{@link packages.Prevision.Vent#getVitesse_u <em>Vitesse u</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vitesse u</em>'.
	 * @see packages.Prevision.Vent#getVitesse_u()
	 * @see #getVent()
	 * @generated
	 */
	EAttribute getVent_Vitesse_u();

	/**
	 * Returns the meta object for the attribute '{@link packages.Prevision.Vent#getVitesse_v <em>Vitesse v</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vitesse v</em>'.
	 * @see packages.Prevision.Vent#getVitesse_v()
	 * @see #getVent()
	 * @generated
	 */
	EAttribute getVent_Vitesse_v();

	/**
	 * Returns the meta object for class '{@link packages.Prevision.Pressions <em>Pressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pressions</em>'.
	 * @see packages.Prevision.Pressions
	 * @generated
	 */
	EClass getPressions();

	/**
	 * Returns the meta object for the attribute '{@link packages.Prevision.Pressions#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see packages.Prevision.Pressions#getValue()
	 * @see #getPressions()
	 * @generated
	 */
	EAttribute getPressions_Value();

	/**
	 * Returns the meta object for class '{@link packages.Prevision.Coordonnee <em>Coordonnee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordonnee</em>'.
	 * @see packages.Prevision.Coordonnee
	 * @generated
	 */
	EClass getCoordonnee();

	/**
	 * Returns the meta object for the attribute '{@link packages.Prevision.Coordonnee#getLon <em>Lon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lon</em>'.
	 * @see packages.Prevision.Coordonnee#getLon()
	 * @see #getCoordonnee()
	 * @generated
	 */
	EAttribute getCoordonnee_Lon();

	/**
	 * Returns the meta object for the attribute '{@link packages.Prevision.Coordonnee#getLat <em>Lat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lat</em>'.
	 * @see packages.Prevision.Coordonnee#getLat()
	 * @see #getCoordonnee()
	 * @generated
	 */
	EAttribute getCoordonnee_Lat();

	/**
	 * Returns the meta object for class '{@link packages.Prevision.InterPrev <em>Inter Prev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inter Prev</em>'.
	 * @see packages.Prevision.InterPrev
	 * @generated
	 */
	EClass getInterPrev();

	/**
	 * Returns the meta object for class '{@link packages.Prevision.Prevision <em>Prevision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prevision</em>'.
	 * @see packages.Prevision.Prevision
	 * @generated
	 */
	EClass getPrevision();

	/**
	 * Returns the meta object for the reference list '{@link packages.Prevision.Prevision#getDonnees <em>Donnees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Donnees</em>'.
	 * @see packages.Prevision.Prevision#getDonnees()
	 * @see #getPrevision()
	 * @generated
	 */
	EReference getPrevision_Donnees();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PrevisionFactory getPrevisionFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link packages.Prevision.impl.DonneeImpl <em>Donnee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see packages.Prevision.impl.DonneeImpl
		 * @see packages.Prevision.impl.PrevisionPackageImpl#getDonnee()
		 * @generated
		 */
		EClass DONNEE = eINSTANCE.getDonnee();

		/**
		 * The meta object literal for the '<em><b>Coord</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DONNEE__COORD = eINSTANCE.getDonnee_Coord();

		/**
		 * The meta object literal for the '<em><b>Temps</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DONNEE__TEMPS = eINSTANCE.getDonnee_Temps();

		/**
		 * The meta object literal for the '{@link packages.Prevision.impl.VentImpl <em>Vent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see packages.Prevision.impl.VentImpl
		 * @see packages.Prevision.impl.PrevisionPackageImpl#getVent()
		 * @generated
		 */
		EClass VENT = eINSTANCE.getVent();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VENT__DIRECTION = eINSTANCE.getVent_Direction();

		/**
		 * The meta object literal for the '<em><b>Vitesse u</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VENT__VITESSE_U = eINSTANCE.getVent_Vitesse_u();

		/**
		 * The meta object literal for the '<em><b>Vitesse v</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VENT__VITESSE_V = eINSTANCE.getVent_Vitesse_v();

		/**
		 * The meta object literal for the '{@link packages.Prevision.impl.PressionsImpl <em>Pressions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see packages.Prevision.impl.PressionsImpl
		 * @see packages.Prevision.impl.PrevisionPackageImpl#getPressions()
		 * @generated
		 */
		EClass PRESSIONS = eINSTANCE.getPressions();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESSIONS__VALUE = eINSTANCE.getPressions_Value();

		/**
		 * The meta object literal for the '{@link packages.Prevision.impl.CoordonneeImpl <em>Coordonnee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see packages.Prevision.impl.CoordonneeImpl
		 * @see packages.Prevision.impl.PrevisionPackageImpl#getCoordonnee()
		 * @generated
		 */
		EClass COORDONNEE = eINSTANCE.getCoordonnee();

		/**
		 * The meta object literal for the '<em><b>Lon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDONNEE__LON = eINSTANCE.getCoordonnee_Lon();

		/**
		 * The meta object literal for the '<em><b>Lat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDONNEE__LAT = eINSTANCE.getCoordonnee_Lat();

		/**
		 * The meta object literal for the '{@link packages.Prevision.InterPrev <em>Inter Prev</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see packages.Prevision.InterPrev
		 * @see packages.Prevision.impl.PrevisionPackageImpl#getInterPrev()
		 * @generated
		 */
		EClass INTER_PREV = eINSTANCE.getInterPrev();

		/**
		 * The meta object literal for the '{@link packages.Prevision.impl.PrevisionImpl <em>Prevision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see packages.Prevision.impl.PrevisionImpl
		 * @see packages.Prevision.impl.PrevisionPackageImpl#getPrevision()
		 * @generated
		 */
		EClass PREVISION = eINSTANCE.getPrevision();

		/**
		 * The meta object literal for the '<em><b>Donnees</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREVISION__DONNEES = eINSTANCE.getPrevision_Donnees();

	}

} //PrevisionPackage
