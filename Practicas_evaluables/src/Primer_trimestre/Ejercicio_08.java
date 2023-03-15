package Primer_trimestre;

import java.util.Scanner;

public class Ejercicio_08 {

	public static void main(String[] args) {
		
		
		String contraseña1, contraseña2;
		Scanner contraseña = new Scanner (System.in);	
		
		System.out.println("Introduzca una contraseña");
		contraseña1 = contraseña.next();
		
		System.out.println("Introduzca la misma contraseña");
		contraseña2 = contraseña.next();
		
		
		while (contraseña1.compareToIgnoreCase(contraseña2) != 0) {
			
			System.out.println("Tienes que poner la misma contraseña dos veces, prueba otra vez");
			System.out.println("Introduzca una contraseña");
			contraseña1 = contraseña.next();
			
			System.out.println("Introduzca la misma contraseña");
			contraseña2 = contraseña.next();
			
			
		}
		
		System.out.println("Contrasen123a guardada correctamente");
		
		contraseña.close();
		
		
	}

}

