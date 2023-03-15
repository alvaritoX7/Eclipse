package Tema_01;

import java.util.*;

public class Ejercicio_04 {

	public static void main(String[] args) {
		
		Scanner tiempo = new Scanner (System.in);
		
		int segundos, min, hora;
		
		
		System.out.println("Dime segundos pàra pasarlos a horas,  mins y segundos");
		segundos = tiempo.nextInt();
		
		
		
		hora = segundos / 3600;
			
		min = segundos % 3600;
		
		min = segundos / 60;
		
		
		
		
		
		tiempo.close();
	}

}
