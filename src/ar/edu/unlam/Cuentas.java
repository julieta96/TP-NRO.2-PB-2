package ar.edu.unlam;

public class Cuentas {

	protected Integer numero;
	protected Double saldo;
	
	public Cuentas(Integer numero) {
		this.numero = numero;
		this.saldo = 0.0;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	public Double depositar(Double monto) {
		this.saldo = this.saldo + monto;
		return this.saldo;

	}

	public Double extraer(Double monto) {
		if (monto > this.saldo) {
			return null;
		}else {
			return this.saldo = this.saldo - monto;
		}
		
	}

	public Double consultarSaldo() {
		return this.saldo;
	}
}
