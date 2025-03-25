package es.cesur.ejercicio26;

public abstract class Vehiculo {

	private int velocidad;
	
	public abstract void conducir(); //método abstracto
	
	public void detener() { //método desarrollado  
		System.out.println("El vehículo está detenido."); 
		}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public Vehiculo(int velocidad) {
		this.velocidad = velocidad;
	}
	
	
}
