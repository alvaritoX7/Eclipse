package Tema_04;

public class Cuenta_Segundos {

	public static void main(String[] args) {
		
		int h = 1, min = 2, s = 59;
		
		int resultado = cuentaSegundos(h,min,s);
		
		System.out.println(resultado);
		
		
		
		
		
		
		
	}
	static int cuentaSegundos (int horas, int minutos, int segundos) {
		return (horas*3600 + minutos*60 + segundos);
	}

}
