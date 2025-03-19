package ejercicio3;

public class Persistencia implements PersistenciaPersonas {

    @Override
    public void crearPersona(Persona persona) {
        System.out.println("Creando persona: " + persona.getNombre() + " " + persona.getApellidos());
    }

    @Override
    public void actualizarPersona(Persona persona) {
        System.out.println("Actualizando persona con ID " + persona.getId() + ": "
    + persona.getNombre() + " " + persona.getApellidos());
    }

    @Override
    public void eliminarPersona(Persona persona) {
        System.out.println("Eliminando persona con ID " + persona.getId() + ": "
    + persona.getNombre() + " " + persona.getApellidos());
    }
}



