package Ejercicios_Libro_Programacion;

public class Carta implements Comparable{
	
	
	private Palo palo;
	private int numero;
	
	
	public Carta(int numero, Palo palo) {
		
		if ((numero > 0 && numero < 8) || (numero < 13 && numero > 9) && (palo.toString().compareToIgnoreCase("Oros") == 0 || palo.toString().compareToIgnoreCase("Copas") == 0 || palo.toString().compareToIgnoreCase("Bastos") == 0 || palo.toString().compareToIgnoreCase("Espadas") == 0) ) {
			
			this.numero = numero;
			this.palo = palo;
		}
		else {
			this.numero = 1;
			this.palo = Palo.ESPADAS;
		}
	}
	
	
	public Palo getPalo() {
		return palo;
	}
	public int getNumero() {
		return numero;
	}	
	
	
	public static Carta num_carta_aleatoria () {
		int carta;
		Palo [] arrays_palos = Palo.values();
		
		Palo palo = arrays_palos[(int) (Math.random() * 4)];
		
		carta = (int) (Math.random() * 10) + 1;
		
		if (carta < 8) {
			return new Carta (carta, palo);
		}
		else {
			carta = carta + 2;
			return new Carta (carta, palo);
		}
		
	}
	
	@Override
	public int compareTo(Object o) {
		Carta otro = (Carta) o;
		if (this.numero == otro.getNumero()) {
			return this.palo.toString().compareToIgnoreCase(otro.toString());
		}
		else if (this.numero > otro.getNumero()) {
			return 1;
		}
		else {
			return -1;
		}
	}
	
	
	public String toString () {
		return "Es el " + numero + " de " + palo;
		
	}
	
	
	
	
}
