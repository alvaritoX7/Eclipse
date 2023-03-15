package Ejercicios_tema_04;

import java.util.*;

public class Ejercicio_4_13 {

	public static void main(String[] args) {
		Scanner par = new Scanner (System.in);
		System.out.println("Dime un numero para ponerte todos esos pares");
		int numero1 = par.nextInt();
		
		System.out.println(espar(numero1));
		
		par.close();
	}
	static boolean espar(int a) {
		boolean par = false;
		if (a%2 == 0) {
			par = true;
		}
		return par;
	}
	
}
	

