package es.cesur.poo;

public class Persona {

	/*Declaramos los atributos de clase con modificador de acceso private para usar la propiedad de la encapsulacion de la POO*/
	
	private String nombre;
	private String apellidos;
	private int edad;
	private boolean haPagado;
	private int aula;
	
	/*Los metodos constructores nos van a permitir construir objetos de nuestra clase Persona. Tienen el mismo nombre de la clase */
	
	//CONSTRUCTOR VACÍO O POR DEFECTO. Se inician los valores en nulo
	public Persona() {
		nombre= "";
		apellidos="";
		edad= 0;
		haPagado= false;
		aula= 0;
	}
	
	//CONSTRUCTOR POR PARAMETROS. Asigna el parametro(derecha) al atributo de clase(izquierda)
	public Persona(String n, String a, int e, boolean h, int au) {
		nombre = n;
		apellidos = a;
		edad = e;
		haPagado = h;
		aula = au;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre; //el this indica que es el atributo de clase
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean getHaPagado() {
		return haPagado;
	}

	public void setHaPagado(boolean haPagado) {
		this.haPagado = haPagado;
	}

	public int getAula() {
		return aula;
	}

	public void setAula(int aula) {
		this.aula = aula;
	}
	
	
	
	
	
}
