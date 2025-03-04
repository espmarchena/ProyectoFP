package es.cesur.ejercicio1poo;

public class Principal {

	public static void main(String[] args) {
		//INSTANCIAR 2 OBJETOS

		Persona persona1 = new Persona();
		persona1.setNombre("Naiara");
		persona1.setApellidos("Mesa Vargas");
		persona1.setDNI("44444444N");
		persona1.setDomicilio("C/Camas 2");
		persona1.setTelefono("+34777777777");
		System.out.println("El nombre de la persona1 es " + persona1.getNombre() + " " + persona1.getApellidos()
		+ ". El DNI es: " + persona1.getDNI() + ". Su domicilio es: " + persona1.getDomicilio()
		+ ", y su teléfono es " + persona1.getTelefono());
		
		
		Persona persona2 = new Persona("Esperanza", "Marchena Moreno", "26262626M", "C/Tomares 4", "+34666666666");
		System.out.println("El nombre de la persona2 es " + persona2.getNombre() + " " + persona2.getApellidos()
		+ ". El DNI es: " + persona2.getDNI() + ". Su domicilio es: " + persona2.getDomicilio()
		+ ", y su teléfono es " + persona2.getTelefono());
	}

}
