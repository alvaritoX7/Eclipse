package Excepciones_de_java;

public class Exceptions_02 {

	public static void main(String[] args) {
		
		int a = 200, b = 0;
		
		try {
			int calc = a/b;
		}
		catch(ArithmeticException e) {
			System.out.println("Error de calculo");
		}
	}

}
