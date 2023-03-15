package Practicas_2ª_Evaluación_Navidades;

import java.util.*;

public class Tablero_3_en_raya_Fase2 {

	public static void main(String[] args) {
		
		int x = Proporciones_tablero_X ();
		int y = Proporciones_tablero_y ();
		
		int [][] Tablero = Crear_tablero(x, y);
		Tablero = Pinta_Tablero(Tablero, x, y);
		Jugar(Tablero, x, y);
	}
	static int Proporciones_tablero_X () {
		Scanner sc_1 = new Scanner (System.in);
		
		System.out.println("Cuantas filas quieres que tenga tu tablero");
		int filas = sc_1.nextInt();
		
		return filas;
		
	}
	static int Proporciones_tablero_y () {
		Scanner sc_1 = new Scanner (System.in);
		
		System.out.println("Cuantas columnas quieres que tenga tu tablero");
		int columnas = sc_1.nextInt();
		
		return columnas;
	}
	static int [][] Crear_tablero(int filas, int columnas) {
		
		
		int [][] Tablero = new int [filas] [columnas];
		
		return Tablero;
		
	}
	static int [][] Pinta_Tablero(int [][] pintar_tablero, int filas, int columnas) {
		
		int contador = 1;
		
		for (int m = 0; m < filas; m++) {
			for (int t = 0; t < columnas; t++) {
				pintar_tablero [m] [t] = contador;
				if (contador < 10) {
					System.out.print(pintar_tablero [m] [t] + "    ");
				}
				else {
					System.out.print(pintar_tablero [m] [t] + "   ");
				}
				
				contador ++; 
			}
			System.out.println();
		}
		
		return pintar_tablero;
		
	}
	static void Jugar(int [][] tablero, int filas, int columnas) {
		boolean Resultado = false, Comprobar;
		int x = 0;
		
		do {
			tablero = Pinta_Jugador(tablero, filas, columnas);
			
			tablero = Pinta_Tablero_2(tablero, filas, columnas);
			
			Pinta_Maquina(tablero, filas, columnas);
			
			tablero = Pinta_Tablero_Jugar(tablero, filas, columnas);
			System.out.println();
			Comprobar  = Comprobar_tablero(Resultado, tablero, filas, columnas,x);
		}while (Comprobar != true);
		
	}
	static int [][] Pinta_Jugador(int [][] tablero, int filas, int columnas){
		Scanner sc_2 = new Scanner (System.in);
		
		System.out.println("En que posicion pones el -1");
		int Posicion_X = sc_2.nextInt();
		
		tablero = Posicion(tablero, Posicion_X, filas, columnas);
		
		return tablero;
		
	}
	static int [][] Posicion(int [][] tablero, int num, int fila, int columna){
		
		for (int i = 0; i < columna; i++) {
			for (int j = 0; j < columna ; j++) {
				if (tablero [i][j] == num){
					tablero [i][j] = -1;
				}
				
			}
		}
		
		return tablero;
	}
	static int [][] Pinta_Tablero_2(int [][]tablero, int fila, int columna){
		
		System.out.println();
		for (int m = 0; m < fila; m++) {
			for (int t = 0; t < columna; t++) {
				if (tablero[m][t] == -1){
					System.out.print(tablero [m] [t] + "   ");
				}
				else if (tablero [m][t] >= 0 && tablero [m][t] < 10) {
					System.out.print(tablero [m] [t] + "    ");
				}
				else {
					System.out.print(tablero [m] [t] + "   ");
				}
			}
			System.out.println();
		}
		return tablero;
	}
	
	
	
	static int [][] Pinta_Maquina (int [][] tablero, int x, int y){
		x = x - 1;
		y = y - 1;
		
		boolean a = false;
		
		for (int i = 0; i < x && a == true; i++) {
			for (int j = 0; i < y && a == true ; j++) {
				
				while (tablero[i][j] == -1 || a == true) {
					int n = (int) (Math.random()* 2);
					
					if (n == 1) {
						if (tablero [i][j] == -1) {
							int l = (int) (Math.random()* 4);
					
								if (l == 1) {
									if (tablero [i] [j] == tablero [0] [j - 1] || tablero [i - 1][j] == 0) {
									
									}
									else {
										tablero [i - 1][j] = 0;
										a = true;
									}
								
								}
								else if (l == 2) {
									if (tablero [i] [j] == tablero [i] [0] || tablero [i][j - 1] == 0) {
									
									}
									else {
										tablero [i][j - 1] = 0;
										a = true;
									}
								}
								else if (l == 3) {
									if (tablero [i] [j] == tablero [i] [tablero.length - 1] || tablero [i - 1][j] == 0) {
									
									}
									else {
										tablero [i - 1][j] = 0;
										a = true;
									}
								}
								else {
									if (tablero [i] [j] == tablero [tablero.length - 1] [j] || tablero [i][j - 1] == 0) {
									
									}
									else {
										tablero [i][j - 1] = 0;
										a = true;
									}
								}
						}
					}
					else {
						if (tablero [i - 1][j -1] == 0) {
							int l = (int) (Math.random()* 4);
					
								if (l == 1) {
									if (tablero [i] [j] == tablero [0] [j] || tablero [i - 1][j] == 0) {
									
									}
									else {
										tablero [i - 1][j] = 0;
										a = true;
									}
								
								}
								else if (l == 2) {
									if (tablero [i] [j] == tablero [i] [0] || tablero [i][j - 1] == 0) {
									
									}
									else {
										tablero [i][j - 1] = 0;
										a = true;
									}
								}
								else if (l == 3) {
									if (tablero [i] [j] == tablero [i] [tablero.length - 1] || tablero [i - 1][j] == 0) {
									
									}
									else {
										tablero [i - 1][j] = 0;
										a = true;
									}
								}
								else {
									if (tablero [i] [j] == tablero [tablero.length - 1] [j - 1] || tablero [i][j - 1] == 0) {
									
									}
									else {
										tablero [i][j - 1] = 0;
										a = true;
									}
								}
						}
					}
				}
			}
		}
		return tablero;
	}
	
	static int [][] Pinta_Tablero_Jugar(int [][]tablero, int fila, int columna){
		System.out.println();
		
		for (int u = 0; u < fila; u++) {
			for (int r = 0; r < columna; r++) {
				if (tablero[u][r] == -1){
					System.out.print(tablero [u] [r] + "   ");
				}
				else if (tablero [u][r] >= 0 && tablero [u][r] < 10) {
					System.out.print(tablero [u] [r] + "    ");
				}
				else {
					System.out.print(tablero [u] [r] + "   ");
				}
			}
			System.out.println();
		}
		return tablero;
	}
	
	static boolean Comprobar_tablero(boolean Resultado, int [][] tablero, int fila, int columna, int x) {
		Resultado = true;
		for (int u = 0; u < fila; u++) {
			for (int r = 0; r < columna; r++) {
				if (tablero [u][r] == -1) {
					if (tablero [u+1][r] == -1) {
						if (tablero [u + 2][r] == -1) {
							Resultado = false;
						}
					}
					else if (tablero [u][r + 1] == -1) {
						if (tablero [u][r + 2] == -1) {
							Resultado = false;
						}
					}
					else if (tablero [u + 1][r + 1] == -1) {
						if (tablero [u + 2][r + 2] == -1) {
							Resultado = false;
						}
					}
					else if (tablero [u + 1][r - 1] == -1) {
						if (tablero [u + 2][r - 2] == -1) {
							Resultado = false;
						}
					}
				}
				else if (tablero[u][r] == 0) {
					if (tablero [u+1][r] == 0) {
						if (tablero [u + 2][r] == 0) {
							Resultado = false;
						}
					}
					else if (tablero [u][r + 1] == 0) {
						if (tablero [u][r + 2] == 0) {
							Resultado = false;
						}
					}
					else if (tablero [u + 1][r + 1] == 0) {
						if (tablero [u + 2][r + 2] == 0) {
							Resultado = false;
						}
					}
					else if (tablero [u + 1][r - 1] == 0) {
						if (tablero [u + 2][r - 2] == 0) {
							Resultado = false;
						}
					}
				}
			}
		}
			
		
		
		return Resultado;
		
	}
}
