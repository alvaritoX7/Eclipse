package Tema_01;

import java.util.*;

public class Ejercicio_07_1 {

	public static void main(String[] args) {
		
		Scanner nota = new Scanner (System.in);
		int media;
		
		
		System.out.println("Ponme la nota que has sacado");
		media = nota.nextInt();
		
		if (media < 5) {
			System.out.println("Insuficiente");
		}
		else if (media >= 5 && media < 6) {
			System.out.println("Suficiente");
		}
		else if (media >= 6 && media < 7) {
			System.out.println("Bien");
		}
		else if (media >= 7 && media < 9) {
			System.out.println("Notable");
		}
		else {
				System.out.println("Sobresaliente");
		}
		
		
		
		
		
		
		
		
		
		
		
		nota.close();
	}

}
