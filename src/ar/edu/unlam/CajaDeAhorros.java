package ar.edu.unlam;

public class CajaDeAhorros extends Cuentas {

	private Integer contador;
	private String nombre;
	private String apellido;

	public CajaDeAhorros(Integer numero, String nombre, String apellido) {
		super(numero);

		this.nombre = nombre;
		this.apellido = apellido;
		this.numero = numero;
		this.saldo = 0.0;
		this.contador = 0;
	}

	public Integer getContador() {
		return contador;
	}

	public void setContador(Integer contador) {
		this.contador = contador;
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

	public Double consultar() {
		return this.saldo;
	}

	public Double depositar(Double monto) {
		this.saldo = super.depositar(monto);

		return this.saldo;

	}

	public Double extraer(Double monto) {

		this.contador++;

		if (this.contador > 5) {

			return this.saldo = super.extraer(monto + 6.0);

		} else {
			this.saldo = super.extraer(monto);
			return this.saldo;
		}

	}

}
