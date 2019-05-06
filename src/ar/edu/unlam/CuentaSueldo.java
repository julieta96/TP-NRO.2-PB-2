package ar.edu.unlam;

public class CuentaSueldo extends Cuenta {
	
	 private String nombre;
	 private String apellido;

	public CuentaSueldo() {

	}
	
	public CuentaSueldo(String nombre, String apellido, Double saldo , Integer numero) {
		super(saldo);
		this.nombre = nombre;
		this.apellido = apellido;
		this.saldo = saldo;

	}
	

	public CuentaSueldo( String apellido, String nombre) {

		this.apellido = apellido;
		this.nombre = nombre;
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


	public Double depositar(Double cantidad){
		
    
		this.saldo=super.depositar(cantidad);
		
		return this.saldo;
	 
	 }
		
	public Double extraer (Double cantidad){

		this.saldo=super.extraer(cantidad);	
		
		return this.saldo;
		
	}
		
	
	
}
