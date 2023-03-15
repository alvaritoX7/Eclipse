package Primer_trimestre;

import java.util.Scanner;

public class Ejercicio_13 {

	public static void main(String[] args) {
		int j, i;
		Scanner cuadrado = new Scanner (System.in);
		
			System.out.println("Dime el numero de filas que quiera tener tu cuadrado");
			
			
				
				for ( i = 3; i >= 1; i--) {
					for ( j = 1; j <= 7; j++ ) {
				
						System.out.print("* ");
					
					}
			
			
					System.out.println("");
				}
			
		
			
		
		
		
		
		cuadrado.close();
	}

}
