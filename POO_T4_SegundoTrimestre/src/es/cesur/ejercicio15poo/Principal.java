package es.cesur.ejercicio15poo;

public class Principal {

	public static void main(String[] args) {
		
		Coche c = new Coche("0102KHJ", 4, new Conductor());
		
		Moto m = new Moto("1985DDL", 2, 2.8);
		
		Vehiculo v = new Vehiculo("4845MNN", 4);
		
		Conductor cond = new Conductor("Esperanza", true);
		
		Vehiculo v2 = new Coche("6548HRN", 2, new Conductor("Jose", true));

		
		System.out.println(cond.getNombre() + " tiene carnet "+ cond.isCarnet() + " y conduce un coche con matricula "
				+ c.getMatricula());
		System.out.println(cond.getNombre() + " tiene carnet "+ cond.isCarnet() + " y conduce " +
				 v2.getMatricula() + v2.getNumRuedas() + " con " + ((Moto)v2).getCilindrada() + " cilindradas");
		//((Moto) vehiculo2).getCilindrada()  AQUI CASTEAMOS DECIMOS QUE DE moto COJA EL ATRIBUTO cilindradas YA QUE ES EXCLUSIVO DE MOTO
		// Y VEHICULO ES PADRE QUE TIENE TAMBIEN  matricula y numRuedas
 
		
	}

}
