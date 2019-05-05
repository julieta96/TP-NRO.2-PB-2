package ar.edu.unlam;

import org.junit.Assert;
import org.junit.Test;

public class TestCuentaCorriente {

	@Test
	public void test() {
		
		CuentaCorriente cc = new CuentaCorriente(1508, "Jen", "Lawrence");
		
		cc.depositar(100.0);
		cc.extraer(200.0);
		
		Double esperadoSaldo = -100.0;
		Double actual;
		actual = cc.consultarSaldo();
		
		Assert.assertEquals(esperadoSaldo, actual); 
		
		Double esperadoDeuda = 105.0;
		Double actualDeuda;
		actualDeuda = cc.consuldarDeuda();
		
		Assert.assertEquals(esperadoDeuda, actualDeuda);
		
		
		
	}

}
