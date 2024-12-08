package estudiandoparaelexamen2;

public class Ejercicio2yo1 {

	public static void main(String[] args) {
		// Crea un programa con tres funciones: 
		//- Una función que devuelve un array de longitud 10 de números aleatorios 
		//- Una función que reciba ese array y devuelva el número menor del array
		//- La función main que hace la llamada a las dos anteriores
		
		int[] numAleatorio= obtenerNumsAleatorios();
		for (int i=0; i<numAleatorio.length;i++) {
			System.out.print(numAleatorio[i] + " ");
		}
		
		int numMenor = obtenerNumMenor(numAleatorio);
		System.out.println("El número menor es: " + numMenor);
	}
	
	public static int[] obtenerNumsAleatorios() {
		int[] array = new int[10];
		int max=15;
		int min=1;
		int range= (max-min) +1;
		
		for (int i=0; i<10; i++) {
			array[i]= (int) ((range * Math.random()) + min);
		}
		
		return array;
	}
	
	
	public static int obtenerNumMenor(int[] array) {
		int numMenor = array[0];
		
		for (int i=0; i<array.length; i++) {
			if (array[i]<numMenor) {
				numMenor = array[i];
			}
		}
		
		return numMenor;
	}
	
}
