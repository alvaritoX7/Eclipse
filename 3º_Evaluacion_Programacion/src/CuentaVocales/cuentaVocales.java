package CuentaVocales;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class cuentaVocales {
	
	public static void main(String[] args) {
		leerFichero("ejemplo.tx");
	}
	
	private static void leerFichero(String nombreFichero) {
		
		String cadena;
		int cuentaVocales = 0;
		
		try {
			FileReader lector = new FileReader (nombreFichero);
			BufferedReader b = new BufferedReader (lector);
			
			while ((cadena = b.readLine()) != null) {
				
				
				for(int i = 0; i < cadena.length() ; i++) {
					
					if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'i' || cadena.charAt(i) == 'e' || cadena.charAt(i) == 'o' || cadena.charAt(i) == 'u' || cadena.charAt(i) == 'A' || cadena.charAt(i) == 'E' || cadena.charAt(i) == 'I' || cadena.charAt(i) == 'O' || cadena.charAt(i) == 'U') {
						cuentaVocales ++;
					}
					
				}
				
				
				System.out.println(cadena);
			}
			FileWriter escritor = new FileWriter (nombreFichero, true);
			BufferedWriter bw = new BufferedWriter (escritor);
			
			bw.write("Hay: " + cuentaVocales + " vocales");
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
