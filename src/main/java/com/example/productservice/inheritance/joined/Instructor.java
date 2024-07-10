package com.example.productservice.inheritance.joined;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity(name = "joined_instructors")
@Data
public class Instructor extends User {
    private String company;
}
