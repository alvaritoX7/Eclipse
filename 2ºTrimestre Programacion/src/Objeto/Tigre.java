package Objeto;

public class Tigre extends Animal{

	private String raza;

	public Tigre(String tipo, String nombre, String raza) {
		super(tipo, nombre);
		
		this.raza = raza;
	}
	
	public void come (String comida) {
		System.out.println(comida);
	}
	
	public String toString() {
		return "Tigre " + super.toString();
	}
}
