package Ejercicios_futbolista;

public class Futbolista implements Comparable{
	
	private DNI dni;
	private String nombre;
	private int edad;
	private int num_goles;
	
	public Futbolista(DNI dni, String nombre, int edad, int num_goles) {
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
		this.num_goles = num_goles;
	}
	
	public DNI getDni() {
		return dni;
	}
	public void setDni(DNI dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getNum_goles() {
		return num_goles;
	}
	public void setNum_goles(int num_goles) {
		this.num_goles = num_goles;
	}
	
	
	public String toString () {
		
		return this.nombre + " con " + this.edad + " annos con DNI: " + this.dni + " y numero de goles " + this.num_goles;
	}
	
	@Override
	public boolean equals(Object o) {
		Futbolista otro = (Futbolista) o;
		boolean iguales = false;
		if (this.dni.getNum() == otro.getDni().getNum()) {
			if (this.dni.getLetra().equals(otro.dni.getLetra())) {
				iguales = true;
				System.out.println("Son iguales");
			}
			else {
				System.out.println("No son iguales");
			}
		}
		else {
			System.out.println("No son iguales");
		}
		return iguales;
	}

	@Override
	public int compareTo(Object o) {
		Futbolista otro = (Futbolista) o;
		if (this.dni.getNum() == otro.getDni().getNum()) {
			return this.dni.getLetra().compareToIgnoreCase(otro.dni.getLetra());
		}
		else if (this.dni.getNum() > otro.getDni().getNum()) {
			return 1;
		}
		else {
			return -1;
		}
	}
	
	
	
	
	
}
