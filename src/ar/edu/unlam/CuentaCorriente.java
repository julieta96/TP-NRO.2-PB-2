package ar.edu.unlam;

public class CuentaCorriente extends Cuentas {
	
	private static final Double COMISION = 0.05;
	private static final Double LIMITE = 150.0;

	private Double limite;
	private String nombre;
	private String apellido;
	private Double diferencia;

	public CuentaCorriente(Integer numero, String nombre, String apellido) {
		super(numero);

		this.nombre = nombre;
		this.apellido = apellido;
		this.numero = numero;
		this.saldo = 0.0;
	}

	public Double getDiferencia() {
		return diferencia;
	}

	public void setDiferencia(Double diferencia) {
		this.diferencia = diferencia;
	}

	public Double getLimite() {
		return limite;
	}

	public void setLimite(Double limite) {
		this.limite = limite;
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

	public Double getCOMISION() {
		return COMISION;
	}
	
	public Double getLIMITE() {
		return LIMITE;
	}

	public Double depositar(Double monto) {
		this.saldo = super.depositar(monto);
		return this.saldo;
	}

	public Double extraer(Double monto) {

		if (monto > this.saldo) {

			this.diferencia = this.saldo - monto;

			if ((this.diferencia < LIMITE) || (this.diferencia == LIMITE)) {

				this.diferencia = (this.diferencia + (this.diferencia * COMISION));
				this.diferencia= Math.abs(this.diferencia);

				this.saldo = this.saldo - monto;

				return this.saldo;

			} else { 
				return null;
			}

		} else {
			return this.saldo = this.saldo - monto;
		}

	}

	public Double consultarSaldo() {
		return this.saldo;
	}
	
	public Double consuldarDeuda() {
		return this.diferencia;
	}

}
