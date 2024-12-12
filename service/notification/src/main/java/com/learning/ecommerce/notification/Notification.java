package com.learning.ecommerce.notification;

import com.learning.ecommerce.kafka.order.OrderConfirmation;
import com.learning.ecommerce.kafka.payment.PaymentConfirmation;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private NotificationType type;

    private LocalDateTime notificationDate;

    @ManyToOne
    private OrderConfirmation orderConfirmation;

    @ManyToOne
    private PaymentConfirmation paymentConfirmation;
}
