package Primer_trimestre;

import java.util.Scanner;

public class Ejercicio_10 {

	public static void main(String[] args) {
		int numpersona, numtotal = 0;
		Scanner num = new Scanner (System.in);
		
		do {
			System.out.println("Pon un numero y si no es cero se sumera de forma hasta que pongas 0");
			numpersona = num.nextInt();
			
			numtotal = numtotal + numpersona;
			
		}while (numpersona != 0);
		
		System.out.println("La suma de todos los numeros que has puesto es: " + numtotal);
		
		num.close();
	}

}