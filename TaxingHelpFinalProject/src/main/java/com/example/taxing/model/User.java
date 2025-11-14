package com.example.taxing.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users") // ✅ Renamed table to 'users' to avoid SQL keyword issue
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
    private String role = "USER"; // default role
}
