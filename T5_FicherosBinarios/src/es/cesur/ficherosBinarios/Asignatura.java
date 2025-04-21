package es.cesur.ficherosBinarios;

import java.io.Serializable;

public class Asignatura implements Serializable { // Serializable permite que la clase que lo implemente pueda trabajar y convertir en bytes
	//la interfaz existe en la api de Java, no tenemos que crearla nosotros

	private static final long serialVersionUID = 1L; // ID QUE JAVA ASIGNA AL OBJETO ASIGNATURA, QUE CUANDO LO TRANSFORMEMOS A BYTES, SERÁ IDENTIFICADO ASÍ
	// Es una constante que nos permitirá identificar el objeto asignatura para poder trabajar mas tarde con ello
	
	private String nombre;
	private int numHoras;
	private String codigo;

	public Asignatura(String nombre, int numHoras, String codigo) {
		this.nombre = nombre;
		this.numHoras = numHoras;
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumHoras() {
		return numHoras;
	}

	public void setNumHoras(int numHoras) {
		this.numHoras = numHoras;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
}
