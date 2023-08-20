package com.eshop.wordun.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.persistence.GenerationType;

import com.eshop.wordun.entities.OrderItem;

import lombok.Data;

@Data
@Entity
@Table(name = "orders")
public class Order {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private LocalDateTime orderDate;
  private double totalPrice;
  private String status;

  @ManyToOne
  private User user;

  @Transient
  private List<OrderItem> orderItems = new ArrayList<>();
}
