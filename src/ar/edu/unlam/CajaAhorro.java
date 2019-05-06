package ar.edu.unlam;

public class CajaAhorro extends Cuenta{
	
	private String nombre;
	private String apellido;
	Integer contador=0;

	public CajaAhorro(String nombre, String apellido, Double saldo) {

		super(saldo);

		this.nombre = nombre;
		this.apellido = apellido;
		this.saldo = saldo;
		
	}
	
	public CajaAhorro() {


	}

	public CajaAhorro(Double saldo) {

		super(saldo);

		this.saldo = saldo;
		

	}

	public Double extraer(Double dinero) {
	
	    if(dinero>0.0D ) {
	         this.contador++;
		
		  if(dinero<=this.saldo && this.contador<5) {
			  
		     this.saldo = super.extraer(dinero);
		
		}
		
		 if (dinero<= this.saldo && this.contador > 5) {

		     this.saldo= super.extraer(dinero + 6.0);				
					
		}
	}
		
	   return this.saldo;
	
	}
	
	public Double depositar (Double cantidad){

		this.saldo=super.depositar(cantidad);
		
		return this.saldo;
	 }

}
