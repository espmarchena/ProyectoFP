package es.cesur.ejercicio18interfaces;

public class Principal {

	/*COMPLETAR la funcionalidad de este programa creando la clase FuenteDeDatos con los atributos 
	 * tamaño y formato de la que deben heredar las clases Documento e Imagen. La clase FuenteDeDatos 
	 * tendrá además el método leer() que nos permitirá leer el contenido de la fuente de datos.
	 * Las clases Documento e Imagen deben sobreescribir dicho método. Desde la clase Principal
	 * usa el Polimorfismo para ejecutar el método leer() que sobreescriben las subclases: 
	 * PT4_POO_Ejercicio18_InterfacesyHerencia*/
	
	/*SEGUIMOS AMPLIANDO FUNCIONALIDAD AL PROGRAMA: Creamos la interfaz Editable con el método abstracto 
	 * editar() al que no le pasamos parámetro y no devuelve nada. Las clases Documento e Imagen deben 
	 * implementar la interfaz: PT4_POO_Ejercicio19_InterfacesyHerencia*/
	
	public static void main(String[] args) {
		Documento documento1 = new Documento(".pdf", 8, 212);
			
		Imagen imagen1 = new Imagen(".jpg", 5, "un monumento");
			
		Imprimible documento2 = new Documento(".docx", 10, 120);
		Imprimible imagen2 = new Imagen(".jpg", 4, "varios árboles");
			
		documento1.imprimir();
		imagen1.imprimir();
			
		documento2.imprimir();
		imagen2.imprimir();
			
		FuenteDeDatos documento3 = new Documento(".pdf", 1, 32);
		FuenteDeDatos imagen3 = new Imagen(".jpg", 3, "retrato");
			
		documento1.leer();
		imagen1.leer();
			
		documento3.leer();
		imagen3.leer();
			
		FuenteDeDatos fuenteDeDatos = new FuenteDeDatos(".sql", 1);
		fuenteDeDatos.leer();
			
		Editable documento4 = new Documento(".txt", 1, 1);
		Editable imagen4 = new Imagen(".png", 4, "es un cuadro");
		
		documento4.editar();
		imagen4.editar();

	}

}
