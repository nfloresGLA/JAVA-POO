package challenge.three;

import java.time.LocalDate;

public class FCI {
	
	private LocalDate apertura;
	private String nombre;
	private float importe;
	private float rentabilidad;
	
	public FCI() {}

	public LocalDate getApertura() {
		return apertura;
	}

	public void setApertura(LocalDate apertura) {
		this.apertura = apertura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getImporte() {
		return importe;
	}

	public void setImporte(float importe) {
		this.importe = importe;
	}

	public float getRentabilidad() {
		return rentabilidad;
	}

	public void setRentabilidad(float rentabilidad) {
		this.rentabilidad = rentabilidad;
	}

	@Override
	public String toString() {
		return "FCI [apertura=" + apertura + ", nombre=" + nombre + ", importe=" + importe + ", rentabilidad="
				+ rentabilidad + "]";
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
		return ((FCI)obj).getNombre().equals(this.getNombre());
	}
}
