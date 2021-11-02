package es.studium.ad_tema_1_practica_1;

public class ArticuloAComprar
{
	private String descripcion;
	private int cantidad;
	private String unidad;
	
	/* Constructor por defecto */
	  public ArticuloAComprar () 
	  {
		  descripcion = "";
		  cantidad = 0;
		  unidad = "";		  
	  }
	 
	  /* Constructor con parámetros */
	  public ArticuloAComprar (String d, int c,  String u) 
	  {
	  	  descripcion = d;
		  cantidad = c;
		  unidad = u;
	  }
	 
	  /* Métodos */
	  public String getDescripcion() 
	  {
		  return descripcion;
	  }
	 
	  public void setDescripcion(String d) 
	  {
		  descripcion = d;
	  }
	 
	  public int getCantidad() 
	  {
		  return cantidad;
	  }
	 
	  public void setCantidad(int c) 
	  {
		  cantidad = c;
	  }
	  
	  public String getUnidad() 
	  {
		  return unidad;
	  }
	 
	  public void setUnidad(String u) 
	  {
		  unidad = u;
	  }
}
