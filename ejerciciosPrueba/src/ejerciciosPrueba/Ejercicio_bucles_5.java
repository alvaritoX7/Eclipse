package ejerciciosPrueba;

import java.util.*;

public class Ejercicio_bucles_5 {

	public static void main(String[] args) {
		
		
		
		int j, i, fila;
		Scanner cuadrado = new Scanner (System.in);
		
		do {
			System.out.println("Dime el numero de filas que quiera tener tu cuadrado");
			fila = cuadrado.nextInt();
			if (fila>1) {
				
				for ( i = fila; i >= 1; i--) {
					for ( j = 1; j <= fila; j++ ) {
				
						System.out.print("* ");
					
					}
			
			
					System.out.println("");
				}
			}
		
			else {
				System.out.println("Tienes que poner filas positivas mayores a 1");
			}
		}while (fila<=1);
		
		System.out.println("Este es tu cuadrado de "+ fila + " por " + fila);
		
		cuadrado.close();
	}

}
