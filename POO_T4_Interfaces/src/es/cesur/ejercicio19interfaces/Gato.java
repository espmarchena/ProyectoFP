package es.cesur.ejercicio19interfaces;

public class Gato implements Animal{
	
	private String raza;
	private String color;
	
	@Override
	public void comer() {
		System.out.println("El gato de raza " + raza + " y color " + color + " está comiendo");
	}
	
	@Override
	public void dormir() {
		System.out.println("El gato de raza " + raza + " y color " + color + " está durmiendo");
	}

	public Gato(String raza, String color) {
		super();
		this.raza = raza;
		this.color = color;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
}
