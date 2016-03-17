package grib;

import java.io.IOException;

import ucar.ma2.Array;
import ucar.ma2.InvalidRangeException;
import ucar.nc2.NetcdfFile;
import ucar.nc2.Variable;
public class Grib_read{
	static String filename = null;
	static NetcdfFile ncfile = null;


	public static Array getVitesseU(NetcdfFile file,Double longitude, Double latitude) throws InvalidRangeException, IOException{
		String varNameLon = "lon"; 
		String varNameLat = "lat"; 
		String varNameU = "u-component_of_wind_height_above_ground"; 
		String varTem = "time";
		
		Variable lon = file.findVariable(varNameLon);
		Variable lat = file.findVariable(varNameLat);
		Variable u = file.findVariable(varNameU);
		Variable t = file.findVariable(varTem);
		
		Array dataLon = null;
		Array dataLat = null;
		Array dataU = null;
		Array dataT = null;
		
		if (null == lon) return null;
		if (null == lat) return null;
		if (null == u) return null;
		if(null == t) return null;
		
		dataLon = lon.read();
		dataLat = lat.read();
		dataT = t.read();
		//System.out.println("Taille longitude : "+dataLon.getSize()+"  Taille latitude : "+dataLat.getSize());
		for(int i = 0; i < dataT.getSize(); i++){
			for(int j =0; j < dataLat.getSize();j++){
				for(int k=0; k< dataLon.getSize();k++){
					if(longitude.equals(dataLon.getDouble(k))){
						if(latitude.equals(dataLat.getDouble(j))){
							dataU = u.read(i+":"+i+":1, 0:0:1, "+j+":"+j+":1, "+k+":"+k+":1");
							System.out.println("Temps : "+dataT.getDouble(i)+" Longitude : "+dataLon.getDouble(k)+"; Latitude : "+dataLat.getDouble(j)+";  vent U(m/s) = "+dataU.getDouble(0)+".");
						}
					}
				}
			}
		}
		System.out.println("--------------------------------------------------");
		return dataU;
	}
	
	public static Array getVitesseV(NetcdfFile file,Double longitude, Double latitude) throws InvalidRangeException, IOException{
		String varNameLon = "lon"; 
		String varNameLat = "lat"; 
		String varNameV = "v-component_of_wind_height_above_ground";
		String varTem = "time";
		
		Variable lon = file.findVariable(varNameLon);
		Variable lat = file.findVariable(varNameLat);
		Variable v = file.findVariable(varNameV);
		Variable t = file.findVariable(varTem);
		
		Array dataLon = null;
		Array dataLat = null;
		Array dataV = null;
		Array dataT = null;
		
		if (null == lon) return null;
		if (null == lat) return null;
		if (null == v) return null;
		if (null == t) return null;
		
		dataLon = lon.read();
		dataLat = lat.read();
		dataT = t.read();
		//System.out.println("Taille longitude : "+dataLon.getSize()+"  Taille latitude : "+dataLat.getSize());
		for(int i = 0; i < dataT.getSize(); i++){
			for(int j =0; j < dataLat.getSize();j++){
				for(int k=0; k< dataLon.getSize();k++){
					if(longitude.equals(dataLon.getDouble(k))){
						if(latitude.equals(dataLat.getDouble(j))){
							dataV = v.read(i+":"+i+":1, 0:0:1, "+j+":"+j+":1, "+k+":"+k+":1");
							System.out.println("Temps : "+dataT.getDouble(i)+" Longitude : "+dataLon.getDouble(k)+"; Latitude : "+dataLat.getDouble(j)+";  vent V(m/s) = "+dataV.getDouble(0)+".");
						}
					}
				}
			}
		}
		System.out.println("--------------------------------------------------");
		return dataV;
	}
	
	public static Array getPression(NetcdfFile file,Double longitude, Double latitude) throws InvalidRangeException, IOException{
		String varNameLon = "lon"; 
		String varNameLat = "lat"; 
		String varPres = "Pressure_reduced_to_MSL_msl";
		String varT = "time";
		
		Variable lon = file.findVariable(varNameLon);
		Variable lat = file.findVariable(varNameLat);
		Variable pres = file.findVariable(varPres);
		Variable t = file.findVariable(varT);
		
		Array dataLon = null;
		Array dataLat = null;
		Array dataPres = null;
		Array dataT = null;
		
		dataLon = lon.read();
		dataLat = lat.read();
		dataT = t.read();
		
		if (null == lon) return null;
		if (null == lat) return null;
		if(null == t) return null;
		
		for(int i = 0; i < dataT.getSize(); i++){
			for(int j =0; j < dataLat.getSize();j++){
				for(int k=0; k< dataLon.getSize();k++){
					if(longitude.equals(dataLon.getDouble(k))){
						if(latitude.equals(dataLat.getDouble(j))){
							dataPres = pres.read(i+":"+i+":1, "+j+":"+j+":1, "+k+":"+k+":1");
							System.out.println("Temps : "+dataT.getDouble(i)+" Longitude : "+dataLon.getDouble(k)+"; Latitude : "+dataLat.getDouble(j)+"; Pression(Pa) = "+dataPres.getDouble(0)+".");
						}
					}
				}
			}
		}
		System.out.println("--------------------------------------------------");
		return dataPres;
	}

	public static void main(String args[]) throws InvalidRangeException{
		filename = "C:/Users/Kajine/Downloads/grib20160315060801331.grb";
		try {
			ncfile = NetcdfFile.open(filename);
		} catch (IOException ioe) {
			System.out.println("trying to open " + filename+" "+ioe);
		} finally { 
			if (null != ncfile) try {
				getVitesseU(ncfile,-40.0,20.0);
				getVitesseV(ncfile,-40.0,20.0);
				getPression(ncfile,-40.0,20.0);
				//System.out.println(afficheValeur());
				ncfile.close();
			} catch (IOException ioe) {
				System.out.println("trying to open " + filename+" "+ioe);
			}
		}
	}
}
