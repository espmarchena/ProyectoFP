package estudiandoparaelexamen2;

public class Ejercicio9yo1 {

	public static void main(String[] args) {
		//Teniendo la siguiente matriz:  
		String[][] datos = {{"Ana", "Guitarra"},
				{"Pepe", "Piano"},
				{"Carlos", "Guitarra"}, 
				{"Marta", "Batería"},
				{"Manuel", "Batería"},
				{"Rocío", "Guitarra"} }; 

		//Crea una función que recibe la matriz y un instrumento y devuelve un array con los nombres de los alumnos que tocan el instrumento recibido.
		//El array debe tener el tamaño exacto, no pueden sobrar posiciones. 
		
		String[] alumnosInstrumentos = obtenerInstrumento(datos, "Batería");
		for (int i=0; i<alumnosInstrumentos.length;i++) {
			System.out.println(alumnosInstrumentos[i] + " ");
		}
	}

	public static String[] obtenerInstrumento (String[][] datos, String instrumento) {
		int contador=0;
		
		for (int i=0; i<datos.length; i++) { // primer bucle para contar las coincidencias
			if (datos[i][1].equals(instrumento)) {
				contador++; // para determinar tamaño array
			}
		}
		
		String arrayAlumnosInstrumento[] = new String [contador]; // se crea un array con un tamaño exacto al número de coincidencias encontradas
		int contador2=0; //se incrementará con cada coincidencia encontrada
		
		for (int i=0; i<datos.length; i++) { // segundo bucle para llenar el array de nombres
			if (datos[i][1].equals(instrumento)) {
				arrayAlumnosInstrumento[contador2++]= datos[i][0];
			}
		}
		
		return arrayAlumnosInstrumento;
	}	
}
