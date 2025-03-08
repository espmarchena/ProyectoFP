package es.cesur.ejercicio10poo;

public class Cliente {

	private String nombre;
	private String DNI;
	private String direccion;
	
	public Cliente(String nombre, String dNI, String direccion) {
		this.nombre = nombre;
		DNI = dNI;
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	
}
