package com.eshop.wordun.controller;

import com.eshop.wordun.repositories.UserRepository;
import com.eshop.wordun.entities.User;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
  private final UserRepository userRepository;

  public UserController(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @QueryMapping
  public User getUserById(@Argument Long id) {
    return this.userRepository.findById(id).orElseThrow();
  }
}
