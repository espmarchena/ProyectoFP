package es.cesur.ejercicio24interfaces;

public class EsVocal {

	public static void main(String[] args) {
		
		System.out.println(esVocal("a"));
		System.out.println(EsVocal.esVocal("h"));
		
	}

	/*Con private, el metodo se sigue ejecutando igual que con public, porque lo tenemos desarrollado en LA MISMA CLASE desde la que lo ejecutamos
	 * y el modificador de acceso privado permite que el metodo sea accesible desde LA MISMA CLASE donde lo tenemos implementado*/
	//con default y el protected permitiría usarlo en otra clase, pero con private no
	
	//private static String esVocal (String entrada) {
	public static String esVocal (String entrada) { 
		if (entrada.length() != 1) { 
			return "No has introducido un único carácter."; 
		}
		else { 
			char letra = entrada.charAt(0); 
			if (!Character.isLetter(letra)) { 
				return "El carácter no es una letra."; 
			} 
			else if  ("aeiouAEIOUáéíóúÁÉÍÓÚ".indexOf(Character.toString(letra)) >= 0) { 
				return "El carácter es una vocal."; 
			}
			else if (letra == 'y') { 
				return "El carácter a veces es una vocal y a veces es una consonante."; 
			}
			else { 
				return "El carácter es una consonante."; 
			} 
		} 
	} 
	
	
}
