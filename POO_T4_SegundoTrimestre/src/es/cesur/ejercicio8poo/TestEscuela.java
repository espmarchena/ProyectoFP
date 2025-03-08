package es.cesur.ejercicio8poo;

public class TestEscuela {

	public static void main(String[] args) {
		
		Aula aula = new Aula("DAW", 20);
		
		Alumno a1 = new Alumno("Naiara", "Mesa", 27, false, aula);
		Alumno a2 = new Alumno ("Esperanza", "Marchena", 30, true, new Aula("DAM", 22)); //otra forma de pasar parametros del constructor
		
		System.out.println("La alumna " + a1.getNombre() + " " + a1.getApellido() + " tiene " + a1.getEdad() + " años y parece ser que " + a1.isHaPagado() + " ha pagado."
		 + " Está en la clase de " + a1.getAula().getNombreAula() + " y tiene " + a1.getAula().getNumAlumnos() + " compañeros.");
		
		System.out.println("La alumna " + a2.getNombre() + " " + a2.getApellido() + " tiene " + a2.getEdad() + " años y parece ser que " + a2.isHaPagado() + " ha pagado."
				 + " Está en la clase de " + a2.getAula().getNombreAula() + " y tiene " + a2.getAula().getNumAlumnos() + " compañeros.");
	}

}
