package uniandes.dpoo.modelo;

import java.io.File;
import java.util.ArrayList;

public class Restaurante {

	private ArrayList<Ingrediente> ingredientes;
	private ArrayList<ProductoMenu> menuBase;
	private Pedido pedidoEnCurso;
	private ArrayList<Pedido> pedidos;
	private ArrayList<Combo> combos;
	
	public Restaurante () {
		
	}

	//Getters y Setters
	
		public ArrayList<Ingrediente> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
		this.ingredientes = ingredientes;
	}

	public ArrayList<ProductoMenu> getMenuBase() {
		return menuBase;
	}

	public void setMenuBase(ArrayList<ProductoMenu> menuBase) {
		this.menuBase = menuBase;
	}

	public Pedido getPedidoEnCurso() {
		return pedidoEnCurso;
	}

	public void setPedidoEnCurso(Pedido pedidoEnCurso) {
		this.pedidoEnCurso = pedidoEnCurso;
	}

	public ArrayList<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(ArrayList<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	public ArrayList<Combo> getCombos() {
		return combos;
	}

	public void setCombos(ArrayList<Combo> combos) {
		this.combos = combos;
	}


	
	
	
	
	//Métodos
	
	
	public void iniciarPedido(String nombreCliente, String direccionCliente) {
		// TODO: IMPLEMENTAR
	}

	public void cerrarYGuardarPedido() {
		// TODO: IMPLEMENTAR
	}
	
	public void cargarInformacionRestaurante(File archivoIngredientes, File archivoMenu, File archivoCombos) {
		
		// TODO: IMPLEMENTAR
	}
	
	
	public Pedido consultarPedido(int id) {
		
		// TODO: IMPLEMENTAR
		return new Pedido("","");
	}
	
	
	
	private void cargarIngredientes(File archivoIngredientes) {
		
		// TODO: IMPLEMENTAR
	}
	
	
	private void cargarMenu(File archivoMenu) {
		
		// TODO: IMPLEMENTAR
	}
	
	
	private void cargarCombos(File archivoCombos) {
		
		// TODO: IMPLEMENTAR
	}
	
	
}
