package es.cesur.ejercicio10poo;

public class Cuenta {

	private String numCuenta;
	private double saldo;
	private Cliente cliente; // relacionamos las clases usando un atributo con el tipo de dato de la otra clase
	
	public Cuenta(String numCuenta, double d, Cliente cliente) {
		this.numCuenta = numCuenta;
		this.saldo = d;
		this.cliente = cliente;
	}
	public String getNumCuenta() {
		return numCuenta;
	}
	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
}
