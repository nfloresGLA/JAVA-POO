package challenge.two;

import java.time.LocalTime;

public class Asignatura {
	
	private String nombre;
	private Carrera carrera;
	private int anio;
	private LocalTime hora;
	private int cuatrimestre;
	private boolean anual;
	private Profesor profesor;
	
	public Asignatura() {}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Carrera getCarrera() {
		return carrera;
	}

	public void setCarrera(Carrera carrera) {
		this.carrera = carrera;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public int getCuatrimestre() {
		return cuatrimestre;
	}

	public void setCuatrimestre(int cuatrimestre) {
		this.cuatrimestre = cuatrimestre;
	}

	public boolean isAnual() {
		return anual;
	}

	public void setAnual(boolean anual) {
		this.anual = anual;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	@Override
	public String toString() {
		return "Asignatura [nombre=" + nombre + ", carrera=" + carrera + ", anio=" + anio + ", hora=" + hora
				+ ", cuatrimestre=" + cuatrimestre + ", anual=" + anual + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + anio;
		result = prime * result + ((carrera == null) ? 0 : carrera.hashCode());
		result = prime * result + cuatrimestre;
		result = prime * result + ((hora == null) ? 0 : hora.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		
		Asignatura objeto = ((Asignatura)obj);
		
		return 	objeto.getAnio() == this.getAnio() 
				&&
				objeto.getCarrera().equals(this.getCarrera()) 
				&&
				objeto.getCuatrimestre() == this.getCuatrimestre() 
				&&
				objeto.getHora().equals(this.getHora());
	}	
}
