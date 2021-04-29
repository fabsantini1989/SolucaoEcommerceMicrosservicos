package com.fabsantini.ecommerce.payment.service;

import com.fabsantini.ecommerce.checkout.event.CheckoutCreatedEvent;
import com.fabsantini.ecommerce.payment.entity.PaymentEntity;

import java.util.Optional;

public interface PaymentService {

    Optional<PaymentEntity> create(CheckoutCreatedEvent checkoutCreatedEvent);
}
