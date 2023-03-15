package Practicas_2º_Trimestre_Coche;

public class Coche_Electrico extends Coche{
	
	private Bateria bateria;
	 
	Coche_Electrico(String marca, String modelo, Acce.Accesorio[] accesorios, Bateria bateria) {
		super(marca, modelo, accesorios);
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setAccesorios(accesorios);
		this.bateria = bateria;
	}
	
	public Bateria getBateria() {
		return bateria;
	}

	public void setBateria(Bateria bateria) {
		this.bateria = bateria;
	}
	
	
}

