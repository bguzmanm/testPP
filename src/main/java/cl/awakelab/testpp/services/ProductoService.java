package cl.awakelab.testpp.services;

import java.util.List;

import cl.awakelab.testpp.models.Producto;

public interface ProductoService {

	public List<Producto> getAll();
	public Producto getOne(int id);
	public void guardarProducto(Producto p);
	public double calcularCostoPromedio();
	
	
}
