package es.cesur.cajaNegra_Ejercicio6;

public class Casa {
	private String nombrePropietario;
	private int superficie;

	public Casa() {
		nombrePropietario = "";
		superficie = 0;
	}

	public void setPropietario(String nombrePropietario) {
		this.nombrePropietario = nombrePropietario;
	}

	public String getPropietario() {
		return nombrePropietario;
	}

	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}

	public int getSuperficie() {
		return superficie;
	}
}
