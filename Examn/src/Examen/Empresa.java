package Examen;

import java.util.*;
	
public class Empresa {
	
static Empleado [] personas_1 = new Empleado [3];
	
	public static void main(String[] args) {
		
		Empleado persona1 = new Empleado ("1200 ", "Alvaro", 670000000, 654321987);
		Empleado persona2 = new Empleado ("1100 ", "Javi", 658239714, 698741235);
		Empleado persona3 = new Empleado ("1000 ", "Kamilo", 623147895);
		
		
		
		Empleado [] personas = new Empleado [3];
		
		personas [0] = persona1;
		personas [1] = persona2;
		personas [2] = persona3;
		
		System.out.println(persona1.cuentaEmpleados(personas));
		
		for(Empleado a: personas) {
			System.out.println(a);
		}
		
		
		for(int i = 0; i < personas.length; i++) {
			System.out.println(personas[i]);
		}
		
		Empresa.personas_1 [0] = persona1;
		Empresa.personas_1 [1] = persona2;
		Empresa.personas_1 [2] = persona3;
		
		telefonos(persona1, persona2, persona3);
		
		muestraTelefono(persona1.getNombre());
		
	}
	
	public static void telefonos(Empleado persona1, Empleado persona2, Empleado persona3) {
		Scanner sc = new Scanner (System.in);
		System.out.println();
		System.out.println("Que persona quieres saber el telefono");
		int num = sc.nextInt();
		if (num == 1) {
			System.out.println(persona1.toString1()); 
		}
		else if (num == 2) {
			System.out.println (persona2.toString1());
		}
		else if (num == 3) {
			System.out.println(persona3.toString1());
		}
		else {
			System.out.println("No existe ninguna persona asi");
		}
		
		 
	}
	
	public static void muestraTelefono (String buscoNombre) {
		
		for(Empleado var: personas_1) {
			if (var.getNombre().equals(buscoNombre)){
				System.out.println(Arrays.toString(var.getTelefono()));
			}
			
		}
		
		
		
		
	}
	
	

}
