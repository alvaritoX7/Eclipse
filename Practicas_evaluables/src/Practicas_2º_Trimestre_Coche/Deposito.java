package Practicas_2º_Trimestre_Coche;

public class Deposito {
	
	private boolean diesel;
	private boolean gasolina;
	public static String etiqueta;
	
	public boolean getDiesel() {
		return diesel;
	}

	public boolean getGasolina() {
		return gasolina;
	}
	
	public String getEtiqueta() {
		return etiqueta;
	}
	
	Deposito(String deposito) {
	
		if(deposito.compareToIgnoreCase("gasolina") == 0)	{
			this.gasolina = true;
			this.diesel = false;
			this.etiqueta = "B";
		}
		else {
			this.diesel = true;
			this.gasolina = false;
			this.etiqueta = "C";
		}
	}
}

