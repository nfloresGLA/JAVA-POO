package challenge.three;

import java.util.ArrayList;
import java.util.List;

public class CarteraValores extends Producto {
	
	private List<Valor> valores = new ArrayList<Valor>();

	public CarteraValores(int codigo, String descripcion) {
		super(codigo, descripcion);
	}

	public List<Valor> getValores() {
		return valores;
	}

	public void setValores(List<Valor> valores) {
		this.valores = valores;
	}

	@Override
	public String toString() {
		return "CarteraValores [codigo=" + codigo + ", apertura=" + apertura + ", descripcion=" + descripcion
				+ ", valores=" + valores + "]";
	}

	@Override
	public String terminos() {
		return "Terminos de la Cartera de valores " + this.getDescripcion() + ": ...";
	}
}
