package Primer_trimestre;

public class Ejercicio_11 {

	public static void main(String[] args) {
		int contador=0;
		
		 System.out.println("Escribire todos los números del 100 al 0 de 2 en 2");
		for (int i = 0; i<=99; i+=2) {
			
			if (i==7){
				contador++;
			}
			else if(i % 10 == 7){
				contador++;
			}
			else {
				System.out.println(i);
			}
		}
		System.out.println("");
		System.out.println(contador + " numeros acaban en siete");
		
		
		
	}

}
