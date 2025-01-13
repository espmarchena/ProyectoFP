package clases;

public abstract class InstrumentoMusical { //se indica clase abstracta porque contiene un metodo abstracto.
//Pueden existir clases abstractas sin poseer metodos abstractos, pero no pueden existir metodos abstractos sin estar en una clase abstracta.
//En el momento que tengo una clase abstracta, no puedo instanciar un objeto de ese tipo -> InstrumentoMusical im = new InstrumentoMusical();
//Las superclases suelen ser abstractas cuando son génericas, cuando no tiene sentido que yo genere un objeto concreto de esa clase. Instrumento es abstracto, pero el tipo de instrumento ya es algo definido (guitarra, piano...)

	private String nombre;

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void emmitirSonido() { //esto se llama metodo implementado
		System.out.println("DO");
	}
	
	public abstract void emitirSonido(); //esto se llama metodo abstracto, no esta implementado. Este metodo significa que OBLIGA a los hijos a tener un metodo que se llame asi y que haga algo
	//le estoy diciendo a la clase padre que todos sus hijos tienen que hacer algo obligatoriamente, en este caso, emitir un sonido
}
