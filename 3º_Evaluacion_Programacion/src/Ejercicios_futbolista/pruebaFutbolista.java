package Ejercicios_futbolista;

import java.util.Arrays;
import java.util.Collections;

public class pruebaFutbolista {

	public static void main(String[] args) {
		
		Futbolista [] lista = new Futbolista [3];
		
		
		DNI d1 = new DNI (123, "L");
		DNI d2 = new DNI (123, "A");
		
		Futbolista f1 = new Futbolista(d1, "apa", 15, 15);
		Futbolista f2 = new Futbolista(d2, "apa", 10, 10);
		Futbolista f3 = new Futbolista(d1, "bario", 18, 9);
		f1.equals(f2);
		
		lista[0] = f1;
		lista[1] = f2;
		lista[2] = f3;
		
		Arrays.sort(lista, new ordenacionConbinado());
		
		System.out.println(Arrays.toString(lista));

	}

}
