/**
 */
package packages.IO.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import packages.IO.FileReader;
import packages.IO.IOPackage;
import packages.Prevision.Donnee;
import ucar.ma2.Array;
import ucar.nc2.NetcdfFile;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File Reader</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class FileReaderImpl extends MinimalEObjectImpl.Container implements FileReader {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileReaderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IOPackage.Literals.FILE_READER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void parseFile(String path_to_file) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Donnee getDonnees() {
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
			case IOPackage.FILE_READER___PARSE_FILE__STRING:
				parseFile((String)arguments.get(0));
				return null;
			case IOPackage.FILE_READER___GET_DONNEES:
				return getDonnees();
		}
		return super.eInvoke(operationID, arguments);
	}

	@Override
	public Array getVitesseU(NetcdfFile file, Double longitude, Double latitude) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Array getVitesseU(NetcdfFile file) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Array getVitesseV(NetcdfFile file, Double longitude, Double latitude) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Array getVitesseV(NetcdfFile file) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Array getPres(NetcdfFile file, Double longitude, Double latitude) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Array getPres(NetcdfFile file) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Array getTemp(NetcdfFile file) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Array getLat(NetcdfFile file) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Array getLon(NetcdfFile file) {
		// TODO Auto-generated method stub
		return null;
	}

} //FileReaderImpl
