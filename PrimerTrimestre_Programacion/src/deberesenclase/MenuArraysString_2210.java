package deberesenclase;

import java.util.Scanner;

public class MenuArraysString_2210 {

	public static void main(String[] args) {
		// TODO Crear menú con 3 opciones (1.introduce nombre persona, 2. ver datos, 3. salir) y declarar tabla de String con 20 posiciones pedidas por scanner

		Scanner sc = new Scanner(System.in);
		
		String tabla[] = new String [4]; // declaro la tabla con la longitud 4
		System.out.println("La longitud será de: " + tabla.length); // imprimo la longitud de mi tabla
		System.out.println("-------------------");
		
		final int NUMERO_ALUMNOS=4;
		int opcion;
		int posicion=0;
		String nombre="";
		
		
		
			do {
	
				System.out.println("Opción 1. Introducir datos");
				System.out.println("Opción 2. Ver datos");
				System.out.println("Opción 3. Ver datos al revés");
				System.out.println("Opción 4. Salir");
				System.out.println("**Selecione una opción:**");
				System.out.println("-------------------");
				
				opcion=sc.nextInt();
				sc.nextLine();
					
					switch (opcion) {
					case 1:
						System.out.println("Opción seleccionada: introducir datos");
						System.out.println("Introduzca el nombre del usuario:");
						nombre = sc.nextLine();    //el usuario introduce el nombre por pantalla
						tabla[posicion++]=nombre; //añade a la tabla lo que el usuario introduce por pantalla, aumentando contador
						
						break;
						
					case 2:
						System.out.println("Opción seleccionada: ver datos");
						
					
						for (int i=0; i<tabla.length; i++) {			// (int i=0; i<contador; i++)     ***solamente pinta hasta el contador para evitar null			
							//System.out.println(tabla[i] == null ? "" : tabla[i]);    ***otra forma de poner de forma más directa las siguientes dos lineas
							if(tabla[i] != null) { 
								System.out.println(tabla[i]);
							}
						}							
						break;
						
					case 3:
						System.out.println("Opción seleccionada: ver datos al revés");
						
						
						for (int i=NUMERO_ALUMNOS-1; i>=0; i--) {	
							
							if(tabla[i] != null) {                     // recorro todo mi arrays y los que no son null los pinto
								System.out.println(tabla[i]);
							}
						}							
						break;
						
					case 4:
						System.out.println("Opción seleccionada: salir");
						break;
						
					default:	
						System.err.println("Opción incorrecta");
					}
						
			}
			while(opcion!=4);
				System.out.println("¡Adiós!");
		
		
		
		
		
	
		
		
		
		sc.close();
		
	}

}
