package Ejercicios_tema_03;

import java.util.*;

public class Ejercicio_ahorcado {

	public static void main(String[] args) {
		
		
		Scanner ahorcado = new Scanner (System.in);
		
		System.out.println("Vamos a jugar al ahorcado");
		
		int intentos = 5;
		String delegado = "delegado";
		String respuestausuario;
		int longitud = delegado.length() - 1;
		
		System.out.println("Tienes " + intentos + " intentos");
		
		do{
			for (int j = 0; j <= longitud; j++ ) {
				System.out.print("_ ");
			}
			respuestausuario = ahorcado.next();
			for (int i = 0; i <= longitud; i++) {
				if (delegado.charAt(i) == respuestausuario.charAt(0))
					System.out.print(respuestausuario);
				else {
					System.out.print("_ ");
				}
			}
			intentos--;
			System.out.println("");
			
			if (intentos != 1) {
			System.out.println("Te quedan " + intentos + " intentos");
			}
			else {
				System.out.println("Te queda " + intentos + " intento");
			}
			
		}while ( (respuestausuario.compareToIgnoreCase(delegado) == 0)  && (intentos != 0)   );
		
		if (respuestausuario.compareToIgnoreCase(delegado) == 0) {
			System.out.println("La respuesta es corrcta");
		}
		else {
			System.out.println("La respuesta es incorrecta");
		}
		
		
		ahorcado.close();
	}

}
