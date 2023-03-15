package Practicas_1º_Trimestre_Comodin;

import java.util.Scanner;

public class dasghhdgas {

	public static void main(String[] args) {
		Scanner mover = new Scanner (System.in);
		
		System.out.println("Elige de cuanto quieres que sea el tablero y se te pondran bombas y muros del mismo numero que el de la tabla");
		int num = mover.nextInt();
		
		String Tablero [] [] = new String [num] [num];
		boolean bomba = false;
		
		int coche_casilla_x = (int) (Math.random()* num);
		int coche_casilla_y = (int) (Math.random()* num);
		Tablero [coche_casilla_x] [coche_casilla_y] = "C"; 
		
		String Tablero_final [] [] = Tablero_final(Tablero, num, coche_casilla_x, coche_casilla_y);
		
		
		coche(bomba, num, coche_casilla_x , coche_casilla_y, Tablero_final);
		
		
		if (bomba == false) {
					
			System.out.println();
			System.out.println("Has ganado");
			System.out.println("YUPIIIIIIIIIIIIIIIIIIIIIIII");
		}
		else {
			System.out.println();
			System.out.println("Has perdido, te chocaste con una bomba :(");
		}
		
		
		mover.close();
	}
	static String[][] Tablero_final (String Tablero1 [] [], int num2, int coche_x, int coche_y){
		
		
		int bomba_casilla_x = 0, bomba_casilla_y = 0;
		int muro_casilla_x = 0, muro_casilla_y = 0;
		
		
		
		
		
		
		for (int i = 0; i < num2; i++){
			
			bomba_casilla_x = (int) (Math.random()* num2);
			bomba_casilla_y = (int) (Math.random()* num2);
			muro_casilla_x = (int) (Math.random()* num2);
			muro_casilla_y = (int) (Math.random()* num2);
			
			if (coche_x == bomba_casilla_x && coche_y == bomba_casilla_y || num2 - 1 == bomba_casilla_x && num2 - 1 == bomba_casilla_y) {
				i--;
			}
			else if ((coche_x == muro_casilla_x && coche_y == muro_casilla_y) ||(muro_casilla_x == bomba_casilla_x && muro_casilla_y == bomba_casilla_y) || (num2 - 1 == muro_casilla_x && num2 - 1 == muro_casilla_y)) {
				i--;
			}
			else {
				Tablero1 [bomba_casilla_x] [bomba_casilla_y] = "B";
				Tablero1 [muro_casilla_x] [muro_casilla_y] = "M";
			}
			
			
		}
		
		
		for (int j = 0; j < num2; j++){
			for (int n = 0; n < num2; n++){
				if (Tablero1 [j] [n] == null) {
					Tablero1[j] [n] = "L";
				}
			}
		}
		return Tablero1;
	}
	
	static boolean coche (boolean bomba, int num, int coche_x2, int coche_y2, String Tablero2 [] []) {
		Scanner hola = new Scanner (System.in);
		
		do {
			for (int m = 0; m < num; m++) {
				for (int t = 0; t < num; t++) {
					System.out.print(Tablero2 [m] [t] + ", ");
				}
				System.out.println();
				
			}
			
			System.out.println();
			System.out.println("Donde te quieres mover:");
			System.out.println("w = 1 casilla hacia delante");
			System.out.println("a = 1 casilla hacia la izquierda");
			System.out.println("d = 1 casilla hacia la derecha");
			System.out.println("s = 1 casilla hacia atras");
			String movimiento = hola.next();
			
			String w = "w", a = "a", d = "d", s = "s"; 
			
			
			
			if (movimiento.compareToIgnoreCase(w) == 0) {
				if (Tablero2 [coche_x2 - 1] [coche_y2] == "B") {
					bomba = true;
				}
				else if (Tablero2 [coche_x2 - 1] [coche_y2] == "M") {
					System.out.println("Hay un muro, haz otro movimiento");
				}
				else if (Tablero2 [coche_x2 - 1] [coche_y2] == "X") {
					System.out.println("Ya has pasado por esa casilla, no puedes pasar otra vez.");
					System.out.println("Hay un muro, haz otro movimiento");
				}
				else {
					coche_x2 --;
					Tablero2 [coche_x2] [coche_y2] = "C";
					Tablero2 [coche_x2 + 1] [coche_y2] = "L";
				}
				
			}
			
			else if (movimiento.compareToIgnoreCase(a) == 0) {
				if (Tablero2 [coche_x2] [coche_y2 - 1] == "B") {
					bomba = true;
				}
				else if (Tablero2 [coche_x2] [coche_y2 - 1] == "M") {
					System.out.println("Hay un muro, haz otro movimiento");
				}
				else if (Tablero2 [coche_x2] [coche_y2 - 1] == "X") {
					System.out.println("Ya has pasado por esa casilla, no puedes pasar otra vez.");
					System.out.println("Hay un muro, haz otro movimiento");
				}
				else {
					coche_y2 --;
					Tablero2 [coche_x2] [coche_y2] = "C";
					Tablero2 [coche_x2] [coche_y2 + 1] = "L";
				}
			}
			
			else if (movimiento.compareToIgnoreCase(d) == 0) {
				if (Tablero2 [coche_x2] [coche_y2 + 1] == "B") {
					bomba = true;
				}
				else if (Tablero2 [coche_x2] [coche_y2 + 1] == "M") {
					System.out.println("Hay un muro, haz otro movimiento");
				}
				else if (Tablero2 [coche_x2] [coche_y2 + 1] == "X") {
					System.out.println("Ya has pasado por esa casilla, no puedes pasar otra vez.");
					System.out.println("Hay un muro, haz otro movimiento");
				}
				else {
					coche_y2 ++;
					Tablero2 [coche_x2] [coche_y2] = "C";
					Tablero2 [coche_x2] [coche_y2 - 1] = "L";
				}
			}
			
			else if (movimiento.compareToIgnoreCase(s) == 0) {
				if (Tablero2 [coche_x2 + 1] [coche_y2] == "B") {
					bomba = true;
				}
				else if (Tablero2 [coche_x2 + 1] [coche_y2] == "M") {
					System.out.println("Hay un muro, haz otro movimiento");
				}
				else {
					coche_x2 ++;
					Tablero2 [coche_x2] [coche_y2] = "C";
					Tablero2 [coche_x2 - 1] [coche_y2] = "L";
				}
			}
			
			else {
				System.out.println("Tecleaste una tecla que no tiene direccion");
			}
			
		}while((Tablero2 [coche_x2] [coche_y2] != Tablero2 [num - 1] [num - 1]) && (bomba == false));
		return bomba;
	}

}