// License: GPL. For details, see Readme.txt file.
package test;

import grib.GribFile;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Point;
import java.awt.Stroke;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.StrokeBorder;

import org.openstreetmap.gui.jmapviewer.Coordinate;
import org.openstreetmap.gui.jmapviewer.JMapViewer;
import org.openstreetmap.gui.jmapviewer.JMapViewerTree;
import org.openstreetmap.gui.jmapviewer.Layer;
import org.openstreetmap.gui.jmapviewer.LayerGroup;
import org.openstreetmap.gui.jmapviewer.MapMarkerCircle;
import org.openstreetmap.gui.jmapviewer.MapMarkerDot;
import org.openstreetmap.gui.jmapviewer.MapPolygonImpl;
import org.openstreetmap.gui.jmapviewer.MapRectangleImpl;
import org.openstreetmap.gui.jmapviewer.OsmMercator;
import org.openstreetmap.gui.jmapviewer.OsmTileLoader;
import org.openstreetmap.gui.jmapviewer.Style;
import org.openstreetmap.gui.jmapviewer.events.JMVCommandEvent;
import org.openstreetmap.gui.jmapviewer.interfaces.JMapViewerEventListener;
import org.openstreetmap.gui.jmapviewer.interfaces.MapPolygon;
import org.openstreetmap.gui.jmapviewer.interfaces.TileLoader;
import org.openstreetmap.gui.jmapviewer.interfaces.TileSource;
import org.openstreetmap.gui.jmapviewer.tilesources.BingAerialTileSource;
import org.openstreetmap.gui.jmapviewer.tilesources.MapQuestOpenAerialTileSource;
import org.openstreetmap.gui.jmapviewer.tilesources.MapQuestOsmTileSource;
import org.openstreetmap.gui.jmapviewer.tilesources.OsmTileSource;

import packages.Prevision.Vent;

/**
 * Demonstrates the usage of {@link JMapViewer}
 *
 * @author Jan Peter Stotz
 *
 */
public class Demo extends JFrame implements JMapViewerEventListener  {

    private static final long serialVersionUID = 1L;

    private final JMapViewerTree treeMap;

    private final JLabel zoomLabel;
    private final JLabel zoomValue;

    private final JLabel mperpLabelName;
    private final JLabel mperpLabelValue;

    /**
     * Constructs the {@code Demo}.
     */
    public Demo(ArrayList<Vent> list) {
        super("JMapViewer Demo");
        setSize(400, 400);

        treeMap = new JMapViewerTree("Zones");

        // Listen to the map viewer for user operations so components will
        // receive events and update
        map().addJMVListener(this);

        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        JPanel panel = new JPanel(new BorderLayout());
        JPanel panelTop = new JPanel();
        JPanel panelBottom = new JPanel();
        JPanel helpPanel = new JPanel();

        mperpLabelName = new JLabel("Meters/Pixels: ");
        mperpLabelValue = new JLabel(String.format("%s", map().getMeterPerPixel()));

        zoomLabel = new JLabel("Zoom: ");
        zoomValue = new JLabel(String.format("%s", map().getZoom()));

        add(panel, BorderLayout.NORTH);
        add(helpPanel, BorderLayout.SOUTH);
        panel.add(panelTop, BorderLayout.NORTH);
        panel.add(panelBottom, BorderLayout.SOUTH);
        JLabel helpLabel = new JLabel("Use right mouse button to move,\n "
                + "left double click or mouse wheel to zoom.");
        helpPanel.add(helpLabel);
        JButton button = new JButton("setDisplayToFitMapMarkers");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                map().setDisplayToFitMapMarkers();
            }
        });
        JComboBox<TileSource> tileSourceSelector = new JComboBox<>(new TileSource[] {
                new OsmTileSource.Mapnik(),
                new OsmTileSource.CycleMap(),
                new BingAerialTileSource(),
                new MapQuestOsmTileSource(),
                new MapQuestOpenAerialTileSource() });
        tileSourceSelector.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                map().setTileSource((TileSource) e.getItem());
            }
        });
        JComboBox<TileLoader> tileLoaderSelector;
        tileLoaderSelector = new JComboBox<>(new TileLoader[] {new OsmTileLoader(map())});
        tileLoaderSelector.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                map().setTileLoader((TileLoader) e.getItem());
            }
        });
        map().setTileLoader((TileLoader) tileLoaderSelector.getSelectedItem());
        panelTop.add(tileSourceSelector);
        panelTop.add(tileLoaderSelector);
        final JCheckBox showMapMarker = new JCheckBox("Map markers visible");
        showMapMarker.setSelected(map().getMapMarkersVisible());
        showMapMarker.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                map().setMapMarkerVisible(showMapMarker.isSelected());
            }
        });
        panelBottom.add(showMapMarker);
        ///
        final JCheckBox showTreeLayers = new JCheckBox("Tree Layers visible");
        showTreeLayers.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                treeMap.setTreeVisible(showTreeLayers.isSelected());
            }
        });
        panelBottom.add(showTreeLayers);
        ///
        final JCheckBox showToolTip = new JCheckBox("ToolTip visible");
        showToolTip.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                map().setToolTipText(null);
            }
        });
        panelBottom.add(showToolTip);
        ///
        final JCheckBox showTileGrid = new JCheckBox("Tile grid visible");
        showTileGrid.setSelected(map().isTileGridVisible());
        showTileGrid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                map().setTileGridVisible(showTileGrid.isSelected());
            }
        });
        panelBottom.add(showTileGrid);
        final JCheckBox showZoomControls = new JCheckBox("Show zoom controls");
        showZoomControls.setSelected(map().getZoomControlsVisible());
        showZoomControls.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                map().setZoomContolsVisible(showZoomControls.isSelected());
            }
        });
        panelBottom.add(showZoomControls);
        final JCheckBox scrollWrapEnabled = new JCheckBox("Scrollwrap enabled");
        scrollWrapEnabled.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                map().setScrollWrapEnabled(scrollWrapEnabled.isSelected());
            }
        });
        panelBottom.add(scrollWrapEnabled);
        panelBottom.add(button);

        panelTop.add(zoomLabel);
        panelTop.add(zoomValue);
        panelTop.add(mperpLabelName);
        panelTop.add(mperpLabelValue);

        add(treeMap, BorderLayout.CENTER);

        //
        /*
        LayerGroup germanyGroup = new LayerGroup("Germany");
        Layer germanyWestLayer = germanyGroup.addLayer("Germany West");
        Layer germanyEastLayer = germanyGroup.addLayer("Germany East");
        MapMarkerDot eberstadt = new MapMarkerDot(germanyEastLayer, "Eberstadt", 49.814284999, 8.642065999);
        MapMarkerDot ebersheim = new MapMarkerDot(germanyWestLayer, "Ebersheim", 49.91, 8.24);
        MapMarkerDot empty = new MapMarkerDot(germanyEastLayer, 49.71, 8.64);
        MapMarkerDot darmstadt = new MapMarkerDot(germanyEastLayer, "Darmstadt", 49.8588, 8.643);
        map().addMapMarker(eberstadt);
        map().addMapMarker(ebersheim);
        map().addMapMarker(empty);
        Layer franceLayer = treeMap.addLayer("France");
        map().addMapMarker(new MapMarkerDot(franceLayer, "La Gallerie", 48.71, -1));
        map().addMapMarker(new MapMarkerDot(43.604, 1.444));
        map().addMapMarker(new MapMarkerCircle(53.343, -6.267, 0.666));
        map().addMapRectangle(new MapRectangleImpl(new Coordinate(53.343, -6.267), new Coordinate(43.604, 1.444)));
        map().addMapMarker(darmstadt);
        treeMap.addLayer(germanyWestLayer);
        treeMap.addLayer(germanyEastLayer);

        MapPolygon bermudas = new MapPolygonImpl(c(49, 1), c(45, 10), c(40, 5));
        map().addMapPolygon(bermudas);
        map().addMapPolygon(new MapPolygonImpl(germanyEastLayer, "Riedstadt", ebersheim, darmstadt, eberstadt, empty));

        map().addMapMarker(new MapMarkerCircle(germanyWestLayer, "North of Suisse", new Coordinate(48, 7), .5));
        Layer spain = treeMap.addLayer("Spain");
        map().addMapMarker(new MapMarkerCircle(spain, "La Garena", new Coordinate(40.4838, -3.39), .002));
        spain.setVisible(Boolean.FALSE);

        Layer wales = treeMap.addLayer("UK");
        map().addMapRectangle(new MapRectangleImpl(wales, "Wales", c(53.35, -4.57), c(51.64, -2.63)));
        
        //map.setDisplayPosition(new Coordinate(49.807, 8.6), 11);
        //map.setTileGridVisible(true);
		*/

        // MES TESTS
        Layer test = treeMap.addLayer("test");
        
//        MapRectangleImpl rectTest = new MapRectangleImpl(test, c(53.35, -4.57), c(51.64, -2.63));
//        rectTest.setColor(Color.RED);
//        map().addMapRectangle(rectTest);
//        MapPolygonImpl polyTest = new MapPolygonImpl(c(49, 1), c(45, 10), c(40, 5));
//        polyTest.setLayer(test);
//        polyTest.setBackColor(new Color(0.0f, 1.0f, 1.0f, 0.2f));  
//        map().addMapPolygon(polyTest);
        
//        Vent vent1 = new Vent(test, c(0,0)    ,  10.0 , 0);
//        Vent vent2 = new Vent(test, c(0,20)   ,  20.0 , 0);
//        Vent vent3 = new Vent(test, c(0,-20)  ,  30.0 , 0);
//        Vent vent4 = new Vent(test, c(20,0)   ,  40.0 , 0);
//        Vent vent5 = new Vent(test, c(20,20)  ,  50.0 , 0);
//        Vent vent6 = new Vent(test, c(20,-20) ,  60.0 , 0);
//        Vent vent7 = new Vent(test, c(40,0)   ,  70.0 , 0);
//        Vent vent8 = new Vent(test, c(40,20)  ,  80.0 , 0);
//        Vent vent9 = new Vent(test, c(40,-20) ,  90.0 , 0);
        
//        map().addMapPolygon(vent1.getPoly());
//        map().addMapPolygon(vent2.getPoly());
//        map().addMapPolygon(vent3.getPoly());
//        map().addMapPolygon(vent4.getPoly());
//        map().addMapPolygon(vent5.getPoly());
//        map().addMapPolygon(vent6.getPoly());
//        map().addMapPolygon(vent7.getPoly());
//        map().addMapPolygon(vent8.getPoly());
//        map().addMapPolygon(vent9.getPoly());
        
        //GribFile gribFile = new GribFile();
        //ArrayList<Vent> listVent = gribFile.getVent(test);
        
        
        for (Vent vent : list) {
        	
        	
        	map().addMapPolygon(getPoly(vent, test));
		}
        
        
        
        
        map().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON1) {
                    map().getAttribution().handleAttribution(e.getPoint(), true);
                }
            }
        });

        map().addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                Point p = e.getPoint();
                boolean cursorHand = map().getAttribution().handleAttributionCursor(p);
                if (cursorHand) {
                    map().setCursor(new Cursor(Cursor.HAND_CURSOR));
                } else {
                    map().setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                }
                if (showToolTip.isSelected()) map().setToolTipText(map().getPosition(p).toString());
            }
        });
    }

    private MapPolygon getPoly(Vent vent, Layer layer) {
    	MapPolygonImpl fleche = new MapPolygonImpl(getpoint(vent));
		fleche.setBackColor(new Color(0.0f, 0.0f, 0.0f, 1.0f));
		fleche.setColor(Color.BLACK);
		fleche.setLayer(layer);
		return fleche;
	}
    
    
	public Coordinate[] getpoint(Vent v){
		double zoom = 0.4;
		double dir = v.getDirection()*Math.PI/180;
		double effetZoom = 1.5;
		double effetAngl = 25;
		double effetElem = 1.0;
		double sousEffetZoom = 0.2;
		double sousEffetAngl = 7;
		double sousEffetElem = 0.25;
		double n = v.getVitesse_nd();
		ArrayList<Coordinate> list = new ArrayList<Coordinate>();
		
		//TODO Si vent < a 5
		
		Coordinate c = new Coordinate(v.getCoord().getLat(), v.getCoord().getLon());
		list.add(c);
		c = new Coordinate(v.getCoord().getLat() - Math.cos(dir)*zoom, v.getCoord().getLon() - Math.sin(dir)*zoom);
		list.add(c);
		c = new Coordinate(v.getCoord().getLat(), v.getCoord().getLon());
		list.add(c);
		c = new Coordinate(v.getCoord().getLat() + Math.cos(dir)*zoom, v.getCoord().getLon() + Math.sin(dir)*zoom);
		list.add(c);
		
		while (n >= 50) {
			if (effetZoom == 1.5) effetZoom = 1.00;
			//System.out.println("Triangle"); 
			c = new Coordinate(v.getCoord().getLat() + Math.cos((v.getDirection()+effetAngl)*Math.PI/180)*zoom*effetZoom, v.getCoord().getLon() + Math.sin((v.getDirection()+effetAngl)*Math.PI/180)*zoom*effetZoom);
			list.add(c);
			effetElem -= 0.2;
			c = new Coordinate(v.getCoord().getLat() + Math.cos(dir)*zoom*effetElem, v.getCoord().getLon() + Math.sin(dir)*zoom*effetElem);
			list.add(c);
			n-=50;
			if (n >= 50){
				effetElem -= 0.0;
				c = new Coordinate(v.getCoord().getLat() + Math.cos(dir)*zoom*effetElem, v.getCoord().getLon() + Math.sin(dir)*zoom*effetElem);
				list.add(c);
				effetAngl += 8;
				effetZoom -= 0.15;
			}else {
				effetElem -= 0.10;
				c = new Coordinate(v.getCoord().getLat() + Math.cos(dir)*zoom*effetElem, v.getCoord().getLon() + Math.sin(dir)*zoom*effetElem);
				list.add(c);
				effetAngl += 7;
				effetZoom -= 0.1;
			}
			sousEffetElem = 0.15;
			sousEffetAngl = 10;
			sousEffetZoom = 0.07;
		}
		while (n >= 10) {
			//System.out.println("Longue");
			c = new Coordinate(v.getCoord().getLat() + Math.cos((v.getDirection()+effetAngl)*Math.PI/180)*zoom*effetZoom, v.getCoord().getLon() + Math.sin((v.getDirection()+effetAngl)*Math.PI/180)*zoom*effetZoom);
			list.add(c);
			c = new Coordinate(v.getCoord().getLat() + Math.cos(dir)*zoom*effetElem, v.getCoord().getLon() + Math.sin(dir)*zoom*effetElem);
			list.add(c);
			effetElem -= sousEffetElem;
			c = new Coordinate(v.getCoord().getLat() + Math.cos(dir)*zoom*effetElem, v.getCoord().getLon() + Math.sin(dir)*zoom*effetElem);
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
			//System.out.println("Courte");   n-=5; 
		}

		//c = new Coordinate(coord.getLat() + Math.cos((direction+25)*Math.PI/180)*zoom*1.5, coord.getLon() + Math.sin((direction+25)*Math.PI/180)*zoom*1.5);
		//list.add(c);
		//c = new Coordinate(coord.getLat() + Math.cos(dir)*zoom, coord.getLon() + Math.sin(dir)*zoom);
		//list.add(c);
		c = new Coordinate(v.getCoord().getLat(), v.getCoord().getLon());
		list.add(c);
		
		
		Coordinate[] tab = new Coordinate[list.size()];
		for (int i = 0 ; i < list.size() ; i++) {
			tab[i] = list.get(i);
		} 
		return  tab;
	}
    
    
    

	private JMapViewer map() {
        return treeMap.getViewer();
    }

    private static Coordinate c(double lat, double lon) {
        return new Coordinate(lat, lon);
    }

    /**
     * @param args Main program arguments
     */
    public static void main(String[] args) {
        new Demo(new ArrayList<Vent>()).setVisible(true);
    }

    private void updateZoomParameters() {
        if (mperpLabelValue != null){
            mperpLabelValue.setText(String.format("%s", map().getMeterPerPixel()));
        //TODO Changer les vents !
            
        }
        if (zoomValue != null)
            zoomValue.setText(String.format("%s", map().getZoom()));
    }

    @Override
    public void processCommand(JMVCommandEvent command) {
        if (command.getCommand().equals(JMVCommandEvent.COMMAND.ZOOM) ||
                command.getCommand().equals(JMVCommandEvent.COMMAND.MOVE)) {
            updateZoomParameters();
        }
    }
}
