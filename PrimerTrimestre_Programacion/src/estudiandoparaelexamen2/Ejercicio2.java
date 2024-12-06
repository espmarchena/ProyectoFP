package estudiandoparaelexamen2;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Crea un programa con tres funciones: 
		//- Una función que devuelve un array de longitud 10 de números aleatorios 
		//- Una función que reciba ese array y devuelva el número menor del array
		//- La función main que hace la llamada a las dos anteriores

		int[] array = obtenerArrayNumsAleatorios();
		
		for (int i=0; i<array.length; i++) { //con esto pinto el array
			System.out.print(array[i] + " ");
		}
		
		int numeroMenor = obtenerMenor(array);
		System.out.println(numeroMenor);
	}

	public static int[] obtenerArrayNumsAleatorios() {
		//declaro un array vacio de 10 digitos
		int[] array = new int[10];
		for (int i=0; i<10; i++) {
			
			int max=10;
			int min=0;
			int range= (max-min) +1;
			//relleno el array		
			array[i] = (int) ((range * Math.random()) + min); //importante la asignacion del array a la formula (en el examen puedo poner una palabra clave solamente)
		}		
		return array;
	}
	
	public static int obtenerMenor (int[] array ) {
		
		int menor= array[0]; // comparo todos los numeros con la primera posicion del array y solo la va a machacar cuando de con el menor de todos
		
		for (int i=0; i<array.length; i++) {
			if (array[i] < menor) {
				menor = array[i]; // asigno en la variable 'menor' el numero mas pequeño del array
			}
		}		
		return menor;
	}
	
}
