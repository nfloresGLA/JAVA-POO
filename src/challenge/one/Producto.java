package challenge.one;

public class Producto {
	
	private String nombre;
	private float ancho;
	private float largo;
	private float peso;
	private float volumen;
	private int cantidad;

	public Producto(String nombre, float ancho, float largo, float peso, float volumen) {
		this.nombre = nombre;
		this.ancho = ancho;
		this.largo = largo;
		this.peso = peso;
		this.volumen = volumen;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getAncho() {
		return ancho;
	}

	public void setAncho(float ancho) {
		this.ancho = ancho;
	}

	public float getLargo() {
		return largo;
	}

	public void setLargo(float largo) {
		this.largo = largo;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getVolumen() {
		return volumen;
	}

	public void setVolumen(float volumen) {
		this.volumen = volumen;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}	

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", ancho=" + ancho + ", largo=" + largo + ", peso=" + peso + ", volumen="
				+ volumen + ", cantidad=" + cantidad + "]\n";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		return ((Producto)obj).getNombre().equalsIgnoreCase(this.getNombre());
	}
}
