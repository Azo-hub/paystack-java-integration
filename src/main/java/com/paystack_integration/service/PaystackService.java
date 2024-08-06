package com.paystack_integration.service;

import com.paystack_integration.model.dto.CreatePlanDto;
import com.paystack_integration.model.dto.InitializePaymentDto;
import com.paystack_integration.model.response.CreatePlanResponse;
import com.paystack_integration.model.response.InitializePaymentResponse;
import com.paystack_integration.model.response.PaymentVerificationResponse;

public interface PaystackService {
    CreatePlanResponse createPlan(CreatePlanDto createPlanDto) throws Exception;
    InitializePaymentResponse initializePayment(InitializePaymentDto initializePaymentDto);
    PaymentVerificationResponse paymentVerification(String reference, String plan, Long id) throws Exception;
}
