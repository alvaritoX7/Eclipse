package Primer_trimestre;

import java.util.*;

public class Ejercicio_04 {

	public static void main(String[] args) {
		
		
		
Scanner palabras = new Scanner (System.in);
		
		System.out.println("Pon tres palabras al azar: ");
		String palabra1 = palabras.next();
		String palabra2 = palabras.next();
		String palabra3 = palabras.next();
		
		
		
		if ((palabra1.length() > palabra2.length()) && (palabra2.length() > palabra3.length())) {
			
			System.out.println(palabra1 + " > " + palabra2 + " > " + palabra3);
		
		}
		else if ((palabra1.length() > palabra3.length()) && (palabra3.length() > palabra2.length())) {
			
			System.out.println(palabra1 + " > " + palabra3 + " > " + palabra2);
			
		}
		
		else if ((palabra2.length() > palabra1.length()) && (palabra1.length() > palabra3.length())) {
			
			System.out.println(palabra2 + " > " + palabra1 + " > " + palabra3);
			
		}
		else if ((palabra2.length() > palabra3.length()) && (palabra3.length() > palabra1.length())) {
			
			System.out.println(palabra2 + " > " + palabra3 + " > " + palabra1);
			
		}
		
		else if ((palabra3.length() > palabra1.length()) && (palabra1.length() > palabra2.length())) {
			
			System.out.println(palabra3 + " > " + palabra1 + " > " + palabra2);
			
		}	
		else if ((palabra3.length() > palabra2.length()) && (palabra2.length() > palabra1.length())) {
			
			System.out.println(palabra3 + " > " + palabra2 + " > " + palabra1);
			
		}
		
		else if ((palabra1.length() == palabra2.length()) && (palabra2.length() > palabra3.length())) {
			
			if (palabra1.compareToIgnoreCase(palabra2) == 0) {
				
				System.out.println(palabra1 + " = " + palabra2 + " > " + palabra3);
				
			}
			else if (palabra1.compareToIgnoreCase(palabra2) >0){
				
				System.out.println(palabra1 + " > " + palabra2 + " > " + palabra3);
				
			}
			else {
				System.out.println(palabra2 + " > " + palabra1 + " > " + palabra3);
			}
		}
		else if ((palabra1.length() == palabra3.length()) && (palabra3.length() > palabra2.length())) {
			if (palabra1.compareToIgnoreCase(palabra3) == 0) {
				
				System.out.println(palabra1 + " = " + palabra3 + " > " + palabra2);
				
			}
			else if (palabra1.compareToIgnoreCase(palabra3) > 0) {
				
				System.out.println(palabra1 + " > " + palabra3 + " > " + palabra2);
				
			}
			else {
				
				System.out.println(palabra3 + " > " + palabra1 + " > " + palabra2);
			
			}
			
		}
		else if ((palabra2.length() == palabra3.length()) && (palabra3.length() > palabra1.length())) {
			if (palabra2.compareToIgnoreCase(palabra3) == 0) {
				
				System.out.println(palabra2 + " = " + palabra3 + " > " + palabra1);
				
			}
			else if (palabra2.compareToIgnoreCase(palabra3) > 0) {
				
				System.out.println(palabra2 + " > " + palabra3 + " > " + palabra1);
				
			}
			else {
				
				System.out.println(palabra3 + " > " + palabra2 + " > " + palabra1);
			
			}
			
		}
		
		else if ((palabra1.length() == palabra2.length()) && (palabra2.length() < palabra3.length())) {
			if (palabra1.compareToIgnoreCase(palabra2) == 0) {
				
				System.out.println(palabra3 + " > " + palabra1 + " = " + palabra2);
				
			}
			else if (palabra1.compareToIgnoreCase(palabra2) >0){
				
				System.out.println(palabra3 + " > " + palabra1 + " > " + palabra2);
				
			}
			else {
				System.out.println(palabra3 + " > " + palabra2 + " > " + palabra1);
			}
			
		}
		else if ((palabra1.length() == palabra3.length()) && (palabra3.length() < palabra2.length())) {
			if (palabra1.compareToIgnoreCase(palabra3) == 0) {
				
				System.out.println(palabra2 + " > " + palabra1 + " = " + palabra3);
				
			}
			else if (palabra1.compareToIgnoreCase(palabra3) > 0) {
				
				System.out.println(palabra2 + " > " + palabra1 + " > " + palabra3);
				
			}
			else {
				
				System.out.println(palabra2 + " > " + palabra3 + " > " + palabra1);
			
			}
			
		}
		else if ((palabra2.length() == palabra3.length()) && (palabra3.length() < palabra1.length())) {
			if (palabra2.compareToIgnoreCase(palabra3) == 0) {
				
				System.out.println(palabra1 + " > " + palabra2 + " = " + palabra3);
				
			}
			else if (palabra2.compareToIgnoreCase(palabra3) > 0) {
				
				System.out.println(palabra1 + " > " + palabra2 + " > " + palabra3);
				
			}
			else {
				
				System.out.println(palabra1 + " > " + palabra3 + " > " + palabra2);
			
			}
			
		}
		
		else {
			if ((palabra1.compareToIgnoreCase(palabra2) < 0) && (palabra2.compareToIgnoreCase(palabra3) < 0)) {
				System.out.println(palabra3 + " > " + palabra2 + " > " + palabra1);
			}
			else if ((palabra1.compareToIgnoreCase(palabra3) < 0) && (palabra3.compareToIgnoreCase(palabra2) < 0)) {
				System.out.println(palabra2 + " > " + palabra3 + " > " + palabra1);
			}
			
			else if ((palabra2.compareToIgnoreCase(palabra1) < 0) && (palabra1.compareToIgnoreCase(palabra3) < 0)) {
				System.out.println(palabra3 + " > " + palabra1 + " > " + palabra2);
			}
			else if ((palabra2.compareToIgnoreCase(palabra3) < 0) && (palabra3.compareToIgnoreCase(palabra1) < 0)) {
				System.out.println(palabra1 + " > " + palabra3 + " > " + palabra2);
			}
			
			else if ((palabra3.compareToIgnoreCase(palabra1) < 0) && (palabra1.compareToIgnoreCase(palabra2) < 0)) {
				System.out.println(palabra2 + " > " + palabra1 + " > " + palabra3);
			}
			else if ((palabra3.compareToIgnoreCase(palabra2) < 0) && (palabra2.compareToIgnoreCase(palabra1) < 0)) {
				System.out.println(palabra1 + " > " + palabra2 + " > " + palabra3);
			}
			else {
				System.out.println(palabra1 + " = " + palabra2 + " = " + palabra3);
			}
		}
		
		palabras.close();
	}

}
