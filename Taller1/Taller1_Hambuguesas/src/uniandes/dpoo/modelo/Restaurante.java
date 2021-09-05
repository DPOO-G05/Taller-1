package uniandes.dpoo.modelo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import uniandes.dpoo.procesamiento.LoaderInformacionArchivos;

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
		Pedido pedido = new Pedido(nombreCliente, direccionCliente);
	}

	public void cerrarYGuardarPedido() {
		// TODO: IMPLEMENTAR
	}
	
	public void cargarInformacionRestaurante(String rutaIngredientes, String rutaMenu, String rutaCombos) {
		
		// TODO: IMPLEMENTAR
	
		cargarMenu(rutaMenu);
		cargarIngredientes(rutaIngredientes);
		cargarCombos(rutaCombos);
		
	}
	
	
	public Pedido consultarPedido(int id) {
		
		// TODO: IMPLEMENTAR
		return new Pedido("","");
	}
	
	
	
	private void cargarIngredientes(String rutaIngredientes) {
	
		ArrayList<Ingrediente> ingredientes = new ArrayList<>();
	
		try
		{
			ingredientes = LoaderInformacionArchivos.leerInfoArchivoIngredientes(rutaIngredientes);
			System.out.println("OK Se carg� el archivo " + rutaIngredientes + " con informaci�n de los Productos Menu.");
			this.ingredientes = ingredientes;
			
			for (Ingrediente ingrediente: this.ingredientes) {
				System.out.printf("%s", ingrediente);
			}
			
		}
		catch (FileNotFoundException e)
		{
			System.out.println("ERROR: el archivo " + rutaIngredientes + " no se encontr�.");
			System.out.println(e.getMessage());
		}
		catch (IOException e)
		{
			System.out.println("ERROR: hubo un problema leyendo el archivo " + rutaIngredientes);
			System.out.println(e.getMessage());
		}

		
		
		
	}
	
	
	private void cargarMenu(String rutaMenu) {
		
		// TODO: IMPLEMENTAR
		/**
		 * Leer el archivo de Productos Menu y obtener su informacion en una lista de objetos ProductoMenu
		 * @param rutaArchivo
		 * @return Lista de objetos ProductoMenu
		 */
		
			ArrayList<ProductoMenu> productosMenu = new ArrayList<ProductoMenu>();
			try
			{
				productosMenu = LoaderInformacionArchivos.leerInfoArchivoProductosMenu(rutaMenu);
				System.out.println("OK Se carg� el archivo " + rutaMenu + " con informaci�n de los Productos Menu.");
				this.menuBase = productosMenu;
				for (ProductoMenu producto: this.menuBase) {
					System.out.printf("%s", producto);
				}
			}
			catch (FileNotFoundException e)
			{
				System.out.println("ERROR: el archivo " + rutaMenu + " no se encontr�.");
				System.out.println(e.getMessage());
			}
			catch (IOException e)
			{
				System.out.println("ERROR: hubo un problema leyendo el archivo " + rutaMenu);
				System.out.println(e.getMessage());
			}


	}
	
	
	private void cargarCombos(String rutaCombos) {
		
		// TODO: IMPLEMENTAR
		ArrayList<Combo> combos = new ArrayList<Combo>();
		try
		{
			combos = LoaderInformacionArchivos.leerInfoArchivoCombos(rutaCombos, getMenuBase());
			this.combos = combos;
			System.out.println("OK Se carg� el archivo " + rutaCombos + " con informaci�n de los Combos.");
			
			for (Combo combo: this.combos) {
				System.out.printf("%s", combo);
			}
			
		}
		catch (FileNotFoundException e)
		{
			System.out.println("ERROR: el archivo " + rutaCombos+ " no se encontr�.");
			System.out.println(e.getMessage());
		}
		catch (IOException e)
		{
			System.out.println("ERROR: hubo un problema leyendo el archivo " + rutaCombos);
			System.out.println(e.getMessage());
		}

	}
	
	
}
