package Objeto_02;
import java.util.*;
public class Libro {
	
	private String titulo_libro;
	private String autor;
	private int num_ejemplares_libro;
	private int num_ejemplares_prestado;
	
	
	public Libro() {
		this.titulo_libro = "Pendiente";
		this.autor = "Pendiente";
		this.num_ejemplares_libro = 10;
		this.num_ejemplares_prestado = 0;
		
	}
	
	public Libro (String titulo_libro, String autor, int num_ejemplares_libro, int num_ejemplares_prestado) {
		
		this.titulo_libro = titulo_libro;
		this.autor = autor;
		this.num_ejemplares_libro = num_ejemplares_libro;
		this.num_ejemplares_prestado = num_ejemplares_prestado;
		
		
	}
	
	public String gettitulo_libro() {
		return this.titulo_libro;
	}
	
	public String getautor () {
		return this.autor;
	}
	
	public int getnum_ejemplares_libro() {
		return this.num_ejemplares_libro;
	}
	
	public int getnum_ejemplares_prestado () {
		return this.num_ejemplares_prestado;
	}
	
	public void settitulo_libro (String titulo_libro) {
		this.titulo_libro = titulo_libro;
	}
	
	public void setautor() {
		
	}
	
	public void setnum_ejemplares_libro () {
		
	}
	
	public void setnum_ejemplares_prestado() {
		
	}
	
	
	public boolean prestamo () {
		
		boolean prestado = true;
		
		if (num_ejemplares_libro > num_ejemplares_prestado) {
			
			num_ejemplares_prestado ++;
			prestado = true;
		}
		else {
			prestado = false;
		}
		return prestado;
	}
	
	public boolean devolucion () {
		boolean devuelve = true;
		
		if (num_ejemplares_libro >= num_ejemplares_prestado && num_ejemplares_prestado > 0) {
			
			num_ejemplares_prestado --;
			devuelve = true;
		}
		else {
			devuelve = false;
		}
		
		return devuelve;
	}
	
	public String toString () {
		return "El libro se titula " + titulo_libro + " y el autor es "+ autor +  " quedan " + (this.num_ejemplares_libro - this.num_ejemplares_prestado) + " libros.";
	}

	public boolean comparacion (Libro otro) {
		boolean compara;
		
		if (otro.titulo_libro.compareToIgnoreCase(this.titulo_libro) == 0) {
			
			if (otro.autor.compareToIgnoreCase(autor) == 0) {
				compara = true;
			}
			else {
				compara = false;
			}
		}
		else {
			compara = false;
		}
		
		return compara;
	}
	
	public void tiempo () {
		
		String Arrays [] = new String [4];
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
