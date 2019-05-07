package ar.edu.unlam;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCuentaSueldo {

	@Test
	public void test() {
		
		    CuentaSueldo cuenta = new CuentaSueldo();
			cuenta.depositar(600.0D);
			Double sueldoEsperado=600.0D;
			Double sueldoActual= cuenta.getSaldo();
			assertEquals(sueldoEsperado, sueldoActual);
			
			cuenta.extraer(100.0);
			Double sueldoEsperado1=400.0D;
			Double sueldoActual1= cuenta.getSaldo();
			assertEquals(sueldoEsperado1, sueldoActual1);
			
			Double sueldoEsperado2=null;
			Double sueldoActual2= cuenta.extraer(500.0);
			assertEquals(sueldoEsperado2, sueldoActual2);
	}

}
