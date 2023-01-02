package challenge.three;

import java.time.LocalDate;

public class Test {

	public static void main(String[] args) {
		
		Producto fci = new FCI(1111, "Fondo comun de inversiones", "Juarez SA.", 200, 15);
		Producto cartera = new CarteraValores(2222, "cartera de valores");
		Producto cajaAhorro = new CajaAhorro(3333, "caja de ahorro", 12345678, 100, 0, LocalDate.now().plusYears(5));
		Producto corrienta = new Corriente(3334, "cuenta corriente", 87654321, 50, 0);
		
		System.out.println(fci); // output: FCI [codigo=1111, apertura=2023-01-02, descripcion=Fondo comun de inversiones, nombre=Juarez SA., importe=200.0, rentabilidad=15.0]
		System.out.println(fci.terminos()); // output:  Terminos del FCI Juarez SA.: ...
		
		System.out.println(cartera); // output:  CarteraValores [codigo=2222, apertura=2023-01-02, descripcion=cartera de valores, valores=[]]
		System.out.println(cartera.terminos()); // output:  Terminos de la Cartera de valores cartera de valores: ...
		
		System.out.println(cajaAhorro); // output:  CajaAhorro [codigo=3333, apertura=2023-01-02, descripcion=caja de ahorro, cierre=2028-01-02, tiempoDisponible=0]
		System.out.println(cajaAhorro.terminos()); // output:  Terminos de una caja de ahorro: ...
		
		System.out.println(corrienta); // output:  Corriente [codigo=3334, apertura=2023-01-02, descripcion=cuenta corriente, tarjetas=[], productos=[]]
		System.out.println(corrienta.terminos()); // output:  Terminos de una cuenta Corriente: ...		
	}
}