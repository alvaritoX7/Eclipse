package Objeto;

import java.util.*;

public class prueba_Cubo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		Cubo cubo1 = new Cubo(5);
		
		cubo1.llenar();
		
		cubo1.pinta_cubo();
		
		System.out.println(cubo1.capacidad);
		
		System.out.println(cubo1.getCapacidad());
		
		Cubo cubo3 = new Cubo(3);
		
		System.out.println("el contenido es " + cubo3.getContenido());
		
		cubo3.llenar();
		
		cubo3.vacaiar();;
		
		System.out.println("el contenido es " + cubo3.getContenido());
		
		cubo1.llenar();
		
		cubo1.volcar(cubo3, 2);
		
		System.out.println("el contenido de cubo 3 es " + cubo3.getContenido());
		
		System.out.println("el contenido de cubo 1 es " + cubo1.getContenido());
		
		
	}

}
