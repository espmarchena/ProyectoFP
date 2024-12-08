package estudiandoparaelexamen2;

public class Ejercicio1yo3 {

	public static void main(String[] args) {
		//Crea una función que reciba un array y devuelva otro array con los valores del array recibido, pero al revés.
		int[] arrayD = {0,1,2,3};
		
		int[] array = devolverArrayAlReves(arrayD);
		for (int i=0;i<array.length; i++) {
			System.out.println(array[i] + " ");
		}
		
	}

	public static int[] devolverArrayAlReves (int[] arrayD) {
		int[] array = new int [arrayD.length];
		int contador= array.length-1;
		
		for (int i =0; i<arrayD.length; i++) {
			array[contador]= arrayD[i];
			contador--;
		}
		
		return array;
	}
	
}
