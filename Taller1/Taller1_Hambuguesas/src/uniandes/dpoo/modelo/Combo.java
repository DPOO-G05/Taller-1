package uniandes.dpoo.modelo;

import java.util.ArrayList;

public class Combo {
	private String nombreCombo;
	private int precio;
	private double descuento;
	private ArrayList<ProductoMenu> itemsCombo;    // SIMPLIFICACION: Lista de nombres de los productos del menu que componen el combo. Revisar el diagrama de clases
	
	/**
	 * Constructor de la clase
	 */
	public Combo(String nombreP, double descuentoP)
	{
		this.nombreCombo = nombreP;
		this.descuento = descuentoP;
		this.itemsCombo = new ArrayList<ProductoMenu>();    
	}
	
	// TODO: COMPLETAR EL CALCULO DEL PRECIO  

	public String getNombreCombo() {
		return nombreCombo;
	}



	public void setNombreCombo(String nombreCombo) {
		this.nombreCombo = nombreCombo;
	}



	public double getDescuento() {
		return descuento;
	}



	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}



	public ArrayList<ProductoMenu> getItemsCombo() {
		return itemsCombo;
	}



	public void setItemsCombo(ArrayList<ProductoMenu> itemsCombo) {
		this.itemsCombo = itemsCombo;
	}



	/**
	 * Agrega el nombre de un productoMenu a un combo. Metodo simplificado.
	 * @param nombreProducto
	 * TODO: Cambiar esto para que agregue un objeto en vez de un string.
	 */
	public void agregarProducto(ProductoMenu nombreProducto)
	{
		this.itemsCombo.add(nombreProducto);
	}
	
	/**
	 * Permite convertir un objeto Combo a un String 
	 */
	@Override
	public String toString()
	{
		return this.nombreCombo + "-" + this.descuento + "-" + this.itemsCombo;
	}
}
