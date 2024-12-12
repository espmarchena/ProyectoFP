package estudiandoparaelexamen2;

public class DiagonalesEnMatrices2 {

	public static void main(String[] args) {

		int matriz[][] = {
			    {3, 5, 7, 9, 2},
			    {9, 2, 1, 4, 8},
			    {7, 1, 6, 3, 5},
			    {4, 6, 0, 2, 1},
			    {8, 0, 4, 7, 9}
			};	

		
	//SUMAR FILA
		
		int sumaTotal=0;
		for (int i=0; i<matriz.length; i++) {
			int sumaFila=0;
			
			for (int j=0; j<matriz[i].length;j++) {
				sumaFila+=matriz[i][j];
			}
		System.out.println("Fila nº " + i + " suma " + sumaFila);
		sumaTotal+=sumaFila;
		}	
		System.out.println("Suma total de la matriz: " + sumaTotal);
		
	//SUMAR COLUMNA	
		
		for (int j=0; j<matriz.length; j++) {
			int sumaColumna=0;
			
			for (int i=0; i<matriz[j].length; i++) {
				sumaColumna+=matriz[i][j];
			}
		System.out.println("Columna nº " + j + " suma " + sumaColumna);
		}
		
		//SUMAR DIAGONAL PRINCIPAL
		int sumaDiagonalP=0;
		for (int i=0; i<matriz.length;i++) {
			sumaDiagonalP+=matriz[i][i];
		}
		System.out.println("Suma de la diagonal principal: " + sumaDiagonalP);
		
		
		//SUMAR DIAGONAL SECUNDARIA
		int sumaDiagonalS=0;
		for (int i=0;i<matriz.length;i++) {
			sumaDiagonalS+=matriz[i][(matriz.length-1)-i];
		}
		System.out.println("Suma de la diagonal secundaria: " + sumaDiagonalS);
		
		
	}

	
}
