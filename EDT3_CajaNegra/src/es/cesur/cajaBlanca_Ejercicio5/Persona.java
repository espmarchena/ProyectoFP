package es.cesur.cajaBlanca_Ejercicio5;

public class Persona {

	private int anyoNacimiento;
	private int anyoFallecimiento;
	private String sexo;

	public Persona(int anyoNac) {
		anyoNacimiento = anyoNac;
		anyoFallecimiento = 0;
		sexo = "";
	}

	public void setNacimiento(int anyo) {
		this.anyoNacimiento = anyo;
	}

	public void setFallecimiento(int anyo) {
		if ((this.anyoNacimiento <= anyo) && ((anyo - this.anyoNacimiento) <= 125)) {
			this.anyoFallecimiento = anyo;
		}
	}

	public void setSexo(String sexo) {
		if (sexo.equals("H") || sexo.equals("M")) {
			this.sexo = sexo;
		}
	}

	public int getAnyoFallecimiento() {
		return anyoFallecimiento;
	}

	public int getAnyoNacimiento() {
		return anyoNacimiento;
	}

	public String getSexo() {
		return sexo;
	}

}
