package com.taxinghelp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TaxingHelpApplication {
    public static void main(String[] args) {
        SpringApplication.run(TaxingHelpApplication.class, args);
        System.out.println("✅ Taxing Help running on http://localhost:8080");
    }
}
