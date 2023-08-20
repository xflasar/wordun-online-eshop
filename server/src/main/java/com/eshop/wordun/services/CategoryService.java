package com.eshop.wordun.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eshop.wordun.entities.Category;
import com.eshop.wordun.repositories.CategoryRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
  private final CategoryRepository categoryRepository;

  @Autowired
  public CategoryService(CategoryRepository categoryRepository) {
    this.categoryRepository = categoryRepository;
  }

  public List<Category> getAll() {
    return categoryRepository.findAll();
  }

  public Category getByName(String name) {
    return categoryRepository.findByName(name);
  }

  public Optional<Category> getByCategoryId(Long id) {
    return categoryRepository.findByCategoryId(id);
  }
}
