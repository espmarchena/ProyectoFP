package clases;

public class Asignatura { // el constructor se tiene que llamar exactamente igual que la clase 
	//ATRIBUTOS
	public String nombre;
	public String profesor;
	public int horas;
 
	//CONSTRUCTORES. Es una funcion a la que le puedo meter el codigo que quiera. 
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
	
	//METODOS
	public void impartir() {}

	public int cantidadExamenes() { // int-> tipo de parametro que devuelvo en el return
		return 5;
	}
	
	public void imprimirNombreProfesor() {
		System.out.println("El nombre del profesor es: " + profesor);
	}
	
}


