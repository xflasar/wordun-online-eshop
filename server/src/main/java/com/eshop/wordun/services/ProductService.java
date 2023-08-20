package com.eshop.wordun.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eshop.wordun.entities.Product;
import com.eshop.wordun.repositories.ProductRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
  private final ProductRepository productRepository;

  @Autowired
  public ProductService(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  public List<Product> getAll() {
    return productRepository.findAll();
  }
  
  public Optional<Product> getByProductId(Long id) {
    Optional<Product> product = productRepository.findById(id);
    return product;
  }

  public Product findByName(String name) {
    return productRepository.findByName(name);
  }

  public List<Product> findByCategoryId(Long id) {
    return productRepository.findByCategoryId(id);
  }

  public List<Product> findByCategoryName(String name) {
    return productRepository.findByCategoryName(name);
  }
}
