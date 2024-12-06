package estudiandoparaelexamen2;

public class Ejercicio1 {

	public static void main(String[] args) {
		//Crea una función que reciba un array y devuelva otro array con los valores del array recibido, pero al revés.

		int array[] = {55, 31, 22, 37, 45, 51}; //array que quiero que me devuelva del revés
		int arrayFinal[] = devolverArrayAlreves(array);
		
		for (int i=0; i<arrayFinal.length; i++) { //con esto pinto el array
			System.out.print(arrayFinal[i] + " ");
		}
		
	}

	public static int[] devolverArrayAlreves (int[] arrayInicial) { //funcion que devuelve array y (que recibe un array)
		int[] arrayFinal = new int [arrayInicial.length]; // declaro un array final que no se de que tamaño va a ser pero como voy a devolver uno exactamente igual, uso arrayInicial.length
		int contadorFinal = arrayInicial.length-1; // empieza a asignar desde el final del array del derecho hasta el principio (le va dando la vuelta)
		
		for (int i=0; i<arrayInicial.length; i++) {
			arrayFinal[contadorFinal] = arrayInicial[i];
			contadorFinal--;
		}
		
		return arrayFinal;
	}
	
	
}
