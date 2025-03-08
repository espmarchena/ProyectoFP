package es.cesur.ejercicio9poo;

public class Equipo {

	private String nombre;
	private int anyoFundacion;
	private int numSocios;
	
	public Equipo(String nombre, int anyoFundacion, int numSocios) {
		this.nombre = nombre;
		this.anyoFundacion = anyoFundacion;
		this.numSocios = numSocios;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAnyoFundacion() {
		return anyoFundacion;
	}

	public void setAnyoFundacion(int anyoFundacion) {
		this.anyoFundacion = anyoFundacion;
	}

	public int getNumSocios() {
		return numSocios;
	}

	public void setNumSocios(int numSocios) {
		this.numSocios = numSocios;
	}
	
	
}
