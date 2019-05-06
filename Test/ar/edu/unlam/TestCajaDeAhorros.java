package ar.edu.unlam;

import org.junit.Assert;
import org.junit.Test;

public class TestCajaDeAhorros {

	@Test
	public void test() {
		
		CajaDeAhorros caja = new CajaDeAhorros(2026, "Jen", "Lawrence");
		
		caja.depositar(100.0);
		caja.extraer(10.0);
		caja.extraer(10.0);
		caja.extraer(10.0);
		caja.extraer(10.0);
		caja.extraer(10.0);
		caja.extraer(10.0);
		
		Double esperado = 34.0;
		Double actual;
		actual = caja.consultar();
		
		Assert.assertEquals(esperado, actual);
		
		
		
		
	}

}
