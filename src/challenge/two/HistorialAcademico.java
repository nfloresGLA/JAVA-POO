package challenge.two;

import java.util.ArrayList;
import java.util.List;

public class HistorialAcademico {
	
	private List<MateriaCursada> cursadas = new ArrayList<MateriaCursada>();
	private Alumno alumno;
	
	public HistorialAcademico() {}

	public List<MateriaCursada> getCursadas() {
		return cursadas;
	}

	public void setCursadas(List<MateriaCursada> cursadas) {
		this.cursadas = cursadas;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	@Override
	public String toString() {
		return "HistorialAcademico [cursadas=" + cursadas + ", alumno=" + alumno + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alumno == null) ? 0 : alumno.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		return ((HistorialAcademico)obj).getAlumno().equals(this.getAlumno());
	}	
}
