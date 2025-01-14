package clases;

import java.util.Arrays;

public class Alumno extends Persona implements AlumnosAcciones, AlumnosFueraAcciones { //implementa las acciones

	public Alumno() {
		super();
	}
	
	public Alumno(String nombre, String apellido, String telefono, String mail) {
		super(nombre, apellido, telefono, mail);
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + ", mail=" + mail
				+ ", asignatura=" + Arrays.toString(asignatura) + "]";
	}
	
	@Override
	public boolean hacerExamen() {
		System.out.println("Soy alumno y hago examenes");
		
		return false;
	}

	@Override
	public void irAClase() {	
	}

	@Override
	public void recogerNotas() {	
	}

	@Override
	public void estudiarExamen() {	
	}

	@Override
	public void hacerEjercicios() {

	}
	
	
	
}
