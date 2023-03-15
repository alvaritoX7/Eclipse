package Tema_05;

public class Ejercicio_01 {

	public static void main(String[] args) {
		
		
		String Semana [] = new String[7];
		
		Semana[0] = "lunes";
		Semana[1] = "Martes";
		Semana[2] = "Miercoles";
		Semana[3] = "Jueves";
		Semana[4] = "Viernes";
		Semana[5] = "Sabado";
		Semana[6] = "Domingo";
		
		for(int i = 1; i < Semana.length; i+=2) {
		System.out.println(Semana[i]);
			
		}
		
		
	}

}
