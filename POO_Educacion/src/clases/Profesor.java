package clases;

import java.util.Arrays;

public class Profesor extends Persona implements PersonasAcciones { //implementa las acciones

	protected String iban;

	//constructor con los atributos del padre y el suyo propio
	public Profesor(String nombre, String apellido, String telefono, String mail, String iban) { 
		super(nombre, apellido, telefono, mail); //aqui llama al constructor del padre (Persona)
		this.iban = iban;
	}
	
	public Profesor () {
		super();
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	@Override
	public String toString() {
		return "Profesor [iban=" + iban + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono
				+ ", mail=" + mail + ", asignatura=" + Arrays.toString(asignatura) + "]";
	}
	
	@Override
	public boolean hacerExamen() {
		System.out.println("Soy profesor y hago examenes");
		
		return false;
	}
	
	@Override
	public void irAClase() {
		
	}
	
	
	
}

