package Colecciones;

import java.time.LocalDate;
import java.time.Month;

public class Main {

	public static void main(String[] args) {
		Caja_Cromos listaCromos = new Caja_Cromos();

		listaCromos.addCromos(new Cromo(80, "epson", LocalDate.of(2001, Month.MARCH, 4)));
		listaCromos.addCromos(new Cromo(50, "nopon", LocalDate.of(2021, Month.MARCH, 5)));
		listaCromos.addCromos(new Cromo(100, "erton", LocalDate.of(2101, Month.MARCH, 21)));
		listaCromos.addCromos(new Cromo(140, "erton", LocalDate.of(2015, Month.MARCH, 21)));
		listaCromos.addCromos(new Cromo(90, "peson", LocalDate.of(2011, Month.MARCH, 7)));
		listaCromos.addCromos(new Cromo(90, "meson", LocalDate.of(2011, Month.MARCH, 7)));

		listaCromos.mostrarLista();
		System.out.println("------------------------");
		listaCromos.ordenar();
		listaCromos.mostrarLista();
	}

}
