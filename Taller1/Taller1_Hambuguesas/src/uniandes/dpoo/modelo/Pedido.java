package uniandes.dpoo.modelo;

import java.util.ArrayList;

public class Pedido {
	
	private static int numeroPedidos;
	private int idPedido;
	private String nombreCliente;
	private String direccionCliente;
	private ArrayList<Producto> itemsPedido; 
	
	
	public Pedido (String nombreCliente, String direccionCliente ) {
		this.nombreCliente = nombreCliente;
		this.direccionCliente = direccionCliente;
		this.itemsPedido = new ArrayList<Producto>();
		numeroPedidos++;
	}
	
	//Getters y Setters

	
	
	// Métodos
	private String generarTextoFactura() {
		// TODO Auto-generated method stub
		return "";
	}
	
	public static int getNumeroPedidos() {
		return numeroPedidos;
	}

	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getDireccionCliente() {
		return direccionCliente;
	}

	public void setDireccionCliente(String direccionCliente) {
		this.direccionCliente = direccionCliente;
	}

	public ArrayList<Producto> getItemsPedido() {
		return itemsPedido;
	}

	public void setItemsPedido(ArrayList<Producto> itemsPedido) {
		this.itemsPedido = itemsPedido;
	}

	public void agregarProducto(Producto nuevoItem ) {
		this.itemsPedido.add(nuevoItem);
		//TODO: 
		//Chekear de que tipo es el producto.
	}
	
	public void agregarProducto(Producto nuevoItem, ArrayList<String> modificaciones, Restaurante restaurante) {
		ProductoMenu base = (ProductoMenu) nuevoItem;
		ProductoAjustado ajustado = new ProductoAjustado(base);
		ajustado.modificarProducto(modificaciones, restaurante);
		this.itemsPedido.add(ajustado);
	}

	private int getPrecioNetoPedido() {
		// TODO: IMPLEMENTAR
		return 0;
	}
	
	
	private int getPrecioTotalPedido() {
		// TODO: IMPLEMENTAR
		return 0;
	}
	
	
	private int getPrecioIVAPedido() {
		// TODO: IMPLEMENTAR
		return 0;
	}
	
	private Combo buscarCombo(String nombre) {
		//TODO: IMPLEMENTAR
		return new Combo("",0.5);
	}
	
	private ProductoMenu buscarProductoMenu(String nombre) {
		//TODO: IMPLEMENTAR
		return null;
	}
	
	private Ingrediente buscarIngrediente(String ingrediente) {
		//TODO: IMPLEMENTAR
		return null;
	}
	
	
}
