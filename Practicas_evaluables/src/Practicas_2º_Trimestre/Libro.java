package Practicas_2º_Trimestre;

public class Libro {
	
	private int codigo;
	private String titulo;
	private String autor;
	private boolean disponible;
	private Persona persona;
	
	
	
	public Libro(String titulo, String autor, int codigo) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.autor = autor;
		disponible = true;
	}

	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
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
	public boolean getDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public boolean prestamo () {
		boolean prestado;
		
		if (this.disponible == true && persona.getNum_prestamos() < 2) {
			
			this.disponible = false;
			prestado = true;
			persona.sumaPrestamos();
		}
		else {
			
			prestado = false;
		}
		return prestado;		
	}
	
	
	public boolean devolucion () {
		boolean devuelve;
		
		if (this.disponible == false && persona.getNum_prestamos() < 3) {
			
			this.disponible = true;
			devuelve = true;
			persona.restaPrestamos();
		}
		else {
			devuelve = false;
		}
		
		return devuelve;
	}
	
	public String toString () {
		if (disponible == true) {
			return "El libro se titula  " + this.titulo + "  con codigo:  "+ this.codigo +"  y el autor es  "+ this.autor  + ",  disponibilidad:  " + this.disponible;
		}
		else {
			return "El libro se titula  " + this.titulo + "  con codigo:  "+ this.codigo +"  y el autor es  "+ this.autor  + ",  disponibilidad:  " + this.disponible + 
					". Porque lo tiene prestado: " + persona.getNombre();
		}
		
	}
	
	
	public boolean comparacion (Libro otro) {
		boolean compara;
		
		if (otro.titulo.compareToIgnoreCase(this.titulo) == 0) {
			
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
}
