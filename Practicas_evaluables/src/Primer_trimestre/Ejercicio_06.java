package Primer_trimestre;

import java.util.*;

public class Ejercicio_06 {

	public static void main(String[] args) {
		
		
		Scanner numeros = new Scanner (System.in);
		int numcapicua, operacion1, operacion2;
		
		System.out.println("Pon un numero capicua de tres cifras:");
		numcapicua = numeros.nextInt();
		
		
		operacion1 = (numcapicua % 1000 - numcapicua % 100) /100;
		operacion2 = numcapicua % 10;
		
		
		if(operacion1==operacion2) {
			System.out.println("El numero si es capicua");
		}
		else {
			System.out.println("El numero no es capicua");
		}
		
		
		
		numeros.close();
		
	}
}