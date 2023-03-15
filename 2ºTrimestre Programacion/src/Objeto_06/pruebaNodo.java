package Objeto_06;

public class pruebaNodo {

	public static void main(String[] args) {
		
		Nodo a = new Nodo();
		
		a.info = 4;
		
		System.out.println(a.info);
		
		Nodo b = new Nodo ();
		
		b.info = 7;
		
		a.siguiente = b; 
		
		System.out.println(b.info);
		
		
	}

}
