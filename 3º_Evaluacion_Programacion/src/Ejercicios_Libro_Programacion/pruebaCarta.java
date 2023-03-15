package Ejercicios_Libro_Programacion;

import java.util.Arrays;

public class pruebaCarta {

	public static void main(String[] args) {
		
		Carta [] cartas = new Carta [3]; 

		Carta c1 = new Carta (0, Palo.BASTOS);
		
		Carta c2;
		
		c2 = Carta.num_carta_aleatoria();
		
		Carta c3 = new Carta (12, Palo.OROS);
		
		cartas [0] = c1;
		cartas [1] = c2;
		cartas [2] = c3;
		
		System.out.println(c2);
		
		Arrays.sort(cartas);
		
		System.out.println(Arrays.toString(cartas));
		
		
		
	}

}
