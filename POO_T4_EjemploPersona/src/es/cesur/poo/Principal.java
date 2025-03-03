package es.cesur.poo;

public class Principal {

	public static void main(String[] args) {
		
		Persona persona1 = new Persona(); //he creado persona1 usando new + el constructor vacío de la clase Persona
		persona1.setNombre("Esperanza");
		persona1.setApellidos("Marchena Moreno");
		persona1.setEdad(29);
		persona1.setHaPagado(true);
		persona1.setAula(1);		
		System.out.println("El nombre y apellidos de la persona1 son: " + persona1.getNombre() + " " + persona1.getApellidos()
		+ " y su edad es: " + persona1.getEdad() + ". El aula en la que estudia es la nº " + persona1.getAula() + " y ha pagado: " + persona1.getHaPagado());
		
		
		Persona persona2 = new Persona("Naiara", "Mesa Vargas",27, false, 2); //esto se llama INSTANCIAR OBJETOS (crear objetos)
		System.out.println("El nombre y apellidos de la persona2 son: " + persona2.getNombre() + " " + persona2.getApellidos()
		+ " y su edad es: " + persona2.getEdad() + ". El aula en la que estudia es la nº " + persona2.getAula() + " y ha pagado: " + persona2.getHaPagado());
		
		
		
		
		
		
		
		
	}

}
