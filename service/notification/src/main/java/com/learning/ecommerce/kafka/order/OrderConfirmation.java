package com.learning.ecommerce.kafka.order;

import com.learning.ecommerce.kafka.payment.PaymentMethod;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;

@Entity
public class OrderConfirmation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String orderReference;

    private BigDecimal totalAmount;

    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;

    @ManyToOne
    private Customer customer;

    @OneToMany(mappedBy = "orderConfirmation", cascade = CascadeType.ALL)
    private List<Product> products;
}
