package es.cesur.claseAbstracta;

public class Principal {

	public static void main(String[] args) {
		
		Animal perro = new Perro("Risi");
		Animal gato = new Gato("Lilo");
	
		perro.hacerSonido();
		gato.hacerSonido();
		
		perro.dormir();
		gato.dormir(); //metodo dormir con objeto gato de clase animal -> Animal gato=new Gato("Lilo");

	
	}

}
