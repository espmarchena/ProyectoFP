package es.cesur.claseAbstracta;

public class Perro extends Animal{

	public Perro(String nombre) {
		super(nombre);
	}

	@Override
	public void hacerSonido() {
		System.out.println("El animal " + super.getNombre() + " dice guau");
		
	}

	public void dormir() {
		super.dormir();
		System.out.println("Estamos sobrescribiendo en Perro el método dormir() de la clase Animal");
	}
	
}
