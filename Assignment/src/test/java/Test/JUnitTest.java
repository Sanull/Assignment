package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Main.*;

public class JUnitTest {

	@Test
	public void testNewYear() {
		Calculator calc = new Calculator();
		assertTrue(calc.discValue("New Year").equals("5%"));
		assertTrue(calc.newAmount("100000.00","New Year").equals("95000.00"));
	}
	
	@Test
	public void testLebaran() {
		Calculator calc = new Calculator();
		assertTrue(calc.discValue("Lebaran").equals("10%"));
		assertTrue(calc.newAmount("100000.00","Lebaran").equals("90000.00"));
	}
	
	@Test
	public void testHarbolnas() {
		Calculator calc = new Calculator();
		assertTrue(calc.discValue("Harbolnas").equals("20%"));
		assertTrue(calc.newAmount("100000.00","Harbolnas").equals("80000.00"));
	}

}
