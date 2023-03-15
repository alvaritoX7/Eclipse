package Tema_1;

import java.util.*;

public class ejerciciodieciocho {

	public static void main(String[] args) {
		
		
		double h, a, c, x;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Ponga el número de patas capturadas de hormigas: ");
		h = teclado.nextDouble();
		
		System.out.println("Ponga el número de patas capturadas de arañas: ");
		a = teclado.nextDouble();
		
		System.out.println("Ponga el número de patas capturadas de cochinillas: ");
		c = teclado.nextDouble();
		
		
		x = (h*6) + (a*8) + (c*14);
		System.out.println("El número total de patas so: " + x);
		
		teclado.close();
		
	}

}
