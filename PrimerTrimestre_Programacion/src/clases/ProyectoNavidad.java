package clases;

import java.util.Scanner;

public class ProyectoNavidad {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		String[] preguntas = {"Permito navegar entre directorios, ¿quién soy", 
								"Digo en que directorio estás",
								"Listo las carpetas del directorio"};
				
		
		String[] respuestas = {"pwd", "cd", "ls", 
								"cd", "move", "pwd",
								"ls", "copy", "greg"};
		int[] preguntasRespuesta = {0, 0, 0, 
									1, 1, 1,
									2, 2, 2};
		boolean[] correctaRespuesta = {false, true, false, // respuestas - pregunta 1 
									true, false, false, // respuestas - pregunta 2
									true, false, false}; // respuestas - pregunta 3
		
 		for (int i = 0; i < preguntas.length; i++) {
			System.out.println(preguntas[i]);
			
			int contadorRespuesta= 1;
			int correcta= 0;

			for (int j = 0; j < respuestas.length; j++) { //para cada pregunta busco cada respuesta
				
				//System.out.println("\t" + respuestas[j]);
				if (i == preguntasRespuesta[j]) {
					System.out.println("\t" + respuestas[j] + " - " + correctaRespuesta[j]); //pinto la respuesta y su valor (true o false)
					
					if(correctaRespuesta[j]==true) {
						correcta= contadorRespuesta; //guardamos la respuesta correcta para poder compararla luego
					}
				contadorRespuesta++;
				}
			}
			System.out.println("¿¿Cuál es la respuesta correcta??");
			int respuestaUsuario= sc.nextInt();
			
			if(respuestaUsuario == correcta) {
				System.out.println("ACERTASTE");
			}
			else {
				System.out.println("OOHHHH");
			}
 		}	
		
	
		
 		sc.close();;
	}
 }
