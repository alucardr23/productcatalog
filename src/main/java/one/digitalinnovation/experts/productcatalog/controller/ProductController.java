package one.digitalinnovation.experts.productcatalog.controller;

import one.digitalinnovation.experts.productcatalog.Model.Product;
import one.digitalinnovation.experts.productcatalog.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/product")

public class ProductController {
                @Autowired
              private  ProductRepository productRepository;

                @RequestMapping(method = RequestMethod.POST)
                Product create(@RequestBody Product product){
            return productRepository.save(product);
        }
        @Bean
        @RequestMapping(value = "/id", method = RequestMethod.GET)
       Optional <Product> findById(@PathVariable Integer id){
            return productRepository.findById(id);
        }

    }

