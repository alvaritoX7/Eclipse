package Tema_03;

import java.util.*;

public class Ejercicio_8_palabras_palindromas {

	public static void main(String[] args) {
		
		
		
		Scanner palabras = new Scanner (System.in);
		
		System.out.println("Pon una frase que sea palindromo:");
		String a = palabras.nextLine();
		int b=0;
		boolean c = true;
		a = a.replaceAll(" ", "").toLowerCase();
		int d = a.length()/2;
		
		do {	
			if (a.charAt(b)==a.charAt(a.length()-1-b)){
				b++;
				
			}
			else {
				c = false;
			}
		} while ((c != false) && ( b<d ));
		
		
		if (c != false){
			System.out.println("Es polindromo");
		}
		else {
			System.out.println("No es polindromo");
		}
		
		palabras.close();
		
		
	}

}
