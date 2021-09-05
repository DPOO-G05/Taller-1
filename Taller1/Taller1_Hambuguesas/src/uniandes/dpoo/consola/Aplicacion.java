package uniandes.dpoo.consola;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

import uniandes.dpoo.modelo.Combo;
import uniandes.dpoo.modelo.Restaurante;
import uniandes.dpoo.modelo.ProductoMenu;
import uniandes.dpoo.procesamiento.LoaderInformacionArchivos;;



public class Aplicacion {

	private Restaurante restaurante;

	public Aplicacion(Restaurante restaurante) {
		this.restaurante = restaurante;
	}
	
	public void mostrarMenu() {
		System.out.println("Menu:");
		System.out.println("1: Cargar Informacion");
		System.out.println("2: Iniciar Pedido");

		int opcionSeleccionada = Integer.parseInt(input("Ingrese la opción deseada"));
		ejecutarOpcion(opcionSeleccionada);

	}
	

	public void ejecutarOpcion(int opcionSeleccionada) {
		// TODO: IMPLEMENTAR
	
		int o = opcionSeleccionada;
		switch (o) {
			case 1:
				String fileIngredientes = "./data/ingredientes.txt";
				String fileMenu = "./data/menu.txt";
				String fileCombos = "./data/ingredientes.txt";
				this.restaurante.cargarInformacionRestaurante(fileIngredientes,fileMenu , fileCombos);
				break;
			case 2:
				String nombreCliente = input("Ingrese su nombre");
				String direccion = input("Ingrese su dirección");
				this.restaurante.iniciarPedido(nombreCliente.trim().toLowerCase(), direccion.trim().toLowerCase());
				break;
		}
	}
	
	/**
	 * Leer el archivo de combos y obtener su informacion en una lista de objetos Combo
	 * @param rutaArchivo
	 * @param productosMenu Lista de productos menu donde aparecen todos los posibles productos de un combo
	 * @return Lista de objetos Combo
	 */

	/**
	 * Este metodo sirve para imprimir un mensaje en la consola pidiendole
	 * informacion al usuario y luego leer lo que escriba el usuario.
	 * 
	 * @param mensaje El mensaje que se le mostrara al usuario
	 * @return La cadena de caracteres que el usuario escriba como respuesta.
	 */
	public String input(String mensaje)
	{
		try
		{
			System.out.print(mensaje + ": ");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			return reader.readLine();
		}
		catch (IOException e)
		{
			System.out.println("Error leyendo de la consola");
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inicio de ejecuci�n de la aplicaci�n");
		
		Restaurante restaurante = new Restaurante();
		Aplicacion app = new Aplicacion(restaurante);
		app.mostrarMenu();

		
		}

}
