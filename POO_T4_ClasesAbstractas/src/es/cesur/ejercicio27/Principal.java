package es.cesur.ejercicio27;

public class Principal {

	public static void main(String[] args) {

		Circulo c = new Circulo(5.5);
		Rectangulo r = new Rectangulo(10, 8);
		
		FiguraGeometrica c1 = new Circulo(2.3);
		FiguraGeometrica r2 = new Rectangulo(4.2f, 2.2f);
		
		
		c.calcularArea();
		c.mostrarArea();
		r.calcularArea();
		r.mostrarArea();
		
		c1.calcularArea();
		c1.mostrarArea();
		r2.calcularArea();
		r2.mostrarArea();
		
	}

}
