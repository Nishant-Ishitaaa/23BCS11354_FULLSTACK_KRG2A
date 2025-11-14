package com.example.taxing.controller;

import com.example.taxing.model.ServiceRequest;
import com.example.taxing.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/")
public class RequestController {

    @Autowired
    private RequestService service;

    @GetMapping
    public String viewHome(Model model) {
        model.addAttribute("requests", service.getAllRequests());
        return "index";
    }

    @GetMapping("/new")
    public String newRequestForm(Model model) {
        model.addAttribute("request", new ServiceRequest());
        return "new";
    }

    @PostMapping("/save")
    public String saveRequest(@Valid @ModelAttribute("request") ServiceRequest request,
                              BindingResult result) {
        if (result.hasErrors()) {
            return "new";
        }
        service.save(request);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String deleteRequest(@PathVariable Long id) {
        service.delete(id);
        return "redirect:/";
    }

    @PostMapping("/complete/{id}")
    public String markAsCompleted(@PathVariable Long id) {
        ServiceRequest req = service.getById(id);
        if (req != null) {
            req.setStatus("Completed");
            service.save(req);
        }
        return "redirect:/";
    }
}

