package com.learning.order.kafka;

import com.learning.order.customer.CustomerResponse;
import com.learning.order.model.PaymentMethod;
import com.learning.order.dto.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation (
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products

) {
}
