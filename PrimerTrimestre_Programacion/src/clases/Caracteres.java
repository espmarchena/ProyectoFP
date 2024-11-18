package clases;

import java.util.Scanner;

public class Caracteres {
	public static void main(String args[]) {
	
	char c='A';
	System.out.println(c); //me va a imprimir la letra c
	System.out.println((int)c);//me va a imprimir el valor numérico de la letra c //**Los caracteres numéricos no son lo mismo que los números**
	System.out.println((int)(c+1));//me va a dar el siguiente caracter que haya después de la 'A', en este caso si 'A' es 65, me dará el 66 que es la 'B'
		
	System.out.println("-------------------------------");
	
	char a='A';
	char e='a';
	System.out.println(a + "--->" + (int)a); //me va a imprimir el valor numérico de la letra a
	System.out.println(e + "--->" + (int)e); //me va a imprimir el valor numérico de la letra e
	//esto va a sumar el valor numerico de la letra a y la letra e
	
	
	char suma= 'A'+'a';
	System.out.println((int)suma + "--->" + (char)suma); //me va a imprimir la suma de ambos valores anteriores y me va imprimir el caracter que corresponda a ese valor,
	//osea el caracter que se encuentre en la posicion numerica que me ha dado la suma
	
	System.out.println("-------------------------------");
	String sA = "A"; 
	String sE = "E";
	System.out.println(sA+sE); //va a concatenar las letras porque no estoy usando el char, que siempre actua como un numero // 'A'+'B' no es igual a 'AB' pero "A"+"B" sí es igual a 'AB'
	
	
	System.out.println("-------------------------------");
	
	char h='A';
	System.out.println(h+ "--->" +(int)h);
	System.out.println(((int)h+1));//me suma 1 al valor del caracter
	System.out.println(((int)h+2));//me suma 2 al valor del caracter
	System.out.println(((int)h+3));//me suma 3 al valor del caracter
	System.out.println(((int)h+4));//me suma 4 al valor del caracter
	
	System.out.println("-------------------------------");
	
	int i = 89;
	System.out.println((char)i); // me va a decir qué caracter está en el valor/posicion 89
	int v = 196;
	System.out.println((char)v); // me va a decir qué caracter está en el valor/posicion 196
	
	
	System.out.println("-------------------------------");
	
	System.out.println("Introduzca una cadena:");
	Scanner teclado = new Scanner (System.in);
	String cadena= teclado.nextLine();
	System.out.println("La primera letra de la cadena de texto es:");
	char r= cadena.charAt(0);
	System.out.println(r);
	

	System.out.println("Las demás letras de tu cadena de texto son:");
	System.out.println(cadena.charAt(0));
	System.out.println(cadena.charAt(1));	
	System.out.println(cadena.charAt(2));
	System.out.println(cadena.charAt(3));
	
	teclado.close();
}
	}