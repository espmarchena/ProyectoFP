package deberesenclase;

public class FuncionesArray_StringRepes {

	public static void main(String[] args) {
		// funcion que reciba un array de String y un apellido y que devuelva cuantos hay
		String tablaApellidos[] = {"Lopez", "Perez", "Perez", "Martin", "Sanchez"};
		
		int apellidosRepe = ContarApellidos(tablaApellidos, "Perez");
		System.out.println("nº de apellidos repes: " + apellidosRepe);
		
		apellidosRepe = ContarApellidos(tablaApellidos, "Marchena");
		System.out.println("nº de apellidos repes: " + apellidosRepe);
	}
	
	
	public static int ContarApellidos (String tablaApellidos[], String apellido) {
		
		int contador=0;
		for (int i = 0; i < tablaApellidos.length; i++) {
			
			if(apellido.equals(tablaApellidos[i])) {
				contador++;
			}			
		}
		
		return contador;
	}
	
}
