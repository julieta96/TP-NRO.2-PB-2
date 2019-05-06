package ar.edu.unlam;

import static org.junit.Assert.*;

import org.junit.Test;



public class TestCuentaCorriente {

	@Test
	public void test() {
		
		CuentaCorriente cuenta = new CuentaCorriente();
		cuenta.depositar(300.0D);
		Double esperado = 300.0;
		Double actual = cuenta.getSaldo();
		assertEquals(esperado , actual);
		
		cuenta.extraer(100.0);
		Double esperado1 = 200.0;
		Double actual1 = cuenta.getSaldo();
		assertEquals(esperado1 , actual1);
		
		cuenta.extraer(800.0);
		Double esperado2 = 630.0;
		Double actual2 = cuenta.getSaldo();
		assertEquals(esperado2 , actual2);
		
		
		
		
		
		
		
	    
	   
		
	   
	    
	    
	    
	    
	    
		
		
		
		

		
		
	}

}
