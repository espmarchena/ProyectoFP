package es.cesur.ejercicio11_12poo;

public class Aula {
	private String nombreAula;
	private int numAlumnos;
	
	public Aula() {
}
	
	public Aula(String nombreAula, int numAlumnos) {
		this.nombreAula = nombreAula;
		this.numAlumnos = numAlumnos;
	}

	public String getNombreAula() {
		return nombreAula;
	}

	public void setNombreAula(String nombreAula) {
		this.nombreAula = nombreAula;
	}

	public int getNumAlumnos() {
		return numAlumnos;
	}

	public void setNumAlumnos(int numAlumnos) {
		this.numAlumnos = numAlumnos;
	}
}
