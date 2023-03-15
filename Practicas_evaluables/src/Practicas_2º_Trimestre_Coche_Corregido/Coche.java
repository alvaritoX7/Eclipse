package Practicas_2º_Trimestre_Coche_Corregido;

import java.util.Arrays;

public class Coche {
    
    private String marca;
    private String modelo;
    private double precioBase=1000;
    private double precioFinal;
    private static double descuento = 100;
    private Acce.Accesorio[] accesorios;
    private int velocidad = 0;

    Coche(String marca, String modelo, Acce.Accesorio[] accesorios) {
        this.marca = marca;
        this.modelo = modelo;
        this.accesorios = accesorios;
    }

	public double verPrecio() {
		 this.precioFinal = this.precioBase - this.descuento;
		 
	        for (int i = 0; i < this.accesorios.length; i++) {
	            this.precioFinal += this.accesorios[i].getPrecio();
	        }
	        return this.precioFinal;
	}
    
    public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(int precioBase) {
		this.precioBase = precioBase;
	}
	
	public double getPrecioFinal() {
		return precioFinal;
	}
	

	public static double getDescuento() {
		return descuento;
	}

	public Acce.Accesorio[] getAccesorios() {
		return accesorios;
	}

	public void setAccesorios(Acce.Accesorio[] accesorios) {
		this.accesorios = accesorios;
	}
	
	public class Acce {

		public enum Accesorio {
        TECHO(500),
        ASIENTOS_CALEFACTABLES(500),
        NAVEGADOR(500);
			
			private double precio;
			
			private Accesorio(double precio) {
	            this.precio = precio;
	        }
			
			
			
			public void setPrecio(double precio) {
				this.precio = precio;
			} 
			
			public double getPrecio() {
	            return precio;
	        }
			
		}
	
	} 

	public void arrancar() {
		if (this.velocidad == 0) {
			this.velocidad = 1;
			System.out.println("Coche arrancado");
		}
		else {
			System.out.println("El coche ya estaba en movimiento");
		}
	}
	
	public void detener() {
		if (this.velocidad > 0) {
			this.velocidad = 0;
			System.out.println("Coche detenido");
		}
		else {
			System.out.println("El cohe ya estaba detenido");
		}
	}
	
	public void acelerar() {
		if (this.velocidad >= 1) {
			this.velocidad++;
			System.out.println("Acelerando");
		}
		else {
			System.out.println("El coche no ha arrancado");
		}
	}
	
	public void frenar() {
		if (this.velocidad > 1) {
			this.velocidad--;
			System.out.println("Frenando");
		}
		else {
			System.out.println("El coche se habia detenido");
		}
	}
	
	public String toString() {
		
		if (this instanceof CocheCombustible) {
			return "Marca; " + this.marca + ", Modelo: " + this.modelo + ", Accesorios: " + Arrays.toString(accesorios) + ", Etiqueta: " + CocheCombustible.getDeposito().getEtiqueta() + ", Precio: " + this.verPrecio();
		}
		else if (this instanceof CocheElectrico) {
			return "Marca; " + this.marca + ", Modelo: " + this.modelo + ", Accesorios: " + Arrays.toString(accesorios) + ", Potencia: " + CocheElectrico.getBateria().getPotencia() + ", Consumo: " + CocheElectrico.getBateria().getConsumo() + ", Precio: " + this.verPrecio();
	}
		else {
			return "Marca; " + this.marca + ", Modelo: " + this.modelo + ", Accesorios: " + Arrays.toString(accesorios)+ ", Precio: " + this.verPrecio();
		}
	}
}

