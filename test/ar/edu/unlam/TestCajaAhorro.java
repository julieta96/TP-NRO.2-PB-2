package ar.edu.unlam;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCajaAhorro {

	@Test
	public void test() {
		
		CajaAhorro cuenta = new CajaAhorro();
		cuenta.depositar(10000.0D);
		Double sueldoEsperado=10000.0D; 
		Double sueldoActual= cuenta.getSaldo();
		assertEquals(sueldoEsperado, sueldoActual , 0.0);
		
		
	    cuenta.extraer(500.0);
		Double sueldoEsperado1=9500.0D; 
	    Double sueldoActual1= cuenta.getSaldo();
		    
		assertEquals(sueldoEsperado, sueldoActual , 0.0);
		    
		cuenta.extraer(10.0);
	    cuenta.extraer(10.0);
	    cuenta.extraer(10.0);
	    cuenta.extraer(10.0);
		cuenta.extraer(10.0);
		Double sueldoEsperado2=9450.0D;
		Double sueldoActual2= cuenta.getSaldo();
	    assertEquals(sueldoEsperado2, sueldoActual2);
	  	
		
	}

}
