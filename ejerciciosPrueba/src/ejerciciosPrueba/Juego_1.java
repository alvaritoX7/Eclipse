package ejerciciosPrueba;

import java.util.*;

public class Juego_1 {

	public static void main(String[] args) {
		
		
		int a, intentos;
		double numeromaquina;
		
		Scanner juego = new Scanner (System.in);
		
		
		numeromaquina = (int) (Math.random() * 100) + 1;
		
		do {
		System.out.println("Ponte un numero de intentos: ");
		intentos = juego.nextInt();
		}while (intentos>numeromaquina);
		
		
		System.out.println("Pon un numero aleatorio del 1 al 100: ");
		a = juego.nextInt();
					
			while ((numeromaquina != a) && (intentos>0)){
			
			if (a>numeromaquina){
				System.out.println("Te has pasado");
			}
			else if(a<numeromaquina) {
				System.out.println("No has llegado al numero");
			}
			
			System.out.println("Pon otro numero.");
			a = juego.nextInt();
			
			intentos--;
			System.out.println("Te quedan " + intentos + " intentos.");
			}
		
			if (numeromaquina==a) {
			System.out.println("Has acertado el numero aleatorio que puso la maquina.");
			System.out.println("Te han sobrado" + intentos + " intento/intentos");
			}
			else {
				System.out.println("Has gastado todos los intentos.");
				System.out.println("Has perdido el juego.");
			}
		
		
		
		
		juego.close();
		
	}

}
