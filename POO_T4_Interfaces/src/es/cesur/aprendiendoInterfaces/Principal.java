package es.cesur.aprendiendoInterfaces;

public class Principal {

	public static void main(String[] args) {
		
		Acumulador acum1 = new Acumulador(10); //constructor //detrás del new nunca va una interfaz
		System.out.println(acum1.getValorNumerico()); // en el constructor anterior le di valor 10, asiq en el syso saldrá 10
		
		acum1.incremento(50); // con este metodo sumamos 50 al valorNumerico que declaré con 10
		System.out.println(acum1.getValorNumerico());//por lo que dará 60
		
		acum1.setMaximo(800); // este metodo asigna al atributo lo que le paso como parametro
		System.out.println(acum1.getValorNumerico()); //por lo que saldrá 800
		
		acum1.setPrecision(1); // este metodo asigna el parametro al atributo
		System.out.println(acum1.getValorNumerico()); //por lo que dará 1 
		
		
		
		IModificacion acum2 = new Acumulador(50); //polimorfismo //detrás del new nunca va una interfaz
		acum2.incremento(60); 
		
		INumerico acum3 = new Acumulador(20); //polimorfismo
		acum3.setMaximo(200);
		acum3.setPrecision((int)INumerico.NUMERO_E); //casteamos a entero pq NUMERO_E es un double //nombredelainterfaz.nombredelaconstante
		
		IConstantes acum4 = new Acumulador(10);
		acum1.setMaximo(IConstantes.VALOR_MAXIMO); //llamo a acum1 que lo ve todo y le paso el valor maximo que hay en la interfaz IConstantes(100) // accedo al atributo(constante) de la interfaz pero uso el metodo de la clase
		acum1.setValorNumerico(IConstantes.VALOR_MINIMO); //llamo a acum1 que lo ve todo y le paso el valor minimo que hay en la interfaz IConstantes(100)
		
	}

}
