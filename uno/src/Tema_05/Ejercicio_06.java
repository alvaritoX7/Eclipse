package Tema_05;

import java.util.*;

public class Ejercicio_06 {

	public static void main(String[] args) {
		
		
		Scanner hola = new Scanner (System.in);
		
		int miArray [] = new int [10];
		int b;
		
		for (int i = 1; i < miArray.length; i++) {
			int a;
			a = (int) (Math.random() * 11) ;
			miArray[i] = a;
			
		}
		
		Arrays.sort(miArray);
		
		System.out.println(Arrays.toString(miArray));
		
		System.out.println("Inserta un numero para meterlo ordenado en la tabla");
		b = hola.nextInt();
		
		
		miArray = insertaOrdenado (miArray, b);
		
		System.out.println(Arrays.toString(miArray));
		
		hola.close();
		
	}
	static int[] insertaOrdenado (int n[], int valor) {
		
		
		n = Arrays.copyOf(n, n.length + 1);
		
		
		n [n.length - 1] = valor;
		
		Arrays.sort(n);
		
		return (n);
		
		
	}

}
