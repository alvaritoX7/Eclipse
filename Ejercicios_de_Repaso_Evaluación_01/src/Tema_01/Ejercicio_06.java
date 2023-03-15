package Tema_01;

import java.util.*;

class Ejercicio_06 {

	public static void main(String[] args) {
		
		
		Scanner etapa = new Scanner (System.in);
		
		int edad;
		
		System.out.println("Dime tu edad");
		edad = etapa.nextInt();
		
		
		if (edad<18) {
			System.out.println("Eres muy joven");
		}
		else if(edad >= 18 && edad<40) {
			System.out.println("Eres joven");
		}
		else if (edad >= 40 && edad < 65) {
			System.out.println("Eres viejoven");
		}
		else {
			System.out.println("Cuidate");
		}
		etapa.close();
	}

}
