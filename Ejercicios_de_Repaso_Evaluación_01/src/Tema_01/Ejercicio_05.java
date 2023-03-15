package Tema_01;

import java.util.*;

public class Ejercicio_05 {

	public static void main(String[] args) {
		
		Scanner operacion = new Scanner (System.in);
		
		double num1, num2;
		
		System.out.println("Dime dos numeros");
		num1 = operacion.nextInt();
		num2 = operacion.nextInt();
		
		System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
		System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
		System.out.println("La media es: " + (num1+num2)/2);
		
		operacion.close();
	}

}
