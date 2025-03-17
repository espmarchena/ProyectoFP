package es.cesur.ejercicio18interfaces;

public class FuenteDeDatos {
	
	protected String formato; //ejemplo con modificador de acceso protected para la visibilidad del atributo desde la subclase
	private int tamanio; //ejemplo de modificador de acceso private
	
	public FuenteDeDatos(String formato, int tamanio) {
		this.formato = formato;
		this.tamanio = tamanio;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public int getTamanio() {
		return tamanio;
	}

	public void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}
	
	public void leer() {
		System.out.println("Accedemos a la fuente de datos  de formato " + formato +
							" y tamaño " + tamanio + " Mb. Para leer su contenido.");
	}
}
