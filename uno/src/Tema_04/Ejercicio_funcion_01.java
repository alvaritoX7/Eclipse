package Tema_04;

import java.util.*;

public class Ejercicio_funcion_01 {

	public static void main(String[] args) {
		
		
		
		numero(1, 0);
		
		
		
		
	}
	static int numero(int a, int b) {
		Scanner hola = new Scanner (System.in);
		System.out.println("Escibeme dos numeros");
		a = hola.nextInt();
		b = hola.nextInt();
		System.out.println("El mayor es: ");
		
		if (a > b){
			System.out.println(a);
		}
		else if (b > a) {
			System.out.println(b);
		}
		else {
			System.out.println(0);
		}
	
		hola.close();
		return b;
	}
}
