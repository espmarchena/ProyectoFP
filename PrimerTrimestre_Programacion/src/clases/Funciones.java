package clases;

public class Funciones {

	public static void main(String[] args) { //lo que hay entre paréntesis es el parámetro

	}
	
	public static void decirHola() { //funcion que no devuelve nada
		System.out.println("Hola");
	}
	
	
	public static int calcularSuma() { //funcion que devuelve algo (hacen operaciones)
		return 0;                     //siempre hay que poner return en la última línea si no es tipo void
	}
	
	
	public static void imprimirNombreConParametro (String nombre){ //no devuelve nada pero tiene parámetros
		System.out.println("Hola" + nombre); // si llamo a la funcion poniendo como la he llamado, le meto el String entre paréntesis para darle el valor: imprimirNombreConParametro("Espe")
		System.out.println("La longitud de tu nombre es " + nombre.length());
	}
	
	
	public static int calcularSumaConParametros (int numero1, int numero2){ //tiene parámetros y devuelve un int
		int a = 7;
		int b = 3;
		int resultado= calcularSumaConParametros (a, b); //int resultado = numero1 + numero2;
		
		//int c = calcularSumaConParametros (a, b);
		
		return resultado; 
		
	}
	
	
	//**EJEMPLOS**//
	
	
	public static void main2 (String[] args) {
	System.out.println("Bienvenido");
	
	decirHola();
	imprimirNombreConParametro("Espe");
	
	}
	
	public static int[] devolver4Operaciones (int n1, int n2) { // si quiero imprimir 4 operaciones en la misma funcion, tiene que ser con arrays. Solo puede haber un return
		int operaciones[] = {n1+n2, n1-n2, n1*n2, n1/n2}; //declaro tabla con valores asignados
		return operaciones; 
		
		//int resultadoOperaciones[] = devolver4Operaciones (5,6);
		//System.out.println("Suma: " + resultadoOperaciones[0]);
		//System.out.println("Resta: " + resultadoOperaciones[1]);
		//System.out.println("Multiplicación: " + resultadoOperaciones[2]);
		//System.out.println("División: " + resultadoOperaciones[3]);
	}
	
	
	
	
	
	
	
	
}
