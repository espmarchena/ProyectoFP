package es.cesur.ejercicio7poo;

public class Principal {

	public static void main(String[] args) {

		Autor autor1 = new Autor("J.K", "Rowling", "británica");
		Libro libro1 = new Libro("Harry Potter y la Piedra Filosofal", autor1, 1997, "editorial", 264);
		
		System.out.println("El libro " + libro1.getTitulo() + " es de " + libro1.getAutor().getNombre() + " " + libro1.getAutor().getApellido() + //asi se llama a los valores de un objeto que estan dentro de otro obejto
		" y su nacionalidad es " + libro1.getAutor().getNacionalidad() + ". El libro tiene " + libro1.getnPaginas() + " páginas, es de la editorial " + libro1.getEditorial()
		+ " y se publicó en el año " + libro1.getAnyopublicacion()); 
	}

}
