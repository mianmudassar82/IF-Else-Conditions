package com.conditions.IF_Else_Conditions.service.impl;

import com.conditions.IF_Else_Conditions.service.PaymentService;
import org.springframework.stereotype.Service;

@Service("DEFAULT")
public class DefaultPaymentService implements PaymentService {
    @Override
    public void processPayment() {
        System.out.println("Processing default payment method...");
    }
}