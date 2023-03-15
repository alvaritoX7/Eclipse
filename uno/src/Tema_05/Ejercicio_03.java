package Tema_05;

import java.util.*;

public class Ejercicio_03 {

	public static void main(String[] args) {
		
		Scanner colores = new Scanner (System.in);
		System.out.println("Dime cuatro colores:");
		
		String color1 = colores.next();
		String color2 = colores.next();
		String color3 = colores.next();
		String color4 = colores.next();
		
		String Color [] = new String[4];
		Color [0] = color1;
		Color [1] = color2;
		Color [2] = color3;
		Color [3] = color4;
		
		System.out.println(Color [0] + ", " + Color [1] + ", " + Color [2] + ", " + Color [3]);
		colores.close();
		
	}

}
