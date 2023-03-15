package Ejercicios_futbolista;

public class DNI {
	
	private int num;
	private String letra;
	
	
	public DNI(int num, String letra) {
		super();
		this.num = num;
		this.letra = letra;
	}
	
	public int getNum() {
		return num;
	}
	public String getLetra() {
		return letra;
	}
	
	public String toString () {
		
		return this.num + " " + this.letra;
	}
	
}
