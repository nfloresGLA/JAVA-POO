package challenge.two;

import java.time.LocalDate;

public class Tramite {

	private int numero;
	private LocalDate fechaInicio;
	private Alumno alumno;	
	
	public Tramite() {}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	@Override
	public String toString() {
		return "Tramite [numero=" + numero + ", fechaInicio=" + fechaInicio + ", alumno=" + alumno + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alumno == null) ? 0 : alumno.hashCode());
		result = prime * result + numero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		return 	((Tramite)obj).getAlumno().equals(this.getAlumno())
				&&
				((Tramite)obj).getNumero() == this.getNumero();
	}	
}
