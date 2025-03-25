package es.cesur.ejercicio26;

public class Coche extends Vehiculo{

	private String fabricante;
	private String modelo;
	private boolean esGasolina;
	
//constructor con herencia
	public Coche(int velocidad, String fabricante, String modelo, boolean esGasolina) {
		super(velocidad);
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.esGasolina = esGasolina;
	}

	//metodo sobrescrito
	@Override
	public void conducir() {
		System.out.println("El coche " + fabricante + " " + modelo + " está conduciendo a una velocidad de " + super.getVelocidad() + " Km/h. ");
	}

	//getters y setters
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

	public boolean isEsGasolina() {
		return esGasolina;
	}

	public void setEsGasolina(boolean esGasolina) {
		this.esGasolina = esGasolina;
	}

	 
	 
}
