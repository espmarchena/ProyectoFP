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
		
		
		Empleado empleado2 = new Empleado();
		System.out.println("El nombre de la persona2 es " + empleado2.getNombre() + " " + empleado2.getApellidos()
		+ ". El DNI es: " + empleado2.getDNI());
		
		
		
	}

}
