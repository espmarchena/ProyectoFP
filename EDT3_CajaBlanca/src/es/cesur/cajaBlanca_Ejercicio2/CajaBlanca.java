package es.cesur.cajaBlanca_Ejercicio2;

public class CajaBlanca {

	public static boolean esParOImpar(int n){
			if (n % 2 == 0)
			{
				System.out.println("El número es par.");
				return true;
			} else
			{
				System.out.println("El número es impar.");
				return false;
			}
		}
}