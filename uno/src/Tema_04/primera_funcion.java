package Tema_04;

public class primera_funcion {

	public static void main(String[] args) {
		System.out.println("Buenos dias");
		
		saluda(2);
		saluda(1);
		saluda(4);
		saluda(0);
		
		
		System.out.println("Hoy es lunes");
	}
	
	
	static void saluda(int veces) {
		System.out.println("_____________");
		for( int i = 0; i<veces; i++) {
			System.out.println("Hola que tal");
		}
	}
}
