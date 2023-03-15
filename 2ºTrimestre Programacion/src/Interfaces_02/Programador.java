package Interfaces_02;

public class Programador extends Empleado {

	
	
	@Override
	public void calcularBono(int b) {
		int a = b * 20 / 100;
		b = a + b;
		System.out.println(b);
	}

	
}
