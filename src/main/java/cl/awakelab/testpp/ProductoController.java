package cl.awakelab.testpp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cl.awakelab.testpp.repos.IProductoRepo;
import cl.awakelab.testpp.services.ProductoServiceImpl;

@Controller
public class ProductoController {
	
	@Autowired
	private ProductoServiceImpl pServ; 
	
	
	@RequestMapping(value="productos", method = RequestMethod.GET)
	public String listaProductos(Model model) {
		
		
		model.addAttribute("productos", pServ.getAll());
		model.addAttribute("promedio", pServ.calcularCostoPromedio());
		
		return "productos";
	}
	
	
}
