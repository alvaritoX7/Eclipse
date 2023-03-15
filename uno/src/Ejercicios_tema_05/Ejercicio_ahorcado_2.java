package Ejercicios_tema_05;

import java.util.*;

public class Ejercicio_ahorcado_2 {

	public static void main(String[] args) {
		
		Scanner ahorcado = new Scanner (System.in);
		
		int intentos = 10;
		boolean a = false, b = false, c = false, d = false;
		String Palabra_Maquina = "hola";
		String Palabra_Usuario;
		
		
		String palabras[] = new String [4];
		palabras[0] = "h ";
		palabras[1] = "o ";
		palabras[2] = "l ";
		palabras[3] = "a ";
		
		
		
		System.out.println("Intenta adividar la palabra secreta: ");
		System.out.println("Si pones mas de una letra se te quitará un intento ");
		System.out.println("Tienes " + intentos + " intentos.");
		for(int i = 0; i != (Palabra_Maquina.length()); i++) {
			System.out.print("_ ");
		}
		Palabra_Usuario = ahorcado.next();
		
		
			while ((intentos != 0 ) && (Palabra_Maquina.compareTo(Palabra_Usuario) != 0)) {
								
				
				if (Palabra_Usuario.charAt(0) == Palabra_Maquina.charAt(0)) {
					a = true;
				}
				else if (Palabra_Usuario.charAt(0) == Palabra_Maquina.charAt(1)) {
					b = true;
				}
				else if (Palabra_Usuario.charAt(0) == Palabra_Maquina.charAt(2)) {
					c = true;
				}
				else if (Palabra_Usuario.charAt(0) == Palabra_Maquina.charAt(3)) {
					d = true;
				}	
				
				
				if (a == true) {
					System.out.print(palabras[0]);
				}
				else {
					System.out.print("_ ");
				}
				if (b == true) {
					System.out.print(palabras[1]);
				}
				else {
					System.out.print("_ ");
				}
				if (c == true) {
					System.out.print(palabras[2]);
				}
				else {
					System.out.print("_ ");
				}
				if (d == true) {
					System.out.print(palabras[3]);
				}
				else {
					System.out.print("_ ");
				}
				System.out.println("");
				intentos--;
				
				System.out.println("Te quedan " + intentos + " intentos");
				
				Palabra_Usuario = ahorcado.next();
		}
			
		if (Palabra_Maquina.compareTo(Palabra_Usuario) == 0) {
			
			System.out.println("Has acertado la palabra");
			System.out.println("Te han sobrado " + intentos + " intentos");
			
		}
		else {
			System.out.println("Has perdido porque te quedaste sin intentos :(");
		}
		
		
		
		
		
		ahorcado.close();
	}

}

