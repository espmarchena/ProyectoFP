package clases;

public class RecorrerMatrizes_For {

	public static void main(String[] args) {
		
		int[][] matriz = new int[5][5];
		
	    // Imprimir la matriz
	    System.out.println("Matriz:");
	    for (int i = 0; i < matriz.length; i++) {
	        for (int j = 0; j < matriz[i].length; j++) {
	            System.out.print(matriz[i][j] + " ");
	        }
	        System.out.println();
	    }

	}
}