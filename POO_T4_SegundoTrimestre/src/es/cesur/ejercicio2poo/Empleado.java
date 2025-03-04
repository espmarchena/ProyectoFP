package es.cesur.ejercicio2poo;

public class Empleado {

	//ATRIBUTOS con modificador de acceso privado
	private String nombre;
	private String apellidos;
	private String DNI;
	private String domicilio;
	private String puesto;
	private String telefono;
	
	//CONSTRUCTORES por defecto y por parametros
	public Empleado () {
		nombre = "";
		apellidos = "";
		DNI = "";
		domicilio = "";
		puesto = "";
		telefono = "";
	}
	
	public Empleado(String n, String a, String dni, String d, String p, String t) { // source/generate constructor using Fields
		this.nombre = n;
		this.apellidos = a;
		this.DNI = dni;
		this.domicilio = d;
		this.puesto = p;
		this.telefono = t;	}

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

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
}
