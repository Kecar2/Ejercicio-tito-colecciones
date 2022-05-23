package Colecciones;

import java.util.*;

public class Caja_Cromos {

	private ArrayList<Cromo> misCromos = new ArrayList<Cromo>();
	Iterator<Cromo> it;

	public void addCromos(Cromo c) {

		if (misCromos.contains(c)) {
			System.out.println("Este cromo ya existe!");
		} else
			misCromos.add(c);
	}

	public void mostrarLista() {
		it = misCromos.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	public void ordenar() {

		Collections.sort(misCromos);
	
	}


}
