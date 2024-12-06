package estudiandoparaelexamen2;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Crea una función que reciba una matriz y devuelva un array de enteros con dos posiciones, 
		//la primera posición es la suma de todos los valores de la diagonal principal
		//y la segunda posición la suma de todos los valores de la diagonal secundaria.  

		
		
		/* para controlar que la matriz es perfecta (cuadrada):	
		 * if ( matriz.length == matriz[0].length){} */
	}

	public static int[] obtenerSumaDiagonales(int[][] matriz) {
		int[] valores = new int [2];
		
		for (int i=0; i<matriz.length; i++) {
			valores[0] = valores [0] + matriz[i][i];
			valores[1] = valores[1] + matriz[i][matriz.length - 1 - i];
		}
		
		return valores;
	}
	 
}
