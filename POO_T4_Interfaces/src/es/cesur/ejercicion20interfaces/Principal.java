package es.cesur.ejercicion20interfaces;

public class Principal {

	public static void main(String[] args) {
		
		Coche c1 = new Coche ("Seat", "Ibiza", 2017, true);

		c1.arrancar();
		c1.detener();
		c1.encenderMotor();
		c1.apagarMotor();
		
		Vehiculo c2 = new Coche("Volkswagen", "Polo", 2014, true);
		Motor c3 = new Coche("Renault", "Clio", 2020, false);
		
		c2.arrancar();
		c2.detener();
		c3.encenderMotor();
		c3.apagarMotor();
	}

}
