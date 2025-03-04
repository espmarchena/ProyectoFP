package es.cesur.ejercicio6poo;

public class Musico {
	private String nombre;
	private char sexo;
	
	public Musico(String nombre, char sexo) {
		this.nombre = nombre;
		this.sexo = sexo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	
	
}
