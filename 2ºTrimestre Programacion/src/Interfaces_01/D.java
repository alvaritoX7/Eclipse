package Interfaces_01;

public class D implements B,C{
	private int codigo;
	private String nombre, apellido;
	
	@Override
	public int getCodigo() {
		return this.codigo;
	}
	@Override
	public String getNombre() {
		return this.nombre;
	}
	@Override
	public String getApellido() {
		return this.apellido;
	}	
}