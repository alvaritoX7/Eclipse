package Tema_01;

import java.util.*;

public class Ejercicio_02_1 {

	public static void main(String[] args) {
		
		Scanner sumaresta = new Scanner (System.in);
		
		int num1, num2, operacion;
		
		
		System.out.println("Escribe dos numeros: ");
		num1 = sumaresta.nextInt();
		num2 = sumaresta.nextInt();
		
		System.out.println("Si quieres sumar escribe 1 o si quieres restar pulsa 2");
		operacion = sumaresta.nextInt();
		
		
		if (operacion == 1) {
			System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
		}
		else if (operacion == 2) {
			System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
		}
		else {
			System.out.println("Escribiste mal si queres sumar o restar");
		}
		
		
		
		
		
		
		sumaresta.close();
		
	}

}
