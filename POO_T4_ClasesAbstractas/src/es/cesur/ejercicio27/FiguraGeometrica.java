package es.cesur.ejercicio27;

public abstract class FiguraGeometrica {
	
	public abstract double calcularArea(); 
	
	public void mostrarArea() { 
		System.out.println("El área de la figura es: " + calcularArea()); 
		} 
}
