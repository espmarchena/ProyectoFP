package ejercicio3;

public interface PersistenciaPersonas {

	void crearPersona(Persona persona); // Permite crear una persona en la base de datos.

	void actualizarPersona(Persona persona); // Permite actualizar los datos de una persona.

	void eliminarPersona(Persona persona); // Permite eliminar los datos de una persona.

}
