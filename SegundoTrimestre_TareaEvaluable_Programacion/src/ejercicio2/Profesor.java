package ejercicio2;

public class Profesor extends Persona {
	//Solo accesible dentro de la misma clase
    private String titulacion;

    // constructor vacío
    public Profesor() {
        super(); // Llama al constructor vacío de Persona
        this.titulacion = "Sin titulación";
    }

    // constructor con parámetros
    public Profesor(String nombre, String direccion, String titulacion) {
        super(nombre, direccion); // Llama al constructor de Persona
        this.titulacion = titulacion;
    }

    // sobrescribo el método conducir() de Persona
    @Override
    public void conducir() {
        System.out.println(nombre + " (profesor) está conduciendo con precaución.");
    }

    // método estático trabajar. Pertenece a la clase en sí, por lo que puedes llamarlo sin necesidad de crear un objeto de la clase
    public static void trabajar() {
        System.out.println("El profesor está trabajando.");
    }

    // getters y Setters (para controlar el acceso a atributos privados)
    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }
}


