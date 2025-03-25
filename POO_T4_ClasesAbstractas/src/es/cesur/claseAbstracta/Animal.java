package es.cesur.claseAbstracta;

public abstract class Animal {

	private String nombre;

	
	public Animal(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public abstract void hacerSonido();
	
	public void dormir() {
		System.out.println("El animal " + nombre + " está durmiendo");
	}
}
