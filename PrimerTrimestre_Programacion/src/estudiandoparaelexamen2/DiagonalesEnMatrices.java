package estudiandoparaelexamen2;

public class DiagonalesEnMatrices {

	public static void main(String[] args) {

		int matriz[][] = {
			    {3, 5, 7, 9, 2},
			    {9, 2, 1, 4, 8},
			    {7, 1, 6, 3, 5},
			    {4, 6, 0, 2, 1},
			    {8, 0, 4, 7, 9}
			};			

		
		int sumaTotal=0;
		
		for (int i=0; i<matriz.length; i++) {  // Primer bucle: Calculamos la suma de cada fila
			int sumaFila= 0;
			
			for (int j=0; j<matriz[i].length; j++) { //cada una de las columnas dentro de la fila actual
				
				sumaFila+=matriz[i][j]; //// Sumo el valor actual de la celda a la suma de la fila
			}	
			System.out.println("\u001B[30m" + "Suma de la fila " + i + " :" + sumaFila);
			sumaTotal+=sumaFila; // Acumulo la suma de la fila en la suma total
		}
		
		
		
		
		System.out.println("\033[38;5;94m" + "Suma de la matriz completa: " + sumaTotal);	
		
		
		
		
		
		for (int j=0; j<matriz.length; j++) { // recorremos cada columna
			int sumaColumna=0;
			
			for (int i=0; i<matriz[j].length; i++) {  // Recorremos cada fila para sumar los elementos de la columna actual
				
				sumaColumna+=matriz[i][j]; // Sumamos el valor actual de la celda a la suma de la columna
			}
			System.out.println("\u001B[30m" + "Suma de la columna " + j + " :" + sumaColumna);
		}
		
		
		
		//FORMA LOGICA DE HACERLO
		
		 int sumaDiagonalP=0;
		 for (int i=0; i<matriz.length;i++){    // Recorremos la matriz para sumar los elementos de la diagonal principal     
			 
			 
			 sumaDiagonalP+=matriz[i][i];            // tabla[i][i] porque los valores son los mismos  0,0  1,1  2,2 ......
		 }
		 System.out.println("\033[38;5;214m"+ "Suma diagonal izq a dcha: " + sumaDiagonalP);
		 
		/*int sumaDiagonalP =0;
		for (int i=0, j=0; i<tabla.length && j<tabla.length ; i++, j++) {  
			sumaDiagonalP+=tabla[i][j];	
		}*/
		
		 
		 
		 
		//FORMA LOGICA DE HACERLO
		
		int sumaDiagonalS =0;
		for (int i=0; i<matriz.length;i++){       // Recorremos la matriz para sumar los elementos de la diagonal secundaria 
			
		    //Accedemos al elemento de la posición [i][(matriz.length-1)-i], correspondiente a la diagonal secundaria
			sumaDiagonalS+=matriz[i][(matriz.length-1)-i];        //  2,0  1,1  0,2 ..........
		} 
		System.out.println("\033[38;5;209m"+ "Suma diagonal dcha a izda: " +sumaDiagonalS);
		
		/*int sumaDiagonalS =0;
		for (int i=0, j=(tabla.length)-1; i<tabla.length && j>=0 ; i++, j--) {  
			sumaDiagonalS+=tabla[i][j];
		}*/
		
		
	}

}



