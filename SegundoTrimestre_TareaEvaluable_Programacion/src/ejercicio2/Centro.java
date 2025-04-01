package ejercicio2;

public class Centro {
	//Solo accesible dentro de la misma clase
	private String nombreCentro;
	private String direccionCentro;
	private int codigoCentro;
	
	//CONSTRUCTOR VACÍO
	public Centro() {
		nombreCentro = "";
		direccionCentro = "";
		codigoCentro = 0;
	}

	//CONSTRUCTOR POR PARÁMETROS
	public Centro(String nombreCentro, String direccionCentro, int codigoCentro) {
		this.nombreCentro = nombreCentro;
		this.direccionCentro = direccionCentro;
		this.codigoCentro = codigoCentro;
	}

	
	//GETTERS AND SETTERS (para controlar el acceso a atributos privados)
	public String getNombreCentro() {
		return nombreCentro;
	}
	public void setNombreCentro(String nombreCentro) {
		this.nombreCentro = nombreCentro;
	}
	public String getDireccionCentro() {
		return direccionCentro;
	}
	public void setDireccionCentro(String direccionCentro) {
		this.direccionCentro = direccionCentro;
	}
	public int getCodigoCentro() {
		return codigoCentro;
	}
	public void setCodigoCentro(int codigoCentro) {
		this.codigoCentro = codigoCentro;
	}
	
}
