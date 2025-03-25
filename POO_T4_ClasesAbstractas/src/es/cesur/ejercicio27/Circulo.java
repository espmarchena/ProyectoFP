package es.cesur.ejercicio27;

public class Circulo extends FiguraGeometrica{
	
	private double radio;

	@Override
	public double calcularArea() {
		double areaCirculo = 3.14f * radio * radio;
		return areaCirculo;
	}

	public Circulo(double radio) {
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	
	
}
