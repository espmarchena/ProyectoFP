package clases;

public class ClaseEjecucion {

	public void ejecutar() {
		System.out.println("Comienzo programa!!");
		
		Asignatura aProgramacion = new Asignatura("Programacion", 256);
		Asignatura aBaseDatos = new Asignatura("Base de Datos", 220);
		Asignatura aSistemas = new Asignatura("Sitemas Informaticos", 198);
		Asignatura aMarcas = new Asignatura("Lenguaje de Marcas", 120);
		
		Asignatura[] asignaturas = new Asignatura[4]; //creo array y a continuacion asigno valores
		asignaturas[0] = aProgramacion;
		asignaturas[1] = aBaseDatos;
		asignaturas[2] = aSistemas;
		asignaturas[3] = aMarcas;
		
		comienzaCurso(asignaturas); //llamo al metodo
		
		System.out.println("Fin del programa!!");
	}

	private void comienzaCurso(Asignatura[] asignaturas) {
		for (int i=0; i<asignaturas.length; i++) {
			asignaturas[i].presentarAsignatura();
			
			System.out.println(asignaturas[i].toString()); //metodo que devuelve el contenido de mi clase
		}
	}
	
	
}
