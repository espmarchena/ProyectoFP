package es.cesur.ejercicio15poo;

public class Moto extends Vehiculo{
	private double cilindrada;
	
	public Moto() {
		super();
		cilindrada = 0;
	}
	
	public Moto(String matricula, int numRuedas, double d) {
		super(matricula, numRuedas);
		this.cilindrada = d;
	}



	public Moto(double cilindrada) {
		super();
		this.cilindrada = cilindrada;
	}

	public double getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(double cilindrada) {
		this.cilindrada = cilindrada;
	}
	
	
}
