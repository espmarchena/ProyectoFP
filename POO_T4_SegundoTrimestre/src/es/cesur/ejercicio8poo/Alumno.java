package es.cesur.ejercicio8poo;

public class Alumno {
	private String nombre;
	private String apellido;
	private int edad;
	private boolean haPagado;
	private Aula aula;
	
	public Alumno() {
		nombre="";
		apellido="";
		edad= 0;
		haPagado = false;
		aula = new Aula();
	}
	
	public Alumno(String nombre, String apellido, int edad, boolean haPagado, Aula aula) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.haPagado = haPagado;
		this.aula = aula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isHaPagado() {
		return haPagado;
	}

	public void setHaPagado(boolean haPagado) {
		this.haPagado = haPagado;
	}

	public Aula getAula() {
		return aula;
	}

	public void setAula(Aula aula) {
		this.aula = aula;
	}
	
	
}
