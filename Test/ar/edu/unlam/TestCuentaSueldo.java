package ar.edu.unlam;

import org.junit.Assert;
import org.junit.Test;

public class TestCuentaSueldo {

	@Test
	public void test() {
		CuentaSueldo c1 = new CuentaSueldo(2026, "Taylor", "Swift");

		c1.depositar(300.0);
		c1.extraer(100.0);

		Double esperado = 200.0;
		Double actual;
		actual = c1.consultarSaldo();
		
		Assert.assertEquals(esperado, actual);
		
		
		
		
		
		 

	}

}
