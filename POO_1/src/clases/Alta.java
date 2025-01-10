package clases;

public class Alta {

	Alta a = new Alta();
	a.imprimirNombreProfesor(); //llamo al objeto y al metodo para que haga lo que hay dentro
	System.out.println("El nombre del profesor es: " + a.profesor); //llamo al objeto y al atributo
	a.cambiarNombreProfesor("David Postigo"); // este metodo tira de un atributo private y solo asi puedo cambiarle el valor
	System.out.println(" ");
	
}
