package examenfinal1trimestre;

public class Ejercicio5 {

	public static void main (String args[]) {
		
		String[][] datos = {
	            {"Paco", "Sistemas Informáticos", "DAM"}, 
	            {"David", "Lenguaje de Marcas", "DAW"}, 
	            {"Lidia", "Bases de Datos", "DAM"}, 
	            {"Alejandro", "Planificación y Administración de Redes", "ASIR"}, 
	            {"José Manuel", "Programación", "DAM"}, 
	            {"José Manuel", "Entornos de Desarrollo", "DAW"}};	
		
		
		int profesPorCiclo = contarProfesoresPorCiclo(datos, "DAW");
		System.out.println("Un total de " + profesPorCiclo + " imparten DAW");
		
		String moduloPorProfe = obtenerPrimerModuloPorProfesor(datos, "José Manuel");
		System.out.println("El primer modulo que imparte José Manuel es " + moduloPorProfe);
		
	}

	
	// Función que recibe una matriz y un ciclo, y devuelve el número de profesores que imparten en ese ciclo
	public static int contarProfesoresPorCiclo(String[][] datos, String ciclo) {
	    int contador = 0;
	    for (int i = 0; i < datos.length; i++) {
	        if (datos[i][2].equals(ciclo)) { // Comparar directamente el ciclo
	            contador++;
	        }
	    }
	    return contador;
	}
	
	// Función que recibe una matriz y un profesor, y devuelve el primer módulo que imparte
	public static String obtenerPrimerModuloPorProfesor(String[][] datos, String profesor) {
	    String modulo = ""; // Valor por defecto si no se encuentra
	    for (int i = 0; i < datos.length; i++) {
	        if (datos[i][0].equals(profesor)) { // Comparar directamente el nombre del profesor
	            modulo = datos[i][1]; // Asigna el módulo al encontrarlo
	            break; // Salir del bucle al encontrar el primer módulo
	        }
	    }
	    return modulo;
	}
	
	
}
