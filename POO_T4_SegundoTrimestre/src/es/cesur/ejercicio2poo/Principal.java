package es.cesur.ejercicio2poo;

public class Principal {

	public static void main(String[] args) {
		
		Empleado empleado1 = new Empleado();
		empleado1.setNombre("Esperanza");
		empleado1.setApellidos("Marchena Moreno");
		empleado1.setDNI("78787878H");
		empleado1.setPuesto("encargado");
		empleado1.setDomicilio("Calle Rio 9");
		empleado1.setTelefono("+34698698698");
		System.out.println("El nombre de la persona1 es " + empleado1.getNombre() + " " + empleado1.getApellidos()
		+ ". El DNI es: " + empleado1.getDNI() + ". Su cargo es: " + empleado1.getPuesto() +". Vive en " + empleado1.getDomicilio()
		+ " y su telefono es " + empleado1.getTelefono());
		
		
		Empleado empleado2 = new Empleado("Esperanza", "Marchena Moreno", "56565656L", "Calle Marina 3", "jefe", "+34699888777");
		System.out.println("El nombre de la persona2 es " + empleado2.getNombre() + " " + empleado2.getApellidos()
		+ ". El DNI es: " + empleado2.getDNI() + ". Su cargo es: " + empleado2.getPuesto() +". Vive en " + empleado2.getDomicilio()
		+ " y su telefono es " + empleado2.getTelefono());
		
		
		
	}

}
