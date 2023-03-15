package Interfaces_02;

public class pruebaEmpleado {

	public static void main(String[] args) {
		
		Empleado p1 = new Programador ();
		
		Empleado p2 = new Gerente ();
		
		p1.calcularBono(1000);
		
		p2.calcularBono(1000);

	}

}