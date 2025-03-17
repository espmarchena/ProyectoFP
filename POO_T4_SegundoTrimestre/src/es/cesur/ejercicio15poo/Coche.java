package es.cesur.ejercicio15poo;

public class Coche extends Vehiculo{
	private Conductor conductor;
	
	public Coche() {
		super();
		conductor = new Conductor();
	}

	public Coche(String matricula, int numRuedas, Conductor conductor) {
		super(matricula, numRuedas);
		this.conductor = conductor;
	}

	public Conductor getConductor() {
		return conductor;
	}

	public void setConductor(Conductor conductor) {
		this.conductor = conductor;
	}
	
	
	
}
