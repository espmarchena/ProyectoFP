package ejercicio2;

public class Profesor extends Persona {
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

    // método estático trabajar
    public static void trabajar() {
        System.out.println("El profesor está trabajando.");
    }

    // getters y Setters
    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }
}


