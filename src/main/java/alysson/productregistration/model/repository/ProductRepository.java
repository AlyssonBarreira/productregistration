package alysson.productregistration.model.repository;

import alysson.productregistration.model.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}
