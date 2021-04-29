package com.fabsantini.ecommerce.payment.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.fabsantini.ecommerce.payment.entity.PaymentEntity;

public interface PaymentRepository extends JpaRepository<PaymentEntity, Long> {
}
