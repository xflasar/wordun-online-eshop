package com.eshop.wordun.repositories;

import com.eshop.wordun.entities.Order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
  List<Order> findAll();
  Optional<Order> findById(Long id);
  Order findByUserId(Long id);
}

