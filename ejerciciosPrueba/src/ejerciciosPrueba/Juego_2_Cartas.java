package ejerciciosPrueba;

import java.util.*;

public class Juego_2_Cartas {

	public static void main(String[] args) {
		
		
		double numcarta1, numtotal1=0,numtotal=0, numcarta, b=7.5;
		int a1, seguir1 = 0, a, seguir;
		
		Scanner cartas = new Scanner (System.in);
		
		
		System.out.println("JUGUEMOS AL 7 Y MEDIO");
		
		System.out.println("Vamos con el primer jugador");
		
		do {
			System.out.println("Coge una carta ");
			
			a1 = (int) (Math.random()*10)+1;
			if (a1<8) {
			numcarta1 = (int) (Math.random() * 7) + 1;
			System.out.println("Te ha tocado esta carta: El " + numcarta1);
			}
			else {
				numcarta1 = (int)(Math.random()*3)+1; 
				if (numcarta1==1) {
					numcarta1=0.5;
					System.out.println("Te ha tocado esta carta: La sota que vale " + numcarta1 + " puntos");
				}
				
				else if (numcarta1 == 2) {
					numcarta1 = 0.5;
					System.out.println("Te ha tocado esta carta: El caballo y vale " + numcarta1 + " puntos");
				}
				else if (numcarta1 == 3) {
					numcarta1 = 0.5;
					System.out.println("Te ha tocado esta carta: El rey y vale " + numcarta1 + " puntos");
				}
				
			}
			
			numtotal1 = numcarta1 + numtotal1;
			
			System.out.println("Llevas " + numtotal1 + " puntos");
			System.out.println("¿Quieres seguir jugando?");
			System.out.println("1 = no y 0 = si");
			seguir1 = cartas.nextInt();
			
		}while ((seguir1==0) && (numtotal1 > b));
		
		if (numtotal1<=7.5) {
			System.out.println("El jugador 1 tiene " + numtotal1 + " punto/s");
		}
		else {
			System.out.println("Has perdido por pasarte de puntos :(");
		}
		
		System.out.println("Ahora le toca al jugador 2 jugar");
		
		
		do {
			System.out.println("Coge una carta ");
			
			a = (int) (Math.random()*10)+1;
			if (a<8) {
			numcarta = (int) (Math.random() * 7) + 1;
			System.out.println("Te ha tocado esta carta: El " + numcarta);
			}
			else {
				numcarta = (int)(Math.random()*3)+1; 
				if (numcarta==1) {
					numcarta=0.5;
					System.out.println("Te ha tocado esta carta: La sota que vale " + numcarta + " puntos");
				}
				
				else if (numcarta == 2) {
					numcarta = 0.5;
					System.out.println("Te ha tocado esta carta: El caballo y vale " + numcarta + " puntos");
				}
				else if (numcarta == 3) {
					numcarta = 0.5;
					System.out.println("Te ha tocado esta carta: El rey y vale " + numcarta + " puntos");
				}
				
			}
			
			numtotal = numcarta + numtotal;
			
			System.out.println("Llevas " + numtotal + " puntos");
			
			System.out.println("¿Quieres seguir jugando?");
			
			System.out.println("1 = no y 0 = si");
			
			seguir = cartas.nextInt();
			
		}while ((numtotal > b) && (seguir != 1));
		
		
		if (numtotal<=b) {
			System.out.println("El jugador 2 tiene " + numtotal + " punto/s");
		}
		else {
			System.out.println("El jugador 2 ha perdido :(");
		}
		
		
		if ((numtotal>b) && (numtotal1>7.5)) {
			System.out.println("Los dos habeis fallado :(");
		}
		else if(numtotal>numtotal1) {
			System.out.println("El jugador 2 ha ganado al jugador 1 con una diferencia de " + (numtotal-numtotal1) + " punto/s");
		}
		else if (numtotal1>numtotal) {
			System.out.println("El jugador 1 ha ganado al jugador 2 con una diferencia de " + (numtotal-numtotal1) + " punto/s");
		}
		
		cartas.close();
	}

}
