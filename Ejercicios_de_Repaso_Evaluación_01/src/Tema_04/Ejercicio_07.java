package Tema_04;

public class Ejercicio_07 {

	public static void main(String[] args) {
		
		
		String email = "pepe@gmail.com";
		
		System.out.println(check_email (email));
		System.out.println(check_email ("pepe@@"));
		
		boolean otra = check_email ("pepe@.com");
		
		System.out.println(otra);
		
	}
	static boolean check_email (String a) {
		int contadorPuntos = 0, contadorArrobas = 0;
		
		int longitud = a.length() - 1;
		boolean resultado = false;
		
		for (int i = 0; i <= longitud; i++) {
			if (a.charAt(i) == '@') {
				contadorArrobas++;
			}
			if (a.charAt(i) == '.') {
				contadorPuntos++;
			}
		}
		
		if (contadorArrobas == 1 && contadorPuntos == 1) {
			resultado = true;
		}
		
		return resultado;
		
		
		
		
		
	}

}
