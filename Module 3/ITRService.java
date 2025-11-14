package com.example.taxing.service;

import org.springframework.stereotype.Service;

@Service
public class ITRService {

    public String calculateTax(double income) {
        if (income <= 250000) {
            return "No tax payable — below taxable limit.";
        } else if (income <= 500000) {
            double tax = (income - 250000) * 0.05;
            return "Tax Payable: ₹" + tax;
        } else if (income <= 1000000) {
            double tax = (250000 * 0.05) + (income - 500000) * 0.2;
            return "Tax Payable: ₹" + tax;
        } else {
            double tax = (250000 * 0.05) + (500000 * 0.2) + (income - 1000000) * 0.3;
            return "Tax Payable: ₹" + tax;
        }
    }
}
