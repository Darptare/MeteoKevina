/**
 */
package packages.Calcul.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import packages.Calcul.Calcul;
import packages.Calcul.CalculPackage;
import packages.Prevision.Coordonnee;
import packages.Prevision.Donnee;
import packages.Prevision.impl.CoordonneeImpl;
import packages.Prevision.impl.PrevisionFactoryImpl;
import packages.Prevision.impl.VentImpl;

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
	
	 public double getVitesse(double u, double v){ // Renvoie la vitesse a partir de u et v de manière magique avec notre ami Poutagyre en noeuds :>
	   	 double vit = 0;
	   	 double res = 0;
	   	 
	   	 res = Math.pow(u, 2)+Math.pow(v, 2);
	   	 //System.out.println("Carré des deux valeurs : "+res);
	   	 vit = Math.sqrt(res);
	   	 //System.out.println("Vitesse du vent en m/s : "+vit);
	   	 vit = vit * 1.9438444924574;
	   	 System.out.println("Vitesse du vent en noeuds : "+vit);
	   	 //System.out.println("racine carrée de 25 : "+Math.sqrt(25));
	   	 
	    return vit;
	    }
	    
	    public double getAngle(double u, double v){ // Renvoie l'angle (la direction du vent) grâce a de la magie
	   	 double angle = 0;
	   	 
	   	 angle = Math.atan2(u, v);
	   	 angle = Math.toDegrees(angle);
	   	 angle = angle + 180;
	   	 //angle = (angle==360)?0:angle;
	   	 angle = angle%360;
	   	 //System.out.println(angle);
	   	 System.out.println("Valeur de l'angle en degrés de rose des vents marins : "+angle);
	   	 
	   	 return angle;
	   	 
	    }

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public double interpoler(Donnee prev1, Donnee prev2, Donnee prev3, Donnee prev4, double latitude, double longitude) {
		
		
		throw new UnsupportedOperationException();
	}
	
	public VentImpl interpoler(VentImpl v1x, VentImpl v2x, VentImpl v1y, VentImpl v2y, VentImpl vpy, double x, double y){
		
		PrevisionFactoryImpl prev = new PrevisionFactoryImpl();
		
		VentImpl vent = (VentImpl) prev.createVent();
		CoordonneeImpl c = (CoordonneeImpl) prev.createCoordonnee();
		
		c.setLon(x);
		c.setLat(y);
		
		vent.setCoord(c);
		
		vent.setVitesse_u(interpoler1DU(v1x, v2x, x));
		vent.setVitesse_v(interpoler1DV(v1y, v2y, y));
		
		vent.setDirection(getAngle(vent.getVitesse_u(), vent.getVitesse_v()));
		vent.setVitesse_nd(getVitesse(vent.getVitesse_u(), vent.getVitesse_v()));
		
		vent.setValue(interpoler2P(v1x, v2x, vpy, x, y));
		
		return vent;
		
	}
	
	private double interpoler2P(VentImpl v1, VentImpl v2, VentImpl v3, double x, double y) {
		
		double res = 0;
		double distABX = 0;
		double distACX = 0;
		double pourcentageDCX = 0;
		
		Coordonnee c1 = v1.getCoord();
		Coordonnee c2 = v2.getCoord();
		
		// Xc1 est plus grand que Xc2
		if(c1.getLon() >= c2.getLon()){
		
			// Xc1 - Xc2
			distABX = c1.getLon()-c2.getLon();
			// x - Xc2 (le plus petit)
			distACX = x-c2.getLon();
			
			pourcentageDCX = distACX / distABX; // par rapport à c2
			
			res = (1-pourcentageDCX)*v2.getValue()+pourcentageDCX*v1.getValue();
					
		} else {
			
			// Xc2 - Xc1
			distABX = c2.getLon()-c1.getLon();
			// x -Xc1 (le plus petit)
			distACX = x-c1.getLon();
			
			pourcentageDCX = distACX / distABX;// par rapport à c1
			
			res = (1-pourcentageDCX)*v1.getValue()+pourcentageDCX*v2.getValue();
			
		}
		
		double distABY = 0;
		double distACY = 0;
		double pourcentageDCY = 0;
		
		// Yc1 est plus grand que Yc2
		if(c1.getLat() >= c2.getLat()){
		
			// Yc1 - Yc2
			distABY = c1.getLat()-c2.getLat();
			// y - Yc2 (le plus petit)
			distACY = y-c2.getLat();
			
			pourcentageDCY = distACY / distABY; // par rapport à c2
			
			res += (1-pourcentageDCY)*v2.getValue()+pourcentageDCY*v1.getValue();
					
		} else {
			
			// Yc2 - Yc1
			distABY = c2.getLat()-c1.getLat();
			// y - Yc1 (le plus petit)
			distACY = y-c1.getLat();
					
			pourcentageDCY = distACY / distABY; // par rapport à c1
			
			res += (1-pourcentageDCY)*v1.getValue()+pourcentageDCY*v2.getValue();
			
		}
		
		res = res/2;
		
		return res;
		
	}

	public double interpoler1DU(VentImpl v1, VentImpl v2, double x){
		
		double res = 0;
		double distABX = 0;
		double distACX = 0;
		double pourcentageDCX = 0;
		
		Coordonnee c1 = v1.getCoord();
		Coordonnee c2 = v2.getCoord();
		
		// Xc1 est plus grand que Xc2
		if(c1.getLon() >= c2.getLon()){
		
			// Xc1 - Xc2
			distABX = c1.getLon()-c2.getLon();
			// x - Xc2 (le plus petit)
			distACX = x-c2.getLon();
			
			pourcentageDCX = distACX / distABX; // par rapport à c2
			
			res = (1-pourcentageDCX)*v2.getVitesse_u()+pourcentageDCX*v1.getVitesse_u();
					
		} else {
			
			// Xc2 - Xc1
			distABX = c2.getLon()-c1.getLon();
			// x -Xc1 (le plus petit)
			distACX = x-c1.getLon();
			
			pourcentageDCX = distACX / distABX;// par rapport à c1
			
			res = (1-pourcentageDCX)*v1.getVitesse_u()+pourcentageDCX*v2.getVitesse_u();
			
		}

		return res;
		
	}
	
	public double interpoler1DV(VentImpl v1, VentImpl v2, double y){
		
		double res = 0;
		double distABY = 0;
		double distACY = 0;
		double pourcentageDCY = 0;
		
		Coordonnee c1 = v1.getCoord();
		Coordonnee c2 = v2.getCoord();
		
		// Yc1 est plus grand que Yc2
		if(c1.getLat() >= c2.getLat()){
		
			// Yc1 - Yc2
			distABY = c1.getLat()-c2.getLat();
			// y - Yc2 (le plus petit)
			distACY = y-c2.getLat();
			
			pourcentageDCY = distACY / distABY; // par rapport à c2
			
			res = (1-pourcentageDCY)*v2.getVitesse_v()+pourcentageDCY*v1.getVitesse_v();
					
		} else {
			
			// Yc2 - Yc1
			distABY = c2.getLat()-c1.getLat();
			// y - Yc1 (le plus petit)
			distACY = y-c1.getLat();
					
			pourcentageDCY = distACY / distABY; // par rapport à c1
			
			res = (1-pourcentageDCY)*v1.getVitesse_v()+pourcentageDCY*v2.getVitesse_v();
			
		}

		return res;
		
	}
	
public double interpoler1DD(VentImpl v1, VentImpl v2, double x, double y){
		
		double res = 0;
		double distABX = 0;
		double distACX = 0;
		double pourcentageDCX = 0;
		
		Coordonnee c1 = v1.getCoord();
		Coordonnee c2 = v2.getCoord();
		
		// Xc1 est plus grand que Xc2
		if(c1.getLon() >= c2.getLon()){
		
			// Xc1 - Xc2
			distABX = c1.getLon()-c2.getLon();
			// x - Xc2 (le plus petit)
			distACX = x-c2.getLon();
			
			pourcentageDCX = distACX / distABX; // par rapport à c2
			
			res = (1-pourcentageDCX)*v2.getVitesse_u()+pourcentageDCX*v1.getVitesse_u();
					
		} else {
			
			// Xc2 - Xc1
			distABX = c2.getLon()-c1.getLon();
			// x -Xc1 (le plus petit)
			distACX = x-c1.getLon();
			
			pourcentageDCX = distACX / distABX;// par rapport à c1
			
			res = (1-pourcentageDCX)*v1.getVitesse_u()+pourcentageDCX*v2.getVitesse_u();
			
		}

		return res;
		
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