package clases;

public class Alta {

	public static void main(String[] args) {
	
	Alta alta = new Alta();
	alta.imprimirNombreProfesor(); //llamo al objeto y al metodo para que haga lo que hay dentro
	System.out.println("El nombre del profesor es: " + alta.profesor); //llamo al objeto y al atributo
	alta.cambiarNombreProfesor("David Postigo"); // este metodo tira de un atributo private y solo asi puedo cambiarle el valor
	System.out.println(" ");

	
	}
}