package Colecciones;

import java.time.LocalDate;
import java.util.Objects;

public class Cromo implements Comparable<Cromo>{
	private int id;
	private static int cont = 1;
	private int valor;
	private String nombre;
	private LocalDate fecha;

	public Cromo(int valor, String nombre, LocalDate fecha) {
		if (valor > 999) {
			throw new IllegalArgumentException("El valor no puede ser mayor que 999");

		} else {
			this.id = cont++;
			this.valor = valor;
			this.nombre = nombre;
			this.fecha = fecha;
		}
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(fecha, id, nombre, valor);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cromo other = (Cromo) obj;
		return Objects.equals(fecha, other.fecha) && id == other.id && Objects.equals(nombre, other.nombre)
				&& valor == other.valor;
	}



	@Override
	public String toString() {
		return "cromos [id=" + id + ", valor=" + valor + ", nombre=" + nombre + ", fecha=" + fecha + "]";
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public static int getCont() {
		return cont;
	}



	public static void setCont(int cont) {
		Cromo.cont = cont;
	}



	public int getValor() {
		return valor;
	}



	public void setValor(int valor) {
		this.valor = valor;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public LocalDate getFecha() {
		return fecha;
	}



	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}



	@Override
	public int compareTo(Cromo o) {
		if (this.valor - o.valor == 0) {
			return this.nombre.compareTo(o.nombre);
		}else 
			return this.valor - o.valor;
	}

}