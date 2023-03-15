package Excepciones_de_java;

public class Exceptions_01 {

	public static void main(String[] args) {
		try {
			int[] numeros = {1,2,3};
			//int calculo = numeros [1]/0;
			System.out.println(numeros[10]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Posicion fuera del array");
		}
		catch(Exception e){
			System.out.println("Posicion fuera del array");
		}
		finally {
			System.out.println("Paso por el finaly");
		}
		
	}

}
