package Primer_trimestre;

import java.util.*;

public class Ejercicio_07 {

	public static void main(String[] args) {
		
		Scanner numero = new Scanner (System.in);
		int digito1, digito2, numero1;
		
		System.out.println("Dime un numero del o al 99");
		numero1 = numero.nextInt();
		
		if ((numero1 >= 20) && (numero1<100)){
			digito2 = numero1/10;
			switch (digito2) {
				case 2: System.out.print("Veinte ");
				break;
				case 3: System.out.print("Treinta ");
				break;
				case 4: System.out.print("Cuarenta ");
				break;
				case 5: System.out.print("Cincuenta ");
				break;
				case 6: System.out.print("Sesenta ");
				break;
				case 7: System.out.print("Setenta ");
				break;
				case 8: System.out.print("Ochenta ");
				break;
				case 9: System.out.print("Noventa ");
				break;
			}
			
		}
		
		else if (numero1 == 0) {
			System.out.println("Cero");
		}
		else if ((numero1 >= 10) && (numero1<20)){
			switch(numero1) {
				case 10: System.out.print("Diez");
				break;
				case 11: System.out.print("Once");
				break;
				case 12: System.out.print("Doce");
				break;
				case 13: System.out.print("Trece");
				break;
				case 14: System.out.print("Catorce");
				break;
				case 15: System.out.print("Quince");
				break;
				case 16: System.out.print("Dieciseis");
				break;
				case 17: System.out.print("Diecisiete");
				break;
				case 18: System.out.print("Dieciocho");
				break;
				case 19: System.out.print("Diecinueve");
				break;
			}
		}
		if ((numero1 > 20 ) && (numero1 != 30) && (numero1 != 40) && (numero1 != 50) && (numero1 != 60) && (numero1 != 70) && (numero1 != 80) && (numero1 != 90)){
			System.out.print("y ");
		}
		
		
		digito1 = numero1 % 10;
		
		if(((digito1 >= 1)) && ((numero1 > 19) || (numero1 < 10)) ){
			
			
			switch (digito1) {
				case 1: System.out.print("uno");
				break;
				case 2: System.out.print("dos");
				break;
				case 3: System.out.print("tres");
				break;
				case 4: System.out.print("cuatro");
				break;
				case 5: System.out.print("cinco");
				break;
				case 6: System.out.print("seis");
				break;
				case 7: System.out.print("siete");
				break;
				case 8: System.out.print("ocho");
				break;
				case 9: System.out.print("nueve");
				break;
			}
		}
		
		
		
		
		numero.close();
		
	}

}
