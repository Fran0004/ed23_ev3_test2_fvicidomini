package paqueteCadena;

import static org.junit.Assert.*;

import org.junit.Test;

public class CadenaTest {

	@Test
	public void longitudTest() {
		Cadena targer = new Cadena();
		int expected = 3;
		int lenght = targer.longitud("sol");
		assertEquals("Error",expected,lenght);
	}
	
	@Test
	public void longitudTestError() {
		Cadena targer = new Cadena();
		int expected = 3;
		int lenght = targer.longitud("");
		assertEquals("Error",expected,lenght);
	}
	
	@Test
	public void vocalesTest() {
		Cadena targer = new Cadena();
		int expected = 1;
		int lenght = targer.vocales("sol");
		assertEquals("Error",expected,lenght);
	}
	@Test
	public void vocalesTestError() {
		Cadena targer = new Cadena();
		int expected = 1;
		int lenght = targer.vocales("");
		assertEquals("Error",expected,lenght);
	}
	
	@Test
	public void invertirTest() {
		Cadena targer = new Cadena();
		String expected = "los";
		String lenght = targer.invertir("sol");
		assertEquals("Error",expected,lenght);
	}

	@Test
	public void invertirTestError() {
		Cadena targer = new Cadena();
		String expected = "los";
		String lenght = targer.invertir("");
		assertEquals("Error",expected,lenght);
	}
	
	@Test
	public void contarTest() {
		Cadena targer = new Cadena();
		int expected = 1;
		int lenght = targer.contarLetra("sol",'s');
		assertEquals("Error",expected,lenght);
	}
	
	@Test
	public void contarTestError() {
		Cadena targer = new Cadena();
		int expected = 1;
		int lenght = targer.contarLetra("",'s');
		assertEquals("Error",expected,lenght);
	}
	
	
}
