package Practicas_1º_Trimestre_Comodin;

import java.util.*;

public class Coche_Evita_Obstaculos {
	
	public static void main(String[] args) {
		
		int num = Instrucciones();
		
		String Arrays_Inicial [] [] = new String [num] [num];
		
		boolean bomba = false;
		
		int bomba_casilla_x = 0, bomba_casilla_y = 0, muro_casilla_x = 0, muro_casilla_y = 0;
		
		int coche_casilla_x = (int) (Math.random()* num);
		int coche_casilla_y = (int) (Math.random()* num);
		Arrays_Inicial [coche_casilla_x] [coche_casilla_y] = "C"; 
		
		String Tablero_Final [] [] = Tablero(Arrays_Inicial, num, bomba_casilla_x, coche_casilla_x, coche_casilla_y, bomba_casilla_y, muro_casilla_x, muro_casilla_y);
		
		Tablero_Final = Movimientos (Tablero_Final, coche_casilla_x, coche_casilla_y, bomba, num);
		
		Resultado(Tablero_Final, num);
		
	}
	
	
	
	static String [][]  Tablero(String [] [] Tablero_Partida, int num_casillas, int coche_x, int coche_y, int bomba_x, int bomba_y, int muro_x, int muro_y){
		
		for (int i = 0; i < num_casillas; i++){
			
			bomba_x = (int) (Math.random()* num_casillas);
			bomba_y = (int) (Math.random()* num_casillas);
			muro_x = (int) (Math.random()* num_casillas);
			muro_y = (int) (Math.random()* num_casillas);
			
			if (coche_x == bomba_x && coche_y == bomba_y || num_casillas - 1 == bomba_x && num_casillas - 1 == bomba_y) {
				i--;
			}
			else if ((coche_x == muro_x && coche_y == muro_y) ||(muro_x == bomba_x && muro_y == bomba_y) || (num_casillas - 1 == muro_x && num_casillas - 1 == muro_y)) {
				i--;
			}
			else {
				Tablero_Partida [bomba_x] [bomba_y] = "B";
				Tablero_Partida [muro_x] [muro_y] = "M";
			}
		}
		
		for (int j = 0; j < num_casillas; j++){
			for (int n = 0; n < num_casillas; n++){
				if (Tablero_Partida [j] [n] == null) {
					Tablero_Partida[j] [n] = "L";
				}
			}
		}
		
		return Tablero_Partida;
	}
	
	static int Instrucciones () {
		Scanner mover = new Scanner (System.in);
		
		System.out.println("Movimientos:");
		System.out.println("w = 1 casilla hacia delante");
		System.out.println("a = 1 casilla hacia la izquierda");
		System.out.println("d = 1 casilla hacia la derecha");
		System.out.println("s = 1 casilla hacia atras");
		System.out.println("Elige de cuanto quieres que sea el tablero y se te pondran bombas y muros del mismo numero que el de la tabla");
		int num = mover.nextInt();
		

		return num;
	}
	
	static void Pinta_Tablero(String [][] Tablero_Final, int num_casillas) {
		
		for (int m = 0; m < num_casillas; m++) {
			for (int t = 0; t < num_casillas; t++) {
				System.out.print(Tablero_Final [m] [t] + "  ");
			}
			System.out.println();
		}
		
	}
	
	static void Resultado(String [][] Tablero_Final, int num_casillas) {
		if (Tablero_Final [num_casillas - 1] [num_casillas - 1] == "C") {
			for (int m = 0; m < num_casillas; m++) {
				for (int t = 0; t < num_casillas; t++) {
					System.out.print(Tablero_Final [m] [t] + ", ");
				}
				System.out.println();
				
			}
			System.out.println();
			System.out.println("Has ganado");
			System.out.println("YUPIIIIIIIIIIIIIIIIIIIIIIII");
		}
		else {
			System.out.println("Has perdido, te chocaste con una bomba :(");
		}
	}
	
	static String [] [] Movimientos (String[][] Tablero_Final, int coche_casilla_x, int coche_casilla_y, boolean bomba, int num){
		Scanner mover = new Scanner (System.in);
		
		do {
			
			
			Pinta_Tablero(Tablero_Final, num);
			
			String w = "w", a = "a", d = "d", s = "s";
			String movimiento = mover.next();
			
			if (movimiento.compareToIgnoreCase(w) == 0) {
				if (Tablero_Final [coche_casilla_x] [coche_casilla_y] == Tablero_Final [0] [coche_casilla_y] ) {
					System.out.println("No puede salirse de la tabla");
				}
				else {
					if (Tablero_Final [coche_casilla_x - 1] [coche_casilla_y] == "B") {
						bomba = true;
					}
					else if (Tablero_Final [coche_casilla_x - 1] [coche_casilla_y] == "M") {
						System.out.println("Hay un muro, haz otro movimiento");
					}
					else if (Tablero_Final [coche_casilla_x - 1] [coche_casilla_y] == "X") {
						System.out.println("Ya has pasado por esa casilla, no puedes pasar otra vez.");
						System.out.println("Hay un muro, haz otro movimiento");
					}
					else if (Tablero_Final [coche_casilla_x - 1] [coche_casilla_y] == "L") {
						coche_casilla_x --;
						Tablero_Final [coche_casilla_x] [coche_casilla_y] = "C";
						Tablero_Final [coche_casilla_x + 1] [coche_casilla_y] = "X";
					}
					else {
						System.out.println("No te puedes salir del mapa");
						System.out.println("Hay un muro, haz otro movimiento");
					}
				}
					
				
			}
			
			else if (movimiento.compareToIgnoreCase(a) == 0) {
				if (Tablero_Final [coche_casilla_x] [coche_casilla_y] == Tablero_Final [coche_casilla_x] [0]) {
					System.out.println("No puede salirse de la tabla");
				}
				else {
					if (Tablero_Final [coche_casilla_x] [coche_casilla_y - 1] == "B") {
						bomba = true;
					}
					else if (Tablero_Final [coche_casilla_x] [coche_casilla_y - 1] == "M") {
						System.out.println("Hay un muro, haz otro movimiento");
					}
					else if (Tablero_Final [coche_casilla_x] [coche_casilla_y - 1] == "X") {
						System.out.println("Ya has pasado por esa casilla, no puedes pasar otra vez.");
						System.out.println("Hay un muro, haz otro movimiento");
					}
					else if (Tablero_Final [coche_casilla_x] [coche_casilla_y - 1] == "L") {
						coche_casilla_y --;
						Tablero_Final [coche_casilla_x] [coche_casilla_y] = "C";
						Tablero_Final [coche_casilla_x] [coche_casilla_y + 1] = "X";
					}
					else {
						System.out.println("No te puedes salir del mapa");
						System.out.println("Hay un muro, haz otro movimiento");
					}
				}
				
			}
			
			else if (movimiento.compareToIgnoreCase(d) == 0) {
				if (Tablero_Final [coche_casilla_x] [coche_casilla_y] == Tablero_Final [coche_casilla_x] [Tablero_Final.length - 1]) {
					System.out.println("No puede salirse de la tabla");
				}
				else {
					if (Tablero_Final [coche_casilla_x] [coche_casilla_y + 1] == "B") {
						bomba = true;
					}
					else if (Tablero_Final [coche_casilla_x] [coche_casilla_y + 1] == "M") {
						System.out.println("Hay un muro, haz otro movimiento");
					}
					else if (Tablero_Final [coche_casilla_x] [coche_casilla_y + 1] == "X") {
						System.out.println("Ya has pasado por esa casilla, no puedes pasar otra vez.");
						System.out.println("Hay un muro, haz otro movimiento");
					}
					else if (Tablero_Final [coche_casilla_x] [coche_casilla_y + 1] == "L") {
						coche_casilla_y ++;
						Tablero_Final [coche_casilla_x] [coche_casilla_y] = "C";
						Tablero_Final [coche_casilla_x] [coche_casilla_y - 1] = "X";
					}
					else {
						System.out.println("No te puedes salir del mapa");
						System.out.println("Hay un muro, haz otro movimiento");
					}
				}
				
			}
			
			else if (movimiento.compareToIgnoreCase(s) == 0) {
				if (Tablero_Final [coche_casilla_x] [coche_casilla_y] == Tablero_Final [Tablero_Final.length - 1] [coche_casilla_y]) {
					System.out.println("No puede salirse de la tabla");
				}
				else {
					if (Tablero_Final [coche_casilla_x + 1] [coche_casilla_y] == "B") {
						bomba = true;
					}
					else if (Tablero_Final [coche_casilla_x + 1] [coche_casilla_y] == "M") {
						System.out.println("Hay un muro, haz otro movimiento");
					}
					else if (Tablero_Final [coche_casilla_x + 1] [coche_casilla_y] == "X") {
						System.out.println("Ya has pasado por esa casilla, no puedes pasar otra vez.");
						System.out.println("Hay un muro, haz otro movimiento");
					}
					else if (Tablero_Final [coche_casilla_x + 1] [coche_casilla_y] == "L") {
						coche_casilla_x ++;
						Tablero_Final [coche_casilla_x] [coche_casilla_y] = "C";
						Tablero_Final [coche_casilla_x - 1] [coche_casilla_y] = "X";
					}
					else {
						System.out.println("No te puedes salir del mapa");
						System.out.println("Hay un muro, haz otro movimiento");
					}
				}
				
			}
			
			else {
				System.out.println("Tecleaste una tecla que no tiene direccion");
			}
			
		}while ((Tablero_Final[coche_casilla_x] [coche_casilla_y] != Tablero_Final [num - 1] [num - 1]) && (bomba == false));
		
		return Tablero_Final;
	}
	
}
