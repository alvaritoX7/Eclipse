package Ejercicios_futbolista;

import java.util.Comparator;

public class ordenacionConbinado implements Comparator<Futbolista>{

	@Override
	public int compare(Futbolista o1, Futbolista o2) {
		
		if(o1.getNombre().compareToIgnoreCase(o2.getNombre()) == 0) {
			return o1.getEdad() - o2.getEdad();
		}
		else {
			return o1.getNombre().compareToIgnoreCase(o2.getNombre());
		}
		
	}

}
