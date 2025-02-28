package com.conditions.IF_Else_Conditions.controller;

import com.conditions.IF_Else_Conditions.service.PaymentProcessorService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

    private final PaymentProcessorService paymentProcessorService;

    public PaymentController(PaymentProcessorService paymentProcessorService) {
        this.paymentProcessorService = paymentProcessorService;
    }

    @PostMapping("/{paymentMethod}")
    public String processPayment(@PathVariable String paymentMethod) {
        paymentProcessorService.processPayment(paymentMethod.toUpperCase());
        return "Payment processed successfully using: " + paymentMethod;
    }
}