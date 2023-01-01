package challenge.one;

import java.util.ArrayList;
import java.util.List;

public class SistemaSensor {
	
	private List<Producto> productos = new ArrayList<Producto>();
	private int totalDiario;
	private int totalProductos;
	
	public SistemaSensor() {}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	public int getTotalDiario() {
		return totalDiario;
	}

	public void setTotalDiario(int totalDiario) {
		this.totalDiario = totalDiario;
	}

	public int getTotalProductos() {
		return totalProductos;
	}

	public void setTotalProductos(int totalProductos) {
		this.totalProductos = totalProductos;
	}

	@Override
	public String toString() {
		return "SistemaSensor [productos=" + productos + ", totalDiario=" + totalDiario + ", totalProductos="
				+ totalProductos + "]";
	}
	
	public void iniciar() {
		
		// Reseteo los valores de la tx anterior
		this.totalProductos = 0;
		this.productos.clear();
		
		System.out.println("Sensores activados");
		System.out.println("Por favor ingrese los elementos");
	}
	
	public String recibo() {	
		
		return 
				"RECIBO: "
				+ "elementos calibrados: \n" + productos + "\n"
				+ "[Total productos: " + this.totalProductos + "]";
	}
	
	public boolean agregarProducto(String nombre, float ancho, float largo, float peso, float volumen) {
		
		Producto producto = this.traerProducto(nombre); // Compruebo si el producto ya existe en la lista
		boolean flag = false;
		
		if(producto != null) producto.setCantidad(producto.getCantidad() + 1); // En caso de existir se le suma la cantidad + 1
		
		else { // Caso contrario que no exista, se agrega a la lista
			producto = new Producto(nombre, ancho, largo, peso, volumen);
			producto.setCantidad(1);
			productos.add(producto);			 
			flag = true;
		}
		
		// Se agregan los valores diarios y los de esta tx
		this.setTotalDiario(this.getTotalDiario() + 1);
		this.setTotalProductos(this.getTotalProductos() + 1);
		
		return flag;
	}
	
	public Producto traerProducto(String nombre) {
		
		Producto producto = null;
		int i = 0;
		
		
		// Recorre la lista de productos hasta que llegue a la ultima o hasta que encuentre al producto
		// Para ahorrar ciclos
		while(i < productos.size() && producto==null) {
			
			if(productos.get(i).getNombre().equalsIgnoreCase(nombre)) {
				producto = productos.get(i);
			}
			
			i++;
		}
		
		return producto;
	}
	
}
