package Practicas_2ª_Evaluación_Navidades;

public class Libro {
	
	private int codigo_libro = 0;
	private String titulo;
	private String autor;
	private boolean disponible;
	private String nombre;
	private String codigo_persona;
	private int num_prestamos;
	
	public Libro() {
		this.titulo = "Sin definir";
		this.autor = "Sin definir";
	}
	
	public Libro(int codigo_libro, String titulo, String autor, boolean disponible) {
		this.codigo_libro = codigo_libro;
		this.titulo = titulo;
		this.autor = autor;
		this.disponible = disponible;
	}
	
	public Libro(String nombre, String codigo_persona, int num_prestamos) {
		this.nombre = nombre;
		this.codigo_persona = codigo_persona;
		this.num_prestamos = num_prestamos;
	}
	
	
	public Libro(int codigo_libro, String titulo, String autor, boolean disponible, String nombre, String codigo_persona, int num_prestamos) {
		this.codigo_libro = codigo_libro;
		this.titulo = titulo;
		this.autor = autor;
		this.disponible = disponible;
		this.nombre = nombre;
		this.codigo_persona = codigo_persona;
		this.num_prestamos = num_prestamos;
	}

	public int getCodigo_libro() {
		return codigo_libro;
	}
	public void setCodigo_libro(int codigo_libro) {
		this.codigo_libro = codigo_libro;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo_persona() {
		return codigo_persona;
	}

	public void setCodigo_persona(String codigo_persona) {
		this.codigo_persona = codigo_persona;
	}

	public int getNum_prestamos() {
		return num_prestamos;
	}

	public void setNum_prestamos(int num_prestamos) {
		this.num_prestamos = num_prestamos;
	}
	
	public boolean prestamo () {
		
		boolean prestado;
		
		if (disponible == true && num_prestamos < 3) {
			prestado = true;
			disponible = false;
			num_prestamos ++;
		}
		else {
			prestado = false;
		}
			
		return prestado;
	}
	
	
	public boolean devolucion () {
		
		boolean devuelto;
		
		if (disponible == false && num_prestamos < 3) {
			devuelto = true;
			disponible = true;
			num_prestamos --;
		}
		else {
			devuelto = false;
		}
			
		return devuelto;
	}
	
	
	public String toString_01 () {
		return "El libro se titula " + titulo + " con codigo " + codigo_libro + " y el autor es "+ autor +  " , disponibilidad del libro: " + disponible + " libros.";
	}
	public String toString_02 () {
		return titulo;
	}
	
	public boolean comparacion (Libro otro) {
		boolean compara;
		
		if (otro.titulo.compareToIgnoreCase(this.titulo) == 0) {
			
			if (otro.autor.compareToIgnoreCase(this.autor) == 0) {
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
