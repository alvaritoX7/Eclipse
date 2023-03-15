package Interfaces_03;

import java.util.*;

public class pruebaEmpleado {

	public static void main(String[] args) {
		
		
		
		
		Empleado [] arraysEmpleado = new Empleado [5];
		
		arraysEmpleado [0] = new Empleado (4, "ALVARO");
		arraysEmpleado [1] = new Empleado (2, "EDU");
		arraysEmpleado [2] = new Empleado (4, "DIEGO");
		arraysEmpleado [3] = new Empleado (2, "CARLOS");
		arraysEmpleado [4] = new Empleado (2, "JOSE");
		
		
		
		
		Arrays.sort(arraysEmpleado);
		
		System.out.println(Arrays.toString(arraysEmpleado));
	}
	
	public static void ordenaID (Empleado [] arrayAOrdenar) {
		
		//generar una variable auxiliar
		//recorro todas las posiciones del arrays y si el id es mayor intercambio la posicion
		//para cada posicion si el id siguiente es manor que el anterior intercambio las posiciones
		Empleado a;
		
		for (int i = 1; i < arrayAOrdenar.length; i++) {
			for (int j = 0; j < arrayAOrdenar.length - 1; j++) {
				
				if (arrayAOrdenar [j].getId() > arrayAOrdenar [j + 1].getId()) {
					a = arrayAOrdenar [j]; 
					arrayAOrdenar [j] = arrayAOrdenar [j + 1];
					arrayAOrdenar [j + 1] = a;
				}
				
				
				
				
			}
		}
		
	}
	public static void ordenaNombre (Empleado [] arrayBOrdenar) {
		
		//generar una variable auxiliar
		//recorro todas las posiciones del arrays y si el id es mayor intercambio la posicion
		//para cada posicion si el id siguiente es manor que el anterior intercambio las posiciones
		Empleado a;
		
		for (int i = 1; i < arrayBOrdenar.length; i++) {
			for (int j = 0; j < arrayBOrdenar.length - 1; j++) {
				
				if (arrayBOrdenar [j].getNombre().compareToIgnoreCase(arrayBOrdenar [j + 1].getNombre()) >= 0) {
					a = arrayBOrdenar [j]; 
					arrayBOrdenar [j] = arrayBOrdenar [j + 1];
					arrayBOrdenar [j + 1] = a;
				}
				
				
				
			}
		}
		
	}
 
}
