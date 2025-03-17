package es.cesur.ejercicio17interfaces;

public class Coche implements Vehiculo{

	private String fabricante;
	private String modelo;
	private int anio;
	private boolean esGasolina;
	
	
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

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public boolean isEsGasolina() {
		return esGasolina;
	}

	public void setEsGasolina(boolean esGasolina) {
		this.esGasolina = esGasolina;
	}

	public Coche(String fabricante, String modelo, int anio, boolean esGasolina) {
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.anio = anio;
		this.esGasolina = esGasolina;
	}

	@Override
	public void arrancar() {
		System.out.println("El vehículo coche del fabricante " + fabricante + " ,modelo " + modelo + " y año de fabricación " + anio + " está arrancado");
	}
	
	@Override
	public void detener() {
		System.out.println("El vehículo coche del fabricante " + fabricante + " ,modelo " + modelo + " y año de fabricación " + anio + " está parado");
	}
	
}
