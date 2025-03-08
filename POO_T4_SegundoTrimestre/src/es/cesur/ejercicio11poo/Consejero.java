package es.cesur.ejercicio11poo;

public class Consejero extends Empleado{

	private int numero_acciones;

	public Consejero(String nombre, String apellidos, String dni, String domicilio, String telefono, String puesto, int numero_acciones) {
		super(nombre, apellidos, dni, domicilio, telefono, puesto);
		this.numero_acciones = numero_acciones;
	}

	public int getNumero_acciones() {
		return numero_acciones;
	}

	public void setNumero_acciones(int numero_acciones) {
		this.numero_acciones = numero_acciones;
	}
	
	
}
