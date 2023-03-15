package ejerciciosPrueba;

import java.util.*;

public class Bombillas {

	public static void main(String[] args) {
		
		
		int dia, mes;
		boolean b1=false, b2=false;
		
		Scanner bombilla = new Scanner(System.in);
		
		
		System.out.println("Dime un dia aleatorio: ");
		dia = bombilla.nextInt();
		System.out.println("Dime un mes aleatorio: ");
		mes = bombilla.nextInt();
		
		
		if ((dia%2 == 0)&&(mes%2 == 0)) {
			b1 = true;
		}
		else if((dia%2 !=0)||(mes%2 !=0)) {
			b2 = true;
		}
		
		
		System.out.println("Bombilla 1: " +b1 );
		System.out.println("Bombilla 2: " +b2);
		
		
		
		
		
		
		bombilla.close();
		
		
		
	}

}
