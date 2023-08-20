package com.eshop.wordun.entities;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class OrderItem {
  @Id
  private Long id;
  private Product product;
  private int quantity;
  private double price;

  public double calculateTotalPrice() {
    return product.getPrice() * quantity;
  }
}
