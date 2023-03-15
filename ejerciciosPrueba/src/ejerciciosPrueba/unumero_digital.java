package ejerciciosPrueba;

import java.util.*;

public class unumero_digital {

	public static void main(String[] args) {
		
		
		Scanner leer = new Scanner (System.in);
		
		int numero, unidades;
		
		System.out.println("Dime un numero");
		
		numero = leer.nextInt();
		
		while(numero>0) {
			unidades = numero % 10;
			
			System.out.print(unidades);
			if (numero>99)
			System.out.print(", ");
			else if ((numero>9)&&(numero<100))
			System.out.print(" y ");
			
			numero = numero/10;
		}
		
		
		
		leer.close();
		
	}

}
