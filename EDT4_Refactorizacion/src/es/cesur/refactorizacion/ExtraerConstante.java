package es.cesur.refactorizacion;

public class ExtraerConstante {

	public static double costeTrabajadores(int numeroTrabajadores) {

		return 1200 * numeroTrabajadores;
		//SELECCIONANDO EL 1200 Y DANDOLE A REFACTOR/EXTRACT CONSTANT, LE DAMOS UN NOMBRE Y MARCAMOS EL MODIFICADOR DE ACCESO Y EL CHECK DE LA PRIMERA CASILLA
		//Y SE MODIFICARÁ AL CODIGO DE ABAJO, LO QUE HARÁ QUE TODAS LAS VECES QUE SE HA USADO EL 1200 SE CAMBIE A LO QUE HEMOS RELLENADO EN EL REFACTOR
	}
}


/*
package es.cesur.refactorizacion;

public class CalculoCostes {

	public static final int SUELDO = 1200; //

	public static double costeTrabajadores(int numeroTrabajadores) {

		return SUELDO * numeroTrabajadores;
	}
}
*/