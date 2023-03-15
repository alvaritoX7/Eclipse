package Objeto;

public class Gato extends Animal implements Mascota {
	private int edad;
	private int codigo;
	private double peso;
	private String raza, color, nombre;
	
	Gato(){
		raza = "callejero";
	}
	Gato(String raza){
		this.raza = raza;
	}
	
	@Override
	public int getCodigo() {
		return this.codigo;
	}
	
	@Override
	public void hazRuido () {
		System.out.println("maramiaumiaumiau");
	}
	
	@Override
	public void come(String comida) {
		
		if (comida.compareToIgnoreCase("pescado") == 0) {
			System.out.println("ummmm que rico");
		}
		else {
			System.out.println("No lo quiero");
		}
	}
	
	void ronronea() {
		System.out.println("rrrrrrrrrrrrrrrrrrrrrrr");
	}


	String pelea(Gato otro) {
		String resultado;
		
		if (otro.raza.compareToIgnoreCase("Callejero") == 0) {
			resultado = "No peleo";
		}
		else {
			if (otro.peso > this.peso) {
				resultado = otro.nombre;
			}
			else {
				resultado = this.nombre;
			}
		}
		
		return resultado;
		
	}
	
	public boolean equals (String otro) {
		boolean compara;
		
		if (this.nombre.equalsIgnoreCase(otro)) {
			compara = true;
		}
		else {
			compara = false;
		}
		
		
		return compara;
	}
	
	
	String getRaza(){
		
		
		return this.raza;
	}
	int getEdad() {
		
		
		return this.edad;
	}
	double getPeso() {
		return this.peso;
	}
	String getColor() {
		return this.color;
	}
	public String getNombre() {
		return this.nombre;
	}
	void setRaza(String raza){
		this.raza = raza;
	}
	void setEdad(int edad) {
		this.edad = edad;
	}
	void setPeso(double peso) {
		this.peso = peso;
	}
	void setColor (String color) {
		this.color = color;
	}
	void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
