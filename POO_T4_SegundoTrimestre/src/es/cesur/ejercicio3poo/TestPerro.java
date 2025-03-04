package es.cesur.ejercicio3poo;

public class TestPerro {

	public static void main(String[] args) {
		
	Perro perro1 = new Perro("Pastor Alemán", "grande", "4", "marrón");
	System.out.println("La raza del perro1 es " + perro1.getRaza() +" y es de tamaño " + perro1.getTamanio()
	+ ". Tiene " + perro1.getEdad() + " años y es de color " + perro1.getColor());	
	
	Perro perro2 = new Perro("Carlino", "pequeño", "7", "blanco");
	System.out.println("La raza del perro2 es " + perro2.getRaza() +" y es de tamaño " + perro2.getTamanio()
	+ ". Tiene " + perro2.getEdad() + " años y es de color " + perro2.getColor());
	
	Perro perro3 = new Perro("Yorkshire", "pequeño", "10", "negro");
	System.out.println("La raza del perro3 es " + perro3.getRaza() +" y es de tamaño " + perro3.getTamanio()
	+ ". Tiene " + perro3.getEdad() + " años y es de color " + perro3.getColor());	
	
	}
}
