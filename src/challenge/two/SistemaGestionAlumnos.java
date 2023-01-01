package challenge.two;

import java.util.ArrayList;
import java.util.List;

public class SistemaGestionAlumnos {
	
	private List<Alumno> alumnos = new ArrayList<Alumno>();

	public SistemaGestionAlumnos() {}

	public SistemaGestionAlumnos(List<Alumno> alumnos) {
		super();
		this.alumnos = alumnos;
	}	

	public List<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}

	@Override
	public String toString() {
		return "SistemaGestionAlumnos [alumnos=" + alumnos + "]";
	}
	
	public Alumno TraerAlumno(int dni) {
		
		int i = 0;
		Alumno objeto = null;
		
		while(i < alumnos.size() && objeto == null)
		{
			if(alumnos.get(i).getDni() == dni)
			{
				objeto = alumnos.get(i);
			}
			i++;			
		}		
		
		return objeto;		
	}
	
	public boolean AltaAlumno(String nombre, String apellido, int dni, String direccion, String carrera) {
		return alumnos.add(new Alumno(nombre, apellido, dni, direccion, new Carrera()));
	}
	
	public boolean BajaAlumno(int dni) {
		Alumno alumno = this.TraerAlumno(dni);
		
		return alumnos.remove(alumno);
	}
	public void ModificarAlumno(String nombre, String apellido, int dni) {
		Alumno alumno = this.TraerAlumno(dni);
		
		alumno.setNombre(nombre);
		alumno.setApellido(apellido);
	}
	
}
