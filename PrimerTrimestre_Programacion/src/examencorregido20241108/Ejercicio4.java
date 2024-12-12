package examencorregido20241108;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		
		for (int i = 1; i <= 10; i++) {
			
			int suma = 0;
			for (int j = i; j <= 10; j++) {
				suma = suma + j;
			}
			
			System.out.println("El resultado de " + i + " hasta 10 es: " + suma);
			
		}

	}

}
