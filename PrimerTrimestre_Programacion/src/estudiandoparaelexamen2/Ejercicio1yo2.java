package estudiandoparaelexamen2;

public class Ejercicio1yo2 {

	public static void main(String[] args) {
		//Crea una función que reciba un array y devuelva otro array con los valores del array recibido, pero al revés.
		
		int[] arrayInicial = {1,9,9,5};
		int[] arrayDelReves = devolverArrayAlReves(arrayInicial);
		
		for (int i=0; i<arrayDelReves.length;i++) {
			System.out.print(arrayDelReves[i] + " ");
		}
		
	}
	
	public static int[] devolverArrayAlReves (int[] array) {
		int[] arrayAlReves = new int [array.length];
		int contadorFinal = array.length-1;
		
		for (int i=0; i<array.length;i++) {
			arrayAlReves[contadorFinal] = array[i];
			contadorFinal--;
		}
		
		return arrayAlReves;
	}
}
