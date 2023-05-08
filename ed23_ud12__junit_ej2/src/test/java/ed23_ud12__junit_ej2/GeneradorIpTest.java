package ed23_ud12__junit_ej2;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Array;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.RepeatedTest;

public class GeneradorIpTest {
	GeneradorIp ip1;

	
	@Before
	public void setUp() throws Exception {
		ip1 = new GeneradorIp();
	}

	@Test
	public void testGenerarNumero() {
	int prueba=	ip1.generarNumero(0, 255);
		assertTrue(prueba!=0 && prueba!=255);
	}

	@Test @RepeatedTest(10)
	public void testGenerarIp() {
	String prueba =	ip1.generarIp();
	String[] numIpArray = prueba.split(".");
		assertTrue( !numIpArray[0].equals("0") && !numIpArray[3].equals("0"));
	}

}
