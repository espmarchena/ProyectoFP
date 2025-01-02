package examenfinal1trimestre;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Crear una función que recibe una matriz y devuelve un array relleno con los valores de la matriz.
		// El tamaño del array debe ser correcto, no puede haber valores vacíos. 

		int[][] matriz = {
	            {7},
	            {6},
	            {5},
	            {2},
	            {3}
	        };

	        int[] array = PasarMatrizAArray(matriz); 					  //llamo a la funcion que pasa la matriz a un array
	        
	        System.out.println("Matriz recibida:");
	        for (int i = 0; i < matriz.length; i++) {                     //recorro la matriz
	            for (int j = 0; j < matriz[i].length; j++) {
	                System.out.print(matriz[i][j] + " ");				  //pinto la matriz
	            }
	            System.out.println();
	        }

	        System.out.println("Array devuelto:");						  
	        for (int i = 0; i < array.length; i++) {					  //recorro el array
	            System.out.print(array[i] + " ");						  //pinto el array
	        }
	}
	


	public static int[] PasarMatrizAArray(int[][] matriz) {
	    int totalValores = 0;											  //con esta variable controlo la longitud de la matriz y mas tarde la del futuro array
	    for (int i = 0; i < matriz.length; i++) {						  
	        totalValores += matriz[i].length;							  //suma el número de columnas de la fila actual al acumulador 'totalValores'. Al final del bucle el acumulador valdrá el número total de elementos de la matriz
	    }
	
	    int[] array = new int[totalValores];
	    int indice = 0;
	    for (int i = 0; i < matriz.length; i++) {						  //recorro la matriz
	        for (int j = 0; j < matriz[i].length; j++) {
	            array[indice++] = matriz[i][j];							 //copia los valores de la matriz al array en orden gracias a la variable indice que va aumentando en cada vuelta del bucle.
	        }
	    }
	    return array;
	}

}
