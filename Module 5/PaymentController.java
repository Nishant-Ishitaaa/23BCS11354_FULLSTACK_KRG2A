package com.example.taxing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PaymentController {

    @GetMapping("/payment")
    public String showPaymentPage() {
        return "payment";
    }

    @GetMapping("/payment/success")
    public String showPaymentSuccess(Model model) {
        model.addAttribute("message", "Payment Successful! Your tax filing is confirmed.");
        return "payment-success";
    }
}
