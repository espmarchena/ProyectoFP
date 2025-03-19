package ejercicio1;

public class Alumno {

	private String nombreAlumno;
	private String direccionAlumno;
	private int numMatricula;
	private float nota;
	private Centro centro;
	private Asignatura asignatura;
	
	
	//CONSTRUCTOR VACÍO
	public Alumno() {
		this.nombreAlumno = "";
		this.direccionAlumno = "";
		this.numMatricula = 0;
		this.nota = 0.0f;
		this.centro = new Centro();
		this.asignatura = new Asignatura();
	}
	
	//CONSTRUCTOR POR PARÁMETROS
	public Alumno(String nombreAlumno, String direccionAlumno, int numMatricula, float nota,
			Centro centro, Asignatura asignatura) {
		this.nombreAlumno = nombreAlumno;
		this.direccionAlumno = direccionAlumno;
		this.numMatricula = numMatricula;
		this.nota = nota;
		this.centro = centro;
		this.asignatura = asignatura;
	}

	
	//GETTERS AND SETTERS
	public String getNombreAlumno() {
		return nombreAlumno;
	}
	public void setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
	}
	public String getDireccionAlumno() {
		return direccionAlumno;
	}
	public void setDireccionAlumno(String direccionAlumno) {
		this.direccionAlumno = direccionAlumno;
	}
	public int getNumMatricula() {
		return numMatricula;
	}
	public void setNumMatricula(int numMatricula) {
		this.numMatricula = numMatricula;
	}
	public float getNota() {
		return nota;
	}
	public void setNota(float nota) {
		this.nota = nota;
	}
	public Centro getCentro() {
		return centro;
	}
	public void setCentro(Centro centro) {
		this.centro = centro;
	}
	public Asignatura getAsignatura() {
		return asignatura;
	}
	public void setAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;
	}
	
	
	
	
	
	
}
