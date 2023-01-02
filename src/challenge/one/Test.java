package challenge.one;

public class Test {

	public static void main(String[] args) {
		
		SistemaSensor sistema = new SistemaSensor(); // instancio el sistema
		
		// Agrego algunos productos
		
		sistema.agregarLata("lata", 0.45f, 0.50f, 1.200f, 0.700f, true);		
		sistema.agregarLata("lata", 0.45f, 0.50f, 1.200f, 0.700f, true);		
		sistema.agregarBotella("botella", 0.20f, 0.40f, 0.800f, 0.710f);
		sistema.agregarBotella("botella", 0.20f, 0.40f, 0.800f, 0.710f);		
		sistema.agregarEnvase("envase", 0.33f, 0.70f, 1.700f, 0.910f);
		sistema.agregarEnvase("envase", 0.33f, 0.70f, 1.700f, 0.910f);
		
		System.out.println(sistema.recibo()); // Imprimo el recibo
		
		/* output:	
			RECIBO: elementos calibrados: 
			[Lata [nombre=lata, ancho=0.45, largo=0.5, peso=1.2, volumen=0.7, cantidad=2, aluminio=true, reutilizable=false], 
			Botella [nombre=botella, ancho=0.2, largo=0.4, peso=0.8, volumen=0.71, cantidad=2, retornable=false], 
			Envase [nombre=envase, ancho=0.33, largo=0.7, peso=1.7, volumen=0.91, cantidad=2, reciclado=false]]
			[Total productos: 6]
		*/
		
		for (Producto elemento : sistema.getProductos()) {
			
			elemento.estado();
			
			System.out.println(elemento.mostrarEstado());
			
			/* output:
			Reutilizable: true
			Retornable: false
			Reciclado: true			 
			*/
		}		
	}

}
