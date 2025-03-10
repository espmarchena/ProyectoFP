package es.cesur.ejercicio11_12poo;

public class TestHerencia {

	public static void main(String[] args) {
		
		Persona persona1 = new Persona ("Esperanza", "Marchena", "44645645L", "C/Sol nº2", "698745698");
		System.out.println(persona1.getNombre() + " " + persona1.getApellidos());
		persona1.saludar(); //metodo saludar de la clase persona
		
		Empleado empleado1 = new Empleado ("Naiara", "Mesa", "78457845P", "C/Luna nº4", "654654654", "informática"); // uso los atributos de la herencia de la clase persona más el propio de la clase empleado
		System.out.println(empleado1.getNombre() + " es " + empleado1.getPuesto());
		empleado1.saludar(); //metodo saludar de la clase empleado que sobrescribe al de la clase persona, añadiendo el puesto
		
		Persona empleado2 = new Empleado("Jose", "Duran", "14714714A", "C/Estrella nº8", "652525252", "administrador");	//constructor Empleado de tipo Persona
		System.out.println(((Empleado)empleado2).getPuesto()); //casteamos para obligar a que empleado2 sea de tipo empleado, ya que en un ppio esta siendo de tipo Persona y asi no es accesible
		empleado2.saludar(); //ejecuta el metodo saludar de la clase empleado porque prevalece el de la clase hija cuando usamos el polimorfismo 
	
		Consejero consejero1 = new Consejero("Alvaro", "Fernandez", "85858585N", "C/Mar nº5", "632632632", "cajero", 40);
		System.out.println(consejero1.getNumero_acciones());
	}

}
