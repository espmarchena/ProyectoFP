package es.cesur.ejercicio5poo;

public class Coche {
	private String fabricante;
	private String modelo;
	private int añoFabricacion;
	private boolean gasolina;
	
	public Coche(String fabricante, String modelo, int añoFabricacion, boolean gasolina) {
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.añoFabricacion = añoFabricacion;
		this.gasolina = gasolina;
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

	public int getAñoFabricacion() {
		return añoFabricacion;
	}

	public void setAñoFabricacion(int añoFabricacion) {
		this.añoFabricacion = añoFabricacion;
	}

	public boolean isGasolina() {
		return gasolina;
	}

	public void setGasolina(boolean gasolina) {
		this.gasolina = gasolina;
	}
	
	
	
}
