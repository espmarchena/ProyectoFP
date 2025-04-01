package ejercicio2;

public class Asignatura {
	//Solo accesible dentro de la misma clase
	private String nombreAsig;
	private int horas;
	private String codigoAsig;
	
	//CONSTRUCTOR VACÍO
	public Asignatura() {
		nombreAsig = "";
		horas = 0;
		codigoAsig = "";
	}

	//CONSTRUCTOR POR PARÁMETROS
	public Asignatura(String nombreAsig, int horas, String codigoAsig) {
		this.nombreAsig = nombreAsig;
		this.horas = horas;
		this.codigoAsig = codigoAsig;
	}

	//GETTERS AND SETTERS (para controlar el acceso a atributos privados)
	public String getNombreAsig() {
		return nombreAsig;
	}
	public void setNombreAsig(String nombreAsig) {
		this.nombreAsig = nombreAsig;
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	public String getCodigoAsig() {
		return codigoAsig;
	}
	public void setCodigoAsig(String codigoAsig) {
		this.codigoAsig = codigoAsig;
	}

}
