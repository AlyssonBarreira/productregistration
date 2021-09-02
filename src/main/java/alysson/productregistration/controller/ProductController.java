package alysson.productregistration.controller;

import alysson.productregistration.model.entity.Product;
import alysson.productregistration.model.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @PostMapping
    public Product createProduct(@Valid Product product){
        productRepository.save(product);
        return product;
    }

    @GetMapping
    public Iterable<Product> listAllProducts(){
        return productRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public Optional<Product> listProductById(@PathVariable int id){
        return productRepository.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable int id){
        productRepository.deleteById(id);
    }

    @PutMapping
    public Product updateProduct(@Valid Product product){
        productRepository.save(product);
        return product;
    }
}
