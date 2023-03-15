package Tema_01;

import java.util.Scanner;

public class Ejercicio_07_2 {

	public static void main(String[] args) {
		
		Scanner nota = new Scanner (System.in);
		int media;
		
		
		System.out.println("Ponme la nota que has sacado");
		media = nota.nextInt();
		
		switch (media) {
			case 0, 1, 2, 3, 4: System.out.print("Insuficiente ");
			break;
			case 5: System.out.print("Suficiente ");
			break;
			case 6: System.out.print("Bien ");
			break;
			case 7, 8: System.out.print("Notable ");
			break;
			case 9, 10: System.out.print("Sobresaliente ");
			break;
		}
		
		nota.close();
	}

}
