package es.cesur.ejercicio19interfaces;

public class Principal {

	public static void main(String[] args) {
		
		Perro p1 = new Perro("grande", 3);
		Gato g1 = new Gato("Persa", "gris");
		
		p1.comer();
		p1.dormir();
		g1.comer();
		g1.dormir();

		Animal p2 = new Perro("mediano", 6);
		Animal g2 = new Gato("Esfinge", "marrón");
		
		p2.comer();
		p2.dormir();
		g2.comer();
		g2.dormir();
	}

}
