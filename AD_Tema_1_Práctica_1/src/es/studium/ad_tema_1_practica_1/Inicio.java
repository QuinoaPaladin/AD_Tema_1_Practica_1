package es.studium.ad_tema_1_practica_1;

public class Inicio
{

	public static void main(String[] args)
	{
		ArticuloAComprar articulo1 = new ArticuloAComprar("Patatas", 5, "Kg");
		ArticuloAComprar articulo2 = new ArticuloAComprar("Tomates", 2, "Kg");
		ArticuloAComprar articulo3 = new ArticuloAComprar("Manzanas", 1, "Kg");
		
		ListaDeLaCompra lista1 = new ListaDeLaCompra("Lista Mercadona");
		
		lista1.agregarProductoAComprar(articulo1);
		lista1.agregarProductoAComprar(articulo2);
		lista1.agregarProductoAComprar(articulo3);
		
		lista1.eliminarArticulo("Patatas");
		
		lista1.getArticulos();
	}

}
