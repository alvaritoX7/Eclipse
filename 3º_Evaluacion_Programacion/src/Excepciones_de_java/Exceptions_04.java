package Excepciones_de_java;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exceptions_04 {
	
	public static void main(String[] args) {
		leerFichero("ejemplo.txt");
	}
	
	private static void leerFichero(String nombreFichero) {
		
		String cadena;
		
		try {
			FileReader lector = new FileReader (nombreFichero);
			BufferedReader b = new BufferedReader (lector);
			
			while ((cadena = b.readLine()) != null) {
				System.out.println(cadena);
			}
		}
		catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado");
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
