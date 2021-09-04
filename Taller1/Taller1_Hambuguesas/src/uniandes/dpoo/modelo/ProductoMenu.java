package uniandes.dpoo.modelo;


public class ProductoMenu implements Producto {
	private String nombre;
	private int precioBase;
	
	public ProductoMenu(String nombreP, int precioP) {
		this.nombre = nombreP;
		this.precioBase = precioP;
	}
	
	/**
	 * Permite convertir un objeto ProductoMenu a un String 
	 */
	@Override
	public String toString()
	{
		return this.nombre + "-" + this.precioBase;
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
