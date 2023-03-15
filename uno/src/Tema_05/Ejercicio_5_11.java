package Tema_05;

import java.util.*;

public class Ejercicio_5_11 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		
		int ArraysOriginal [] = {3, 4, 3, 7, 5};
		
		System.out.println(Arrays.toString(ArraysOriginal));
		
		int aBuscar = 3;
		int indices[] = buscarTodos (ArraysOriginal, aBuscar);
		
		System.out.println("El numero " + aBuscar + " se encuentra en los indices");
		System.out.println(Arrays.toString(indices));
		
		
		sc.close();
	}
	static int [] buscarTodos(int t[], int clave) {
		int encontradoEn[] = new int [0];
		for (int i = 0; i < t.length - 1; i++){
				if (t[i] == clave) {
					encontradoEn = Arrays.copyOf(encontradoEn, encontradoEn.length + 1);
					encontradoEn [encontradoEn.length - 1] = i;
			}
			
		}
		return encontradoEn;
	}

}
