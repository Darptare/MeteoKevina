package donnee;

import java.awt.Color;
import java.util.ArrayList;

import org.openstreetmap.gui.jmapviewer.Coordinate;
import org.openstreetmap.gui.jmapviewer.Layer;
import org.openstreetmap.gui.jmapviewer.MapPolygonImpl;

public class Vent {

	double direction;
	double noeud;
	Coordinate coord;
	Layer layer;
	
	public Vent(Layer layer, Coordinate coord, double noeud, double direction) {
		this.coord = coord;
		this.direction = direction;
		this.noeud = noeud;
		this.layer = layer;
	}
	
	public double getDirection() {
		return direction;
	}
	public void setDirection(double direction) {
		this.direction = direction;
	}
	public double getNoeud() {
		return noeud;
	}
	public void setNoeud(double noeud) {
		this.noeud = noeud;
	}
	public Coordinate getCoord() {
		return coord;
	}
	public void setCoord(Coordinate coord) {
		this.coord = coord;
	}
	public int getBeauford() {
		
		//TODO
		return 0;
	}
	
	public Coordinate[] getpoint(){
		double zoom = 3;
		double dir = direction*Math.PI/180;
		double effetZoom = 1.5;
		double effetAngl = 25;
		double effetElem = 1.0;
		double sousEffetZoom = 0.2;
		double sousEffetAngl = 7;
		double sousEffetElem = 0.25;
		double n = noeud;
		ArrayList<Coordinate> list = new ArrayList<Coordinate>();
		
		Coordinate c = coord;
		list.add(c);
		c = new Coordinate(coord.getLat() - Math.cos(dir)*zoom, coord.getLon() - Math.sin(dir)*zoom);
		list.add(c);
		c = coord;
		list.add(c);
		c = new Coordinate(coord.getLat() + Math.cos(dir)*zoom, coord.getLon() + Math.sin(dir)*zoom);
		list.add(c);
		
		while (n >= 50) {
			if (effetZoom == 1.5) effetZoom = 1.00;
			System.out.println("Triangle"); 
			c = new Coordinate(coord.getLat() + Math.cos((direction+effetAngl)*Math.PI/180)*zoom*effetZoom, coord.getLon() + Math.sin((direction+effetAngl)*Math.PI/180)*zoom*effetZoom);
			list.add(c);
			effetElem -= 0.4;
			c = new Coordinate(coord.getLat() + Math.cos(dir)*zoom*effetElem, coord.getLon() + Math.sin(dir)*zoom*effetElem);
			list.add(c);
			effetElem -= 0.15;
			c = new Coordinate(coord.getLat() + Math.cos(dir)*zoom*effetElem, coord.getLon() + Math.sin(dir)*zoom*effetElem);
			list.add(c);
			n-=50;
			if (n >= 50){
				effetAngl += 7;
				effetZoom -= 0.2;
			}else {
				effetAngl += 7;
				effetZoom -= 0.2;
			}
			sousEffetElem = 0.15;
			sousEffetAngl = 10;
			sousEffetZoom = 0.07;
		}
		while (n >= 10) {
			System.out.println("Longue");
			c = new Coordinate(coord.getLat() + Math.cos((direction+effetAngl)*Math.PI/180)*zoom*effetZoom, coord.getLon() + Math.sin((direction+effetAngl)*Math.PI/180)*zoom*effetZoom);
			list.add(c);
			c = new Coordinate(coord.getLat() + Math.cos(dir)*zoom*effetElem, coord.getLon() + Math.sin(dir)*zoom*effetElem);
			list.add(c);
			effetElem -= sousEffetElem;
			c = new Coordinate(coord.getLat() + Math.cos(dir)*zoom*effetElem, coord.getLon() + Math.sin(dir)*zoom*effetElem);
			list.add(c);
			effetAngl += sousEffetAngl;
			effetZoom -= sousEffetZoom;
			/*
			c = new Coordinate(coord.getLat() + Math.cos((direction+34)*Math.PI/180)*zoom*0.95, coord.getLon() + Math.sin((direction+34)*Math.PI/180)*zoom*0.95);
			list.add(c);
			c = new Coordinate(coord.getLat() + Math.cos(dir)*zoom*0.7, coord.getLon() + Math.sin(dir)*zoom*0.7);
			list.add(c);
			c = new Coordinate(coord.getLat() + Math.cos(dir)*zoom*0.65, coord.getLon() + Math.sin(dir)*zoom*0.65);
			list.add(c);
			*/
			n-=10;
		}
		while (n >= 5 ) {
			System.out.println("Courte");   n-=5; 
		}

		//c = new Coordinate(coord.getLat() + Math.cos((direction+25)*Math.PI/180)*zoom*1.5, coord.getLon() + Math.sin((direction+25)*Math.PI/180)*zoom*1.5);
		//list.add(c);
		//c = new Coordinate(coord.getLat() + Math.cos(dir)*zoom, coord.getLon() + Math.sin(dir)*zoom);
		//list.add(c);
		c = coord;
		list.add(c);
		
		
		Coordinate[] tab = new Coordinate[list.size()];
		for (int i = 0 ; i < list.size() ; i++) {
			tab[i] = list.get(i);
		} 
		return  tab;
	}
	
	public MapPolygonImpl getPoly(){

		
		MapPolygonImpl fleche = new MapPolygonImpl(getpoint());
		fleche.setBackColor(new Color(0.0f, 0.0f, 0.0f, 1.0f));
		fleche.setColor(Color.BLACK);
		fleche.setLayer(layer);
		return fleche;
	}
	
}
