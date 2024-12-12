package estudiandoparaelexamen2;


public class FuncionArraysMultiplicaNumsPares {
    public static void main(String[] args) {
    	//función que recibe un array de números y devuelve la multiplicación de los números pares
    	
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8};  // me invento un array
        int resultado = multiplicarPares(numeros);
        System.out.println("El resultado de la multiplicación de los números pares es: " + resultado);
    }

    public static int multiplicarPares(int[] array) {
        int producto = 1; //porq es multiplicacion
        boolean hayPares = false; // Para verificar si hay al menos un número par      
        
        for (int i = 0; i < array.length; i++) { //recorro el array
            if (array[i] % 2 == 0) { // Verifica si el número es par
                producto *= array[i];
                hayPares = true;
            }
        }

            return producto;
    }
}