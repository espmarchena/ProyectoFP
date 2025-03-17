package es.cesur.ejercicio21interfaces;

public class Multifuncion implements Imprimible, Escaneable{

	@Override
	public void escanear() {
		System.out.println("escanear");
		
	}

	@Override
	public void imprimir() {
		System.out.println("imprimir");
		
	}

	public Multifuncion() {
	}

}
