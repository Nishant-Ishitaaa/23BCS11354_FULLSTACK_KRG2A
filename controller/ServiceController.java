package com.taxinghelp.controller;

import com.taxinghelp.model.Service;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/services")
@CrossOrigin(origins = "*")
public class ServiceController {

    @GetMapping
    public List<Service> getServices() {
        List<Service> list = new ArrayList<>();
        list.add(new Service(1, "GST Services", "GST Registration"));
        list.add(new Service(2, "GST Services", "GST Return Filing"));
        list.add(new Service(3, "Income Tax", "IT Return Filing"));
        list.add(new Service(4, "Business License", "MSME/Udyam Registration"));
        return list;
    }
}
