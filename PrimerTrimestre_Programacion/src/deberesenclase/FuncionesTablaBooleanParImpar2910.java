package deberesenclase;

public class FuncionesTablaBooleanParImpar2910 {

	public static void main(String[] args) {
		//funcion que pida un numero y que devuelva una tabla de esa longitud y en cada posicion decir si el numero es par o impar

		obtenerTablaPares(7); //llamo a mi funcion indicandole que la longitud es 7

	}

	
	public static boolean[] obtenerTablaPares (int longitud) {
		boolean tabla[] = new boolean [longitud]; // declaro la tabla booleana con parametro longitud que arriba le doy valor 7
		System.out.println("La longitud será de: " + tabla.length); // imprimo la longitud de mi tabla 
		
		for (int i=0; i<longitud; i++) {
			if (i%2==0) {
			tabla[i]= true;
			}
		}
		
		
		return tabla;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
