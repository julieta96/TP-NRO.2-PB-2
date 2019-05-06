package ar.edu.unlam;

public class CuentaCorriente extends Cuenta {
	
	private Double limiteAdicional=150.0;
	private Double comision=0.05;
	
	public CuentaCorriente(String nombre, String apellido, Double saldo ,Double limite ) {

		super(saldo);

		this.nombre = nombre;
		this.apellido = apellido;
		this.saldo = saldo;
		this.limiteAdicional = limite;
		
	}
	
	public CuentaCorriente() {
		
	}

	public CuentaCorriente(Double saldo , Double limite) {

		super(saldo);

		this.saldo = saldo;
		this.limiteAdicional = limite;
		
	}
	
	public void setLimite(Double limite) {
		
		this.limiteAdicional=limite;
	}
	
	public Double getLimite() {
		
		return this.limiteAdicional;
	}
	
   public Double getComision() {
	 
	 return this.comision;
	
   }
   
   public void setComision(Double nuevaComision) {
	   
	   this.comision = nuevaComision;
	   
   }
	
	
	public Double depositar(Double dinero) {
		
		this.saldo=super.depositar(dinero);
		
		return this.saldo;
		
		
	}
	
	public Double extraer(Double dineroAExtraer) {
		
		
		
		if(dineroAExtraer>this.saldo) {
			
			this.saldo = Math.abs(this.saldo-dineroAExtraer);
			
			if(this.saldo>=limiteAdicional) {
				
				this.saldo=this.saldo+(this.saldo*comision);
			}
			
			else {
				
				this.saldo=null;
			}
			
			
		}
		
		else {
			
			this.saldo = this.saldo - dineroAExtraer;
		}
		
		return this.saldo;
		
		
	}
	

}
