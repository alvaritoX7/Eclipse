package Ejercicios_tema_2;

import java.util.*;

public class Ejercicio_numeros_aleatorios {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		int resultadousuario, resultadomaquina, operacion;
		double a, b;
		
		a = (int) (Math.random() * 99) + 1;
		b = (int) (Math.random() * 99) + 1;
		
		
		
		
		System.out.println("Se generan dos números aleatorios: " + a + " y " + b);
		
		operacion = (int) (Math.random()*3) + 1;
				
				if (operacion == 1) {
					System.out.println("La operacion es suma");
					resultadomaquina = (int) (a + b);
				}
					
				else 
					if (operacion==2) {
						resultadomaquina = (int) (a -b);
						System.out.println("La operacion es una resta");
					}
					
					else {
						System.out.println("La operacion es una multiplicación");
						resultadomaquina = (int) (a * b);
					}
				
		System.out.println("Ponga el resultado de la operacion");
		resultadousuario = s.nextInt();
		
		if (resultadousuario==resultadomaquina)
			System.out.println("Eres un crack");
		else 
			System.out.println("Eres un paquete");
		
		
		
		s.close();
	}

}
