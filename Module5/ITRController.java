package com.example.taxing.controller;

import com.example.taxing.service.ITRService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ITRController {

    @Autowired
    private ITRService itrService;

    @GetMapping("/itr")
    public String showITRPage() {
        return "itr";
    }

    @PostMapping("/calculateTax")
    public String calculateTax(@RequestParam("income") double income, Model model) {
        String result = itrService.calculateTax(income);
        model.addAttribute("result", result);
        return "itr";
    }
}
