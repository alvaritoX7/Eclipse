package Tema_2;

import java.util.*;

public class notaif {

	public static void main(String[] args) {
		
		double nota;
		
		Scanner curso = new Scanner (System.in);
		
		System.out.println("Pon tu nota sacada:");
		nota = curso.nextDouble();
		
		if (nota<5) {
			System.out.println("Has suspendido.");
			System.out.println("Ánimo...");
		}
		else if (5 < nota && nota < 6) {
			System.out.println("Has aprobado.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		curso.close();
		
	}

}
