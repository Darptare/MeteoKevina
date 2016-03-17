package test;

import java.util.ArrayList;

import org.openstreetmap.gui.jmapviewer.Coordinate;

import packages.Prevision.Coordonnee;
import packages.Prevision.PrevisionFactory;
import packages.Prevision.Vent;
import packages.Prevision.impl.PrevisionFactoryImpl;
import packages.Vue.Fenetre;
import packages.Vue.VueFactory;
import packages.Vue.impl.VueFactoryImpl;

public class Test_affichageBarbule {
	
	private static Coordonnee c(double lat, double lon){
		PrevisionFactory prev = new PrevisionFactoryImpl();
		Coordinate c = new Coordinate(lat,lon);
		Coordonnee coord = prev.createCoordonnee();
		coord.setLat(c.getLat());
		coord.setLon(c.getLon());
		return coord;
	}
	
	private static Vent createVent(double vit, double dir, double lat, double lon){
		PrevisionFactory prev = new PrevisionFactoryImpl();
		Vent v = prev.createVent();
		v.setCoord(c(lat,lon));
		v.setDirection(dir);
		v.setVitesse_nd(vit);
		return v;
	}
	
	private static ArrayList<Vent> getVent1(){
		ArrayList<Vent> list = new ArrayList<Vent>();
		for (double i = 0 ; i < 20 ; i++){
			for (double j = 0; j < 40; j++) {
				list.add(createVent(30, 40, 42+i, -30+j));
			}
		}
		


		return list;
	}
	
	private static ArrayList<Vent> getVent2(){
		ArrayList<Vent> list = new ArrayList<Vent>();
		
		list.add(createVent(10,  0,  40, -20));
		list.add(createVent(20,  0,  40, -15));
		list.add(createVent(30,  0,  40, -25));
		list.add(createVent(40,  0,  45, -20));
		list.add(createVent(50,  0,  45, -15));
		list.add(createVent(60,  0,  45, -25));
		list.add(createVent(70,  0,  50, -20));
		list.add(createVent(80,  0,  50, -15));
		list.add(createVent(90,  0,  50, -25));
		list.add(createVent(100, 0,  40, -10));
		list.add(createVent(110, 0,  40, -30));
		list.add(createVent(120, 0,  45, -10));
		list.add(createVent(130, 0,  45, -30));
		list.add(createVent(140, 0,  50, -10));
		list.add(createVent(150, 0,  50, -30));

		return list;
	}
	
	public static void main(String[] args) {
		VueFactory vue = new VueFactoryImpl();
		Fenetre fen = vue.createFenetre();

		ArrayList<Vent> list = getVent2();

		fen.start(list);
	}
}
