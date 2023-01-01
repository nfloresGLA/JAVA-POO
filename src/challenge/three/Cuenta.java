package challenge.three;

import java.time.LocalDate;

public class Cuenta {
	
	private LocalDate apertura;
	private int numero;
	private float saldo;
	private float interes;
	private String tipo;
	
	public Cuenta() {}

	public LocalDate getApertura() {
		return apertura;
	}

	public void setApertura(LocalDate apertura) {
		this.apertura = apertura;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public float getInteres() {
		return interes;
	}

	public void setInteres(float interes) {
		this.interes = interes;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Cuenta [apertura=" + apertura + ", numero=" + numero + ", saldo=" + saldo + ", interes=" + interes
				+ ", tipo=" + tipo + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		return ((Cuenta)obj).getNumero() == this.getNumero();
	}
}
