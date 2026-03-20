package challenge.one;

public class Test {

	public static void main(String[] args) {
		SistemaSensor sistema = new SistemaSensor();

		sistema.agregarLata("lata", 0.45f, 0.50f, 1.200f, 0.700f, true);
		sistema.agregarLata("lata", 0.45f, 0.50f, 1.200f, 0.700f, true);
		sistema.agregarBotella("botella", 0.20f, 0.40f, 0.800f, 0.710f);
		sistema.agregarBotella("botella", 0.20f, 0.40f, 0.800f, 0.710f);
		sistema.agregarEnvase("envase", 0.33f, 0.70f, 1.700f, 0.910f);
		sistema.agregarEnvase("envase", 0.33f, 0.70f, 1.700f, 0.910f);

		System.out.println("=== Challenge 01 ===");
		System.out.println(sistema.recibo());
		System.out.println("\nEstado de elementos:");

		for (Producto elemento : sistema.getProductos()) {
			elemento.estado();
			System.out.println("- " + elemento.getNombre() + " -> " + elemento.mostrarEstado());
		}
	}
}
