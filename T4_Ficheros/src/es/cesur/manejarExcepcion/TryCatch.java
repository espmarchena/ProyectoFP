package es.cesur.manejarExcepcion;

import java.io.IOException;

public class TryCatch {

	public static void main(String[] args) {
		
		try {
			ManejarExcepcion.manejarExcepcion();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
