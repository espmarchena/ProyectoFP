package es.cesur.ejercicio4poo;

public class TestPelicula {

	public static void main(String[] args) {
		
		Pelicula pelicula1 = new Pelicula("Avatar I", 2009, 162);
		System.out.println("La película " + pelicula1.getTitulo() + " es del año " + pelicula1.getYear() + " y dura " + pelicula1.getDuracion() + " minutos.");
		
		Pelicula pelicula2 = new Pelicula("Narnia I", 2008, 150);
		System.out.println("La película " + pelicula2.getTitulo() + " es del año " + pelicula2.getYear() + " y dura " + pelicula2.getDuracion() + " minutos.");
		
		Pelicula pelicula3 = new Pelicula("El Señor de los Anillos I", 2001, 178);
		System.out.println("La película " + pelicula3.getTitulo() + " es del año " + pelicula3.getYear() + " y dura " + pelicula3.getDuracion() + " minutos.");
	}

}
