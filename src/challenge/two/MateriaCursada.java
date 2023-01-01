package challenge.two;

public class MateriaCursada {
	
	private Asignatura asignatura;
	private String notasCursada;
	private String notasFinal;
	
	public MateriaCursada() {}

	public Asignatura getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;
	}

	public String getNotasCursada() {
		return notasCursada;
	}

	public void setNotasCursada(String notasCursada) {
		this.notasCursada = notasCursada;
	}

	public String getNotasFinal() {
		return notasFinal;
	}

	public void setNotasFinal(String notasFinal) {
		this.notasFinal = notasFinal;
	}

	@Override
	public String toString() {
		return "MateriaCursada [asignatura=" + asignatura + ", notasCursada=" + notasCursada + ", notasFinal="
				+ notasFinal + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((asignatura == null) ? 0 : asignatura.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		return ((MateriaCursada)obj).getAsignatura().equals(this.asignatura);
	}
}
