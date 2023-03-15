package Tema_02;

import java.util.*;

public class Ejercicio_01 {

	public static void main(String[] args) {
		
		Scanner cuadrado = new Scanner (System.in);
		int i, a;
		
		System.out.println("Ponme un numero y hare su cuadrado hasta que pongas un numero negativo");
		i = cuadrado.nextInt();
		a = i;
		
		while (i >= 0) {
			a = i * a;
			System.out.println("Numero negativo para salir, llevas: " + a);
			i = cuadrado.nextInt();
		}
		System.out.println("Saliste del bucle con un numero de: " + a);
		
		cuadrado.close();
	}

}
