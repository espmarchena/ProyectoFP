package es.cesur.ejercicio18interfaces;

public class Documento extends FuenteDeDatos implements Imprimible, Editable{

	private int numeroPaginas;

	public Documento(String formato, int tamanio, int numeroPaginas) {
		super(formato, tamanio);
		this.numeroPaginas = numeroPaginas;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	@Override
	public void imprimir() {
		System.out.println("El documento con formato " + formato + 
				           " y número de páginas " + numeroPaginas + " se está imprimiendo." );
		
	}
	
	public void leer() {
		System.out.println("Accedemos a la fuente de datos  de formato " + formato +
							" tamaño " + super.getTamanio() + " Mb, y número de p"
									+ "aginas " + numeroPaginas + " para leer su contenido.");
	}

	@Override
	public void editar() {
		System.out.println("Estamos editando el documento con formato " + formato + " número de páginas " + numeroPaginas + " y tamaño " + super.getTamanio());
	}

}