package Practicas_2º_Trimestre;

public class Persona {
	
	private String nombre;
	private String cod_persona;
	private int num_prestamos;
	
	
	public Persona(String nombre, String cod_persona) {
		this.nombre = nombre;
		this.cod_persona = cod_persona;
		this.num_prestamos = 0;
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCod_persona() {
		return cod_persona;
	}
	public void setCod_persona(String cod_persona) {
		this.cod_persona = cod_persona;
	}
	public int getNum_prestamos() {
		return num_prestamos;
	}
	public void setNum_prestamos(int num_prestamos) {
		this.num_prestamos = num_prestamos;
	}
	
	
	public int restaPrestamos () {
		return this.num_prestamos -- ;
	}
	public int sumaPrestamos () {
		return this.num_prestamos ++ ;
	}
}
