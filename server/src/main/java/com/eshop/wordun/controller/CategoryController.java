package com.eshop.wordun.controller;

import com.eshop.wordun.services.CategoryService;
import com.eshop.wordun.entities.Category;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
public class CategoryController {
  private final CategoryService categoryService;

  public CategoryController(CategoryService categoryService) {
    this.categoryService = categoryService;
  }

  @QueryMapping
  public List<Category> getAllCategories() {
    return categoryService.getAll();
  }

  @QueryMapping
  public Category getCategoryByName(@Argument String name) {
    return categoryService.getByName(name);
  }

  @QueryMapping
  public Optional<Category> getCategoryById(@Argument Long id) {
    return categoryService.getByCategoryId(id);
  }
}
