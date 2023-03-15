package Tema_1;

import java.util.*;

public class Primero {

	public static void main(String[] args) {
		
		Scanner miEscaner = new Scanner (System.in);

		
		double a, b, c, media;
		
		System.out.println("Escribe la nota media del 1º trimestre:");
		
		a = miEscaner.nextDouble();
		
		System.out.println("Escribe la nota media del 2º trimestre:");
		
		b = miEscaner.nextDouble();
		
		System.out.println("Escribe la nota media del 3º trimestre:");
		
		c = miEscaner.nextDouble();
		
		media = (a + b + c) / 3;
		
		System.out.println("La media es " + media );
		
		miEscaner.close();		
		

	}

}
