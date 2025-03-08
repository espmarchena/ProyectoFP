package es.cesur.ejercicio5poo;

public class TestCarrera {

	public static void main(String[] args) {

		Coche coche1 = new Coche("Toyota", "Corola", 2020, true);
		System.out.println("El " + coche1.getFabricante() + " " + coche1.getModelo() + " se fabricó en el año " + coche1.getAñoFabricacion() + ". ¿Es de gasolina?: " + coche1.getGasolina());
		
		Coche coche2 = new Coche("Ford", "Focus", 2018, false);
		System.out.println("El " + coche2.getFabricante() + " " + coche2.getModelo() + " se fabricó en el año " + coche2.getAñoFabricacion() + ". ¿Es de gasolina?: " + coche2.getGasolina());
	
		Piloto piloto1 = new Piloto("Agustín Fernández", "española");
		System.out.println("El piloto " + piloto1.getNombre() + " es de nacionalidad " + piloto1.getNacionalidad());

		Piloto piloto2 = new Piloto("Liam Charles", "inglesa");
		System.out.println("El piloto " + piloto2.getNombre() + " es de nacionalidad " + piloto2.getNacionalidad());
	}

}
