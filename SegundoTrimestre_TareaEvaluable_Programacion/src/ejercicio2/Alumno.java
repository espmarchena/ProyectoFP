package ejercicio2;

public class Alumno extends Persona {
	//Solo accesible dentro de la misma clase
    private int numMatricula;
    private float nota;
    private Centro centro;
    private Asignatura asignatura;

    // constructor vacío
    public Alumno() {
        super(); // Llama al constructor vacío de Persona
        this.numMatricula = 0;
        this.nota = 0.0f;
        this.centro = new Centro();
        this.asignatura = new Asignatura();
    }

    // constructor con parámetros
    public Alumno(String nombre, String direccion, int numMatricula, float nota,
    		Centro centro, Asignatura asignatura) {
        super(nombre, direccion); // Llama al constructor de Persona
        this.numMatricula = numMatricula;
        this.nota = nota;
        this.centro = centro;
        this.asignatura = asignatura;
    }

    // sobrescribe el método conducir() de Persona
    @Override
    public void conducir() {
        System.out.println(nombre + " (alumno) está conduciendo con cuidado.");
    }

    // getters y Setters (para controlar el acceso a atributos privados)
    public int getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(int numMatricula) {
        this.numMatricula = numMatricula;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public Centro getCentro() {
        return centro;
    }

    public void setCentro(Centro centro) {
        this.centro = centro;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }
}