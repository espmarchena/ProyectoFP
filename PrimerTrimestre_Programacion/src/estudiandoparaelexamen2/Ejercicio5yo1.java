package estudiandoparaelexamen2;

public class Ejercicio5yo1 {

	public static void main(String[] args) {
		// Crea una función que reciba un texto y devuelva una variable booleana con true si el texto es válido o false en caso de no serlo. 
		// Las condiciones para que un texto sea válido son:
		//- Debe tener una longitud entre 5 y 15 caracteres
		//- Debe contener al menos un número
		//- Debe contener al menos uno de los siguientes caracteres especiales: ?, !, *, +, - 

		boolean textoValido = esValido("Esperanza0*");
		System.out.println(textoValido);
	}

	public static boolean esValido(String texto) {
		boolean longitudOk= false;
		boolean contieneNum= false;
		boolean contieneCaracteres = false;
		boolean ok= false;
		
		if (texto.length() >= 5 && texto.length() <= 15) {
			longitudOk=true;
		}
		
		for (int i=0; i<texto.length(); i++) {
			char c = texto.charAt(i);
			if (c >= '0' && c <= '9') {
				contieneNum = true;
			}
		}
		
		for (int i=0; i<texto.length(); i++) {
			char c = texto.charAt(i);
			if (c == '?' || c == '!' || c == '*' || c == '+' || c == '-') {
				contieneCaracteres= true;
			}
		}
		
		if(longitudOk && contieneNum && contieneCaracteres) {
			ok= true;
		}
		
		return ok;
	}


}
