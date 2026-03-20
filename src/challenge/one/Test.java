package challenge.one;

public class Test {

	public static void main(String[] args) {
		System.out.println("=== Challenge 01 - Tests ===\n");

		testCargaYTotales();
		testInicioReseteaTransaccion();
		testBusquedaProductoExistenteEInexistente();
		testEstadoDeProductos();
	}

	private static void testCargaYTotales() {
		SistemaSensor sistema = new SistemaSensor();

		boolean altaLata = sistema.agregarLata("lata", 0.45f, 0.50f, 1.200f, 0.700f, true);
		boolean altaLataRepetida = sistema.agregarLata("lata", 0.45f, 0.50f, 1.200f, 0.700f, true);
		sistema.agregarBotella("botella", 0.20f, 0.40f, 0.800f, 0.710f);
		sistema.agregarEnvase("envase", 0.33f, 0.70f, 1.700f, 0.910f);

		System.out.println("[Test] Carga y totales");
		assertResultado("Alta primera lata", altaLata);
		assertResultado("Alta lata repetida (no crea nuevo tipo)", !altaLataRepetida);
		assertResultado("Total productos de la transacción = 4", sistema.getTotalProductos() == 4);
		assertResultado("Tipos de producto en lista = 3", sistema.getProductos().size() == 3);
		System.out.println(sistema.recibo());
		System.out.println();
	}

	private static void testInicioReseteaTransaccion() {
		SistemaSensor sistema = new SistemaSensor();
		sistema.agregarEnvase("envase", 0.33f, 0.70f, 1.700f, 0.910f);
		sistema.iniciar();

		System.out.println("[Test] Inicio resetea transacción");
		assertResultado("Total productos reseteado", sistema.getTotalProductos() == 0);
		assertResultado("Lista de productos vacía", sistema.getProductos().isEmpty());
		System.out.println();
	}

	private static void testBusquedaProductoExistenteEInexistente() {
		SistemaSensor sistema = new SistemaSensor();
		sistema.agregarBotella("botella", 0.20f, 0.40f, 0.800f, 0.710f);

		Producto encontrada = sistema.traerProducto("botella");
		Producto noEncontrada = sistema.traerProducto("lata");

		System.out.println("[Test] Búsqueda de productos");
		assertResultado("Encuentra producto existente", encontrada != null);
		assertResultado("Retorna null si no existe", noEncontrada == null);
		System.out.println();
	}

	private static void testEstadoDeProductos() {
		SistemaSensor sistema = new SistemaSensor();
		sistema.agregarLata("lata", 0.45f, 0.50f, 1.200f, 0.700f, true);
		sistema.agregarBotella("botella", 0.20f, 0.40f, 0.800f, 0.800f);
		sistema.agregarEnvase("envase", 0.33f, 0.70f, 1.700f, 0.910f);

		System.out.println("[Test] Estado de elementos");
		for (Producto elemento : sistema.getProductos()) {
			elemento.estado();
			System.out.println("- " + elemento.getNombre() + " -> " + elemento.mostrarEstado());
		}
		System.out.println();
	}

	private static void assertResultado(String nombreTest, boolean condicion) {
		String estado = condicion ? "OK" : "FAIL";
		System.out.println("  [" + estado + "] " + nombreTest);
	}
}
