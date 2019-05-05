package ar.edu.unlam;

public class CuentaSueldo extends Cuentas{

	private String nombre;
	private String apellido;

	public CuentaSueldo(Integer numero, String nombre, String apellido) {
		super(numero);
		
		this.numero = numero;
		this.nombre = nombre;
		this.apellido = apellido;
		this.saldo = 0.0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Double depositar(Double monto) {
		this.saldo = super.depositar(monto);
		return this.saldo;

	}

	public Double extraer(Double monto) {
		this.saldo = super.extraer(monto);
		
		return this.saldo;
		
	}

	public Double consultarSaldo() {
		return super.consultarSaldo();
	}


}
