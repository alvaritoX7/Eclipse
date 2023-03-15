package Ejercicios_tema_05;

import java.util.*;

public class Ahorcado_2 {

	public static void main(String[] args) {
		
		Scanner ahorcado = new Scanner (System.in);
		
		int intentos = 10;
		boolean a = false, b = false, c = false, d = false, e = false, f = false, g = false, h = false;
		String Palabra_Maquina = "almohada";
		String Palabra_Usuario;
		
		
		String palabras[] = new String [8];
		palabras[0] = "a ";
		palabras[1] = "l ";
		palabras[2] = "m ";
		palabras[3] = "o ";
		palabras[4] = "h ";
		palabras[5] = "a ";
		palabras[6] = "d ";
		palabras[7] = "a ";
		
		
		
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
				if (Palabra_Usuario.charAt(0) == Palabra_Maquina.charAt(1)) {
					b = true;
				}
				if (Palabra_Usuario.charAt(0) == Palabra_Maquina.charAt(2)) {
					c = true;
				}
				if (Palabra_Usuario.charAt(0) == Palabra_Maquina.charAt(3)) {
					d = true;
				}
				if (Palabra_Usuario.charAt(0) == Palabra_Maquina.charAt(4)) {
					e = true;
				}
				if (Palabra_Usuario.charAt(0) == Palabra_Maquina.charAt(5)) {
					f = true;
				}
				if (Palabra_Usuario.charAt(0) == Palabra_Maquina.charAt(6)) {
					g = true;
				}
				if (Palabra_Usuario.charAt(0) == Palabra_Maquina.charAt(7)) {
					h = true;
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
				if (e == true) {
					System.out.print(palabras[4]);
				}
				else {
					System.out.print("_ ");
				}
				if (f == true) {
					System.out.print(palabras[5]);
				}
				else {
					System.out.print("_ ");
				}
				if (g == true) {
					System.out.print(palabras[6]);
				}
				else {
					System.out.print("_ ");
				}
				if (h == true) {
					System.out.print(palabras[7]);
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
