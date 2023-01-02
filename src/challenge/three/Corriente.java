package challenge.three;

import java.util.ArrayList;
import java.util.List;

public class Corriente extends Cuenta {
	
	private List<Tarjeta> tarjetas = new ArrayList<Tarjeta>();
	private List<Producto> productos = new ArrayList<Producto>();
	
	public Corriente(int codigo, String descripcion, int numero, float saldo, float interes) {
		super(codigo, descripcion, numero, saldo, interes);
	}

	public List<Tarjeta> getTarjetas() {
		return tarjetas;
	}

	public void setTarjetas(List<Tarjeta> tarjetas) {
		this.tarjetas = tarjetas;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	@Override
	public String toString() {
		return "Corriente [codigo=" + codigo + ", apertura=" + apertura + ", descripcion=" + descripcion + ", tarjetas="
				+ tarjetas + ", productos=" + productos + "]";
	}

	@Override
	public String terminos() {
		return "Terminos de una cuenta Corriente: ...";
	}	
}
