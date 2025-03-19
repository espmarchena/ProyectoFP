package es.cesur.ejercicio23interfaces;

public class Principal {

	public static void main(String[] args) {
		
		//FORMA 1 DE LLAMAR AL METODO
//		System.out.println(edadPerro(4)); //AL SER UN METODO ESTATICO, NO LO PUEDO USAR FUERA DE LA CLASE DONDE ESTA IMPLEMENTADO
		
		//FORMA 2 DE LLAMAR AL METODO
		System.out.println(EdadPerro.edadPerro(9)); //HAY QUE LLAMARLO CON EL NOMBRE DE LA CLASE DONDE ESTA IMPLEMENTADO DELANTEM DEL NOMBRE DEL METODO
	}
	
}
