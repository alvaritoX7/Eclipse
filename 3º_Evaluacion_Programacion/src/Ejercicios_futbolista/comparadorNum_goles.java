package Ejercicios_futbolista;

import java.util.Comparator;

public class comparadorNum_goles implements Comparator<Futbolista>{

	@Override
	public int compare(Futbolista o1, Futbolista o2) {
		
		return o1.getNum_goles() - o2.getNum_goles();
	}

}
