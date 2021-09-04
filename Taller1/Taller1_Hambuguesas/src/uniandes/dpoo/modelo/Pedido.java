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

	@Override
	public int getPrecio() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	private String generarTextoFactura() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void agregarProducto(Producto nuevoItem) {
		// TODO: Revisar 
		this.itemsPedido.add(nuevoItem);
	}

	private int getPrecioNetoPedido() {
		// TODO: IMPLEMENTAR
	}
	
	
	private int getPrecioTotalPedido() {
		// TODO: IMPLEMENTAR
	}
	
	
	private int getPrecioIVAPedido() {
		// TODO: IMPLEMENTAR
	}
	
	private Combo buscarCombo(String nombre) {
		return new Combo("",0.5);
	}
	
	
	
	
}
