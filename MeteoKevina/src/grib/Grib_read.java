package grib;

import java.io.IOException;

import ucar.ma2.Array;
import ucar.ma2.InvalidRangeException;
import ucar.nc2.NCdumpW;
import ucar.nc2.NetcdfFile;
import ucar.nc2.Variable;
public class Grib_read{
	static String filename = "C:/Users/Kajine/Downloads/grib20160315060801331.grb";
	  static NetcdfFile ncfile = null;
	  
	  
	public static Array afficheValeur(Double longitude, Double latitude) throws InvalidRangeException, IOException{
		String varNameLon = "lon"; 
		String varNameLat = "lat"; 
		String varNameU = "u-component_of_wind_height_above_ground"; 
		String varNameV = "v-component_of_wind_height_above_ground";
		String varTem = "time";
		Variable lon = ncfile.findVariable(varNameLon);
		Variable lat = ncfile.findVariable(varNameLat);
		Variable u = ncfile.findVariable(varNameU);
		Variable v = ncfile.findVariable(varNameV);
		Variable t = ncfile.findVariable(varTem);
		Array dataLon = null;
		Array dataLat = null;
		Array dataU = null;
		Array dataV = null;
		Array dataT = null;
		if (null == lon) return null;
		if (null == lat) return null;
		if (null == u) return null;
		if (null == v) return null;
		if(null == t) return null;
		try {
			dataLon = lon.read();
			dataLat = lat.read();
			dataT = t.read();
			System.out.println("Taille longitude : "+dataLon.getSize()+"  Taille latitude : "+dataLat.getSize());
			/*for(int k=0; k< dataU.getSize();k++){
				dataU.setFloat(k, (float) (dataU.getFloat(k)*1.94384));
			}*/
		} catch (IOException ioe) {
			System.out.println("trying to open " + varNameV+" "+ioe);
		}/* catch (InvalidRangeException e) {
			  System.out.println("trying to open " + varNameV+" "+e);
		}*/
		 for(int i = 0; i < dataT.getSize(); i++){
			 for(int j =0; j < dataLat.getSize();j++){
				 for(int k=0; k< dataLon.getSize();k++){
					 if(longitude.equals(dataLon.getDouble(k))){
						 if(latitude.equals(dataLat.getDouble(j))){
							 dataU = u.read(i+":"+i+":1, 0:0:1, "+j+":"+j+":1, "+k+":"+k+":1");
							 dataV = v.read(i+":"+i+":1, 0:0:1, "+j+":"+j+":1, "+k+":"+k+":1");
							 System.out.println("Temps : "+dataT.getDouble(i)+" Longitude : "+dataLon.getDouble(k)+"; Latitude : "+dataLat.getDouble(j)+";  vent U = "+dataU.getDouble(0)+"; vent V = "+dataV.getDouble(0)+".");
						}
					 }
				 }
			 }
		 }
		 return dataV;
		
		/*String varName = "u-component_of_wind_height_above_ground"; 
		 Variable v = ncfile.findVariable(varName);
		 Array data = null;
		  if (null == v) return null;
		 try {
		 data = v.read("0:0:1, 0:0:1, 0:0:1, 0:0:1");
		  //NCdumpW.printArray(data, varName,System.out, null);
		 } catch (IOException ioe) {
			 System.out.println("trying to open " + varName+" "+ioe);

		  } catch (InvalidRangeException e) {
			  System.out.println("trying to open " + varName+" "+e);
		  }
		 for(int i = 0; i < data.getSize();i++){
			 System.out.println(data.getFloat(i));
		 }
		 return data;*/
	}

	public static void main(String args[]) throws InvalidRangeException{
		  try {
		    ncfile = NetcdfFile.open(filename);
		  } catch (IOException ioe) {
		    System.out.println("trying to open " + filename+" "+ioe);
		  } finally { 
		    if (null != ncfile) try {
		    	afficheValeur(30.0,50.0);
		    	//System.out.println(afficheValeur());
		      ncfile.close();
		    } catch (IOException ioe) {
		    	System.out.println("trying to open " + filename+" "+ioe);
		    }
		  }
	}
}
