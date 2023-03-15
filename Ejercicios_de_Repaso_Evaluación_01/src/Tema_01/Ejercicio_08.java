package Tema_01;

import java.util.*;

public class Ejercicio_08 {

	public static void main(String[] args) {
		
		
		Scanner local = new Scanner (System.in);
		int entradas_totales, entradas_vendidas, precio_entrada = 10, descuento;
		
		
		System.out.println("Cuanto aforo local hay");
		entradas_totales = local.nextInt();
		
		System.out.println("Cuanto entradas han vendido");
		entradas_vendidas = local.nextInt();
		
		if (entradas_vendidas * 100 / entradas_totales >= 50) {
			
			entradas_vendidas = entradas_vendidas * precio_entrada;
			System.out.println("Precio total " + entradas_vendidas + " €");
		}
		else if (entradas_vendidas * 100 / entradas_totales < 50 && entradas_vendidas * 100 / entradas_totales > 20) {
			
			entradas_vendidas = entradas_vendidas * precio_entrada;
			descuento = (int) (entradas_vendidas * 0.25);
			entradas_vendidas = entradas_vendidas - descuento;
			System.out.println("Precio total " + entradas_vendidas + " €");
		}
		else {
			System.out.println("No supera al 20% del local asi que se cancela el concierto");
		}
		
		
		
		
		
		
		
		
		
		
		local.close();
	}

}
