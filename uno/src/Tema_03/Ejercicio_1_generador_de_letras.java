package Tema_03;

public class Ejercicio_1_generador_de_letras {

	public static void main(String[] args) {
		
		int cuentavocales = 0;
		String total = "";
		
		
		
		for (char letra =  'a'; letra <= 'z'; letra++) {
			System.out.print(letra);
			total = total + letra;
			if (letra == 'a'|| letra=='e' || letra=='i'|| letra=='o' ||letra =='u');{
			cuentavocales ++;
			}
		}
		System.out.println("");
		for (char letra =  'B'; letra <= 'Z'; letra+=2) {
			System.out.print(letra);
			total = total + letra;
			if (letra == 'a'|| letra=='e' || letra=='i'|| letra=='o' ||letra =='u');{
			cuentavocales ++;
			}
		}
		System.out.println("");
		for (char letra =  'a'; letra <= 'z'; letra+=2) {
			System.out.print(letra);
			total = total + letra;
			if (letra == 'a'|| letra=='e' || letra=='i'|| letra=='o' ||letra =='u');{
			cuentavocales ++;
			}
		}
		System.out.println("");
		for (char letra =  'z'; letra >= 'a'; letra--) {
			System.out.print(letra);
			total = total + letra;
			if (letra == 'a'|| letra=='e' || letra=='i'|| letra=='o' ||letra =='u');{
			cuentavocales ++;
			}
		}
		System.out.println("");
		for (int i =  1; i <= 26; i++) {
			System.out.print("_");
		}
		System.out.println("");
		System.out.println("Has generado " + total.length() + " letras");	
		
		System.out.println("Has puesto " + cuentavocales + " vocales");
			
	
	}

}

