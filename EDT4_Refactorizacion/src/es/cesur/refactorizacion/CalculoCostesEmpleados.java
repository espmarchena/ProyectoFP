package es.cesur.refactorizacion;

public class CalculoCostesEmpleados {

	private static final double SALARIO_BASE = 1500;

	public static double costeTrabajadores(int numeroTrabajadores) {
		return SALARIO_BASE * numeroTrabajadores;
	}
}