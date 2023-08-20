package com.eshop.wordun.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eshop.wordun.entities.User;
import com.eshop.wordun.repositories.UserRepository;

import java.util.Optional;

@Service
public class UserService {
  private final UserRepository userRepository;

  @Autowired
  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public User getByEmail(String email) {
    return userRepository.findByEmail(email);
  }

  public Optional<User> getById(Long id) {
    return userRepository.findById(id);
  }
}
