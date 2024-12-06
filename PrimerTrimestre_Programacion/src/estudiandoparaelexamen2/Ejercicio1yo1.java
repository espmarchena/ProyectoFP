package estudiandoparaelexamen2;

public class Ejercicio1yo1 {

	public static void main(String[] args) {
		//Crea una función que reciba un array y devuelva otro array con los valores del array recibido, pero al revés.
		
		

		int arrayAlDerecho[] = {1,2,3,4,5}; //declaro el array que quiero que pinte del reves
		int arrayAlReves[] = devolverArrayAlReves(arrayAlDerecho); //llamo a la funcion y le paso el array que quiero que pinte del reves
		
		for (int i=0; i<arrayAlReves.length; i++) { //recorro el array
			System.out.print(arrayAlReves[i] + " "); //pinto el array
		}
				
	}

	public static int[] devolverArrayAlReves(int[] arrayInicial) { //funcion que devuelve el array del reves, recibiendo un array
		
		int[] arrayAlReves =  new int [arrayInicial.length]; //declaro array del reves que va a ser igual de tamaño que el inicial
		int contadorFinal = arrayInicial.length-1; // contador que vamos a usar para recorrer el array desde el final hasta el principio. Empieza en la ultima posicion del array al derecho
		
		for (int i=0; i<arrayInicial.length; i++) { //recorro el array
			arrayAlReves[contadorFinal] = arrayInicial[i]; //asigno valores al array del reves empezando desde el final hasta principio, con cada valor del array del derecho 
			contadorFinal--; // contador en negativo para que vaya del final al principio
		}
		
		return arrayAlReves; //devuelve el array al reves
	}
}
