package es.cesur.ejercicio15poo;

public class Conductor {
	private String nombre;
	private boolean carnet;

	public Conductor(){
		nombre="";
		carnet= true;
	}

	public Conductor(String nombre, boolean carnet) {
		super();
		this.nombre = nombre;
		this.carnet = carnet;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isCarnet() {
		return carnet;
	}

	public void setCarnet(boolean carnet) {
		this.carnet = carnet;
	}


	
}	