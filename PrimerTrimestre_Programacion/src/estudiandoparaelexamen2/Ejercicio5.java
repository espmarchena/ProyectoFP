package estudiandoparaelexamen2;

public class Ejercicio5 {

	public static void main(String[] args) {
		//Crea una función que reciba un texto y devuelva una variable booleana con true si el texto es válido o false en caso de no serlo. 
		//Las condiciones para que un texto sea válido son:
			//- Debe tener una longitud entre 5 y 15 caracteres
			//- Debe contener al menos un número
			//- Debe contener al menos uno de los siguientes caracteres especiales: ?, !, *, +, -
		
		System.out.println(validarTexto("Esperanza0*"));
	}
	
	public static boolean validarTexto (String texto) {
		boolean ok = false;
		
		if (texto.length() >= 5 && texto.length() <= 15) {
			
			boolean okNumero= false;
			boolean okEspecial = false;
			
			for (int i=0; i< texto.length(); i++) {
				char c = texto.charAt(i); //cojo cada caracter de la cadena de texto y lo guardo en la variable 'c'
				if (c >='0' && c<='9') { //no ponemos un else aqui porque sino vuelve a ponerlo en false con el siguiente caracter no numerico de la cadena 
					okNumero = true;
				}
				if (c == '?' || c == '!' || c == '*' || c == '+' || c == '-') { //no ponemos un else aqui porque sino vuelve a ponerlo en false con el siguiente caracter no numerico de la cadena 
					okEspecial = true;
				}
			}
			if (okNumero && okEspecial) { // a este IF solo llego si la longitud es correcta porque esta dentro del rango del primer IF
				ok = true;
			}
		}
		
		return ok;
	}
	
}
