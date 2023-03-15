package Media;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class media {
	
	public static void main(String[] args) {
		leerFichero("ejemplo_02.txt");
	}
	
	private static void leerFichero(String nombreFichero) {
		String arrays [] = new String [0];
		String cadena;
		double a = 0;
		double bb = 0;
		try {
			FileReader lector = new FileReader (nombreFichero);
			BufferedReader b = new BufferedReader (lector);
			
			while ((cadena = b.readLine()) != null) {
				
				arrays = cadena.split(" ");
				
				for (int i = 0; i < arrays.length; i++) {
					a = Double.parseDouble(arrays[i]);
					
					bb = a + bb; 
				}
				
				bb = bb/arrays.length;
				
				System.out.println(cadena);
			}
			FileWriter escritor = new FileWriter (nombreFichero, true);
			BufferedWriter bw = new BufferedWriter (escritor);
			
			bw.newLine();
			bw.write("La media es: " + bb);
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

