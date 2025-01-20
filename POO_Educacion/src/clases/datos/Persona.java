package clases.datos;

import java.util.Arrays;

import clases.acciones.PersonasAcciones;

public abstract class Persona implements PersonasAcciones { //implementa las acciones

	protected String nombre;
	protected String apellido;
	protected String telefono;
	protected String mail;
	
	protected Asignatura[] asignatura = new Asignatura[7]; // atributo del array de asignaturas instanciado

	public Persona () {		
	}
	
	public Persona(String nombre, String apellido, String telefono, String mail, Asignatura[] asignatura) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.mail = mail;
		this.asignatura = asignatura;
	}
	
	public Persona(String nombre, String apellido, String telefono, String mail) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.mail = mail;
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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Asignatura[] getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(Asignatura[] asignatura) {
		this.asignatura = asignatura;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + ", mail=" + mail
				+ ", asignatura=" + Arrays.toString(asignatura) + "]";
	}
	
	// public abstract boolean hacerExamen(); //no lo pongo aqui pq esta en la interfaz
}
