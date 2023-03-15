package Objeto;

public class Animal {
	
	
	private String tipo;
	private String nombre;
	
	public Animal () {
		
	}
	
	
	public Animal (String tipo, String nombre) {
		
		this.tipo = tipo;
		this.nombre = nombre;
		
	}
	
	public String getTipo() {
		
		return this.tipo;
		
	}
	
	public String getNombre() {
		
		return this.nombre;
		
	}
	
	public void setTipo () {
		
	}
	
	public void setNombre () {
		
	}
	
	public void come () {
		System.out.println("ñam ñam");
	}
	
	public void duerme () {
		System.out.println("zzzzzzz");
	}
	
	public String toString () {
		return "animal de tipo " + this.tipo + " con nombre " + this.nombre;
	}
	
	
	
	
	
	
}
