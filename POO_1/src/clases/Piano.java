package clases;

public class Piano extends InstrumentoMusical {

	private int numeroTeclas;

	
	public int getNumeroTeclas() {
		return numeroTeclas;
	}

	public void setNumeroTeclas(int numeroTeclas) {
		this.numeroTeclas = numeroTeclas;
	}
	
	@Override // esto es una anotación. Quiere decir que esta sobreescribiendo un metodo del padre. 
	public void emitirSonido() {
		System.out.println("piano");
		//super.emitirSonido(); //llama al metodo del padre dentro del suyo propio
	}
}
