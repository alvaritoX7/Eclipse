package Primer_trimestre;

import java.util.Scanner;

public class Ejercicio_03 {

	public static void main(String[] args) {
		
		
		
		int a;
		double raiz, division1, division2, potencia1, potencia2, x;
		
		Scanner numero = new Scanner(System.in);
		
		
		System.out.println("Dime un número del 1 al 3 para hacer las siguientes operaciónes: ");
		System.out.println("1 - Raíz cuadrada");
		System.out.println("2 - División entre dos números");
		System.out.println("3 - Potencia de dos números");
		a = numero.nextInt();
		
		
		if (a==1) {
			System.out.println("Dime un número para hacer su raíz cuadrada:");
			raiz = numero.nextDouble();
			x = Math.sqrt(raiz);
			System.out.println("La raiz cuadrada de " + raiz + " da " + x);
			
		}
		
		else if (a==2) {
			System.out.println("Dime dos números para dividirlos entre ellos:");
			division1 = numero.nextDouble();
			division2 = numero.nextDouble();
			x = division1/division2;
			System.out.println("El resultado de la división de " + division1 + " partido de " + division2 + " es: " + x);
			
		}
		
		else if (a==3) {
			System.out.println("Dime dos números para hacer su potencia:");
			System.out.println("La base: ");
			potencia1 = numero.nextDouble();
			System.out.println("El exponente: ");
			potencia2 = numero.nextDouble();
			x = Math.pow(potencia1, potencia2);
			System.out.println("La potencia es: " + x);
			
		}
		
		else {
			System.out.println("Has puesto un número que no está entre el uno y el tres.");
			System.out.println("Vuelve a ejecutar el programa.");
		}
		
		
		
		
		numero.close();
		
	}

}
