/**
 */
package packages.IO;

import org.eclipse.emf.ecore.EObject;

import ucar.ma2.Array;
import ucar.nc2.NetcdfFile;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inter Read</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see packages.IO.IOPackage#getInterRead()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface InterRead extends EObject {
	Array getVitesseU(NetcdfFile file,Double longitude, Double latitude);
	Array getVitesseU(NetcdfFile file);
	Array getVitesseV(NetcdfFile file,Double longitude, Double latitude);
	Array getVitesseV(NetcdfFile file);
	Array getPres(NetcdfFile file,Double longitude, Double latitude);
	Array getPres(NetcdfFile file);
	Array getTemp(NetcdfFile file);
	Array getLat(NetcdfFile file);
	Array getLon(NetcdfFile file);
} // InterRead
