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

		numeroPedidos++;
	}
	
	//Getters y Setters

	
	
	// Métodos
	private String generarTextoFactura() {
		// TODO Auto-generated method stub
		return "";
	}
	
	public void agregarProducto(Producto nuevoItem) {
		// TODO: Revisar 
		this.itemsPedido.add(nuevoItem);
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
