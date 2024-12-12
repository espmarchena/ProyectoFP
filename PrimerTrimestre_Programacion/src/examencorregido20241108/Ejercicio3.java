package examencorregido20241108;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cadena: ");
		String cadena = sc.nextLine();
		boolean mayusculasOK = false;
		boolean minusculasOK = false;
		boolean numerosOK = false;
		boolean especialesOK = false;
		if (cadena.length() >= 6 && cadena.length() <= 12) {
			
			int pMay = -1;
			int pMin = -1;
			char primerNum = '$';
			char primerEspecial = '0';
			
			for (int i = 0; i < cadena.length(); i++) {
				char c = cadena.charAt(i);
				
				if (c >= 'A' && c <= 'Z' && !mayusculasOK) {
					pMay = i;
					mayusculasOK = true;
				} else if (c >= 'a' && c <= 'z' && !minusculasOK) { 
					minusculasOK = true;
					pMin = i;
				} else if (c >= '1' && c <= '9' && !numerosOK) { 
					numerosOK = true;
					primerNum = c;
				} else if ((c == '?' || c == '!' || c == '*' || c == '-') && !especialesOK) {
					especialesOK = true;
					primerEspecial = c;
				}	
			}
		
			if (mayusculasOK && minusculasOK && numerosOK && especialesOK) {
				System.out.println("La posición de la primera mayúscula es " + pMay);
				System.out.println("La posición de la primera minúscula es " + pMin);
				System.out.println("El primer número es " + primerNum);
				System.out.println("El primer carácter especial es " + primerEspecial);
			}
			
		} else {
			System.out.println("La cadena no cumple con la longitud");
		}
		
		
		
		
		
		
		
		
		sc.close();

	}

}
