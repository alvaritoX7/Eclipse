package Objeto;

public class prueba_Calendario {

	public static void main(String[] args) {
		
		
		Calendario c1 = new Calendario(28, 2, 2020);
		
		System.out.println(c1);
		
		c1.incrementaDia();
		
		System.out.println(c1);
		
		c1.setDia(22);
		
		System.out.println(c1);
		
		Calendario c2 = new Calendario(5, 12, 2021);
		
		System.out.println(c2);
		
		
		
		
		
		
		
		
		
		
	}

}
