package clases;

public class tablaFibonacci {

	public static void main(String[] args) {
		
		int []tabla = new int[10];
		tabla[0] = 0;
		tabla[1] = 1;
		
		for (int i=2; i<tabla.length;i++) {
			tabla[i]= tabla[i-1] + tabla[i-2];
			System.out.println(i + "->" + tabla[i]);
		}

	}

}


//pedir numero que sera la longitud de mi tabla
//el algoritmo de fibonacci llevarlo a una funcion que devuelve la tabla









