package Ejercicios_tema_03;

import java.util.*;

public class Ejercicio_email_valido {

	public static void main(String[] args) {
		
		//1 @ y 1. y tiene que terminar en .com o .org con substring
		
		int Cuenta_arrobas = 0, Cuenta_puntos = 0;
		
		Scanner email = new Scanner (System.in);
		System.out.println("Pon un email valido");
		System.out.println("Tiene que contener 1@, 1. y tiene que terminar con .com o .org");
		String gmail = email.nextLine();
		int longitud = gmail.length()-1 ;
		String a = ".com", b = ".org";
		
		
		for (int i = 0; i <= longitud; i++) {
			if (gmail.charAt(i) == '@')
				Cuenta_arrobas++;
				
			if (gmail.charAt(i) == '.')
				Cuenta_puntos++;
			
		}
		
			
		if ((Cuenta_arrobas == 1)&&(Cuenta_puntos == 1)){
			if ((gmail.substring(longitud - 3).compareTo(a)==0) || (gmail.substring(longitud - 3).compareTo(b) == 0)) {
				System.out.println("Tu email es valido");
			}
			else {
				System.out.println("Tu email no es valido");
			}
		}
		
		else {
			System.out.println("Tu email no es valido");
		}
			
		email.close();
		
	}

}
