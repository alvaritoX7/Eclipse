package Ejercicios_futbolista;

import java.util.Comparator;

public class comparadorNombre implements Comparator<Futbolista>{

	@Override
	public int compare(Futbolista o1, Futbolista o2) {
		
		return o1.getNombre().compareToIgnoreCase(o2.getNombre());
	}


}
