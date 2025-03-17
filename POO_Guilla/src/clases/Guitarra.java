package clases;

public class Guitarra extends InstrumentoMusical{

	private int numeroCuerdas;

	
	public int getNumeroCuerdas() {
		return numeroCuerdas;
	}

	public void setNumeroCuerdas(int numeroCuerdas) {
		this.numeroCuerdas = numeroCuerdas;
	}
	
	@Override // esto es una anotación. Quiere decir que esta sobreescribiendo un metodo del padre.
	public void emitirSonido() { // este machaca al metodo del padre que se llama igual. Prevalece el suyo propio antes que el heredado
		System.out.println("DO en guitarra");
	}
	
}
