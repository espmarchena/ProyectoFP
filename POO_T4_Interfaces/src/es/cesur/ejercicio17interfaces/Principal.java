package es.cesur.ejercicio17interfaces;

public class Principal {

	public static void main(String[] args) {
		Coche c1 = new Coche("Seat", "Ibiza", 2017, true);
		
		Moto m1 = new Moto(3);
		
		Vehiculo v1 = new Coche("Volkswagen", "Polo", 2004, false);
		Vehiculo v2 = new Moto(2);
		
		v1.arrancar();
		v2.detener();
		
		c1.arrancar();
		m1.detener();
		
		
	}

}
