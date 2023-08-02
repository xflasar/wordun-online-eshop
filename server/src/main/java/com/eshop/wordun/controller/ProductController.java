package com.eshop.wordun.controller;

import com.eshop.wordun.repositories.ProductRepository;
import com.eshop.wordun.entities.Product;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

// We use this to querry our requests

@Controller
public class ProductController {
  
  private final ProductRepository productRepository;

  public ProductController(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  @QueryMapping
  public Iterable<Product> getAllProducts() {
    return this.productRepository.findAll();
  }

  @QueryMapping
  public Product geProductById(@Argument Long id) {
    return this.productRepository.findById(id).orElseThrow();
  }

}
