package Objeto;

public class Cubo {
	
	int contenido, capacidad;
	
	
	Cubo(int capa){
		this.capacidad = capa;
	}
	
	void vacaiar(){
		this.contenido = 0;
	}
	
	void vaciar (int c) {
		if (c>contenido || contenido - c < 0 ) {
			contenido = 0;
		}
		else {
			contenido -= c;
		}
		
	}
	
	void llenar() {
		this.contenido = this.capacidad;
	}
	
	void volcar (Cubo destino, int cantidad) {
		this.contenido = this.contenido - cantidad;
		destino.contenido = destino.contenido + capacidad;
	}
	
	int getCapacidad () {
		return this.capacidad;
	}
	
	int getContenido () {
		return this.contenido;
	}
	
	void setContenido(int con) {
		this.contenido = con;
	}
	
	void pinta_cubo () {
		for (int i = this.capacidad; i > 0; i-- ) {
			if (i == contenido || contenido > i) {
				if (i == 1) {
					System.out.println("|----------|");
				}
				else {
					System.out.println("|^^^^^^^^^^|");
				}
				
			}
			else if (i == 1) {
				System.out.println("|__________|");
			}
			else {
				System.out.println("|          |");
			}
		}
		
	}
	
	
	
	
	
	
	
	
	
	
}
