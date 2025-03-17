package es.cesur.ejercicio17interfaces;

public class Moto implements Vehiculo{
	
	private int cilindrada;

	
	
	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public Moto(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public void arrancar() {
		System.out.println("El vehículo moto de cilindrada " + cilindrada + " está arrancado");
	}

	@Override
	public void detener() {
		System.out.println("El vehículo moto de cilindrada " + cilindrada + " está parado");
	}
}
