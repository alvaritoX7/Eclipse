package Objeto_07;

public class Lista_Ordenada {
	
	public Nodo_Ordenada raiz;
	
	
	public void insertaPosicion (int posicion, int x) {
		Nodo_Ordenada aux = raiz;
		int a = 0;
		
		while (aux != null) {
			aux = aux.siguiente;
			a ++;
		}
		if (posicion >= a + 2 || posicion <= 0) {
			System.out.println("Posicion no valida");
		}
		else if (posicion == 1){
			insertarPrimero(x);
		}
		else {
			posicion--;
			
			Nodo_Ordenada nuevo = new Nodo_Ordenada ();
			nuevo.info = x;
		
			Nodo_Ordenada busca = raiz;
		
			int tamaño = 1;
		
		
			while (busca != null) {
			
			
				if (tamaño == posicion) {
				
					nuevo.siguiente  = busca.siguiente;
					busca.siguiente = nuevo;
				}
			
				busca = busca.siguiente;
			
				tamaño ++;
			}
		}
	}
		
	
	private void insertarPrimero (int x) {
		
		Nodo_Ordenada nuevo = new Nodo_Ordenada ();
			
		nuevo.info = x;
			
		if (raiz == null) {
			
			raiz = nuevo;
		}
		else {
			
			nuevo.siguiente = raiz;
			
			raiz = nuevo;
		}	
	}
	
	public void insertar (int x) {
		
		if (raiz == null || x < raiz.info) {
			insertarPrimero(x);
			
		}
		else {
			Nodo_Ordenada busca = raiz;
			
			int posicion = 1;
			 
				while (busca.info < x && busca.siguiente != null) {
					posicion++;
					busca = busca.siguiente;
				}
				
				if (busca.siguiente == null && busca.info < x) {
					posicion++;
				}
				insertaPosicion(posicion, x);

		}
		
		
	}
	private void insertarUltimo (int x) {
		
		Nodo_Ordenada nuevo = new Nodo_Ordenada ();
		
		nuevo.info = x;
		
		Nodo_Ordenada busca = raiz;
		
		while (busca.siguiente != null) {
			
			busca = busca.siguiente;
		}
		busca.siguiente = nuevo;
	}	
		
	public void mostrarLista () {
		Nodo_Ordenada busca = raiz;
		
		while (busca != null) {
				
			System.out.print(busca.info+ " " + "-->" + " ");
			
			busca = busca.siguiente;
		}
		System.out.println();
	}	
	
	
	
	public static void main(String[] args) {
		
		
		Lista_Ordenada lista1 = new Lista_Ordenada ();
		
		lista1.insertar(0);
		lista1.insertar (-1);
		
		lista1.mostrarLista();
		
		lista1.insertar (2);
		lista1.insertar (1);
		lista1.insertar (9);
		lista1.insertar (6);
		lista1.insertar (23);
		lista1.insertar (100);
		lista1.insertar (5);
		
		
		lista1.mostrarLista();
		
		
		
	}

}
