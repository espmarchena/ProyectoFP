package es.cesur.ejercicio27;

public class Rectangulo extends FiguraGeometrica{
	
	private float ancho;
	private float largo;
	
	@Override
	public double calcularArea() {
		float areaRectangulo = largo * ancho;
		return areaRectangulo;
	}

	public Rectangulo(float ancho, float largo) {
		this.ancho = ancho;
		this.largo = largo;
	}
	
	public double getAncho() {
		return ancho;
	}

	public void setAncho(float ancho) {
		this.ancho = ancho;
	}

	public double getLargo() {
		return largo;
	}

	public void setLargo(float largo) {
		this.largo = largo;
	}	

}
