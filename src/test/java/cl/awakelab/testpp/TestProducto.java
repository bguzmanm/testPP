package cl.awakelab.testpp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cl.awakelab.testpp.models.Producto;
import cl.awakelab.testpp.services.ProductoServiceImpl;

public class TestProducto {

	@Autowired
	ProductoServiceImpl pServ;
	
	@Test
	public void test1() {
		List<Producto> lista = pServ.getAll();
		
		assertEquals(1, 2);
		
	}
	@Test
	public void test2() {
		
		int total = 4;
		
		int val1 = 2;
		int val2 = 2;
		
		int val3 = val1 + val2;
	
		
		assertEquals(total, val3);
	}
	@Test
	public void test3() {
		Producto p = new Producto(1, "La pulenta placa madre's", "Es una bien grande", 400, 800);
		assertNotNull(p);
	}
	
	@Test
	public void test4() {
		Producto p = new Producto(1, "La pulenta placa madre's", "Es una bien grande", 400, 800);
		assertEquals("La pulenta placa madre's", p.getProduct_name());
	}
}
