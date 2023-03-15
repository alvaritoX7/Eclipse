package Ejercicios_tema_05;

import java.util.*;

public class Arrays_dos_dimensiones {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int datos [][];
		datos = new int [3] [3];
		
		/*for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				datos [i] [j] =sc.nextInt();
			}
			
		}
		
		System.out.print(Arrays.deepToString(datos));*/
		
		for (int fila [] : datos) {
			
			for(int columna : fila) {
				columna++;
				System.out.print(columna + " ");
				
			}
			System.out.println();
		}
		
		
		
		sc.close();
	}

}
