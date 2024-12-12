package estudiandoparaelexamen2;

public class SumarFilaColumnaDiagonalesDeMatricesEnFunciones {

	public static void main(String[] args) {

		int matriz[][] = {
			    {3, 5, 7, 9, 2},
			    {9, 2, 1, 4, 8},
			    {7, 1, 6, 3, 5},
			    {4, 6, 0, 2, 1},
			    {8, 0, 4, 7, 9}
			};	

		
		int sumaFila = sumarFila(matriz);
		int sumaColumna = sumarColumna(matriz);
		mostrarPrincipal(matriz);
		int sumaDiagonalPrincipal = sumarDiagonalP(matriz);
		mostrarSecundaria(matriz);
		int sumaDiagonalSecundaria = sumarDiagonalS(matriz);		
		
	}

	
	public static int sumarFila (int[][] matriz) {
		
		int suma = 0;
		
		for (int i=0; i<matriz.length;i++){
			suma = 0;
			for (int j=0; j<matriz[i].length;j++) {
				suma+=matriz[i][j];
			}
		System.out.println("La suma de la fila " + i + " es: " + suma);
		}
		return suma;
	}
	
	
	public static int sumarColumna (int[][] matriz) {
		
		int suma=0;
		
		for (int j=0; j<matriz.length; j++) {
			suma =0;
			for (int i=0; i<matriz[j].length;i++) {
				suma+=matriz[i][j];
			}
		System.out.println("La suma de la columna " + j + " es: " + suma);	
		}
		
		return suma;
	}
	
	
	public static int sumarDiagonalP (int[][] matriz) {
		
		int diagonalP=0;
		
		for (int i=0; i<matriz.length;i++) {
			diagonalP+=matriz[i][i];
		}
		System.out.println("La suma de la diagonal principal es: " + diagonalP);
		
		return diagonalP;
	}
	
	
	public static int sumarDiagonalS (int[][] matriz) {
		
		int diagonalS=0;
		
		for (int i=0; i<matriz.length; i++) {
			diagonalS+=matriz[i][(matriz.length-1)-i];
		}
		System.out.println("La suma de la diagonal secundaria es: " + diagonalS);
		
		return diagonalS;
	}
	
	
	public static void mostrarPrincipal (int[][] matriz) {
		
		for (int i=0; i<matriz.length; i++) {
			System.out.print(matriz[i][i] + " ");
		}
		System.out.println();
	}
	
	
	public static void mostrarSecundaria (int[][] matriz) {
		
		for (int i=0; i<matriz.length; i++) {
			System.out.print(matriz[i][(matriz.length-1)-i] + " ");
		}
		System.out.println();
	}
	
}