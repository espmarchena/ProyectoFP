package es.cesur.ejercicio18interfaces;

public class Imagen extends FuenteDeDatos implements Imprimible, Editable {
	
	private String contenido;
	
	public Imagen(String formato, int tamanio, String contenido) {
		super(formato, tamanio);
		this.contenido = contenido;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	@Override
	public void imprimir() {
		System.out.println("La imagen de contenido " + contenido + 
						   " y tamaño " + super.getTamanio() + " Mb, se está imprimiendo.");

	}
	
	public void leer() {
		System.out.println("Accedemos a la fuente de datos  de formato " + formato +
							" tamaño " + super.getTamanio() + " Mb, y contenido "
									+ contenido + " para leerlo.");
	}

	@Override
	public void editar() {
		System.out.println("Estamos editando la imagen con formato " + formato + ", tamaño " + super.getTamanio() + " Mb, y contenido " + contenido);
		
	}

}
