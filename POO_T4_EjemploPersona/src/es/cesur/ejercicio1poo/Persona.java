package es.cesur.ejercicio1poo;

public class Persona {

	//ATRIBUTOS
	private String nombre;
	private String apellidos;
	private String DNI;
	private String domicilio;
	private String telefono;
	
	/*CONSTRUCTORES (medotos que nos permiten crear objetos de la clase Persona y tienen el mismo nombre que la clase. Suelen usarse con modificador de acceso public
					para permitirnos crear objetos en cualqueir parte de nuestro programa)*/
	
	public Persona() { //CONSTRUCTOR POR DEFECTO O CONSTRUCTOR VACIO
		nombre = "";
		apellidos = "";
		domicilio = "";
		DNI = "";
		telefono = "";
	}
	
	public Persona(String n, String a, String DNI, String d, String t) { //CONSTRUCTOR POR PARAMETROS
		
		this.nombre = n;
		this.apellidos = a;
		this.DNI = DNI;
		this.domicilio = d;
		this.telefono = t;
	}
	
	
	//METODOS
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

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
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
