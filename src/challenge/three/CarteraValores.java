package challenge.three;

import java.util.ArrayList;
import java.util.List;

public class CarteraValores {
	
	private List<Valor> valores = new ArrayList<Valor>();

	public CarteraValores() {}

	public List<Valor> getValores() {
		return valores;
	}

	public void setValores(List<Valor> valores) {
		this.valores = valores;
	}

	@Override
	public String toString() {
		return "CarteraValores [valores=" + valores + "]";
	}	
}
