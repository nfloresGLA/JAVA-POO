package challenge.two;

public class Profesor extends Persona {
	
	private String departamento;		

	public Profesor(String nombre, String apellido, int dni, String direccion, Carrera carrera, String departamento) {
		super(nombre, apellido, dni, direccion, carrera);
		this.departamento = departamento;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "Profesor [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", direccion=" + direccion
				+ ", carrera=" + carrera + ", departamento=" + departamento + "]";
	}

	@Override
	public String saludar() {
		return "Me llamo: " + this.getNombre() + " y soy un Profesor!!!";
	}	
	
	public String saludar(String mensaje) {
		return "Soy un profesor " + mensaje;
	}
}
