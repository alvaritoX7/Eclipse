package Tema_01;

import java.util.*;

public class ejerciciodiecinueve {

	public static void main(String[] args) {
		
		
		double niño, adulto, a, x;
		
		
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Ponga el numero de entradas de adulto que quieras: ");
		adulto = teclado.nextDouble();
		
		System.out.println("Ponga el número de entradas de niño que quiera: ");
		niño = teclado.nextDouble();
		
		
		a = (adulto*20) + (niño*15.50);
		x = a>100 ? a - (a*5/100) : (a);
		
		System.out.println("El dinero que tienes que pagar es: " + x);
		
		
		teclado.close();
	}

}