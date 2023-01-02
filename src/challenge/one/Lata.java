package challenge.one;

public class Lata extends Producto {
	
	private boolean aluminio;
	private boolean reutilizable;
	
	public Lata(String nombre, float ancho, float largo, float peso, float volumen, boolean aluminio) {
		super(nombre, ancho, largo, peso, volumen);
		this.aluminio = aluminio;
	}

	public boolean isAluminio() {
		return aluminio;
	}

	public void setAluminio(boolean aluminio) {
		this.aluminio = aluminio;
	}

	public boolean isReutilizable() {
		return reutilizable;
	}

	public void setReutilizable(boolean reutilizable) {
		this.reutilizable = reutilizable;
	}

	@Override
	public String toString() {
		return "Lata [nombre=" + nombre + ", ancho=" + ancho + ", largo=" + largo + ", peso=" + peso + ", volumen="
				+ volumen + ", cantidad=" + cantidad + ", aluminio=" + aluminio + ", reutilizable=" + reutilizable
				+ "]";
	}

	@Override
	public void estado() {
		
		if(this.isAluminio()) {
			this.setReutilizable(true);
		}
		else {
			this.setReutilizable(false);
		}		
	}	
	
	public String mostrarEstado() {
		return "Reutilizable: " + this.isReutilizable();
	}
}
