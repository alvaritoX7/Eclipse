package Interfaces_03;

public class Empleado implements Comparable {

	private int id; 
	private String nombre;
	
	public Empleado(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String toString () {
		
		return "   " + getId() + " " + getNombre();
		
	}

	@Override
	public int compareTo(Object o) {
		Empleado otro = (Empleado) o;
		if (this.id == otro.getId()) {
			return this.nombre.compareToIgnoreCase(otro.getNombre());
		}
		else if (this.id > otro.getId()) {
			return 1;
		}
		else {
			return -1;
		}
	}
	
	
	
	
	
}
