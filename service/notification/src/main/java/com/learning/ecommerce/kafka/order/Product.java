package com.learning.ecommerce.kafka.order;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productId;

    private String name;

    private String description;

    private BigDecimal price;

    private double quantity;

    @ManyToOne
    private OrderConfirmation orderConfirmation;
}
