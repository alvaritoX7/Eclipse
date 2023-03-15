package Ejercicios_tema_01;

import java.util.*;

public class Ejercicio_clase_uno {

	public static void main(String[] args) {
		

		String a, b, c;
		 
		
		Scanner palabras = new Scanner (System.in);
		
		System.out.println("Digame una palabra aleatoria: ");
		a = palabras.next();
		System.out.println("Digame una palabra aleatoria: ");
		b = palabras.next();
		System.out.println("Digame una palabra aleatoria: ");
		c = palabras.next();
		
		
		if (a.length() == b.length()) {
			System.out.println("Tienen las mismas letras: " + a + " = " + b);
		}
		else if (a.length() > b.length()) {
			System.out.println("Tiene mas letras: " + a + " > " + b);
		}
		else if (a.length() < b.length()) {
			System.out.println("Tiene menos letras: " + a + " < " + b);
		}
		if (a.length() == c.length()) {
			System.out.println("Tienen las mismas letras: " + a + " = " + c);
		}
		else if (a.length() > c.length()) {
			System.out.println("Tiene mas letras: " + a + " > " + c);
		}
		else if (a.length() < c.length()) {
			System.out.println("Tiene menos letras: " + a + " < " + c);
		}
		if (b.length() == c.length()) {
			System.out.println("Tienen las mismas letras: " + b + " = " + c);
		}
		else if (b.length() > c.length()) {
			System.out.println("Tiene mas letras: " + b + " > " + c);
		}
		else if (b.length() < c.length()) {
			System.out.println("Tiene menos letras: " + b + " < " + c);
		
	}
		palabras.close();
	}
}
