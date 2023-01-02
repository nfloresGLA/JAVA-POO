package challenge.two;

public class Carrera {
	
	private String nombre;
	private String departamento;
	private String universidad;
	
	public Carrera() {}	

	public Carrera(String nombre, String departamento, String universidad) {
		super();
		this.nombre = nombre;
		this.departamento = departamento;
		this.universidad = universidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getUniversidad() {
		return universidad;
	}

	public void setUniversidad(String universidad) {
		this.universidad = universidad;
	}

	@Override
	public String toString() {
		return "Carrera [nombre=" + nombre + ", departamento=" + departamento + ", universidad=" + universidad + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((departamento == null) ? 0 : departamento.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((universidad == null) ? 0 : universidad.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		Carrera objeto = ((Carrera)obj);
		
		return 	objeto.getDepartamento().equals(this.getDepartamento()) 
				&&
				objeto.getNombre().equals(this.getNombre()) 
				&&
				objeto.getUniversidad().equals(this.getUniversidad());
	}	
}
