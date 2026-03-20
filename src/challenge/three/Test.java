package challenge.three;

import java.time.LocalDate;

public class Test {

	public static void main(String[] args) {
		Producto fci = new FCI(1111, "Fondo comun de inversiones", "Juarez SA.", 200, 15);
		Producto cartera = new CarteraValores(2222, "cartera de valores");
		Producto cajaAhorro = new CajaAhorro(3333, "caja de ahorro", 12345678, 100, 0, LocalDate.now().plusYears(5));
		Producto corriente = new Corriente(3334, "cuenta corriente", 87654321, 50, 0);

		System.out.println("=== Challenge 03 ===");

		imprimirProducto(fci);
		imprimirProducto(cartera);
		imprimirProducto(cajaAhorro);
		imprimirProducto(corriente);
	}

	private static void imprimirProducto(Producto producto) {
		System.out.println("\n" + producto);
		System.out.println(producto.terminos());
	}
}