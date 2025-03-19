package ejercicio3;

public class TestPersistencia {
	
    public static void main(String[] args) {
    	
        // Creo una instancia de Persistencia
        Persistencia persistencia = new Persistencia();

        // Creo objetos de Persona
        Persona persona1 = new Persona(1, "Juan", "Pérez", "Calle Ibiza 23", "666666666");
        Persona persona2 = new Persona(2, "Ana", "Gómez", "Avenida Europa 6", "777777777");

        // Ejecuta los métodos de persistencia
        persistencia.crearPersona(persona1); // Crear persona1
        persistencia.crearPersona(persona2); // Crear persona2

        // Actualiza persona1
        persona1.setDomicilio("Calle Ruiseñor 66");
        persistencia.actualizarPersona(persona1);

        // Elimina persona2
        persistencia.eliminarPersona(persona2);
    }
}

