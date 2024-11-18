package estudiandoparaelexamen1;

import java.util.Scanner;

public class If_ControlarEdadYSexo {

	public static void main(String[] args) {
	/*Pedir el sexo de una persona (H o M) y la edad. Comprobar si el valor de la edad está entre 1 y 100 y si el sexo es H o M:
	En caso de que alguno de los valores no sea el correcto, se mostrará un error.
	En caso de que los valores sean correctos, se mostrará el mensaje: "El sexo es <sexo> y la edad <edad>", donde sexo debe ser Hombre o Mujer.
	Si además la edad es superior a 18 y el sexo es H, mostrará es hombre y mayor de edad.*/
		
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Introduce sexo (H o M)");
	String sexo = sc.nextLine(); //char sexo=sc.nextLine().charAt(0); si quisiera coger la M o la H en caso de pedir la palabra completa
	System.out.println("Introduce edad");
	int edad = sc.nextInt();
	
	if (edad>1 && edad<100 && sexo.equals("H") && sexo.equals("M")) {  // y aquí seria == y no .equals pq ya no es string
		System.out.println("Todo correcto");
	}
	else {
		System.out.println("Error");
	}
	if (edad>18 && sexo.equals("H")) {
		System.out.println("Es hombre y mayor de edad");
	}
	
	
	
	
	sc. close();
	
		

	}

}
