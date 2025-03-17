package es.cesur.ejercicio15poo;

public class Vehiculo {
	private String matricula;
	private int numRuedas;
	
	public Vehiculo() {
		matricula = "";
		numRuedas = 0;
	}

	public Vehiculo(String matricula, int numRuedas) {
		super();
		this.matricula = matricula;
		this.numRuedas = numRuedas;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getNumRuedas() {
		return numRuedas;
	}

	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}
	
	
}
