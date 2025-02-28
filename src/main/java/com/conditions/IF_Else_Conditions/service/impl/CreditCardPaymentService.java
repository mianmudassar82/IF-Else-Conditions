package com.conditions.IF_Else_Conditions.service.impl;

import com.conditions.IF_Else_Conditions.service.PaymentService;
import org.springframework.stereotype.Service;

@Service("CREDIT_CARD")
public class CreditCardPaymentService implements PaymentService {
    @Override
    public void processPayment() {
        System.out.println("Processing payment via Credit Card...");
    }
}