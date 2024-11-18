package clases;

public class ImprimirParesConForSinUsarIf {

	public static void main (String args []) {
	
	//Sin usar un IF, imprime del 1 al 100 solo los números pares, y luego di cuántos números se han impreso.
	
		int contador=0;
	for(int i=2; i<=100; i+=2) { // suma en el bucle de dos en dos, por lo que me va a imprimir solo los números pares
		
		System.out.println(i);
		contador++;
	}
	
	System.out.println("Se ha impreso un total de: " + contador + " números.");
	
	
	}
}
