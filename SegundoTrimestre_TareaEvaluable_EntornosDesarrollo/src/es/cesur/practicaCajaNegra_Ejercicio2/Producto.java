package es.cesur.practicaCajaNegra_Ejercicio2;

public class Producto {
	private double precio;
	private int iva;

	// Constructor por defecto o constructor vacío
	public Producto() {
		precio = 0.0;
		iva = 21; // IVA predeterminado del 21%
	}

	// Método para aplicar un descuento
	public void aplicarDescuento(int porcentaje) {
		if (porcentaje > 0 && porcentaje <= 100) {
			// Descuento sobre el precio actual
			precio = precio - (precio * porcentaje / 100.0);
		} else {
			System.out.println("El porcentaje de descuento debe estar entre 1 y 100.");
		}
	}

	// Método para establecer el IVA
	public void setIVA(int iva) {
		this.iva = iva;
	}

	// Método para establecer el precio
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	// Método para obtener el IVA
	public int getIVA() {
		return iva;
	}

	// Método para obtener el precio
	public double getPrecio() {
		return precio;
	}
}
