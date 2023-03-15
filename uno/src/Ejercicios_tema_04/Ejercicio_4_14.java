package Ejercicios_tema_04;

import java.util.*;

public class Ejercicio_4_14 {

	public static void main(String[] args) {
		Scanner tiempo = new Scanner (System.in);
		int h, min, s;
		
		System.out.println("Dime horas minutos y seguindos para pasarlo a segundos");
		h = tiempo.nextInt();
		min = tiempo.nextInt();
		s = tiempo.nextInt();
		
		System.out.println(segundos(h, min, s));
		
		tiempo.close();
		
	}
	static int segundos(int a, int b, int c) {
		int  hora = a*3600;
		int minutos = b*60;
		int segundo = hora + minutos + c;
		return segundo;
	}
	
}
