package uniandes.dpoo.modelo;

import java.util.ArrayList;

public class ProductoAjustado implements Producto {

	private ProductoMenu base;
	private ArrayList<Ingrediente> agregados;
	private ArrayList<Ingrediente> eliminados;

	
	public ProductoAjustado(ProductoMenu base) {
		this.base = base;
	}


	public ArrayList<Ingrediente> getAgregados() {
		return agregados;
	}


	public ArrayList<Ingrediente> getEliminados() {
		return eliminados;
	}


	public ProductoMenu getBase() {
		return base;
	}


	public void setBase(ProductoMenu base) {
		this.base = base;
	}


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
	public String generarTextoFactura() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
