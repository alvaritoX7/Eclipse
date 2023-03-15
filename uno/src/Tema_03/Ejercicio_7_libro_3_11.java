package Tema_03;

import java.util.*;

public class Ejercicio_7_libro_3_11 {

	public static void main(String[] args) {
		
		
		
		Scanner calculadora = new Scanner (System.in);
		
		
		int a, b;
		
		System.out.println("Pon el numero que quieras para pasarlo a binario:");
		a = calculadora.nextInt();
		System.out.println("El numero en binario es:");
		do {
			
			b=a%2;
			
			a=a/2;
			
			System.out.println(b);
		}while (a!=0);
		
		
		
		
		
		
		
		
		
		calculadora.close();
	}

}
