package com.taxinghelp.controller;

import com.taxinghelp.model.Contact;
import org.springframework.web.bind.annotation.*;
import java.sql.*;

@RestController
@RequestMapping("/api/contact")
@CrossOrigin(origins = "*")
public class ContactController {

    @PostMapping
    public String saveMessage(@RequestBody Contact contact) {
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/taxinghelp",
                    "postgres", "Ttinar1@JCW"
            );

            PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO contact(name, email, message) VALUES (?, ?, ?)"
            );
            ps.setString(1, contact.getName());
            ps.setString(2, contact.getEmail());
            ps.setString(3, contact.getMessage());
            ps.executeUpdate();
            con.close();
            return "Message saved successfully!";
        } catch (Exception e) {
            e.printStackTrace();
            return "Error saving message!";
        }
    }
}
