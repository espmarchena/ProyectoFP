package es.cesur.ejercicio10poo;

public class TestBanco {

	public static void main(String[] args) {
		
		Cliente cl = new Cliente("Ariana Grande", "26262626M", "Calle Marítimo nº90");
		Cuenta cta = new Cuenta("7777777", 42855.08, cl);

		System.out.println("La cliente " + cta.getCliente().getNombre() + " con DNI " + cta.getCliente().getDNI() + ", vive en " + cta.getCliente().getDireccion()
				+ " y su ccc es " + cta.getNumCuenta() + " en la que tiene " + cta.getSaldo() + " €");
	}

}
