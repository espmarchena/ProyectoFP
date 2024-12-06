package estudiandoparaelexamen2;

public class Ejercicio9 {

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

		String nombres[] = buscarPersonasPorInstrumentos(datos, "Guitarra");
		for (int i=0; i<nombres.length; i++) {
			System.out.println(nombres[i]);
		}
	}
	
	public static String[] buscarPersonasPorInstrumentos (String[][] datos, String instrumento){
		int contador = 0; //para saber cuantas personas tocan un instrumento
		
		for (int i=0; i<datos.length; i++) { //datos.lenght es el numero de filas que tengo en la matriz facilitada en el main
			if (datos[i][1].equals(instrumento)){ //en la 'j' pongo '1' porque es la columna 1 donde estan los instrumentos y quiero que sea un valor fijo para controlar los instrumentos
				contador++;
			}
		}
		String[] nombres = new String [contador];
		
		for (int i=0; i<datos.length; i++) {
			if (datos[i][1].equals(instrumento)){ //en la 'j' pongo '1' porque es la columna 1 donde estan los instrumentos y quiero que sea un valor fijo para controlar los instrumentos
				nombres[contador++] = datos[i][0]; //en la 'i' pongo '0' porque es la columna 0 donde estan los nombres y quiero que sea un valor fijo para controlar los nombres
			}
		}
		return nombres;
	}
}
