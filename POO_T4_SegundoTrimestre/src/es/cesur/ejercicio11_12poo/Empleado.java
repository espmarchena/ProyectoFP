package es.cesur.ejercicio11_12poo;

public class Empleado extends Persona{
	private String puesto;
	
	public Empleado() {
		super();	
	}

	public Empleado(String nombre, String apellidos, String dni, String domicilio, String telefono, String puesto) {
		super(nombre, apellidos, dni, domicilio, telefono);
		this.puesto = puesto;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	
	
	// POLIMORFISMO. Método saludar en la clase empleado que sobrescribre el metodo saludar de la clase persona
		public void saludar() {
			super.saludar();
			System.out.println("Y mi puesto es " + puesto);
		}
	
}
