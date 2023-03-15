package Tema_03;

import java.util.*;

public class Ejercicio_2 {

	public static void main(String[] args) {
		
		
		int num, total=0, x=1, usuario;
		double media;
		
		Scanner sumamedia = new Scanner (System.in);
		System.out.println("Cuantos numeros quuieres calcular: ");
		usuario = sumamedia.nextInt();
		if (usuario<=0) {
			System.out.println("Fin del programa");
		}
		else {
			while (x<=usuario) {
				System.out.println("Escribe " + usuario + " numero/numeros");
				num = sumamedia.nextInt();
				total = total + num;
				x++;
			}
			System.out.println("La suma es: " + total);
			
			media = total/usuario;
			System.out.println("La media es: " + media);
		}
		
	
		
		
		

		
		
	sumamedia.close();
	}

}
