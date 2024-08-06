package com.paystack_integration.repository;

import com.paystack_integration.model.domain.PaymentPaystack;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaystackPaymentRepository extends JpaRepository<PaymentPaystack, Long> {
}
