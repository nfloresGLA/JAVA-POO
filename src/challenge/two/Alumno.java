package challenge.two;

import java.util.ArrayList;
import java.util.List;

public class Alumno extends Persona {
	
	private List<Asignatura> asignaturas = new ArrayList<Asignatura>();

	public Alumno(String nombre, String apellido, int dni, String direccion, Carrera carrera) {
		super(nombre, apellido, dni, direccion, carrera);
	}	

	public List<Asignatura> getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(List<Asignatura> asignaturas) {
		this.asignaturas = asignaturas;
	}	

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", direccion=" + direccion
				+ ", carrera=" + carrera + ", asignaturas=" + asignaturas + "]";
	}

	@Override
	public String saludar() {
		return "Me llamo: " + this.getNombre() + " y soy un estudiante!!!";
	}	
	
	public String saludar(String mensaje) {
		return "Soy un estudiante " + mensaje;
	}
}
