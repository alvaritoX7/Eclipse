package Practicas_2º_Trimestre_Coche;

import java.util.Arrays;

import Practicas_2º_Trimestre_Coche.Coche.Acce;
import Practicas_2º_Trimestre_Coche.Coche.Acce.Accesorio;

public class Coche {
	
	
	private String marca;
    private String modelo;
    private double precioBase=1000;
    private double precioFinal;
    private static double descuento = 100;
    private Acce.Accesorio[] accesorios;
    private Coche_Combustible coche_combustible;
    private Coche_Electrico coche_electrico;
    private int velocidad = 0;

    Coche(String marca, String modelo, Acce.Accesorio[] accesorios) {
        this.marca = marca;
        this.modelo = modelo;
        this.accesorios = accesorios;
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
	
	public Coche_Combustible getCoche_combustible() {
		return coche_combustible;
	}

	public void setCoche_combustible(Coche_Combustible coche_combustible) {
		this.coche_combustible = coche_combustible;
	}

	public Coche_Electrico getCoche_electrico() {
		return coche_electrico;
	}

	public void setCoche_electrico(Coche_Electrico coche_electrico) {
		this.coche_electrico = coche_electrico;
	}

	public static double getDescuento() {
		return descuento;
	}

	public Acce.Accesorio[] getAccesorios() {
		return accesorios;
	}

	public void setAccesorios(Acce.Accesorio[] accesorios2) {
		this.accesorios = accesorios2;
	}
	public void verPrecio() {
		System.out.println(this.precioFinal);
	}
    
    
	public double precioNormal() {
        
        return this.precioFinal;
    }
    
	public double precioElectrico() {
        this.precioFinal = this.precioBase - (this.precioBase*0.1); 
        
 
        for (int i = 0; i < this.accesorios.length; i++) {
            this.precioFinal += this.accesorios[i].getPrecio();
        }
        return this.precioFinal;
    }
	
	public double precioCombustible() {
        this.precioFinal = this.precioBase + (this.precioBase*0.1);
        
 
        for (int i = 0; i < this.accesorios.length; i++) {
            this.precioFinal += this.accesorios[i].getPrecio();
        }
        return this.precioFinal;
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
			System.out.println("El coche se ha arrncado " + this.marca);
		}
		else {
			System.out.println("El coche ya esta en movimiento");
		}
	}
	
	public void acelerar() {
		if (this.velocidad >= 1) {
			this.velocidad++;
			System.out.println("Estas acelerando el coche " + this.marca);
		}
		else {
			System.out.println("El coche no ha arrancado");
		}
	}
	
	public void frenar() {
		if (this.velocidad > 1) {
			this.velocidad--;
			System.out.println("Estas frenando " + this.marca);
		}
		else {
			System.out.println("El coche se habia detenido");
		}
	}
	
	public void detener() {
		if (this.velocidad > 0) {
			this.velocidad = 0;
			System.out.println("El coche se ha detenido: " + this.marca);
		}
		else {
			System.out.println("El cohe ya estaba detenido");
		}
	}
	
	public String toString() {
		
		if (this.coche_combustible != null) {
			return "Marca: " + this.marca + "| Modelo: " + this.modelo + "| Accesorios: " + Arrays.toString(accesorios) + "| Etiqueta: " + this.getCoche_combustible().getDeposito().getEtiqueta() + "| Precio: " + this.precioFinal + " €";
		}
		else if (this.coche_electrico != null) {
			return "Marca;: " + this.marca + "| Modelo: " + this.modelo + "| Accesorios: " + Arrays.toString(accesorios) + "| Potencia: " + this.getCoche_electrico().getBateria().getPotencia() + "| Consumo: " + this.getCoche_electrico().getBateria().getConsumo() + "| Precio: " + this.precioFinal + " €";
	}
		else {
			return "Marca: " + this.marca + "| Modelo: " + this.modelo + "| Accesorios: " + Arrays.toString(accesorios)+ "| Precio: " + this.precioFinal + " €";
		}
	}
}

