package cl.awakelab.testpp.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.awakelab.testpp.models.Producto;


public interface IProductoRepo extends JpaRepository<Producto, Integer> {

}
