package clases;

import clases.datos.Alumno;
import clases.datos.Asignatura;
import clases.datos.Persona;
import clases.datos.Profesor;

public class ClaseEjecucion {

	public void ejecutar() {
		System.out.println("Comienzo programa!!");
		
		Asignatura[] asignaturas = altaAsignatura();
		
		Alumno[] alumnos = matricularAlumnos();
		
		Profesor[] profesores = altaProfesores(asignaturas);
		
		asignarAsignaturas(alumnos, asignaturas);
		
		comienzaCurso(asignaturas, profesores, alumnos); //llamo al metodo
		
		System.out.println("---------------");
		
		Persona[] personas = obtenerPersonas(alumnos, profesores);
		for (Persona persona : personas) {
			System.out.println("Soy " + persona.getNombre());
			
			if (persona instanceof Profesor) { // compara personas con profesores
				System.out.println(" y soy profesor");
				System.out.println("Mi iban es: " + ((Profesor)persona).getIban()); //CASTEAR CLASES, convierto en profesor la persona
				
			}
			else if (persona instanceof Alumno) { //compara personas con alumnos
				System.out.println(" y soy alumno");
			}			
			//persona.getClass()); //te dice de que clase es la persona, en este caso, alumno o profesor
			System.out.println(persona.hacerExamen());
		}
		
		System.out.println("Fin del programa!!");
	}
	
	private Asignatura[] altaAsignatura() {
		
		//Creo 4 variables e instancio los objetos de tipo Asignatura:
		Asignatura aProgramacion = new Asignatura("Programacion", 256); //constructor
		//Asignatura aProgramacion = new Asignatura(); otra forma de hacerlo, constructor vacío
		//aProgramacion.setNombre("Programacion"); objeto llamando a un metodo y pasandole valor
		//aProgramacion.setHoras(256);objeto llamando a un metodo y pasandole valor
		Asignatura aBaseDatos = new Asignatura("Base de Datos", 220); //constructor
		Asignatura aSistemas = new Asignatura("Sitemas Informaticos", 198); //constructor
		Asignatura aMarcas = new Asignatura("Lenguaje de Marcas", 120); //constructor
				
		Asignatura[] asignaturas = new Asignatura[5]; //se puede crear array y asignarle valores
		asignaturas[0] = aProgramacion; // la posicion 0 es igual a lo que hay en el objeto que he llamado aProgramacion
		asignaturas[1] = aBaseDatos;
		asignaturas[2] = aSistemas;
		asignaturas[3] = aMarcas;
		asignaturas[4] = new Asignatura("Entornos de Desarrollo", 96); // Otra forma de hacerlo. Así no ocupo espacio innecesariamente si no voy a usarlo luego.
		//Declaro una posicion de un array con un objeto Asignatura
				
		return asignaturas;
	}
	

	private void comienzaCurso(Asignatura[] asignaturas, Profesor[] profesores, Alumno[] alumnos) {
		int horas = 0;
		for (int i=0; i<asignaturas.length; i++) {
			asignaturas[i].presentarAsignatura(); //para cada una de las asignaturas, presenta la asignatura
			horas += asignaturas[i].getHoras(); // para saber cuantas horas en total tienen todas las asignaturas juntas
			
			System.out.println(asignaturas[i].toString()); //metodo que devuelve el contenido de mi clase
		}
		System.out.println("Este curso tiene " + horas + " horas.");
		System.out.println(" ");
		
		presentacionProfesores(profesores);
		presentacionAlumnos(alumnos);
	}
	
	private void presentacionAsignaturas(Asignatura[] asignaturas) {
		int horas = 0;
		for (int i = 0; i < asignaturas.length; i++) {
			asignaturas[i].presentarAsignatura();
			horas += asignaturas[i].getHoras();
		}
		System.out.println("El total de horas es: " + horas);
	}
	
	private void presentacionProfesores(Profesor[] profesores) {
		for (Profesor profesor : profesores) { //for each. No sabe en que posicion estas. Si voy a hacer lo mismo para todos, sirve, sino no.
			System.out.println("Soy " + profesor.getNombre() + " e imparto las siguientes asignaturas: "); //recorro toda la lista de profesores y para cada uno dice su nombre
			
			presentacionAsignaturas(profesor.getAsignatura());
		}	
		System.out.println(" ");
	}
	
	private void presentacionAlumnos(Alumno[] alumnos) {
		for (Alumno alumno : alumnos) { //for each. No sabe en que posicion estas. Si voy a hacer lo mismo para todos, sirve, sino no.
			System.out.println("Soy alumno y me llamo " + alumno.getNombre()); //recorro toda la lista de profesores y para cada uno dice su nombre			
		}
		System.out.println(" ");
	}
	
	private Alumno[] matricularAlumnos() {
		//Persona p = new Persona(); // como la clase Persona es abstracta, no me permite instanciar objetos
		//Profesor pr = new Profesor();
		//Alumno a = new Alumno();
		
		Alumno[] alumnos = new Alumno[4];
		alumnos[0] = new Alumno ("Espe", "Marchena", "666777888", "espe@cesur.com");
		alumnos[1] = new Alumno ("Naiara", "Vargas", "678678678", "nai@cesur.com");
		alumnos[2] = new Alumno ("Sonia", "Jaime", "678876678", "sonia@cesur.com");
		alumnos[3] = new Alumno ("Luis", "José", "687687687", "lujo@cesur.com");
		
		return alumnos;
		
	}
	
	private Profesor[] altaProfesores (Asignatura[] asignaturas) {
		Profesor[] profesores = new Profesor[4];
		
		profesores[0] = new Profesor ("Jose Manuel", "Guillamon", "666777888", "jm@cesur.com", "iban1");
		Asignatura[] asignaturasProfesor0 = {asignaturas[0], asignaturas[4]}; //array que contiene programacion y entornos de desarrollo
		profesores[0].setAsignatura(asignaturasProfesor0); // se lo asigno 
		
		profesores[1] = new Profesor ("Lidia", "Gonzalez", "666777888", "lidia@cesur.com", "iban2");
		Asignatura[] asignaturasProfesor1 = {asignaturas[1]};
		profesores[1].setAsignatura(asignaturasProfesor1);
		
		profesores[2] = new Profesor ("Paco", "Martos", "666777888", "paco@cesur.com", "iban3");
		Asignatura[] asignaturasProfesor2 = {asignaturas[2]};
		profesores[2].setAsignatura(asignaturasProfesor2);
		
		profesores[3] = new Profesor ("David", "Postigo", "666777888", "david@cesur.com", "iban4");
		Asignatura[] asignaturasProfesor3 = {asignaturas[3]};
		profesores[3].setAsignatura(asignaturasProfesor3);
		
		
		return profesores;
	}
	
	private void asignarAsignaturas(Alumno[] alumnos, Asignatura[] asignaturas) {
		for (int i=0; i<alumnos.length; i++) {
			alumnos[i].setAsignatura(asignaturas); //por cada alumno le añado todas las asignaturas
		}
	}
	
	private Persona[] obtenerPersonas(Alumno[] alumnos, Profesor[] profesores) {
		Persona[] personas = new Persona[alumnos.length + profesores.length];
		int i = 0;
		for (Alumno alumno : alumnos) {
			personas[i++] = alumno;
		}
		for (Profesor profesor : profesores) {
			personas[i++] = profesor;
		}
		return personas;
	}
}
