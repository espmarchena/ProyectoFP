package es.cesur.ejercicio26;

public class Principal {

	public static void main(String[] args) {

		Coche c1 = new Coche(175, "Seat", "Ibiza", true);
		Bicicleta b1 = new Bicicleta(20, 22);
		
		Vehiculo c2 = new Coche(230, "Audi", "A4", false);
		Vehiculo b2 = new Bicicleta(25, 19);
		
		c1.conducir();
		c2.conducir();
		b1.conducir();
		b1.detener();
		b2.conducir();
		c2.detener();
		
	}

}
