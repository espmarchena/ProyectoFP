package clases;

import java.util.Scanner;

public class PedirDosNumeros {
	public static void main (String args []) {
	
		Scanner teclado;
		teclado = new Scanner (System.in); //ctrl+shift+O para import la clase Scanner y que funcione
		
		System.out.println("Hola, ¿cómo te llamas?");
		String nombre=teclado.nextLine();
		
		System.out.println("Bienvenido/a " + nombre + ", ¿Cómo estás?");
		
		System.out.println("Me dices un número?");
		int numero1=teclado.nextInt(); //Todo lo que el usuario escriba se va a guardar en la variable 'numero'
		System.out.println("Okey, dime otro");
		int numero2=teclado.nextInt();
		int resultado=(numero1+numero2);
		
		System.out.println("El resultado de la suma de esos dos números es " + (resultado) + ", ¿verdad?");
		teclado.close();
		
	}
}