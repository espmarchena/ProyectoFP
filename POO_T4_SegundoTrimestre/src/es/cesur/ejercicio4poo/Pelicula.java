package es.cesur.ejercicio4poo;

public class Pelicula {

	private String titulo;
	private int year;
	private int duracion;
	
	public Pelicula(String titulo, int year, int duracion) {
		this.titulo = titulo;
		this.year = year;
		this.duracion = duracion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	
	
	
}
