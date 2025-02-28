package com.conditions.IF_Else_Conditions.service;

import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class PaymentProcessorService {

    private final Map<String, PaymentService> paymentServiceMap;

    public PaymentProcessorService(Map<String, PaymentService> paymentServiceMap) {
        this.paymentServiceMap = paymentServiceMap;
    }

    public void processPayment(String paymentMethod) {
        PaymentService paymentService = paymentServiceMap.getOrDefault(paymentMethod, paymentServiceMap.get("DEFAULT"));
        paymentService.processPayment();
    }
}
