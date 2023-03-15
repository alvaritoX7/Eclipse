package Tema_02;

import java.util.*;

public class Swich {

	public static void main(String[] args) {
		
		
		int nota;
		
		Scanner curso = new Scanner (System.in);
		System.out.println("Pon tu nota");
		nota = curso.nextInt();
		
		switch (nota) {
		   case 0,1,2,3,4 -> {
			   System.out.println("Has suspendido.");
			   System.out.println("Animo...");
			}
		   case 5 ->
		   System.out.println("Has aprobado.");
		   case 6 -> 
		   System.out.println("Bien.");
		   case 7, 8 ->
		   System.out.println("Notable.");
		   case 9, 10 ->{
		   System.out.println("Sobresaliente.");
		   System.out.println("Enhorabuena.");
		   }
		default -> {
		System.out.println("Nota incorrecta");
		


	curso.close();
		}
		}
	}
}
