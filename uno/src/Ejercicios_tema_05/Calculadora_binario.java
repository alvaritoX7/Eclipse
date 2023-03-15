package Ejercicios_tema_05;

import java.util.*;

public class Calculadora_binario {

	public static void main(String[] args) {
		
		int tipo = Tipo_de_calculo();
		
		if (tipo == 1) {
			int digito_entero = Digitos_entero();
			Operacion_entero (digito_entero);
		}
		else if (tipo == 2){
			boolean digito_booleano1 = Digitos_booleano_01();
			boolean digito_booleano2 = Digitos_booleano_02();
			boolean digito_booleano3 = Digitos_booleano_03();
			Opeacion_booleano (digito_booleano3, digito_booleano2, digito_booleano1);
		}
		else if (tipo == 3){
			String digito_String = Digitos_String();
			Operacion_String (digito_String);
		}
		else {
			System.out.println("Se termino el programa");
		}
	}
	
	static int Tipo_de_calculo() {
		Scanner calculo = new Scanner (System.in);
		int num_tipo;
		do {
		System.out.println("1 - Los digitos tienen que ser tipo entero");
		System.out.println("2 - Los digitos tienen que ser tipo booleano");
		System.out.println("3 - Los digitos tienen que ser tipo caracter");
		System.out.println("0 - Para salirse");
		num_tipo = calculo.nextInt();
		
		}while(1 != num_tipo && 2 != num_tipo && 3 != num_tipo && 0 != num_tipo);
		
		return num_tipo;
	}
	
	static int Digitos_entero () {
		Scanner digito = new Scanner (System.in);
		
		System.out.println("Los digitos tienen que ser tipo entero");
		System.out.println("Dime un numero en binario de tres digitos");
		int num = digito.nextInt();
		
		return num;
	}
	
	static void Operacion_entero (int num_binario) {
		if (num_binario == 0) {
			System.out.println("Cero");
		}
		else if (num_binario == 1) {
			System.out.println("Uno");
		}
		else if (num_binario == 10) {
			System.out.println("Dos");
		}
		else if (num_binario == 11) {
			System.out.println("Tres");
		}
		else if (num_binario == 100) {
			System.out.println("Cuatro");
		}
		else if (num_binario == 101) {
			System.out.println("Cinco");
		}
		else if (num_binario == 110) {
			System.out.println("Seis");
		}
		else if (num_binario == 111) {
			System.out.println("Siete");
		}
		else {
			System.out.println("Pusiste un numero que no es binario o que tiene mas de tres cifras");
		}
	}
	
	static boolean Digitos_booleano_01() {
		Scanner digito = new Scanner (System.in);
		
		System.out.println("Los digitos tienen que ser tipo booleano");
		boolean digito1 = digito.nextBoolean();
		
		return digito1;
	}
	
	static boolean Digitos_booleano_02() {
		Scanner digito = new Scanner (System.in);
		
		boolean digito2 = digito.nextBoolean();
		
		return digito2;
	}

	static boolean Digitos_booleano_03() {
		Scanner digito = new Scanner (System.in);
		
		boolean digito3 = digito.nextBoolean();
		
		return digito3;
	}
	
	static void Opeacion_booleano (boolean digito1, boolean digito2, boolean digito3) {
		if (digito1 == false && digito2 == false && digito3 == false) {
			System.out.println("Cero");
		}
		else if (digito1 == false && digito2 == false && digito3 == true){
			System.out.println("Uno");
		}
		else if (digito1 == false && digito2 == false && digito3 == true) {
			System.out.println("Dos");
		}
		else if (digito1 == false && digito2 == false && digito3 == false) {
			System.out.println("Tres");
		}
		else if (digito1 == true && digito2 == false && digito3 == false) {
			System.out.println("Cuatro");
		}
		else if (digito1 == true && digito2 == false && digito3 == true) {
			System.out.println("Cinco");
		}
		else if (digito1 == true && digito2 == true && digito3 == false) {
			System.out.println("Seis");
		}
		else {
			System.out.println("Siete");
		}
	}
	
	static String Digitos_String() {
		Scanner digito = new Scanner (System.in);
		
		System.out.println("Los digitos tienen que ser tipo caracter");
		String digito_String = digito.next();
		
		return digito_String;
	}
	
	static void Operacion_String(String num) {
		String cero = "0" , uno = "1", dos = "10", tres = "11", cuatro = "100", cinco = "101", seis = "110", siete = "111";
		if (num.compareTo(cero) == 0) {
			System.out.println("Cero");
		}
		else if (num.compareTo(uno) == 0) {
			System.out.println("Uno");
		}
		else if (num.compareTo(dos) == 0) {
			System.out.println("Dos");
		}
		else if (num.compareTo(tres) == 0) {
			System.out.println("Tres");
		}
		else if (num.compareTo(cuatro) == 0) {
			System.out.println("Cuatro");
		}
		else if (num.compareTo(cinco) == 0) {
			System.out.println("Cinco");
		}
		else if (num.compareTo(seis) == 0) {
			System.out.println("Seis");
		}
		else if (num.compareTo(siete) == 0) {
			System.out.println("Siete");
		}
		else {
			System.out.println("Pusiste un numero que no es binario o que tiene mas de tres cifras");
		}
		
	}
	
}
