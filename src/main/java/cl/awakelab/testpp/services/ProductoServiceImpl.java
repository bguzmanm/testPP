package cl.awakelab.testpp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.testpp.models.Producto;
import cl.awakelab.testpp.repos.IProductoRepo;

@Service
public class ProductoServiceImpl implements ProductoService {

	@Autowired
	IProductoRepo pRepo;
	
	@Override
	public List<Producto> getAll() {
		//logica del negocio
		
		
		return pRepo.findAll();
	}

	@Override
	public Producto getOne(int id) {
		//logica del negocio
		return pRepo.findOne(id);
	}

	@Override
	public void guardarProducto(Producto p) {
		
		pRepo.save(p);
	}


	@Override
	public double calcularCostoPromedio() {
		List<Producto> prods = pRepo.findAll();
		double total = 0;
		for (Producto producto : prods) {
			total += producto.getStandard_cost();
		}
		
		return (total / prods.size());
	}
	
}
