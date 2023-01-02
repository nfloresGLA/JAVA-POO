package challenge.one;

import java.time.LocalDate;

public class Envase extends Producto {
	
	private boolean reciclado;

	public Envase(String nombre, float ancho, float largo, float peso, float volumen) {
		super(nombre, ancho, largo, peso, volumen);
	}

	public boolean isReciclado() {
		return reciclado;
	}

	public void setReciclado(boolean reciclado) {
		this.reciclado = reciclado;
	}

	@Override
	public String toString() {
		return "Envase [nombre=" + nombre + ", ancho=" + ancho + ", largo=" + largo + ", peso=" + peso + ", volumen="
				+ volumen + ", cantidad=" + cantidad + ", reciclado=" + reciclado + "]";
	}

	@Override
	public void estado() {
		
		if(LocalDate.now().getDayOfMonth() <= 15) {
			this.setReciclado(true);
		}
		
		else {
			this.setReciclado(false);
		}		
	}
	
	public String mostrarEstado() {
		return "Reciclado: " + this.isReciclado();
	}
}
