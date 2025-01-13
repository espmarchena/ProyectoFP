package clases;

public class Asignatura {
	
	protected String nombre;
	protected int horas;
	
	public Asignatura() {}
	
	public Asignatura(String nombre, int horas) {
		this.nombre = nombre;
		this.horas = horas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public void presentarAsignatura() {
		System.out.println("Me llamo " + nombre + " y duro " + horas + " horas.");
	}

	@Override 
	public String toString() { //pinta lo que esta pasando
		return "Asignatura [nombre=" + nombre + ", horas=" + horas + "]";
	}

	
	
	
	
	
}
