package Excepciones_de_java;

public class Exceptions_03 {

	public static void main(String[] args) {
		
		
		int a = 200, b = 0;
		
			try {
				division(a, b);
			} 
			catch (Exception e) {
				System.out.println("error de calculo");	
			}
		
	}
	
	public static void division (int a, int b) throws Exception {
		int resultado;
		
		if (b!=0) {
			resultado = a / b;
			System.out.println(resultado);
			
		}
		else {
			throw new Exception("error de calculo");
		}
	}

}
