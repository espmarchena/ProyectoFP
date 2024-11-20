package clases;

public class Matriz_String {

	public static void main(String[] args) {
		// funcion que reciba un array de String y un apellido y que devuelva cuantos hay
		
		String personas[][]= {{"Esperanza", "Marchena", "Moreno"}, {"Jose Manuel", "Guillamon", "Marin"}}; //matriz de dos personas // String personas[][]=new String [2][3];
		
		System.out.println(personas[0][1]); //Marchena
		System.out.println(personas[1][2]); //Marin
		
		for (int i=0; i<personas.length; i++) { //personas.length devuelve un 2 (las filas)
			
			System.out.println(personas[i][0]); // pinta el nombre de todas las personas,
												//porque estan en la fila i que va a ir recorriendo todas las filas y en la posicion 0 siempre
			
		}
	}
	
	
	
}
