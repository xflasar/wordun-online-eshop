package com.eshop.wordun.controller;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.eshop.wordun.entities.Order;
import com.eshop.wordun.services.OrderService;

import java.util.List;
import java.util.Optional;

@Controller
public class OrderController {
  private final OrderService orderService;

  public OrderController(OrderService orderService) {
    this.orderService = orderService;
  }
  
  @QueryMapping
  public List<Order> getAll() {
    return orderService.getAll();
  }

  @QueryMapping
  public Optional<Order> getById(@Argument Long id) {
    return orderService.getById(id);
  }

  @QueryMapping
  public Order getByUserId(@Argument Long userId) {
    return orderService.getByUserId(userId);
  }
}
