package com.eshop.wordun.repositories;

import com.eshop.wordun.entities.Category;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
  List<Category> findAll();
  Category findByName(String name);
  Optional<Category> findById(Long id);
}