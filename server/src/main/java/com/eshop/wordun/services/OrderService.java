package com.eshop.wordun.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eshop.wordun.entities.Order;
import com.eshop.wordun.repositories.OrderRepository;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
  private final OrderRepository orderRepository;
  
  @Autowired
  public OrderService(OrderRepository orderRepository) {
    this.orderRepository = orderRepository;
  }

  public List<Order> getAll() {
    return orderRepository.findAll();
  }
  
  public Optional<Order> getById(Long id) {
    return orderRepository.findById(id);
  }
  
  public Order getByUserId(Long id) {
    return orderRepository.findByUserId(id);
  }
}
