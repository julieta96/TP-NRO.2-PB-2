package ar.edu.unlam;

public class Cuenta {
	
	protected Integer numero;
	protected String nombre;
	protected String apellido;
	protected Double saldo=0.0;

	public Cuenta() {

	}

	public Cuenta(Integer numero, String nombre, String apellido, Double saldo) {

		this.numero = numero;
		this.nombre = nombre;
		this.apellido = apellido;
		this.saldo = saldo;
	}

	public Cuenta(Double saldo) {
		this.saldo = saldo;
	}

	public Cuenta(Integer numero, String apellido, String nombre) {

		this.numero = numero;
		this.apellido = apellido;
		this.nombre = nombre;
		this.saldo = 0.0;

	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
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

	public Double depositar(Double dinero) {

		this.saldo += dinero;
		
		return this.saldo;
	}

	public Double extraer(Double dinero) {
		
		Double total=0.0;

		if (dinero > this.saldo) {
			
			total=  null;
		}
		
		else {
			
			total= this.saldo -dinero;
		}
		
		return total;
	}


}
