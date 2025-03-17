package es.cesur.aprendiendoInterfaces;


public class Acumulador implements IModificacion, IConstantes, INumerico{
	
	private int valorNumerico; //se declara privado para usar la propiedad poo de la encapsulacion
	
	public Acumulador(int valorNumerico) { //constructor por parametros
		this.valorNumerico = valorNumerico;
	}

	//get del atributo de la clase Acumulador
	public int getValorNumerico() {
		return valorNumerico;
	}

	//set del atributo de la clase Acumulador
	public void setValorNumerico(int valorNumerico) {
		this.valorNumerico = valorNumerico; //asigna el valor del parametro al atributo
	}

	/**/

	@Override // @sobreescritura del codigo del metodo abstracto de la interfaz IModificacion
	public void incremento(int cantidadIncrementar) { //aqui es donde escribimos lo que va a hacer el metodo
		valorNumerico = valorNumerico + cantidadIncrementar;
	}

	@Override // @sobreescritura del codigo del metodo abstracto de la interfaz IConstantes
	public void setPrecision(int precision) {
		this.valorNumerico = precision;		
	}

	@Override // @sobreescritura del codigo del metodo abstracto de la interfaz INumerico
	public void setMaximo(int maximo) {
		this.valorNumerico = maximo; //asigna el valor del parametro al atributo	
	}



}
