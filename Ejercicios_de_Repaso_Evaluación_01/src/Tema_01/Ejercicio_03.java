package Tema_01;

import java.util.*;

public class Ejercicio_03 {

	public static void main(String[] args) {
		
		Scanner parimpar = new Scanner (System.in);
		
		int num;
		
		
		System.out.println("Dime un numero: ");
		num = parimpar.nextInt();
		
		
		if (num % 2 == 0) {
			System.out.println("Es par");
		}
		else {
			System.out.println("Es impar");
		}
		
		
		
		
		
		
		
		
		
		parimpar.close();
	}

}
