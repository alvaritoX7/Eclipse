package Primer_trimestre;

import java.util.Scanner;

public class Ejercicio_09 {

	public static void main(String[] args) {
		int a, intentos = 10;
		double numeromaquina;
		
		Scanner juego = new Scanner (System.in);
		
		
		numeromaquina = (int) (Math.random() * 100) + 1;
		
		/*do {
		System.out.println("Ponte un numero de intentos: ");
		intentos = juego.nextInt();
		}while (intentos>numeromaquina);
		*/
		
		System.out.println("Pon un numero aleatorio del 1 al 100: ");
		a = juego.nextInt();
		
		if (a>numeromaquina){
			System.out.println("El numero que has introducido es mayor");
		}
		else if(a<numeromaquina) {
			System.out.println("El numero que has introducido es menor");
		}
		intentos--;
		System.out.println("Te quedan " + intentos + " intentos.");
			while ((numeromaquina != a) && (intentos>0)){
		
			System.out.println("Pon otro numero.");
			a = juego.nextInt();
			
			if (a>numeromaquina){
				System.out.println("El numero que has introducido es mayor");
			}
			else if(a<numeromaquina) {
				System.out.println("El numero que has introducido es menor");
			}	
			intentos--;
			if ( numeromaquina != a) {
				System.out.println("Te quedan " + intentos + " intentos.");
			}
			else {
				
			}
			
			}
		
			if (numeromaquina==a) {
			System.out.println("Has acertado el numero aleatorio que puso la maquina.");
			System.out.println("Te han sobrado " + intentos + " intento/intentos");
			}
			else {
				System.out.println("Has gastado todos los intentos.");
				System.out.println("Has perdido el juego.");
			}
		
		
		
		
		juego.close();
		
		
	}

}

