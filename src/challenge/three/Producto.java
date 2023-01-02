package challenge.three;

import java.time.LocalDate;

public abstract class Producto {
	
	protected int codigo;
	protected LocalDate apertura;
	protected String descripcion;	

	public Producto(int codigo, String descripcion) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.apertura = LocalDate.now();
	}		

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public LocalDate getApertura() {
		return apertura;
	}

	public void setApertura(LocalDate apertura) {
		this.apertura = apertura;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", apertura=" + apertura + ", descripcion=" + descripcion + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		return 	((Producto)obj).getCodigo() == this.getCodigo()
				&&	
				((Producto)obj).getDescripcion().equalsIgnoreCase(this.getDescripcion());
	}	
	
	public abstract String terminos();	
}
