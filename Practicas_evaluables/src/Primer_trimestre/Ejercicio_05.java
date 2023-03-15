package Primer_trimestre;

import java.util.*;

public class Ejercicio_05 {

	public static void main(String[] args) {
		
	
		int num1, num2;
		boolean b1=false, b2=false;
		
		Scanner bombilla = new Scanner(System.in);
		
		
		System.out.println("Introduzca dos numeros");
		System.out.println("Si su suma es mayor a tres dígitos se encendera la bombilla 1 y sino se encendera la bombilla2");
		num1 = bombilla.nextInt();
		num2 = bombilla.nextInt();
		
		if ((((num1<100) && (num1>=0)) && ((num2<10) && (num2>=0))) || (((num2<100) && (num2>=0)) && ((num1<10) && (num1>=0))) || (((num1>-100) && (num1<=0)) && ((num2>-10) && (num2<=0))) || (((num2>-100) && (num2<=0)) && ((num1>-10) && (num1<=0)))){
			b2 = true;
		}
		
		
		else {
			b1 = true;
		}

		System.out.println("Bombilla 1: " + b1);
		System.out.println("Bombilla 2: " + b2);
		
		bombilla.close();
}

}