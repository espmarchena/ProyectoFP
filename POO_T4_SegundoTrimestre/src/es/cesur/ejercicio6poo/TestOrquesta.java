package es.cesur.ejercicio6poo;

public class TestOrquesta {

	public static void main(String[] args) {
		Instrumento instrumento1 = new Instrumento("guitarra", 'G');
		System.out.println("La " + instrumento1.getNombre() + " tiene afinación " + instrumento1.getAfinacion());
		
		Musico musico1 = new Musico("Juan Parra", 'H');
		System.out.println("El músico " + musico1.getNombre() + " es de género " + musico1.getSexo());
	}

}
