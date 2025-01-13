package clases;

public class Principal2 {

	public static void main(String[] args) { //aqui hay cuatro objetos (a1, a2, a3, a4)
	
		Calculadora c = new Calculadora();
		System.out.println(c.suma(2, 3));
		System.out.println(c.suma(7, 6));
		
		
		Asignatura a1 = new Asignatura();
		a1.imprimirNombreProfesor(); //llamo al objeto y al metodo para que haga lo que hay dentro
		System.out.println("El nombre del profesor es: " + a1.profesor); //llamo al objeto y al atributo
		a1.cambiarNombreProfesor("David Postigo"); // este metodo tira de un atributo private y solo asi puedo cambiarle el valor (por el parametro)
		a1.setProfesor("Lidia"); //es lo mismo que lo anterior
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
		
		//--------------------------------------//
		
		Guitarra g = new Guitarra(); //hijo de instrumentomusical y hermano de piano
		g.setNombre("Mi guitarra");
		g.setNumeroCuerdas(6);
		//g.setNumeroTeclas(50); no compilaría porque no puede heredar de un hermano, va en piramide
		g.emitirSonido();
		
		/* no lo puedo instanciar asi porque la clase es abstracta
		InstrumentoMusical im = new InstrumentoMusical(); //padre de guitarra y piano
		im.setNombre("Mi instrumento");
		im.emitirSonido(); 
		*/
		
		Piano p = new Piano(); //hijo de instrumentomusical y hermano de guitarra
		p.setNombre("Mi piano");
		p.setNumeroTeclas(50);
		// p.setNumeroCuerdas(50); no compilaría porque no puede heredar de un hermano, va en piramide
		p.emitirSonido();
	}
}
