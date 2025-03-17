package es.cesur.ejercicio19interfaces;

public class Perro implements Animal{

	private String tamanio;
	private int edad;
	
	
	@Override
	public void comer() {
		System.out.println("El perro de tamanño " + tamanio + " y edad " + edad + " está comiendo");
	}
	
	@Override
	public void dormir() {
		System.out.println("El perro de tamanño " + tamanio + " y edad " + edad + " está duriendo");

	}

	public Perro(String tamanio, int edad) {
		super();
		this.tamanio = tamanio;
		this.edad = edad;
	}

	public String getTamanio() {
		return tamanio;
	}

	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
	
	
	
	
}
