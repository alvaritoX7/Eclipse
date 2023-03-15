package Ejercicios_tema_05;

import java.util.*;

public class Arrays_de_izquierda_a_derecha_viceversa {

	public static void main(String[] args) {
		
		
		int t [] = {9, -2, 0, 3};
		
		System.out.println(Arrays.toString(t));
		
		for (int i = t.length - 1; i >= 0; i--) {
			System.out.print(t[i] + " ");
		}
		
		
		
		
	}

}
