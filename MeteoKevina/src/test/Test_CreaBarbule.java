package test;

import static org.junit.Assert.*;

import org.junit.Test;

import packages.Vue.Fenetre;
import packages.Vue.VueFactory;
import packages.Vue.impl.VueFactoryImpl;



public class Test_CreaBarbule {

	@Test
	public void test() {
		fail("Not yet implemented");
		
		VueFactory vue = new VueFactoryImpl();
		Fenetre fen = vue.createFenetre();
		
		fen.ouvrir();
		
		
		
	}

}
