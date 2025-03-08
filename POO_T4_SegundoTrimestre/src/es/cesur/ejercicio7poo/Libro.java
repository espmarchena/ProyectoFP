package es.cesur.ejercicio7poo;

public class Libro {

	private String titulo;
	private Autor autor; // la clase Autor va a darnos el tipo para este atributo . De esta forma relacionamos los atributos de diferentes clases
	private int anyopublicacion;
	private String editorial;
	private int nPaginas;
	
	public Libro() {
		titulo = "";
		autor = new Autor(); //se inicia un atributo con tipo de dato de la otra clase. Instanciamos el objeto vacío
		anyopublicacion = 0;
		editorial = "";
		nPaginas = 0;
	}

	public Libro(String titulo, Autor autor, int anyopublicacion, String editorial, int nPaginas) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.anyopublicacion = anyopublicacion;
		this.editorial = editorial;
		this.nPaginas = nPaginas;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public int getAnyopublicacion() {
		return anyopublicacion;
	}

	public void setAnyopublicacion(int anyopublicacion) {
		this.anyopublicacion = anyopublicacion;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public int getnPaginas() {
		return nPaginas;
	}

	public void setnPaginas(int nPaginas) {
		this.nPaginas = nPaginas;
	}
	
	
	
	
	
}
