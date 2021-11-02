package es.studium.ad_tema_1_practica_1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ListaDeLaCompra
{
	
	private String nombreLista;
	private List<ArticuloAComprar> listaDeArticulos = new ArrayList<ArticuloAComprar>();

	public ListaDeLaCompra()
	{
		nombreLista="";
	}
	
	public ListaDeLaCompra(String n) //Constructor que recibe el nombre de la lista.
	{
		nombreLista = n;
	}
	
	public String getNombreLista() //Obtiene el nombre de la lista.
	{
		return nombreLista;		
	}
	
	public void setNombreLista(String n) //Asigna el nombre de la lista.
	{
		nombreLista = n;
	}
	
	public void agregarProductoAComprar(ArticuloAComprar a) //Este método permite agregar nuevos artículos.
	{
		listaDeArticulos.add(a);
		
		try
		{
			File f = new File(this.nombreLista + ".txt");
			FileWriter fr = new FileWriter(f, true);		// El true indica que no se sobreescriba
			BufferedWriter bf = new BufferedWriter(fr);
			bf.write(a.getDescripcion() + " " + a.getCantidad() + " " + a.getUnidad() + "\n");			
			//Cerrar siempre flujos de datos
			bf.close();
			fr.close();
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
	}
	
	public void eliminarArticulo (String descripcionArticulo) //En este caso, el método permite eliminar un artículo correspondiente a la descripción pasada como parámetro. Si no hay ningún artículo en la lista, no pasa nada.
	{
		for(int i=0;i<listaDeArticulos.size();i++)
		{
			if(listaDeArticulos.get(i).getDescripcion().equals(descripcionArticulo))
			{
				listaDeArticulos.remove(i);
			}
		}
		try
		{
			File f = new File(this.nombreLista + ".txt");
			FileWriter fr = new FileWriter(f, false);		// El true indica que no se sobreescriba
			BufferedWriter bf = new BufferedWriter(fr);
			for(int i=0;i<listaDeArticulos.size();i++)
			{
				bf.write(listaDeArticulos.get(i).getDescripcion() + " " + listaDeArticulos.get(i).getCantidad() + " " + listaDeArticulos.get(i).getUnidad() + "\n");
			}			
			//Cerrar siempre flujos de datos
			bf.close();
			fr.close();
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public List<ArticuloAComprar> getArticulos() //Este método devolverá una lista con todos los artículos de la lista.
	{
		for(int i=0;i<listaDeArticulos.size();i++)
		{
			System.out.println(listaDeArticulos.get(i).getDescripcion() + " " + listaDeArticulos.get(i).getCantidad() + " " + listaDeArticulos.get(i).getUnidad());
		}
		return listaDeArticulos;
	}
	
}
