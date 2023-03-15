package Objeto_03;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
		Yema miYema = new Yema ();
		Clara miClara = new Clara(3.4);
		Huevo h = new Huevo (miYema, miClara);
		
		Yema miYema2 = new Yema ("Naranja");
		Clara miClara2 = new Clara(2);
		Huevo h2 = new Huevo (miYema2, miClara2);
		
		Yema[] yemas = new Yema [2];
		
		
		
		System.out.println(Arrays.toString(h.getYema()));
		
		
		System.out.println(h);
		System.out.println(h2);
		
		System.out.println(h.equals(h2));
		
		if (h.equals(h2)) {
			System.out.println("Los huevos son iguales");
		}
		else {
			System.out.println("Son distintos");
		}
		
		
		
		
		
		
	}

}
