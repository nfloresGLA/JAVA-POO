package challenge.one;

public class Test {

	public static void main(String[] args) {
		
		SistemaSensor sistema = new SistemaSensor(); // instancio el sistema
		
		// Agrego algunos productos
		
		sistema.agregarProducto("lata", 0.45f, 0.50f, 1.200f, 0.700f);		
		sistema.agregarProducto("lata", 0.45f, 0.50f, 1.200f, 0.700f);		
		sistema.agregarProducto("botella", 0.20f, 0.40f, 0.800f, 0.500f);
		sistema.agregarProducto("botella", 0.20f, 0.40f, 0.800f, 0.500f);		
		sistema.agregarProducto("envase", 0.33f, 0.70f, 1.700f, 0.910f);
		sistema.agregarProducto("envase", 0.33f, 0.70f, 1.700f, 0.910f);
		
		System.out.println(sistema.recibo()); // Imprimo el recibo
		
		/*output:	
			RECIBO: elementos calibrados: 
			[Producto [nombre=lata, ancho=0.45, largo=0.5, peso=1.2, volumen=0.7, cantidad=2]
			, Producto [nombre=botella, ancho=0.2, largo=0.4, peso=0.8, volumen=0.5, cantidad=2]
			, Producto [nombre=envase, ancho=0.33, largo=0.7, peso=1.7, volumen=0.91, cantidad=2]			
			[Total productos: 6]
		*/		 

		
	}

}
