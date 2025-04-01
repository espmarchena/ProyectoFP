package ejercicio2;

public class TestHerencia {

    public static void main(String[] args) {
    	
        // Crear objetos sin polimorfismo
        Persona persona = new Persona("Juan", "Calle Constitución 13");
        Profesor profesor = new Profesor("Ana", "Avenida Real 46", "Matemáticas");
        Alumno alumno = new Alumno("Carlos", "Plaza Mayor 79", 1001, 8.5f, new Centro(), new Asignatura());

        // Llamar a métodos sin polimorfismo
        persona.conducir(); // Llama al método de Persona
        profesor.conducir(); // Llama al método sobrescrito de Profesor
        alumno.conducir(); // Llama al método sobrescrito de Alumno

        // Crear objetos con polimorfismo
        Persona personaPolimorfica1 = new Profesor("Luisa", "Calle Secundaria 9", "Física");
        Persona personaPolimorfica2 = new Alumno("Marta", "Calle Principal 22", 1002, 7.8f, new Centro(), new Asignatura());

        // Llamar a métodos con polimorfismo
        personaPolimorfica1.conducir(); // Llama al método sobrescrito de Profesor, con objeto personaPolimorfica1 de la clase Profesor
        personaPolimorfica2.conducir(); // Llama al método sobrescrito de Alumno, con objeto personaPolimorfica2 de la clase Alumno

        // Llamar al método estático de Profesor
        Profesor.trabajar(); // No necesita una instancia para ser llamado
    }
}

/* Explica qué sucede cuando usas el Polimorfismo:
 * 
 * Permite que un objeto de la superclase (Persona) pueda comportarse como un objeto de una subclase (Profesor o Alumno), llamando a los métodos sobrescritos.
 */


/* Ejecuta también el método estático de la clase Profesor y explica qué sucede al ser estático dicho método:
 * 
 * El método estático trabajar() de la clase Profesor se ejecuta sin necesidad de crear una instancia de la clase.
 * Esto es una característica fundamental de los métodos estáticos, pertenecen a la clase en sí, no a una instancia específica de la clase.
 */
