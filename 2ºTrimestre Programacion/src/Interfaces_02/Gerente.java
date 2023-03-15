package Interfaces_02;

public class Gerente extends Empleado {
	
	@Override
	public void calcularBono(int b) {
		int a = b * 30 / 100;
		b = a + b;
		System.out.println(b);
	}
	
	
}
