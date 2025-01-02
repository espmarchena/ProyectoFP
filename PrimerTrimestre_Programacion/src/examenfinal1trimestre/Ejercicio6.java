package examenfinal1trimestre;

public class Ejercicio6 {
	
	public static void main(String[] args) {
		int n = 5;
		int[][] matrizResultante = generarMatriz(n);

		// Imprimir la matriz resultante
		imprimirMatriz(matrizResultante);
	}
	
	
	
	
	public static int[][] generarMatriz(int n) {
		// Crear la matriz de tamaño n x n
		int[][] matriz = new int[n][n];

		// Llenar la matriz con los valores de Pascal
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) { // Los valores de cada fila son hasta la diagonal
				if (j == 0 || j == i) { // Borde izquierdo y derecho
					matriz[i][j] = 1;
				} else {
					matriz[i][j] = matriz[i - 1][j - 1] + matriz[i - 1][j];
				}
			}
		}

		return matriz;
	}

	// Método para imprimir la matriz
	public static void imprimirMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] != 0) { // Solo imprimir los valores no cero
					System.out.print(matriz[i][j] + " ");
				}
			}
			System.out.println();
		}
	}

	
	
}
