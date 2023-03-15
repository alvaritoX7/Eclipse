package Tema_04;

public class Metodo_potencia {

	public static void main(String[] args) {
		
		
		int num = 3, exponente = 4;
		
		int resultado = potencia(num, exponente);
		System.out.println(resultado);
		
	}
	static int potencia (int a, int b) {
		
		int c = a;
		
		for (int i = 0; i <= b; i++) {
			c = c*a;
			b--;
		}
		return (c);
	}

}
