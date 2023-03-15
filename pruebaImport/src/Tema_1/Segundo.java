package Tema_1;

import java.util.*;

public class Segundo {

	public static void main(String[] args) {
	
		double a, b, c, x, y;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Dime el valor de a: ");
		a = teclado.nextDouble();
		
		System.out.println("Dime el valor de b: ");
		b = teclado.nextDouble();
		
		System.out.println("Dime el valor de c: ");
		c = teclado.nextDouble();
		
		System.out.println("Dime el valor de x: ");
		x = teclado.nextDouble();
		
		y = (a*Math.pow (x,2)+(b*x)+c);
		
		System.out.println("El problema da: " + y);
		
		teclado.close();

	}

}
