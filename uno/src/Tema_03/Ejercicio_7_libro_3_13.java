package Tema_03;

import java.util.*;

public class Ejercicio_7_libro_3_13 {

	public static void main(String[] args) {
		
		
		
		Scanner hora = new Scanner (System.in);
		
		int h, min, s, sec;
		
		System.out.println("Dime la hora que es: ");
		h = hora.nextInt();
		System.out.println("Dime los minutos que son: ");
		min = hora.nextInt();
		System.out.println("Dime los segundos que son: ");
		s = hora.nextInt();
		System.out.println("Cuantos segundos deseas incrementar: ");
		sec = hora.nextInt();		
		
		
		s = s + sec;
		
		min = (s/60) + min; 
		
		h = (min/60) + h;
		
		while (s>=60) {
			s = s - 60;
		}
		
		while (min>=60) {
			min = min - 60;
		}
		
		while (h>=24) {
			
			h = h - min;
		}
		
		System.out.println("Son las " + h + ":" + min + ":" + s);
		
		
		
		
		hora.close();
		
	}

}
