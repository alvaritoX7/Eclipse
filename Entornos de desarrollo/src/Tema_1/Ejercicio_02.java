package Tema_1;

import java.util.*;

public class Ejercicio_02 {

	public static void main(String[] args) {
		
		Scanner par = new Scanner (System.in);
		
		System.out.println("Dime un numero para ver si es par");
		 int a = par.nextInt();
		 
		 if (a == 0) {
			 System.out.println("Valor incorrecto");
		 }
		 else if ((a<0) || (a>100)){
			 System.out.println("Numero introducido fuera de rango");
		 }
		 else {
			 if (a%2 == 0) {
				 System.out.println("El numero es par");
			 }
			 else {
				 
			 }
		 }
		
		
		
		
		
		
		
	}

}
