package com.learning.ecommerce.kafka.payment;

import jakarta.persistence.*;

import java.math.BigDecimal;


@Entity
public class PaymentConfirmation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String orderReference;

    private BigDecimal amount;

    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;

    private String customerFirstname;

    private String customerLastname;

    private String customerEmail;
}
