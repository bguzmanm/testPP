package cl.awakelab.testpp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cl.awakelab.testpp.services.ProductoServiceImpl;



@Configuration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
	{ 
		"file:src/main/webapp/WEB-INF/spring/root-context.xml"
	}
)
public class OtroTest {

	@Autowired
	
	ProductoServiceImpl pServ;
	
	@Test
	public void testProducto() {
		String valor_esperado = "ATI FirePro R5000";
		
		assertEquals(valor_esperado, pServ.getOne(181).getProduct_name());
	}
	
}
