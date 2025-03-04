package es.cesur.ejercicio6poo;

public class Instrumento {

	private String nombre;
	private char afinacion;
	
	public Instrumento(String nombre, char afinacion) {
		this.nombre = nombre;
		this.afinacion = afinacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public char getAfinacion() {
		return afinacion;
	}

	public void setAfinacion(char afinacion) {
		this.afinacion = afinacion;
	}
	
	
	
}
