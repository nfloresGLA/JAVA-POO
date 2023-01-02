package challenge.three;

public class FCI extends Producto {

	private String nombre;
	private float importe;
	private float rentabilidad;
	
	public FCI(int codigo, String descripcion, String nombre, float importe, float rentabilidad) {
		super(codigo, descripcion);
		this.nombre = nombre;
		this.importe = importe;
		this.rentabilidad = rentabilidad;
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
		return "FCI [codigo=" + codigo + ", apertura=" + apertura + ", descripcion=" + descripcion + ", nombre="
				+ nombre + ", importe=" + importe + ", rentabilidad=" + rentabilidad + "]";
	}

	@Override
	public String terminos() {
		return "Terminos del FCI " + this.getNombre() + ": ...";
	}	
}
