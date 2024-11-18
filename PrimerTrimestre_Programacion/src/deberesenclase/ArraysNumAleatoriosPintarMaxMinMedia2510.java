package deberesenclase;

import java.util.Scanner;

public class ArraysNumAleatoriosPintarMaxMinMedia2510 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
/*
  PASO 1. RELLENAR TABLA DE 10 NUMEROS ALEATORIOS
  PASO 2. PINTAR LOS NUMEROS	
  PASO 3. DECIR NUMEROS MAXIMO Y MINIMO DE LA TABLA
  PASO 4. DECIR LA MEDIA
*/
		
    	int tabla[] = new int [10];
		
    	int nAleatorio= 0;
  
    	
    	for (int i=0; i<tabla.length; i++) {	               //PASO 1
    		int max=10;
    		int min=0;
    		int range= (max-min) +1;
    		
    		nAleatorio = (int) ((range * Math.random()) +min);
            
            tabla[i]= nAleatorio;
    	}
    	
    	
    	for (int i=0; i<tabla.length; i++) {                  	//PASO 2
            System.out.print(tabla[i] + " "); 
    	}
    	
    	
    	int numeroMayor= tabla[0];                              //PASO 3
		int numeroMenor= tabla[0];                             // Declaro estas variables en esta altura pq sino la tabla va a valer 0 pq arriba aun no se le ha dado valor con los numeros aleatorios
    	
    	for (int i = 0; i < tabla.length; i++) {                
			
	    	if (tabla[i] > numeroMayor){
	    		numeroMayor = tabla[i];
	    	} // TERNARIO: numeroMayor = tabla[i] > numeroMayor ? tabla[i] : numeroMayor;
			
	    	if (tabla[i] < numeroMenor) {
	    		numeroMenor = tabla[i];	
	    	} // TERNARIO: numeroMenor = tabla[i] > numeroMenor ? tabla[i] : numeroMenor;
    	}
    	System.out.println(" ");
		System.out.println("El número mayor introducido es: " + numeroMayor);
		System.out.println("El número menor introducido es: " + numeroMenor);
		
		int suma= 0;
		int media= 0;
		for (int i = 0; i < tabla.length; i++) {				 // PASO 4
			suma= suma + tabla[i]; //suma += tabla[i];
		}
		System.out.println("La suma de todos los números es: " + suma );
    	System.out.println("La media de todos los números es: " + (double) suma/tabla.length); //CASTEAR. Si pongo DOUBLE delante del número que quiero convertir en decimal me lo arroja con 0,0 (decimal) 
		
    
    	
		sc.close();
	}

}
