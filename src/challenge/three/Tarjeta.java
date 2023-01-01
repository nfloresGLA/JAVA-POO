package challenge.three;

import java.time.LocalDate;

public class Tarjeta {
	
	private String tipo;
	private String numero;
	private Cliente cliente;
	private LocalDate vencimiento;
	
	public Tarjeta() {
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public LocalDate getVencimiento() {
		return vencimiento;
	}

	public void setVencimiento(LocalDate vencimiento) {
		this.vencimiento = vencimiento;
	}

	@Override
	public String toString() {
		return "Tarjeta [tipo=" + tipo + ", numero=" + numero + ", cliente=" + cliente + ", vencimiento=" + vencimiento
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		return 	((Tarjeta)obj).getNumero().equals(this.getNumero()) 
				&&
				((Tarjeta)obj).getTipo().equals(this.getTipo());
	}	
}
