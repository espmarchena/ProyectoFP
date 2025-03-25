package es.cesur.claseAbstracta;

public class Gato extends Animal{

	public Gato(String nombre) {
		super(nombre);
	}

	@Override
	public void hacerSonido() {
		System.out.println("El animal " + super.getNombre() + " dice miau");
		
	}

	
}
