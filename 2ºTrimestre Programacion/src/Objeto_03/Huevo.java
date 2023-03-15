package Objeto_03;

//Hacer array deYemas
//Hacer equals de huevo comparando objetos

public class Huevo {
	
	private Yema yema [] = new Yema [2];
	private Clara clara;
	
	Huevo (Yema y, Clara c){
		this.yema[0] = y;
		this.clara = c;
		
	}
	
	public Yema[] getYema() {
		return yema;
	}

	public void setYema(Yema[] yema) {
		this.yema = yema;
	}

	public Clara getClara () {
		return this.clara;
	}
	
	public void setClara (Clara c) {
		this.clara = c;
	}
	
	public String toString () {
		return "Huevo con yema " + yema[0].getColor() + " y clara con volumen " + clara.getVolumen();
	}
	
	@Override
	public boolean equals (Object o) {
		Huevo otro = (Huevo) o;
		
		if (this.yema[0].getColor().equals(otro.yema[0].getColor()) && this.clara.getVolumen() == otro.clara.getVolumen()) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	
	
	
}
