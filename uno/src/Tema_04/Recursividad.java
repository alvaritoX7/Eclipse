package Tema_04;

public class Recursividad {

	public static void main(String[] args) {
		
		String palabra = "alo";
		
		System.out.println(invertirPalabra(palabra, palabra.length()-1));
		
		
	}
	
	static String invertirPalabra (String palabra, int longitud) {
		
		if (longitud == 0) {
			return palabra.charAt(longitud) + "";
		}
		else {
			return palabra.charAt(longitud) + invertirPalabra(palabra, longitud - 1);
		}
	}
}
