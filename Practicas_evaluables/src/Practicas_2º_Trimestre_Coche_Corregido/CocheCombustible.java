package Practicas_2º_Trimestre_Coche_Corregido;

public class CocheCombustible extends Coche {

	 private static Deposito deposito;

	CocheCombustible(String marca, String modelo, Acce.Accesorio[] accesorios, Deposito deposito) {
		super(marca, modelo, accesorios);
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setAccesorios(accesorios);
		this.deposito = deposito;
	}
	
	@Override
	public double verPrecio() {
		double precio = super.getPrecioFinal();
		 precio = this.getPrecioBase() + (this.getPrecioBase()*0.1);
	        
		 
	        for (int i = 0; i < this.getAccesorios().length; i++) {
	            precio += this.getAccesorios()[i].getPrecio();
	        }
	        return precio;
	}
	
	public static Deposito getDeposito() {
		return deposito;
	}
	
	public void setDeposito(Deposito deposito) {
		this.deposito = deposito;
	}
}

