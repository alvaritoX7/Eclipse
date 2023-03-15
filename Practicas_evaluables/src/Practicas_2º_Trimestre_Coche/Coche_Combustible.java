package Practicas_2º_Trimestre_Coche;

public class Coche_Combustible extends Coche{

	private Deposito deposito;

	Coche_Combustible(String marca, String modelo, Acce.Accesorio[] accesorios, Deposito deposito) {
		super(marca, modelo, accesorios);
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setAccesorios(accesorios);
		this.deposito = deposito;
	}
	
	public Deposito getDeposito() {
		return deposito;
	}
	
	public void setDeposito(Deposito deposito) {
		this.deposito = deposito;
	}
	
}

