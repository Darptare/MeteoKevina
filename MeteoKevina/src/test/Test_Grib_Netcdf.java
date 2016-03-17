package test;

import static org.junit.Assert.assertEquals;
import grib.Grib_read;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import ucar.ma2.Array;
import ucar.ma2.InvalidRangeException;
import ucar.nc2.NetcdfFile;

public class Test_Grib_Netcdf {
	String filename = null;
	NetcdfFile ncfile = null;
	@Before
	public void Start() throws IOException {
		filename = "C:/Users/Kajine/Downloads/grib20160315060801331.grb";
		ncfile = NetcdfFile.open(filename);
	}
	


	@Test
	public void testgetVitesseU() throws IOException, InvalidRangeException{
		Start();
		ArrayList<Array> v = new ArrayList<Array>();
		v = Grib_read.getVitesseU(ncfile, -40.0, 20.0);
		assertEquals(5,v.size());
		Array d = v.get(0);
		double b = d.getDouble(0);
		assertEquals(1.0299988,b, 0.0000001);
	}

	@Test
	public void testgetVitesseV()throws IOException, InvalidRangeException{
		Start();
		ArrayList<Array> v = new ArrayList<Array>();
		v = Grib_read.getVitesseV(ncfile, -40.0, 20.0);
		assertEquals(5,v.size());
	}
	
	@Test
	public void testgetPression() throws IOException, InvalidRangeException{
		Start();
		ArrayList<Array> v = new ArrayList<Array>();
		v = Grib_read.getPression(ncfile, -40.0, 20.0);
		assertEquals(5,v.size());
	}

}
