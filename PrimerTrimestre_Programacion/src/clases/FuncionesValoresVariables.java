package clases;

public class FuncionesValoresVariables {

	public static void main(String[] args) {
		int a = 5;
		System.out.println("Valor de a antes de llamar a la función: " + a);
		
		cambiarValor(a);
		System.out.println("Valor de a después de llamar a la función: " + a);
		
		
		
		System.out.println();
		
		
		int[] array = {5, 3, 7};
		System.out.println("Valores del array antes de entrar a la función: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		cambiarValorArray(array, 4);
		
		System.out.println("Valores del array después de llamar a la función: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();

	}
	
	
	public static void cambiarValor(int a) {
		System.out.println("Valor de a al entrar en la función: " + a);
		a = 7;
		
		System.out.println("Valor de a al terminar la función: " + a);
	
	}
	
	public static void cambiarValorArray(int[] arrayAuxiliar, int valorASumar) {
		
		
		System.out.println("Valores del array al entrar en la función: ");
		for (int i = 0; i < arrayAuxiliar.length; i++) {
			System.out.print(arrayAuxiliar[i] + " ");
		}
		System.out.println();

		
		for (int i = 0; i < arrayAuxiliar.length; i++) {
			arrayAuxiliar[i] = arrayAuxiliar[i] + valorASumar;
		}
		
		
		
		
		
		System.out.println("Valores del array al terminar la función: ");
		for (int i = 0; i < arrayAuxiliar.length; i++) {
			System.out.print(arrayAuxiliar[i] + " ");
		}
		System.out.println();
	} 

}