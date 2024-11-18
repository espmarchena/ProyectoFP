package deberesenclase;

import java.util.Scanner;

public class DeberesEnClase0410 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner (System.in);
		
		System.out.println("Dime una opción:");
		String ss= teclado.nextLine(); // String.ss=teclado.nextLine();
		
		String s1 = "1";
		String s2 = "2";
		String s3 = "3";
		String s4 = "4";
		
		if (ss.equals(s1)) { // if (ss.equals("1" || ("+")) {       ó        if (ss.equals("+"))
			System.out.println("suma");
		}
		else if (ss.equals(s2)) { // if (ss.equals("2")) {       ó        if (ss.equals("-"))
			System.out.println("resta");
		}
		else if (ss.equals(s3)) { // if (ss.equals("3")) {       ó        if (ss.equals("*"))
			System.out.println("multiplicación");
		}
		else if (ss.equals(s4)) { // if (ss.equals("4")) {       ó        if (ss.equals("/"))
			System.out.println("división");
		}
		else {
			System.out.println("error");
		}
		
		teclado.close();	
		

	}

}


// if (s1.equals(s2)) {
// if(s1.length()==1) { 