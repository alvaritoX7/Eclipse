package Objeto_06;

public class Lista {
	
	public Nodo raiz;

	public void insertarPrimero (int x) {
		
		Nodo nuevo = new Nodo ();
			
		nuevo.info = x;
			
		if (raiz == null) {
			
			raiz = nuevo;
		}
		else {
			
			nuevo.siguiente = raiz;
			
			raiz = nuevo;
		}	
	}
	
	public void insertarUltimo (int x) {
		
		Nodo nuevo = new Nodo ();
		
		nuevo.info = x;
		
		Nodo busca = raiz;
		
		while (busca.siguiente != null) {
			
			busca = busca.siguiente;
		}
		busca.siguiente = nuevo;
	}
	
	
	public void mostrarLista () {
		Nodo busca = raiz;
		
		while (busca != null) {
				
			System.out.print(busca.info+ " " + "-->" + " ");
			
			busca = busca.siguiente;
		}
		System.out.println();
	}
	
	
	public boolean esta(int x) {
		
		boolean existe = false;
		
		Nodo busca = raiz;
		
		while (busca != null && existe == false) {
			
			if (busca.info == x) {
				existe = true;
			}
			
			busca = busca.siguiente;
		}
		
		return existe;
	}
	
	public void borrar (int x) {
		
		if (raiz.info == x) {
			raiz = raiz.siguiente;
		}
		else {
			Nodo aux = raiz;
			Nodo ant = raiz;
		
			while (aux != null) {
			
				if (aux.info == x) {
					ant.siguiente = aux.siguiente;
				}
				ant = aux;
				aux = aux.siguiente;
			}
		}
	}
	
	public void borrarUltimo () {
		
		Nodo busca = raiz;
		Nodo aux = raiz;
		
		while (busca != null) {
			
			if (busca.siguiente == null) {
				aux.siguiente = busca.siguiente;
			}
			aux = busca;
			busca = busca.siguiente;
			
		}
		
	}
	
	public void mostrarPrimero () {
		
		System.out.println(raiz.info);
	}
	
	public void mostrarUltimo () {
		Nodo busca = raiz;
		
		while (busca != null) {
			
			if (busca.siguiente == null) {
				System.out.println(busca.info);
			}
			busca = busca.siguiente;
			
		}
	}
	
	public void size () {
		
		Nodo busca = raiz;
		int tamaño = 0;
		
		while (busca != null) {
			busca = busca.siguiente;
			tamaño ++;
		}
		System.out.println(tamaño);
	}
	
	public void insertaPosicion (int posicion, int x) {
		Nodo aux = raiz;
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
			
			Nodo nuevo = new Nodo ();
			nuevo.info = x;
		
			Nodo busca = raiz;
		
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
		
	public static void main (String [] args) {
		
		Lista lista = new Lista ();
		
		lista.insertarPrimero(7);
		
		
		lista.insertarPrimero(4);
		
		lista.insertarUltimo(6);
		
		System.out.println(lista.esta(6));
		lista.mostrarLista();
		lista.borrar(7);
		lista.mostrarLista();
		
	}
	
}
