package es.cesur.ejercicio23interfaces;

public class EdadPerro {

	public static void main(String[] args) {
		
		//FORMA 1 DE LLAMAR AL METODO
		System.out.println(edadPerro(4));
		//FORMA 2 DE LLAMAR AL METODO
		System.out.println(EdadPerro.edadPerro(2));
	}	
		
		public static String edadPerro (int e) { 
			double edad = 0;
			if (e < 0) { 
				return "La edad debe ser un número positivo."; 
			}
			else if (e <= 2) { 
				edad = e * 10.5; 
				return "La edad es " + edad; 
			}
			else { 
				edad = 21 + (e - 2) * 4; 
				return "La edad es " + edad; 
			}
	}
}
