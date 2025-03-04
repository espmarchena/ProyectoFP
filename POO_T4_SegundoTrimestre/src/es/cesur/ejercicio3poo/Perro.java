package es.cesur.ejercicio3poo;

public class Perro {

	//ATRIBUTOS
	private String raza;
	private String tamanio;
	private String edad;
	private String color;
	
	//CONSTRUCTOR
	public Perro(String raza, String tamanio, String edad, String color) {
		this.raza = raza;
		this.tamanio = tamanio;
		this.edad = edad;
		this.color = color;
	}

	//METODOS
	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getTamanio() {
		return tamanio;
	}

	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	
}
