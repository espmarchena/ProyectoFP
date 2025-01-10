package clases;

public class Principal2 {

	public static void main(String[] args) { //aqui hay cuatro objetos (a1, a2, a3, a4)
	
		Asignatura a1 = new Asignatura();
		a1.imprimirNombreProfesor(); //llamo al objeto y al metodo para que haga lo que hay dentro
		System.out.println("El nombre del profesor es: " + a1.profesor); //llamo al objeto y al atributo
		System.out.println(" ");
		
		
		Asignatura a2 = new Asignatura("Paco Martos");
		System.out.println("El nombre del profesor es: " + a2.profesor);
		System.out.println(" ");
		
		
		Asignatura a3 = new Asignatura(200);
		System.out.println("El numero de horas es: " + a3.horas);
		System.out.println(" ");
		
		
		Asignatura a4 = new Asignatura();
		System.out.println("El nombre del profesor es: " + a4.profesor);
		System.out.println("El numero de horas es: " + a4.horas);
		System.out.println("El nombre es: " + a4.nombre); //sale null al ejecutar pq no le he asignado valor
	}
}
