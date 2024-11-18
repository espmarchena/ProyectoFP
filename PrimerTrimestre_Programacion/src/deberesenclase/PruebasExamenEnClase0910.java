package deberesenclase;

import java.util.Scanner;

public class PruebasExamenEnClase0910 {

	public static void main(String[] args) {
	
		//Escribir un programa que pida dos números al usuario y los guarde en una variable cada uno de ellos (las variables pueden llamarse numero1 y numero2).
		//Posteriormente, el programa debe cambiar el valor de numero1 por el de numero2 y el de numero2 por el de numero1.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame dos números:");
		int num1= sc.nextInt();
		int num2= sc.nextInt();
		
		int c=num1;
		num1=num2 ;
		num2=c;
		
		System.out.println(num1);
		System.out.println(num2);
		
		sc.close();
	}

}
