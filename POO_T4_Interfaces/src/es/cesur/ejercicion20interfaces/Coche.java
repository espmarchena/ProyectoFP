package es.cesur.ejercicion20interfaces;

public class Coche implements Vehiculo, Motor{

	private String fabricante;
	private String modelo;
	private int anioFabricacion;
	private boolean esGasolina;
	
	@Override
	public void encenderMotor() {
		System.out.println("El " + fabricante + " " + modelo + " ha encendido el motor.");
	}

	@Override
	public void apagarMotor() {
		System.out.println("El " + fabricante + " " + modelo + " ha apagado el motor.");
	}

	@Override
	public void arrancar() {
		System.out.println("El " + fabricante + " " + modelo + " está arrancado.");
	}

	@Override
	public void detener() {
		System.out.println("El " + fabricante + " " + modelo + " está detenido.");
	}

	public Coche(String fabricante, String modelo, int anioFabricacion, boolean esGasolina) {
		super();
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.anioFabricacion = anioFabricacion;
		this.esGasolina = esGasolina;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnioFabricacion() {
		return anioFabricacion;
	}

	public void setAnioFabricacion(int anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	}

	public boolean isEsGasolina() {
		return esGasolina;
	}

	public void setEsGasolina(boolean esGasolina) {
		this.esGasolina = esGasolina;
	}
	
	
	
}
