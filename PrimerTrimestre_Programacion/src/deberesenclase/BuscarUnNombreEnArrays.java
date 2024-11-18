package deberesenclase;

import java.util.Scanner;

public class BuscarUnNombreEnArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int NUMERO_ALUMNOS = 20;
		
		int opcion;
		String[] nombres = new String[NUMERO_ALUMNOS];
		int[] edades = new int[NUMERO_ALUMNOS];
		int contador = 0;
		
		nombres[contador] = "Luis";
		edades[contador] = 25;
		contador++;
		nombres[contador] = "Carlos";
		edades[contador] = 18;
		contador++;
		
		do {
			
			System.out.println("Opciones: \n" + 
									"\t1.Añadir datos\n" + 
									"\t2.Ver datos\n" + 
									"\t3.Ver datos al revés\n" +
									"\t4.Buscar datos\n" +
									"\t5.Salir\n"
									+ "Elige una opción:");
			opcion = sc.nextInt(); 
			 			
			switch (opcion) {
				case 1: // Añadir datos a las tablas
					if (contador < NUMERO_ALUMNOS) {
						System.out.println("Introduzca nombre: ");
						sc.nextLine();
						nombres[contador] = sc.nextLine();
						System.out.println("Introduzca edad: ");
						edades[contador] = sc.nextInt();
						contador++;
					} else {
						System.out.println("Registro completo");
					}
					break;
				case 2: // Ver datos de 0 a NUMERO_ALUMNOS
					for (int i = 0; i < NUMERO_ALUMNOS; i++) {
						if (nombres[i] != null) {
							System.out.println(nombres[i] + " - " + edades[i]);
							
						}
					}
					break;
				case 3: // Ver datos de NUMERO_ALUMNOS a 0
					
					for (int i = NUMERO_ALUMNOS - 1; i >= 0; i--) {
						if (nombres[i] != null) {
							System.out.println(nombres[i] + " - " + edades[i]);
							
						}
					}
					break;
				case 4: // Buscar datos
					boolean encontrado = false;
					int contadorEncontrados = 0;
					System.out.println("Introduce un nombre que buscar: ");
					sc.nextLine();
					String nombreABuscar = sc.nextLine();
					for (int i = 0; i < NUMERO_ALUMNOS; i++) {
						if (nombreABuscar.equals(nombres[i])) {
							encontrado = true;
							contadorEncontrados++;
							System.out.println(i + " - " + nombres[i] + " - " + edades[i]);
							
						}
					}
					if (!encontrado) { // contadorEncontrados == 0
						System.out.println("No existen datos con ese valor");
					} else {
						System.out.println("Se han encontrado " + contadorEncontrados + " alumnos");
					}
					break;
				case 5:
					System.out.println("Hasta otra!!!");
					break;
				default:
					System.out.println("Opción incorrecta");
					
			}
			
		} while (opcion != 5);
		
		System.out.println("Fin del programa!!!");
		sc.close(); 
		

	}

}
