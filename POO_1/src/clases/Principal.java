package clases;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nombre:");
		String nombre = sc.nextLine();
		System.out.println("Profesor:");
		String profesor = sc.nextLine();
		System.out.println("Horas:");
		int horas = sc.nextInt();
		
		
		Asignatura[] asignaturas = new Asignatura[2];
		
		Asignatura asig = new Asignatura();
		asig.nombre = nombre;
		asig.profesor = profesor;
		asig.horas = horas;
		
		asignaturas[0] = asig;
		
		
		Asignatura asig2 = new Asignatura();
		asig2.nombre = "Sistemas Informáticos";
		asig2.profesor = "Francisco Martos";
		asig2.horas = 178;
		
		asignaturas[1] = asig2;
		
		for (int i = 0; i<asignaturas.length; i++) {
			System.out.println("Asignatura: ");
			System.out.println("\t" + asignaturas[i].nombre);
			System.out.println("\t" + asignaturas[i].profesor);
			System.out.println("\t" + asignaturas[i].horas);
		}
		
		
		
		Asignatura asig3 = new Asignatura ("Entornos de Desarrollo", "Guillamón", 128); //lo mismo que arriba pero en una sola línea. Tiene que estar tb en la otra clase para que compile
		
	}
	
}
