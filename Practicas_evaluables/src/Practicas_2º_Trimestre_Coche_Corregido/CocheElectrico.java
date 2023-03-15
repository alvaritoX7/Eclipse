package Practicas_2º_Trimestre_Coche_Corregido;

public class CocheElectrico extends Coche {

	 private static Bateria bateria;
	 
	CocheElectrico(String marca, String modelo, Acce.Accesorio[] accesorios, Bateria bateria) {
		super(marca, modelo, accesorios);
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setAccesorios(accesorios);
		this.bateria = bateria;
	}
	
	@Override
	public double verPrecio() {
		double precio = super.getPrecioFinal();
		 precio = this.getPrecioBase() - (this.getPrecioBase()*0.1); 
	        
		 
	        for (int i = 0; i < this.getAccesorios().length; i++) {
	            precio += this.getAccesorios()[i].getPrecio();
	        }
	        return precio;
	}
	
	public static Bateria getBateria() {
		return bateria;
	}

	public void setBateria(Bateria bateria) {
		this.bateria = bateria;
	}
}

