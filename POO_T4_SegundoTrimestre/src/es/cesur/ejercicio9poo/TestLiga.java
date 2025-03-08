package es.cesur.ejercicio9poo;

public class TestLiga {

	public static void main(String[] args) {
		Equipo betis = new Equipo ("Real Betis Balompié", 1907, 50373);
		Equipo sevilla = new Equipo ("Sevilla FC", 1905, 42836);
		
		Futbolista joaquin = new Futbolista("Joaquín", "Sánchez", true, betis);
		Futbolista navas = new Futbolista("Jesús", "Navas", true, sevilla);

	}

}
