package Practicas_2º_Trimestre;

import java.util.*;

public class Biblioteca {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("De cuanto espacio quieres que sea la biblioteca");
		
		int espacio = sc.nextInt();
		Libro [] biblio = new Libro [espacio];
		
		Persona p1 = new Persona ("Paco", "p1");
		Persona p2 = new Persona ("Pepe", "p2");
		Persona p3 = new Persona ("Maria", "p3");
		
		int i = 0;
		
		do {
			i = menu(i);
			menu2(biblio, i, espacio, p1, p2, p3);
		}while(i != 8);
		
	}
	
	public static int menu(int i) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("1. Listado de libros en la biblioteca");
		System.out.println("2. Nuevo libro");
		System.out.println("3. Modificar un libro");
		System.out.println("4. Prestar un libro");
		System.out.println("5. Devolver un libro");
		System.out.println("6. Comparar 2 libros");
		System.out.println("7. Borrar libro");
		System.out.println("8. Salir de la biblioteca");
		i = sc.nextInt();
		
		return i;
	}
	
	public static void menu2 ( Libro biblio[], int i, int espacio, Persona p1, Persona p2, Persona p3){
		if (i == 1) {
			listarLibros(biblio, espacio);
		}
		else if (i == 2) {
			biblio=nuevoLibro(biblio, espacio);
		}
		else if (i == 3) {
			modificarLibro(biblio, espacio);
		}
		else if (i == 4) {
			prestamoLibro(biblio, espacio, p1, p2, p3);
		}
		else if (i == 5) {
			devolucionLibro(biblio, espacio, p1, p2, p3);
		}
		else if (i == 6) {
			comparacionLibros(biblio, espacio);
		}
		else if (i == 7) {
			borrarLibro(biblio, espacio);
		}
		else if (i == 8) {
			System.out.println("Saliste de la biblioteca");
		}
		else {
			System.out.println();
			System.out.println("Tecleaste mal");
			System.out.println();
		}
	}

	public static void listarLibros(Libro biblio [], int espacio) {
		
		for (int colocacion_libro = 0; colocacion_libro < espacio; colocacion_libro++) {
			if (biblio [colocacion_libro]!= null) {
				System.out.println(biblio[colocacion_libro].toString()); 
			}
		}
	}
	
	public static Libro [] nuevoLibro(Libro biblioteca[], int espacio) {
		Scanner sc2 = new Scanner(System.in);
		int i = 0;
		String a = "La biblioteca esta llena de libros";
		String b = "La biblioteca esta llena de libros";
		for (int colocacion_libro = 0; colocacion_libro < espacio && i != 1; colocacion_libro++) {
			if (biblioteca[colocacion_libro] == null) {
			System.out.println("titulo del libro: ");
			String titulo = sc2.nextLine();
		
			System.out.println("Nombre del autor: ");
			String autor = sc2.nextLine();
			
			biblioteca[colocacion_libro] = new Libro(titulo, autor, colocacion_libro);
			
			System.out.println("El codigo del nuevo libro es: " + biblioteca[colocacion_libro].getCodigo());
			System.out.println();
			
			i++;
			}
			else if (biblioteca[espacio - 1] != null   &&    a.compareToIgnoreCase(b) == 0){
				b = "";
				System.out.println(a);
				System.out.println();
			}
		
		}
		
		return biblioteca;
	}
	
	public static void modificarLibro(Libro biblio[], int espacio) {
		Scanner sc3 =new Scanner(System.in);
		
		System.out.println("Codigo del libro: ");
		int o = sc3.nextInt();
		
		
		
		for (int colocacion = 0; colocacion < biblio.length; colocacion++) {
			
			if (o == colocacion && biblio[o] != null) {
				 
				
				System.out.println("Titulo del libro: ");
				 String titulo = sc3.next();
				 biblio[o].setTitulo(titulo);
			
				 System.out.println("Nombre del autor: ");
				 String autor = sc3.next();
				 biblio[o].setAutor(autor);
				 
				 
				 
			}
		}
		
		
		
	}
	
	public static void prestamoLibro(Libro biblioteca[], int espacio, Persona p1, Persona p2, Persona p3) {
		Scanner sc4 =new Scanner(System.in);
		
		System.out.println("Dime el codigo del libro que quieres coger");
		int cod_libro = sc4.nextInt();
		
		if (cod_libro >= espacio || cod_libro < 0 || biblioteca[cod_libro] == null) {
			System.out.println("No hay libros con ese codigo");
		}
		else {
			System.out.println("Que persona quieres que haga el prestamo");
			String p = sc4.next();
			
			if (p.compareToIgnoreCase(p1.getCod_persona()) == 0) {
				biblioteca[cod_libro].setPersona(p1);
				if (biblioteca[cod_libro].prestamo() == true) {
					System.out.println(p1.getNombre() + " lo ha cogido prestado");
				}
				else {
					System.out.println("No esta disponible ese libro");
				}
				
			}
			
			else if (p.compareToIgnoreCase(p2.getCod_persona()) == 0) {
				biblioteca[cod_libro].setPersona(p2);
				if (biblioteca[cod_libro].prestamo() == true) {
					System.out.println(p2.getNombre() + " lo ha cogido prestado");
				}
				else {
					System.out.println("No esta disponible ese libro");
				}
			}
			
			else if (p.compareToIgnoreCase(p3.getCod_persona()) == 0) {
				biblioteca[cod_libro].setPersona(p3);
				if (biblioteca[cod_libro].prestamo() == true) {
					System.out.println(p3.getNombre() + " lo ha cogido prestado");
				}
				else {
					System.out.println("No esta disponible ese libro");
				}
			}
			
		}
		
	}
	
	public static void devolucionLibro(Libro biblioteca[], int espacio, Persona p1, Persona p2, Persona p3) {
		Scanner sc5 =new Scanner(System.in);
		
		System.out.println("Dime el codigo del libro que quieres devolver");
		int cod_libro = sc5.nextInt();
		
		if (cod_libro >= espacio || cod_libro < 0 || biblioteca[cod_libro] == null) {
			System.out.println("No hay libros con ese codigo");
		}
		else {
			System.out.println("Que persona quieres que devuelva el libro");
			String p = sc5.next();
			
			if (p.compareToIgnoreCase(p1.getCod_persona()) == 0) {
				biblioteca[cod_libro].setPersona(p1);
				if (biblioteca[cod_libro].devolucion() == true) {
					System.out.println(p1.getNombre() + " lo ha devuelto");
				}
				else {
					System.out.println("No puede devolver el libro porque " + p1.getNombre() + " no lo ha cogido prestado");
				}
			}
			
			else if (p.compareToIgnoreCase(p2.getCod_persona()) == 0) {
				biblioteca[cod_libro].setPersona(p2);
				if (biblioteca[cod_libro].devolucion() == true) {
					System.out.println(p1.getNombre() + " lo ha devuelto");
				}
				else {
					System.out.println("No puede devolver el libro porque " + p2.getNombre() + " no lo ha cogido prestado");
				}
			}
			
			else if (p.compareToIgnoreCase(p3.getCod_persona()) == 0) {
				biblioteca[cod_libro].setPersona(p3);
				if (biblioteca[cod_libro].devolucion() == true) {
					System.out.println(p1.getNombre() + " lo ha devuelto");
				}
				else {
					System.out.println("No puede devolver el libro porque " + p3.getNombre() + " no lo ha cogido prestado");
				}
			}
			
		}
	}
	
	public static void comparacionLibros(Libro biblioteca[], int espacio) {
		Scanner sc6 =new Scanner(System.in);
		
			System.out.println("Codigo del libro 1: ");
			int cod_libro1 = sc6.nextInt();
		
			System.out.println("Codigo del libro 2: ");
			int cod_libro2 = sc6.nextInt();
			
			if (cod_libro1 >= espacio || cod_libro2 >= espacio || cod_libro1 < 0 || cod_libro2 < 0 || biblioteca[cod_libro1] == null ||  biblioteca[cod_libro2] == null) {
				System.out.println("Los codigos que tecleaste estan mal");
			}
			else {
				System.out.println();
				if (biblioteca[cod_libro1].comparacion(biblioteca[cod_libro2]) == true) {
					System.out.println("Son iguales");
				}
				else {
					System.out.println("No son iguales");
					
				}
			}
			System.out.println();		
	}
	
	public static void borrarLibro (Libro biblioteca [], int espacio) {
		Scanner sc7 =new Scanner(System.in);
		
		System.out.println("Dime el codigo del libro que quieres borrar");
		int cod_libro = sc7.nextInt();
			
			if (cod_libro >= espacio || cod_libro < 0 || biblioteca[cod_libro] == null ||  biblioteca[cod_libro] == null) {
				System.out.println("No hay libros con ese codigo");
			}
			else if (biblioteca[cod_libro].getDisponible() == false) {
				System.out.println("No se pueden borrar libros que esten prestados");
			}
			else {
				biblioteca [cod_libro] = null;
			}
	}
}