package Primer_trimestre;

import java.util.*;

public class Ejercicio_12 {

	public static void main(String[] args) {
		
		Scanner primo = new Scanner (System.in);
		int j, numusuario, primos = 0;
		boolean numprimo;
		
		
		System.out.print("Introduce un numero para ver cuantos numeros primos hay desde el 1 al numero que pongas: ");
		numusuario=primo.nextInt();

		for(int i=1; i<=numusuario; i++){

		numprimo=true;
		
		j=2;
			while ((j <= i-1 ) && (numprimo == true)){
				if (i%j==0) {
					numprimo=false;
				}
				
				j++;
			}
		
			if (numprimo == true){
				primos++; 
				
				System.out.println("El numero " + i + " es primo");
			}
		}
		
		
		System.out.println("Del 1 al " + numusuario + ", hay "+ primos + " números primos");
		
		 
		
		primo.close();
	}

}
