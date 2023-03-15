package Tema_02;

import java.util.*;

public class Condicional {

	public static void main(String[] args) {
		
		int edad, numerofav;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Digame tu número favorito: ");
		numerofav = teclado.nextInt();
		System.out.println("Digame tu edad: ");
		edad = teclado.nextInt();
		
		
		if (numerofav%2 == 0) {
			System.out.println("Tu numero es par");
		}
		else if (edad<18) {
		System.out.println("Eres menor");
		}
		else {
			System.out.println("Eres mayor");
		}
		
	
		teclado.close();
	}

}
