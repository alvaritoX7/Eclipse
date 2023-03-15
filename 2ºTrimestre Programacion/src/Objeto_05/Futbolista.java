package Objeto_05;

public class Futbolista {
	
	
	private int dorsal;
	private String nombre;
	private Demarcacion demarcacion;
	private Equipo equipo;
	
	public Futbolista() {
		
	}
	
	public Futbolista (String nombre, int dorsal, Demarcacion demarcacion, Equipo equipo) {
		this.nombre= nombre;
		this.dorsal = dorsal;
		this.demarcacion = demarcacion;
		this.equipo = equipo;
	}
	

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Demarcacion getDemarcacion() {
		return demarcacion;
	}

	public void setDemarcacion(Demarcacion demarcacion) {
		this.demarcacion = demarcacion;
	}

	public Equipo getEquipo() {
		return equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}
	
	public String toString () {
		return "Nombre: " + nombre + "  Dorsal: " + dorsal + "  Demarcacion: " + demarcacion + "  Equipo: " + equipo;
	}
	
	
	
	
	
	
}
