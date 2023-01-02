package challenge.three;

import java.time.LocalDate;

public class CajaAhorro extends Cuenta {
	
	private LocalDate cierre;
	private int tiempoDisponible;
	
	public CajaAhorro(int codigo, String descripcion, int numero, float saldo, float interes, LocalDate cierre) {
		super(codigo, descripcion, numero, saldo, interes);
		this.cierre = cierre;
	}

	public LocalDate getCierre() {
		return cierre;
	}

	public void setCierre(LocalDate cierre) {
		this.cierre = cierre;
	}

	public int getTiempoDisponible() {
		return tiempoDisponible;
	}

	public void setTiempoDisponible(int tiempoDisponible) {
		this.tiempoDisponible = tiempoDisponible;
	}

	@Override
	public String toString() {
		return "CajaAhorro [codigo=" + codigo + ", apertura=" + apertura + ", descripcion=" + descripcion + ", cierre="
				+ cierre + ", tiempoDisponible=" + tiempoDisponible + "]";
	}

	@Override
	public String terminos() {
		return "Terminos de una caja de ahorro: ...";
	}	
}
