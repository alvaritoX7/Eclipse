package Examen;

public class Empleado {
	
	private String sueldo;
	private String nombre;
	private int [] telefono = new int [2];
	private static int numEmpleados;
	
	
	public Empleado(String sueldo, String nombre, int telefono1, int telefono2) {
		this.sueldo = sueldo;
		this.nombre = nombre;
		this.telefono [0] = telefono1;
		this.telefono[1] = telefono2;
		//numEmpleado ++;
	}
	
	
	public Empleado() {
		//numEmpleado++;
	}


	public Empleado(String sueldo, String nombre, int telefono1) {
		
		this.sueldo = sueldo;
		this.nombre = nombre;
		this.telefono [0] = telefono1;
		//numEmpleado ++;
	}

	public String getSueldo() {
		return sueldo;
	}

	public void setSueldo(String sueldo) {
		this.sueldo = sueldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int[] getTelefono() {
		return telefono;
	}

	public void setTelefono(int[] telefono) {
		this.telefono = telefono;
	}
	
	/*public static int getNumEmpleados() {
		return numEmpleados;
	}


	public static void setNumEmpleados(int numEmpleados) {
		Empleado.numEmpleados = numEmpleados;
	}*/


	public int cuentaEmpleados (Empleado [] otro) {
		
		int num_empleado = otro.length;
		
		return num_empleado;
	}
	
	public String toString1 () {
		return "Telefono1: " + telefono[0] + "     Telefono2: " + telefono[1];
	}
	
	public String toString () {
		return "Nombre: " + nombre + "    Sueldo: " + sueldo + ""
				+ "Telefono1: " + telefono[0] + "     Telefono2: " + telefono[1];
	}
	
	
	
	
}
