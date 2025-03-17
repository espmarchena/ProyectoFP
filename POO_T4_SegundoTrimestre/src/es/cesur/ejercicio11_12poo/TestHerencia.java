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
		System.out.println("El consejero tiene " + consejero1.getNumero_acciones() + " acciones.");
		
		Aula aula = new Aula("DAW", 20);
		System.out.println("El aula de " + aula.getNombreAula() + " tiene un total de " + aula.getNumAlumnos() + " alumnos.");
		
		Alumno a1 = new Alumno("Luis Jose", "Cañas", "98989898Q", "C/Rio nº7", "698545487", 26, true, aula);
		System.out.println("El alumno " + a1.getNombre() + " " + a1.getApellidos() + " tiene " + a1.getEdad() + " años y parece ser que " + a1.isHaPagado() + " ha pagado."
				 + " Está en la clase de " + a1.getAula().getNombreAula() + " y tiene " + a1.getAula().getNumAlumnos() + " compañeros.");

	}

}
