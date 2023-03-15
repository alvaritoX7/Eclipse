package Practicas_2ª_Evaluación_Navidades;

import java.util.*;

public class Biblioteca {

	public static void main(String[] args) {
		
		boolean salir = true;
		Scanner sc = new Scanner (System.in);
		Libro listado_libros [] = new Libro [0];
		
		Libro libro_1 = new Libro ();
		Libro libro_2 = new Libro ();
		
		do {
			System.out.println("1. Listado de libros en la biblioteca");
			System.out.println("2. Nuevo libro");
			System.out.println("3. Modificar un libro");
			System.out.println("4. Prestar un libro");
			System.out.println("5. Devolver un libro");
			System.out.println("6. Comparar 2 libros");
			System.out.println("7. Borrar libro");
			System.out.println("8. Salir de la biblioteca");
			int agenda = sc.nextInt();
			System.out.println();
			
			if (agenda == 1) {
				System.out.println(listado_libros);
			}
			else if (agenda == 2) {
				
			}
			else if (agenda == 3) {
				
			}
			else if (agenda == 4) {
				
			}
			else if (agenda == 5) {
				
			}
			else if (agenda == 6) {
				System.out.println("Que dos libros quieres comparar");
				String libro1 = sc.next();
				String libro2 = sc.next();
				
				System.out.println(libro_1.comparacion(libro_2));
			}
			else if (agenda == 7) {
				
				
				
				
				
			}
			else if (agenda == 8) {
				salir = false;
			}
			
			
			
			
			
			
		}while (salir == true);
		
		System.out.println("Saliste de la agenda");

	}

}








