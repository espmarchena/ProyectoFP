package clases;

public class Asignatura { // el constructor se tiene que llamar exactamente igual que la clase 
	//ATRIBUTOS . Ponerlos siempre protected si va a tener herencia, sino private
	public String nombre;
	public String profesor;
	public int horas;
	
	private String profesor1;
	private int horas1;
 
	//CONSTRUCTORES . Siempre privados
	//Es una funcion a la que le puedo meter el codigo que quiera. 
	public Asignatura(String nombre, String profesor, int horas) {} //constructor con parametros
	
	public Asignatura() { //constructor sin parametros
		profesor = "José Manuel Guillamón";
		horas = 100;
		System.out.println("Estoy creando una Asignatura");
	} 
	public Asignatura (String p) {
		profesor = p;
		System.out.println("Estoy creando una Asignatura con el nombre del profesor");
	}
	public Asignatura (int h) {
		horas= h;
		System.out.println("Estoy creando una Asignatura con las horas");
	}
	public Asignatura (int h, String p, String n) {
		horas = h;
		profesor = p;
		nombre = n;
		System.out.println("Estoy creando una Asignatura con todos los datos");
	}
	
	/*
	 public Asignatura (String nombre, String profesor, int horas) {
		super(); // se refiere al atributo del padre en la herencia, la superclase.
		this.nombre = nombre; // esto significa que al atributo le asignas el valor de la variable local que le llega por parametro al constructor
		this.profesor = profesor;
		this.horas = horas;
	}
	//this.-> representa mi contenido de la clase, el valor de mi atributo. Es un indicador de que ese es el atributo. Se usa para cuando hay ambiguedad y poderlo diferenciar
		si quiero imprimir el valor del atributo 'original' o sea el que le di por defecto en un principio, lo llamo con el this.
	*/
	
	
	//METODOS . Siempre públicos 
	public void impartir() {}

	public int cantidadExamenes() { // int-> tipo de parametro que devuelvo en el return
		return 5;
	}
	
	public void imprimirNombreProfesor() {
		System.out.println("El nombre del profesor es: " + profesor);
	}

	public void cambiarNombreProfesor(String p) {
		if (p.length() >= 4 && p.length() <= 255) {
			profesor1 = p; // uso el atributo privado
		}
	}
	
	
	//METODOS GET Y SET
	public void setHoras(int h) { //modifica valor al atributo privado
		horas = h;
	} 
	public void setProfesor(String profesor) { //modifica valor al atributo privado
		this.profesor = profesor; // esto significa que al atributo 'origen' le asignas el valor que le llega por parametro al constructor
	} //utilizo this porque hay ambiguedad con una variable local (la del parametro) 
	
	public int getHoras(){ // te da el valor del atributo privado
		return horas;
	}
	public String getProfesor(){ // te da el valor del atributo privado
		return profesor;
	}
}


