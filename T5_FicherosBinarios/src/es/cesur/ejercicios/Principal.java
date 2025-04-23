package es.cesur.ejercicios;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Notas_Ej11[] notas = new Notas_Ej11[3];
		Metodos.crearEscribirFicheroBinario(notas, scanner); // GuardarNotas_Ej11
		
		Metodos.leerFicheroBinario(); // clase LeerNota_Ej12

	}

}
