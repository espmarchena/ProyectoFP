package ejercicio1;

public class TestAcademiaIdiomas {

	public static void main(String[] args) {
		
        // Creo los centros con el constructor por parámetros
		// (nombre del centro, dirección y código que identidica al centro)
        Centro centro1 = new Centro("Escuela de inglés", "Reyes Católicos 14", 001);
        Centro centro2 = new Centro("Escuela de francés", "Cristobal Colón 92", 002);

        // Creo las asignaturas con el constructor por parámetros
        // (nombre de la asignatura, nº de horas que se imparte, código que identifica la asignatura)
        Asignatura inglesB1 = new Asignatura("Inglés B1", 120, "ING-B1");
        Asignatura inglesB2 = new Asignatura("Inglés B2", 120, "ING-B2");
        Asignatura francesA2 = new Asignatura("Francés A2", 80, "FRA-A2");
        Asignatura francesB1 = new Asignatura("Francés B1", 80, "FRA-B1");

        // Creo los alumnos, incluyéndome a mí, con el constructor por parámetros
        // (nombre del alumno, dirección, nº matrícula, nota de la asignatura, centro en el que estudia y asignatura en la que está matriculado)
        Alumno alumno1 = new Alumno("Ana Abel", "Paseo de América 15", 1001, 7.0f, centro1, inglesB1);
        
        Alumno alumno2 = new Alumno("Benito Gómez", "Reyes Católicos 16", 1002, 6.0f, centro1, inglesB2);
        
        Alumno alumno3 = new Alumno("Carmen López", "Reyes Católicos 2", 1003, 5.0f, centro1, inglesB1);

        Alumno alumno4 = new Alumno("Esteban Escalera", "Isabel la Católica 28", 1004, 9.0f, centro2, francesB1);
        
        Alumno alumno5 = new Alumno("Francisco Farfán", "Cristóbal Colón s/n", 1005, 8.5f, centro2, francesA2);

        Alumno alumno6 = new Alumno("Esperanza Marchena", "Avd. Aljarafe 2", 1006, 4.5f, centro2, inglesB2);

        // 1. Mostrar por pantalla el nombre y la dirección de todos los centros
        System.out.println("--- Lista de Centros ---");
        System.out.println("Centro: " + centro1.getNombreCentro() + ", Dirección: " + centro1.getDireccionCentro());
        System.out.println("Centro: " + centro2.getNombreCentro() + ", Dirección: " + centro2.getDireccionCentro());
        System.out.println();

        // 2. Mostrar por pantalla el nombre y la dirección del centro en el que está matriculada Carmen
        System.out.println("--- Información de Carmen ---");
        System.out.println("La alumna: " + alumno1.getNombreAlumno() +
                ", está matriculada en el Centro: " + alumno1.getCentro().getNombreCentro() +
                " con dirección: " + alumno1.getCentro().getDireccionCentro());
        System.out.println();

        // 3. Mostrar por pantalla la nota que Benito ha sacado en el B2
        System.out.println("--- Nota de Benito ---");
        System.out.println("La nota que ha sacado " + alumno2.getNombreAlumno() +
                " en " + alumno2.getAsignatura().getNombreAsig() +
                " es un " + alumno2.getNota());
		
		
	}

}
