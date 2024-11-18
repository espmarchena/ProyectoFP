package clases;

public class Arrays {

	public static void main(String[] args) {
		int numeros[] = new int [5]; // delaro mi arrays con tamaño 5
		int numeros2[] = {20, 5, 98, 12};
		numeros [0] = 5;
		numeros [1] = 3;
		numeros [4] = 1;
		// los numeros que no declaro, por defecto, valen siempre 0
		numeros[0] = 6; //le estoy cambiando el valor de esa posicion a posteriori de haberla ya declarado
		System.out.println(numeros[0]);  //para que me muestre el valor de esa posicion

		System.out.println(numeros2[2]); //para que me muestre el valor de esa posicion
		
		
	}

}
