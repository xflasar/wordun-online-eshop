package com.eshop.wordun.repositories;

import com.eshop.wordun.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository  extends JpaRepository<Product, Long> {
  List<Product> findAll();
  Optional<Product> findById(Long id);
  Product findByName(String name);
  List<Product> findByCategoryId(Long id);
  List<Product> findByCategoryName(String name);
}
