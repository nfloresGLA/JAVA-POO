package challenge.one;

public class Botella extends Producto {	


	private boolean retornable;

	public Botella(String nombre, float ancho, float largo, float peso, float volumen) {
		super(nombre, ancho, largo, peso, volumen);
	}
	public boolean isRetornable() {
		return retornable;
	}

	public void setRetornable(boolean retornable) {
		this.retornable = retornable;
	}	

	@Override
	public String toString() {
		return "Botella [nombre=" + nombre + ", ancho=" + ancho + ", largo=" + largo + ", peso=" + peso + ", volumen="
				+ volumen + ", cantidad=" + cantidad + ", retornable=" + retornable + "]";
	}

	@Override
	public void estado() {
		
		if(this.volumen > 0.710) {
			this.setRetornable(true);
		}
		else {
			this.setRetornable(false);
		}			
	}
	
	public String mostrarEstado() {
		return "Retornable: " + this.isRetornable();
	}
}
