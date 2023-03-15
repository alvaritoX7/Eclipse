package Objeto;

public class Calendario {
	
	int dia, mes, anno;
	
	Calendario(int d, int m, int a){
		this.dia = d;
		this.mes = m;
		this.anno = a;
	}
	
	public String toString () {
		return "La fecha es: " + dia + " / " + mes + " / " + anno;
	}
	
	void incrementaDia() {
		
		if(this.mes == 2) {
			if (this.dia == 28) {
				this.dia = 1;
				this.mes++;
			
			}
			else {
				this.dia++;
			}
		}
		else if (this.mes < 12){
			if (this.mes%2 != 0) {
				if (this.dia == 30) {
					this.dia = 1;
					this.mes++;
				
				}
				else if (this.dia<30) {
					this.dia++;
				}
			}
			else {
				if (dia<31) {
					dia++;
				}
				else {
					this.dia = 1;
					this.mes++;
				}
			}
		}
		else {
			if (this.dia == 31) {
				this.dia = 1;
				this.mes = 1;
				this.anno++;
			
			}
			else if (this.dia<30) {
				this.dia++;
			}
		}
	}
	
	void incrementaMes() {
		
	}
	
	void incrementaAño(int cantidad) {
		
	}
	
	void mostrar() {
		
	}
	
	int getDia(){
		return dia;
		
	}
	
	int getMes() {
		return mes;
	}
	
	int getAnno() {
		return anno;
	}
	
	void setDia (int dia) {
		this.dia = dia;
	}
	
	void setMes (int mes) {
		this.mes = mes;
	}
	void setAnno (int anno) {
		this.anno = anno;
	}

	
}
