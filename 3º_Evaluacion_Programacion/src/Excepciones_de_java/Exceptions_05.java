package Excepciones_de_java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exceptions_05 {

	public static void main(String[] args) {
		leeryEscribirFichero("ejemplo_01.txt");
	}
	
	private static void leeryEscribirFichero(String nombreFichero) {
		
		String cadena;
		
		try {
			FileReader lector = new FileReader (nombreFichero);
			BufferedReader b = new BufferedReader (lector);
			
			while ((cadena = b.readLine()) != null) {
				System.out.println(cadena);
			}
			FileWriter escritor = new FileWriter (nombreFichero, true);
			BufferedWriter bw = new BufferedWriter (escritor);
			
			bw.write("Escribimos desde el progama");
			bw.newLine();
			bw.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado");
		}
		catch (IOException io) {
			System.out.println("Algun problema con la lectura o escritura");
			System.out.println(io.toString());
		}
		
	}

}
