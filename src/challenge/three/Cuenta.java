package challenge.three;

public abstract class Cuenta extends Producto {
	
	private int numero;
	private float saldo;
	private float interes;	

	public Cuenta(int codigo, String descripcion, int numero, float saldo, float interes) {
		super(codigo, descripcion);
		this.numero = numero;
		this.saldo = saldo;
		this.interes = interes;
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

	@Override
	public String toString() {
		return "Cuenta [codigo=" + codigo + ", apertura=" + apertura + ", descripcion=" + descripcion + ", numero="
				+ numero + ", saldo=" + saldo + ", interes=" + interes + "]";
	}
}
