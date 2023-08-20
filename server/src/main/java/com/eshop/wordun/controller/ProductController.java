package com.eshop.wordun.controller;

import com.eshop.wordun.entities.Product;
import com.eshop.wordun.services.ProductService;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

// We use this to querry our requests

@Controller
public class ProductController {
  
  private final ProductService productService;

  public ProductController(ProductService productService) {
    this.productService = productService;
  }

  @QueryMapping
  public Iterable<Product> getAllProducts() {
    return this.productService.getAll();
  }

  @QueryMapping
  public Optional<Product> getProductById(@Argument Long id) {
    Optional<Product> product = this.productService.getByProductId(id);
    return product;
  }

  @QueryMapping
  public Product getProductByName(@Argument String name) {
    Product product = this.productService.findByName(name);
    return product;
  }

  @QueryMapping
  public List<Product> getProductsByCategoryId(@Argument Long id) {
    List<Product> products = this.productService.findByCategoryId(id);
    return products;
  }

}
