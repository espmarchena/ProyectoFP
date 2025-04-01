package ejercicio3;

public class Persona {
    private int id;
    private String nombre;
    private String apellidos;
    private String domicilio;
    private String telefono;

    // constructor vacío
    public Persona() {
        this.id = 0;
        this.nombre = "";
        this.apellidos = "";
        this.domicilio = "";
        this.telefono = "";
    }

    // constructor con parámetros
    public Persona(int id, String nombre, String apellidos, String domicilio, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

    
    // getters y Setters (para controlar el acceso a atributos privados)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

 
}
