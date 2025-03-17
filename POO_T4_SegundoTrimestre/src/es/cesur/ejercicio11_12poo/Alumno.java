package es.cesur.ejercicio11_12poo;

public class Alumno extends Persona {
		private String nombre;
		private String apellidos;
		private int edad;
		private boolean haPagado;
		private Aula aula;
		
		public Alumno() {
			super();
			nombre="";
			apellidos="";
			edad= 0;
			haPagado = false;
			aula = new Aula();
		}

		public Alumno(String nombre, String apellidos, String dni, String domicilio, String telefono, int edad, boolean haPagado, Aula aula) {
			super(nombre, apellidos, dni, domicilio, telefono);
			nombre = nombre;
			apellidos = apellidos;
			this.edad = edad;
			this.haPagado = haPagado;
			this.aula = aula;
		}



		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellidos() {
			return apellidos;
		}

		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}

		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}

		public boolean isHaPagado() {
			return haPagado;
		}

		public void setHaPagado(boolean haPagado) {
			this.haPagado = haPagado;
		}

		public Aula getAula() {
			return aula;
		}

		public void setAula(Aula aula) {
			this.aula = aula;
		}

		
	
	
	
}
