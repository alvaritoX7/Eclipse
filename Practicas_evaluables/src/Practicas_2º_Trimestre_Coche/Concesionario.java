package Practicas_2º_Trimestre_Coche;

import java.util.Arrays;

import Practicas_2º_Trimestre_Coche.Coche.Acce;

public class Concesionario {

static Coche[] arraysCoches = new Coche[5];
	
	public static void main(String[] args) {
		Bateria b1 = new Bateria (40);
		
		Coche_Electrico c1 = new Coche_Electrico ("zxvdsdzg", "sagsd", crearAccesorios(2), b1);
		
	}
	
	public static Acce.Accesorio[] crearAccesorios(int menu) {
		
		if (menu == 1) {
			Acce.Accesorio[] accesorios3 = {Acce.Accesorio.NAVEGADOR, Acce.Accesorio.TECHO, Acce.Accesorio.ASIENTOS_CALEFACTABLES};
			return  accesorios3;
		}
		else if (menu == 2) {
			Acce.Accesorio[] accesoriosTechoNavegador = {Acce.Accesorio.TECHO, Acce.Accesorio.NAVEGADOR};
			return	accesoriosTechoNavegador;
		}
		else if (menu == 3) {
			Acce.Accesorio[] accesoriosTechoAsiento_Calefactable = {Acce.Accesorio.TECHO, Acce.Accesorio.ASIENTOS_CALEFACTABLES};
			return accesoriosTechoAsiento_Calefactable;
		}
		else if (menu == 4) {
			Acce.Accesorio[] accesoriosNavegadorAsiento_Calefactable = {Acce.Accesorio.NAVEGADOR, Acce.Accesorio.ASIENTOS_CALEFACTABLES};
			return accesoriosNavegadorAsiento_Calefactable;
		}
		else if (menu == 5) {
			Acce.Accesorio[] accesoriosTecho = {Acce.Accesorio.TECHO};
			return accesoriosTecho;
		}
		else if (menu == 6) {
			Acce.Accesorio[] accesoriosNavegador = {Acce.Accesorio.NAVEGADOR};
			return accesoriosNavegador;
		}
		else if (menu == 7) {
			Acce.Accesorio[] accesoriosAsiento_calefactables = {Acce.Accesorio.ASIENTOS_CALEFACTABLES};
			return accesoriosAsiento_calefactables;
		}
		else {
			Acce.Accesorio[] sin_accesorios = new Acce.Accesorio[0];
			return sin_accesorios;
		}
		
	}
	
	public static void crearCoche(String marca, String modelo, Acce.Accesorio[] accesorios) {
		Coche normal = new Coche(marca, modelo, accesorios);
		int contador = 0;
		for (int posicion = 0; posicion < arraysCoches.length && contador != 1; posicion ++) {
			if (arraysCoches[posicion] == null) {
				arraysCoches[posicion] = normal;
			normal.precioNormal();
			
			contador++;	
			}
			else if (arraysCoches[arraysCoches.length - 1] != null){
				System.out.println("El concesionario esta lleno");
			contador++;	
			}
		}
	}
	
	public static void crearCocheElectrico(String marca, String modelo, Acce.Accesorio[] accesorios, double potencia) {
		Bateria b = new Bateria(potencia);
		Coche_Electrico electrico = new Coche_Electrico(marca, modelo, accesorios, b);
		electrico.setCoche_electrico(electrico);
		int contador = 0;
		for (int posicion = 0; posicion < arraysCoches.length && contador != 1; posicion ++) {
			if (arraysCoches[posicion] == null) {
				arraysCoches[posicion] = electrico;
			electrico.precioElectrico();
			contador++;	
			}
			else if (arraysCoches[arraysCoches.length - 1] != null){
				System.out.println("El concesionario esta lleno");
			contador++;	
			}
		}
	}
		
	public static void crearCocheCombustible(String marca, String modelo, Acce.Accesorio[] accesorios, String deposito) {
		Deposito d = new Deposito(deposito);
		Coche_Combustible combustible = new Coche_Combustible(marca, modelo, accesorios, d);
		combustible.setCoche_combustible(combustible);
		int contador = 0;
		for (int posicion = 0; posicion < arraysCoches.length && contador != 1; posicion ++) {
			if (arraysCoches[posicion] == null) {	
				arraysCoches[posicion] = combustible;
			combustible.precioCombustible();
			contador++;	
			}
			else if (arraysCoches[arraysCoches.length - 1] != null){
				System.out.println("El concesionario esta lleno");
			contador++;	
			}
		}
	}
	
	public static void mostrarCoches(Coche[]coches) {
		ordenarPorPrecio(coches);
		double precioFinal=0;
		for(int i = 0; i < coches.length; i++) {
			if(coches[i] != null) {
			precioFinal = coches[i].getPrecioFinal() + precioFinal;
			System.out.println(coches[i].toString());
			System.out.println();
			}
		}
		System.out.println("El precio total del concesionario es de: " + precioFinal);
		System.out.println();
	}
	
	public static void informe(String marca) {
		int numero_coches = 0;
		int numero_coches_electricos = 0;
		int numero_coches_combustible = 0;
		for(int i = 0; i < arraysCoches.length; i++) {
			if(arraysCoches[i] != null && arraysCoches[i].getMarca().compareToIgnoreCase(marca) == 0) {
				numero_coches++;
				if(arraysCoches[i] instanceof Coche_Electrico) {
					numero_coches_electricos++;
				}
				if(arraysCoches[i].getCoche_combustible() != null) {
					numero_coches_combustible++;
				}
			}		
		}
		int coches_normales = numero_coches - (numero_coches_electricos+numero_coches_combustible);
		System.out.println("Hay " + numero_coches + " coches de la marca " + marca);
		System.out.println("Hay " + numero_coches_electricos + " coches electricos, " + numero_coches_combustible + " coches de combustible y " + coches_normales + " coches normales");
	}
	
	public static void ordenarPorPrecio(Coche[]coches) {
		for (int i = 0; i < coches.length - 1; i++) {
            for (int j = 0; j < coches.length - i - 1; j++) {
                if (coches[j] != null && coches[j + 1] != null && coches[j].getPrecioFinal() > coches[j + 1].getPrecioFinal()) {
                    Coche temp = coches[j];
                    coches[j] = coches[j + 1];
                    coches[j + 1] = temp;
                }
            }
        }
	}	
}

