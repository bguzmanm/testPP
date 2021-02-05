package cl.awakelab.testpp;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cl.awakelab.testpp.models.Producto;
import cl.awakelab.testpp.services.ProductoServiceImpl;
@Configuration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
	{ 
		"file:src/main/webapp/WEB-INF/spring/root-context.xml"
	}
)
public class TestProducto {

	@Autowired
	ProductoServiceImpl pServ;
	
	@Test
	public void test() {
		
		Producto p = new Producto(1, "Producto", "La descripcion del producto", 100, 150);
		
		assertEquals("Producto", p.getProduct_name());
		
	}
	
	@Test
	public void testPromedio() {
		Double promedio = pServ.calcularCostoPromedio();
		Double valor_esperado =  727.6153819444447;
		
		assertEquals(valor_esperado, promedio);
		
	}
	@Test
	public void testProducto() {
		String valor_esperado = "Intel Core i7-4930K";
		
		assertEquals(valor_esperado, pServ.getOne(75).getProduct_name());
	}
}
