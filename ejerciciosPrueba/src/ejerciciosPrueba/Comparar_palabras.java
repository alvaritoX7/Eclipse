package ejerciciosPrueba;

import java.util.*;

public class Comparar_palabras {

	public static void main(String[] args) {
		
	
		int num1, num2, digitos;
		boolean b1=false, b2=false;
		
		Scanner bombilla = new Scanner(System.in);
		
		
		System.out.println("Introduzca dos numeros");
		System.out.println("Si su suma es mayor a tres dígitos se encendera la bombilla 1 y sino se encendera la bombilla2");
		num1 = bombilla.nextInt();
		num2 = bombilla.nextInt();
		
		digitos = Integer.toString(num1).length() + Integer.toString(num2).length();
		System.out.println("Tiene " + digitos + " digitos");
		if (digitos>3) {
			b1 = true;
		}
		else {
			b2 = true;
		}
		
		
		System.out.println("Bombilla 1: " + b1);
		System.out.println("Bombilla 2: " + b2);
		
	bombilla.close();
}

}
