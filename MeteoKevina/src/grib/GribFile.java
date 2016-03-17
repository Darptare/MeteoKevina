
package grib;

import java.util.ArrayList;
import java.util.Random;

import org.openstreetmap.gui.jmapviewer.Coordinate;
import org.openstreetmap.gui.jmapviewer.Layer;

import donnee.Vent;

public class GribFile {

	
	public ArrayList<Vent> getVent(Layer layer){
		ArrayList<Vent> list = new ArrayList<Vent>();
		Random rand = new Random();
		double force;
		double angle;
		for (double i = 0 ; i < 20 ; i++){
			for (double j = 0; j < 40; j++) {
				//force = 10 + rand.nextDouble() * 50;
				//angle = rand.nextDouble() * 360;
				//System.out.println("F = "+force+" A = "+angle);
				list.add(new Vent(layer, c(42+i,-30+j), 30, 40));
			}
		}
		/*
		list.add(new Vent(layer, c(0,0)    ,  10.0 , 0));
		list.add(new Vent(layer, c(0,20)   ,  20.0 , 0));
		list.add(new Vent(layer, c(0,-20)  ,  30.0 , 0));
		list.add(new Vent(layer, c(20,0)   ,  40.0 , 0));
		list.add(new Vent(layer, c(20,20)  ,  50.0 , 0));
		list.add(new Vent(layer, c(20,-20) ,  60.0 , 0));
		list.add(new Vent(layer, c(40,0)   ,  70.0 , 0));
		list.add(new Vent(layer, c(40,20)  ,  80.0 , 0));
		list.add(new Vent(layer, c(40,-20) ,  90.0 , 0));
		list.add(new Vent(layer, c(0,40)    ,  100.0 , 0));
		list.add(new Vent(layer, c(0,-40)   ,  110.0 , 0));
		list.add(new Vent(layer, c(20,40)  ,  120.0 , 0));
		list.add(new Vent(layer, c(20,-40)   ,  130.0 , 0));
		list.add(new Vent(layer, c(40,40)  ,  140.0 , 0));
		list.add(new Vent(layer, c(40,-40)  ,  150.0 , 0));
	*/
		
		return list;
	}
    private static Coordinate c(double lat, double lon) {
        return new Coordinate(lat, lon);
    }
	
}
