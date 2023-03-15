package Tema_01;

import java.util.*;

public class Ejercicio_02_2 {

	public static void main(String[] args) {
		
		Scanner sumaresta = new Scanner (System.in);
		
		int num1, num2;
		String suma = "+", resta = "-";
		
		System.out.println("Escribe dos numeros: ");
		num1 = sumaresta.nextInt();
		num2 = sumaresta.nextInt();
		
		System.out.println("Si quieres sumar escribe + o si quieres restar escribe -");
		String operacion = sumaresta.next();
		
		
		if (operacion.compareTo(suma) == 0) {
			System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
		}
		else if (operacion.compareTo(resta) == 0) {
			System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
		}
		else {
			System.out.println("Escribiste mal si queres sumar o restar");
		}
		
		
		
		
		
		
		sumaresta.close();
		
	}

}
