package es.cesur.ejercicio26;

public class Bicicleta extends Vehiculo{

	private double pulgadas;

	public Bicicleta(int velocidad, double pulgadas) {
		super(velocidad);
		this.pulgadas = pulgadas;
	}

	public double getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(double pulgadas) {
		this.pulgadas = pulgadas;
	}

	@Override
	public void conducir() {
		System.out.println("La bicicleta de " + pulgadas + " pulgadas va a una velocidad de " + super.getVelocidad() + " Km/h. ");
	}
	


	
	
}
